class outer {
    // final method
    
    final float PI =  3.14f;
    
    public void FinalDemo()
    { final float P;
        P=3.1425f;
        System.out.println(P);
    }
    final void print() {
        System.out.println("this is a final method" + PI );
    }

}

/*class  inner extends outer {
    void print() {

    }
} */

public class FinalKeyWord {
    public static void main(String[] args) {
        outer o = new outer();
        o.print();
    }
}
