

#include <stdio.h>
#include <stdlib.h>

#define A_SIZE 20
#define STACK_EMPTY '0'

void
push(char stack[], /* input/output - the stack */
     char item, /* input - data being pushed onto the stack */
     int *top, /* input/output - pointer to top of stack */
     int max_size) /* input - maximum size of stack */
{
	if (*top < max_size-1) {
		++(*top);
		stack[*top] = item;
	}
}


char
pop(char stack[], /* input/output - the stack */
    int *top) /* input/output - pointer to top of stack */
{
	char item; /* value popped off the stack */

	if (*top >= 0) {
		item = stack[*top];
		--(*top);
	} else {
		item='#';
	}
return (item);
}

void display(char *ptr_1, int n)
{
        int i;
        //printf("in display function");
        
	for ( i = n ; i >= 0; i-- )
		{
		  if(i==n)
		   printf(" %c <--\n",ptr_1[i]);		   
		  else
		   printf(" %c \n",ptr_1[i]); 
		}
}

int
main(void)
{
	char arr[A_SIZE],item;
	int top=-1,choice,i;
	
	do
	{
	printf("***************** Choose stack operation*****************\n");
	printf("1. Push\n");
	printf("2. Pop\n");
	printf("3. Display Stack\n");
	printf("4. Exit\n");
	printf("\nChoose one >>");
	scanf("%d",&choice);		
	
	
	switch(choice)
	{
	  case 1: printf("Enter new item to push>>");
	          scanf(" %c",&item);
	          push(arr,item,&top,A_SIZE);
	          break;
	  	  
	  case 2: item=pop(arr,&top);
	          if (item!='#')  
	           printf("Popped item is :%c\n",item);
	          else
	           printf("Stack empty"); 
	          break;
	  case 3: //printf("in display");
	          
	          display(arr,top);
	          break;
	  case 4: exit(0);
	}  
	}while(choice!=4);

	return (0);
}



