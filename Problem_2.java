import java.util.Scanner;

public class Problem_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int res = 1;
        
        for(int i = 0; i < a; i++){
            System.out.print(res + " ");
            res += 2;
        }
    }
    
}
