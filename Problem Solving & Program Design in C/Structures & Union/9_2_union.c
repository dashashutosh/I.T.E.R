
#include <stdio.h>
#include <math.h>
#include<string.h>

typedef struct
{
  char hobby[15];
  int CCNo;
} info1;

typedef struct
{
  char VecNO[15];
  int dist2C;
} info2;

typedef union
{
  info1 a;
  info2 b;
}info;

typedef struct
{
  char name[40];
  char grade[4];
  int age;
  info sUnion;  
}employee;

void putData(employee E1);
employee getData();

int main()
{
   employee E1,E2;
   printf("Enter data for Next Employee:>>");
   E1=getData();
   printf("Enter data for E2:>>");
   E2=getData();
   
   printf("\n*******Employee 1 details******* \n");
   putData(E1);
   
   printf("\n\n*******Employee 2 details*******\n");
   putData(E2);
   
   /*strcpy(E1.name,"Ashutosh");
   strcpy(E1.grade,"HSK");
   E1.age=33;
   strcpy(E1.sUnion.a.hobby,"Drama");
   E1.sUnion.a.CCNo=334237;
  
  // printf("%d \n",u1.name[0]);
  // printf("%d \n",u1.name[1]);  */       
   return(0);
}

void putData(employee E1)
{
   //printf("Employee details:>> \n");
   printf("Name:%s \nGrade: %s \nAge: %d",E1.name, E1.grade, E1.age);
  
   if (!strcmp(E1.grade,"HSK"))
   	printf("\nHobby:%s \nCCNo: %d\n",E1.sUnion.a.hobby, E1.sUnion.a.CCNo);
   else	 
        printf("\nVehicle No.:%s \nDistance: %d\n",E1.sUnion.b.VecNO, E1.sUnion.b.dist2C);
}   
   	
employee getData()
{
   employee E1;
  
   	
   printf("\nEnter Name, grade and age details:>> \n");
   scanf("%s%s%d",E1.name, E1.grade,&E1.age);
   printf("Enter specific details:\n");
   
   if (!strcmp(E1.grade,"HSK"))
        {
        printf("\nEnter Hobby and CCNo:>>\n");
     	scanf("%s%d",E1.sUnion.a.hobby,&E1.sUnion.a.CCNo);
     	}
   else	 
        {
        printf("\nEnter Vehicle No an distance:>>\n");
        scanf("%s%d",E1.sUnion.b.VecNO,&E1.sUnion.b.dist2C);
        }
   return E1;
}


/* strcpy(E1.name,"Ashutosh");
   strcpy(E1.grade,"HSK");
   E1.age=33;
   if (!strcmp(E1.grade,"HSK"))
   	{
   	  strcpy(E1.sUnion.a.hobby,"Drama");
   	  E1.sUnion.a.CCNo=334237;
   	}
   else	 
        {
   	  strcpy(E1.sUnion.b.VecNO,"MP20CD5618");
   	  E1.sUnion.b.dist2C=3;
   	} */

