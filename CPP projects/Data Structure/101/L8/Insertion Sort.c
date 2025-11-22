/*
This is our Insertion Sort Program in C
Created: F. A. Faisal
Date: 17/11/2025 
*/

#include <stdio.h>

int main(){

	int array[] = {50,10,21,7,9,78,36,123};

	int i,j;
	
	// Outer loop for checking the current position
	for (i=1; i<8; i++){
		// Inner loop for comparing and swapping the position, if required 
		for (j=i; j>0; j--){
			if(array[j-1] > array[j]){
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
			}
		}
	}
	
	// printing the array
	printf("The Output: ");
	for (i = 0;i<8;i++){
		printf("%d ", array[i]);	
	}
	printf("\n");
	return 0;
}














