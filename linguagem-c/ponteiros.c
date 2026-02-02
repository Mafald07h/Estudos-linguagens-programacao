#include <stdio.h>

int main(){
    int x;
    int *ponteiroX = &x;
    printf("%p \n",ponteiroX); 
    return 0;
}