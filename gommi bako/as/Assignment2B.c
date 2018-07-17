#include <stdio.h>
#include <stdlib.h>

int main(){
	int i, n1, n2, *ptr, sum = 0;

	printf("Enter number of elements\n");

	scanf("%d", &n1);

	ptr = (int  *)calloc(n1, sizeof(int));
	if(ptr == NULL){
		printf("Erro allocating memory.");
		exit(0);
	}

	printf("Address of previously allocated memory:\n");
	for(i = 0; i < n1; i++){
		printf("Address%d = %u\n", i, ptr + i);
	}

	printf("Enter new size of array: \n");
	scanf("%d",&n2);

	ptr = realloc(ptr, n2);

	for(i = 0; i < n2; i++){
		printf("Address%d = %u\n", i, ptr + i);
	}

	printf("Enter elements of array: \n");
	for(i = 0; i < n2; i++){
		scanf("%d", ptr + i);
		sum += *(ptr + i);
		printf("Read: %d, Address = %u\n", *(ptr + i), ptr + i);
	}
	printf("Sum = %d", sum);

	free(ptr);
	return 0;
}