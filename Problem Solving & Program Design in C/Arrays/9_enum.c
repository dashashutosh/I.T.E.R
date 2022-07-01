
#include <stdio.h>

typedef enum 
    {
      entertainment, rent, utilities, food, clothing, automobile, insurance, miscellaneous 
    }XYZ;


void print_expense(XYZ expense_kind);


int
main(void)
{
        
  
	XYZ expense_kind;
        printf("Enter a code>>");
	scanf("%d", &expense_kind);
	printf("Expense code represents ");
	print_expense(expense_kind);
	printf(".\n");

	return (0);
}

/*
* Display string corresponding to a value of type expense_t
*/
void
print_expense(XYZ expense_kind)
{

	switch (expense_kind) {
		case entertainment:
					printf("entertainment");
					break;

		case rent:
					printf("rent");
					break;
		case utilities:
					printf("utilities");
					break;

		case food:
					printf("food");
					break;

		case clothing:
					printf("clothing");
					break;

		case automobile:
					printf("automobile");
					break;

		case insurance:
					printf("insurance");
					break;

		case miscellaneous:
					printf("miscellaneous");
					break;

		default:
					printf("\n*** INVALID CODE ***\n");
	}
}






/*
# define entertainment 0
# define rent 1
# define utilities 2
# define food 3
# define clothing 4
# define automobile 5
# define insurance 6
# define miscellaneous 7*/
