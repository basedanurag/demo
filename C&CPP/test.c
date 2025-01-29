#include<stdio.h>

int main() {
    int a, b;

    printf("Enter a and b: ");
    scanf("%d %d", &a, &b); // Corrected the format string and removed the quotes from '&a , &b'

    printf("The numbers are a = %d and b = %d\n", a, b); // Corrected format string and removed incorrect concatenation

    return 0;
}
