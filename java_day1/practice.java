import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hey ! Welcome to Java class");
        int x = 10;
        int y = 22;
        int z = y%x;
        
        System.out.println(z);
        
        int num = 102 ;
        
        if(num%2 == 0)
        {
            
            System.out.println("Even");
            System.out.println("if statement is executed");
            
        }
        else{
            System.out.println("Odd");
        }
        
        int counter = 0;
        
        while(counter < 10){
            System.out.println("Hello World!");
            counter = counter+1;
        }
        
        Scanner bi = new Scanner(System.in);
        
        int num1 = bi.nextInt();
        int num2 = bi.nextInt();
        int num3 = num1+num2;
        System.out.println(num3);
        
        
        for(int cntr = 0;cntr < 10;cntr = cntr+1){
            System.out.println(cntr*cntr);
        }
  
        
     }
}


