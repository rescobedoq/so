#include <stdio.h>
#include <string.h>

void filosofo(char *nombre){
	while(1){
		printf("%s estoy comiendo :D.\n",nombre);
	}
}

int main(void){
	char nf1[7] = "Marvik";
	char nf2[7] = "Daniel";

	filosofo(nf1);
	filosofo(nf2);

	return 1;
}