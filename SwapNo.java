import java.util.Scanner;

public class SwapNo{
   public static void main(String args[]){
     
	 int temp;
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter first no:");
     int a=	sc.nextInt();
	 
	 System.out.println("Enter second no:");
     int b=	sc.nextInt();
	 
	 System.out.println("Before Swapping");
	 System.out.println("First no:" +a); 
	 System.out.println("Second no:" +b);
	 
	 temp=a;
	 a=b;
	 b=temp;
	 
	 System.out.println("After Swapping");
	 System.out.println("First no:" +a); 
	 System.out.println("Second no:" +b);
   }
}
	 
	 
	 