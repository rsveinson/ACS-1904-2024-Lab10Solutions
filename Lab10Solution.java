import java.util.Scanner;
/** 
 * ACS-1904 Lab 10 Solution
 * @author: Sveinson
*/

public class Lab10Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // find the sum of every number <= n
        int n;
        System.out.println("Enter a number >= 1.");
        n = scanner.nextInt();
        int sum = findSum(n);
        System.out.println("The sum is: " + sum);
        System.out.println();
        
        
        // find the gcd of x and y
        // int x = 366;
        // int y = 60;
        int x = 3933;
        int y = 0;
        System.out.println("Calculating the GCD.");
        System.out.println("Enter two numbers > 0.");
        x = scanner.nextInt();
        y = scanner.nextInt();
        //System.out.println(x + " % " + y + " = " + (x % y));
        System.out.println();
        System.out.print("the gcd of " + x + " and " + y + " is ");
        System.out.println(gcd(x, y));
        
        System.out.println();
        System.out.println("end of program");
    }
    
    public static int findSum(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n + findSum(n -1);
        }
    }// end findsum
    
    public static int numberOfDigits(int n){
        if(n < 10)
            return 1;
        else
            return 1 + numberOfDigits(n / 10);
    }
    
    public static int gcd(int x, int y){
        if(x % y == 0)
            return y;
        else
            return gcd(y, x % y);
    }// end gcd
}
