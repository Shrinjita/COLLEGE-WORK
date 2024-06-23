#include <stdio.h>
#include <unistd.h>
int main() {
    int a = 5, b = 10;
    pid_t pid;
    printf("Before vfork a=%d b=%d \n", a, b);
    pid = vfork();
    if (pid == 0) {
        a = a + 1;
        b = b + 1;
        printf("In child a=%d b=%d \n", a, b);
        _exit(0); // Ensure child process terminates to avoid issues with vfork()
    } else {
        a = a - 1;
        b = b - 1;
        printf("In Parent a=%d b=%d \n", a, b);
    }    return 0;
}
