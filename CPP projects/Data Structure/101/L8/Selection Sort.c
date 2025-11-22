/*
This is our Selection Sort Program in C
Created: F. A. Faisal
Date: 17/11/2025 
*/

#include <stdio.h>

int main(){

	int array[] = {50,10,21,7,9,78,36,123};

	int i,j;
	
	// Outer loop for checking the current position
	for (i=0; i<8; i++){
		
		// Pick the current position for the min value.
		int min = i;
		// Inner loop for finding the index position of min value 
		for (j=i+1; j<8; j++){
			if(array[min] > array[j]){
				min = j;
			}
		}
		//do the swap 
		int temp = array[i];
		array[i] = array[min];
		array[min] = temp;

	}
	
	// printing the array
	printf("The Output: ");
	for (i = 0;i<8;i++){
		printf("%d ", array[i]);	
	}
	printf("\n");
	return 0;
}














