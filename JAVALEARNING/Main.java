import java.util.*;

class Doctor {
    private String name;
    private String speciality;
    private List<String> availability;
    private Map<String, String> appointments;
    private Map<String, Queue<String>> waitlist;

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
        this.availability = new ArrayList<>();
        this.appointments = new HashMap<>();
        this.waitlist = new HashMap<>();
    }

    public String addAvailability(List<String> slots) {
        for (String slot : slots) {
            String[] times = slot.split("-");
            int startMinute = Integer.parseInt(times[0].split(":")[1]);
            int endMinute = Integer.parseInt(times[1].split(":")[1]);

            if (endMinute - startMinute != 30) {
                return "Sorry Dr. " + name + ", slots are 30 mins only.";
            }
            if (!availability.contains(slot)) {
                availability.add(slot);
            }
        }
        return "Done Doc!";
    }

    public String bookSlot(String patientName, String slot) {
        if (!availability.contains(slot)) {
            waitlist.putIfAbsent(slot, new LinkedList<>());
            waitlist.get(slot).add(patientName);
            return "Slot already booked, added " + patientName + " to waitlist.";
        }

        availability.remove(slot);
        appointments.put(slot, patientName);
        return "Booked. Booking id: " + Objects.hash(slot + patientName);
    }

    public String cancelAppointment(String slot) {
        if (!appointments.containsKey(slot)) {
            return "No such appointment found.";
        }

        @SuppressWarnings("unused")
        String patientName = appointments.remove(slot);
        Queue<String> waitQueue = waitlist.get(slot);
        if (waitQueue != null && !waitQueue.isEmpty()) {
            String nextPatient = waitQueue.poll();
            appointments.put(slot, nextPatient);
            return "Booking cancelled. Slot reassigned to " + nextPatient + ".";
        }

        availability.add(slot);
        return "Booking Cancelled.";
    }

    public Map<String, String> showAppointments() {
        return appointments;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public List<String> getAvailability() {
        return availability;
    }
}

class AppointmentSystem {
    private Map<String, Doctor> doctors;
    private String trendingDoctor;
    private int trendingCount;

    public AppointmentSystem() {
        doctors = new HashMap<>();
        trendingDoctor = null;
        trendingCount = 0;
    }

    public String registerDoctor(String name, String speciality) {
        if (doctors.containsKey(name)) {
            return "Dr. " + name + " is already registered.";
        }

        doctors.put(name, new Doctor(name, speciality));
        return "Welcome Dr. " + name + " !!";
    }

    public String markAvailability(String name, List<String> slots) {
        if (!doctors.containsKey(name)) {
            return "Dr. " + name + " not found.";
        }

        Doctor doctor = doctors.get(name);
        return doctor.addAvailability(slots);
    }

    public List<String> showAvailabilityBySpeciality(String speciality) {
        List<String> results = new ArrayList<>();
        for (Doctor doctor : doctors.values()) {
            if (doctor.getSpeciality().equals(speciality)) {
                for (String slot : doctor.getAvailability()) {
                    results.add("Dr. " + doctor.getName() + ": (" + slot + ")");
                }
            }
        }
        return results.isEmpty() ? Collections.singletonList("No available slots for this speciality.") : results;
    }

    public String bookAppointment(String patientName, String doctorName, String slot) {
        if (!doctors.containsKey(doctorName)) {
            return "Dr. " + doctorName + " not found.";
        }

        Doctor doctor = doctors.get(doctorName);
        String response = doctor.bookSlot(patientName, slot);

        int appointmentCount = doctor.showAppointments().size();
        if (appointmentCount > trendingCount) {
            trendingDoctor = doctorName;
            trendingCount = appointmentCount;
        }

        return response;
    }

    public String cancelAppointment(String doctorName, String slot) {
        if (!doctors.containsKey(doctorName)) {
            return "Dr. " + doctorName + " not found.";
        }

        Doctor doctor = doctors.get(doctorName);
        return doctor.cancelAppointment(slot);
    }

    public String getTrendingDoctor() {
        return (trendingDoctor != null) ? "Trending Doctor: Dr. " + trendingDoctor + " with " + trendingCount + " appointments." : "No trending doctor currently.";
    }
}

public class Main {
    public static void main(String[] args) {
        AppointmentSystem system = new AppointmentSystem();

        System.out.println(system.registerDoctor("Curious", "Cardiologist"));
        System.out.println(system.markAvailability("Curious", Arrays.asList("9:30-10:00", "12:30-13:00", "16:00-16:30")));
        System.out.println(system.registerDoctor("Dreadful", "Dermatologist"));
        System.out.println(system.markAvailability("Dreadful", Arrays.asList("10:30-11:00", "13:30-14:00", "17:00-17:30")));
        System.out.println(system.showAvailabilityBySpeciality("Cardiologist"));
        System.out.println(system.bookAppointment("PatientA", "Curious", "12:30-13:00"));
        System.out.println(system.showAvailabilityBySpeciality("Cardiologist"));
        System.out.println(system.cancelAppointment("Curious", "12:30-13:00"));
        System.out.println(system.showAvailabilityBySpeciality("Cardiologist"));
        System.out.println(system.getTrendingDoctor());
    }
}
