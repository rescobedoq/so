#include <stdio.h>

void filosofos(void){

	if( fork() ==0 ){
		while(1){
			printf("Marvik estoy comiendo :D.\n");
		}
	}else{
		while(1){
			printf("Daniel estoy comiendo :D.\n");
		}
	}

}

int main(void){
	filosofos();

	return 0;
}