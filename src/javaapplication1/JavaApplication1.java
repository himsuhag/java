
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {

   
    public static void main(String[] args) {
       
           int numb,numb1,i;
           
            
            System.out.println("enter any no");
            Scanner sc= new Scanner(System.in);
            numb=sc.nextInt();
            if(numb%2==0)
            {
                System.out.println("the no is even");
            if(numb==2)
            {
                System.out.println("it is also a prime no");
            }
            }
            else if(numb%2!=0)
            {
           
                System.out.println("it is a odd no"); 
                for(i=0;i<=100;i++)
                {
                    if(numb%i!=0&&numb%numb==0)
                    {
                        System.out.println("the numb is prime no:"+numb);
                    }
                }
                    
            }
             
             
    }
}
