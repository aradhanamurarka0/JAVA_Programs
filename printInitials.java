import java.util.*;
class strings
{
    public static void main(String args[])
    {
        int k=0;
        // int p=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        String str2=" "+str;
        // System.out.println(str2);
        int i;
        for( i=0;i<str2.length();i++)
        {
            // while
           
            if(str2.charAt(i)==' ')
            {
                if(k<2)
                {
                System.out.print(str2.charAt(i+1)+".");
                }
            k++;  
            }   
            if(k==3)
            {
              break;
            } 
       }
       for(int j=i+1;j<str2.length();j++)
       {
        System.out.print(str2.charAt(j));
       }

            
        

        // System.out.println(k);
   
    }
    
        
    }
