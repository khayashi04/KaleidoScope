#include <stdio.h>
#include <Stdlib.h>

int main(void){
	setbuf(stdout, NULL);

	int len = 0;
	char *str; //Make a new C String

	printf("Enter the word length: "); //Prompt the user for input length
	scanf("%d", &len);

	str = (char *)malloc(len * sizeof(char)); //Allocate meory for word
	if(str == NULL){
		printf("Error allocating memory."); //Check for an allocateion error
		exit(0);
	}
	printf("Enter the word: "); //Prompt the user for an input string
	scanf("%s", str);

	//Loop and print each character and memory location
	printf("Word: %s, Address: %u\n", str, str); //Qusetion 1
	for(int i = 0; i < len; i++){
		printf("Char %d: %c, Address: %u\n",i, *(str + i), str + i); //Qusetion 2
	}

	free(str); //Return the memory that we borrowed
	return 0;
}