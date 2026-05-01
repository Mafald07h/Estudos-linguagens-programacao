#include <stdio.h>
#include <string.h>


int main(){
	char nome [80];
	int idade;

	printf("Informe o seu nome: ");
	scanf("%s",&nome);
	printf("Informe a sua idade: ");
	scanf("%d",&idade);
	printf(" -- Prazer em te conhecer --");
	printf(nome);
	printf(idade);
	return 0;
}
