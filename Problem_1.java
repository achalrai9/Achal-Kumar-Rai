import java.util.Scanner;

public class Problem_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        String op = in.next();
        double res = 0;
        
        if(op.charAt(0) == '+') {
            res = a + b;
            System.out.println(res);
        }
        
        else if(op.charAt(0) == '-') {
            res = a - b;
            System.out.println(res);
        }
        
        else if(op.charAt(0) == '/'){
            res = a / b;
            System.out.println(res);
        }
        
        else if(op.charAt(0) == '*'){
            res = a * b;
            System.out.println(res);
        }
        
        else System.out.println("Please enter a valid operation.");
    }
    
}
