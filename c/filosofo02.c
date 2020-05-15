#include <pthread.h>
#include <stdio.h>
#include <string.h>

void *filosofo(void *arg){
	char *nombre = arg;
	while(1){
		printf("%s estoy comiendo :D.\n",nombre);
	}
}

int main(void){

	pthread_t f1, f2;

	char nf1[7] = "Marvik";
	char nf2[7] = "Daniel";

	pthread_create(&f1, NULL, &filosofo, &nf1);
	pthread_create(&f2, NULL, &filosofo, &nf2);

	pthread_join(f1, NULL);
	pthread_join(f2, NULL);

	return 1;
}