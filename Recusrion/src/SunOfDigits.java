
public class SunOfDigits {
     public static void main(String [] args)
     {
    	 int result= SumOfDigits(1225);
    	 System.out.println(result);
     }
     
     public static int SumOfDigits(int n)
     {
    	 if(n==0)
    	 {
    		 return 0;
    	 }
    	 return ((n%10)+ SumOfDigits(n/10));
     }
}
