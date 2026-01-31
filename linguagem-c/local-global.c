// Variáveis locais e globais

/* Variáveis locais existem em um bloco de código específico, sendo 
delimitado por chaves { }, além disso, essas variáveis são criadas quando se chama uma função
e destruidas ao se encerrar a função.*/
#include <stdio.h>
/* Nesse exemplo, as variáveis 'a' e 'b' só existem nessa função 'soma', e 
são criadas quando se chama essa função soma para algum bloco de código */
int soma(int a,int b){
        return a+b;
    }
/* Variáveis globais são utilizadas por todo o programa, e são declaradas no início do programa. */
int main(){
    int contador = 1;
    printf("A soma é: %d \n",soma(8,7));
    return 0;
}