class Dowhile
{
    public static void main(String[]args)
    {
        int a=1;
       do 
       {
           if (a%7==0 || a%10==7){
               System.out .println(a);
           }
           a++;
           
       }while(a<=100);
    }}
    /*7
14
17
21
27
28
35
37
42
47
49
56
57
63
67
70
77
84
87
91
97
98
*/