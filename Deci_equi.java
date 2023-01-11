import java.util.*;
class Deci_equi
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows");
        int m=sc.nextInt();
        if(m>0&&m<10)
        {
            System.out.println("enter colums");
        int n=sc.nextInt();
        if(n>2&&n<6)
        {
        int A[][]=new int[m][n];

        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                System.out.println("enter array elemnts");
               A[i][j]=sc.nextInt();
               if(A[i][j]>8)
               {
                System.out.println("invalid input");
                break;
               }
           
            }
        }
        System.out.println("MATRIX \t\t DECIMAL EQUIVALENT");
            for(int i=0;i<A.length;i++)
            {
                int deci=0;
                int flag=0;
                for(int j=0;j<A[i].length;j++)
                {
                    int mul=1;
                    System.out.print(A[i][j]+" ");
                    for(int k=A[i].length-1;k>flag;k--)
                    {
                        mul=mul*8;
                    }
                    flag++;
                    mul=mul*A[i][j];
                    deci=deci+mul;
                } 
                System.out.print("\t\t"+deci);
                System.out.println();
            }  

        }
    }
    }
}