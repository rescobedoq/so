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

	int check1 = pthread_create(&f1, NULL, &filosofo, &nf1);
	int check2 = pthread_create(&f2, NULL, &filosofo, &nf2);

	if(!check1){
		pthread_join(f1, NULL);
	}

	if(!check2){
		pthread_join(f2, NULL);
	}

	return 1;
}