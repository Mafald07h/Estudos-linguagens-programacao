#include <stdio.h>

int main(){
    int x;
    x = 1;
    loop1:
        x++;
        if(x<100) goto loop1 ;
    printf("%d\n",x);
    return 0;
}