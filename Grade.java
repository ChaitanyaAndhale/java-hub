class Grade
{
public static void main(String[]grades)
{
int a=100,b=90,c=80,d=90,e=100;
int total=a+b+c+d+e;
int percentage=(total*100)/500;
int p=(int)percentage;
char result=(p>=90 && p <=100) ?'A':((p <= 89 && p >=75)? 'B':(p<=74&& p>=55)? 'C': (p <=54 && p>=35)? 'D':'F');
System.out.println("The student has percentage:"+percentage);
System.out.println("The grade is:"+result);

}
}


/*
Output:
Compile time:Success
Run Time: Succes
The student has percentage:92
The grade is:A
*/