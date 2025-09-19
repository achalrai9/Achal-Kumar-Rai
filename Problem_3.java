import java.util.Scanner;

public class Problem_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int res = 1;
        
        if(a % 2 == 0){
            for(int i = 0; i < a-1; i++){
                System.out.println(res);
                res += 2;
            }
        }
        
        else{
            for(int i = 0; i < a; i++){
                System.out.println(res);
                res += 2;
            }
        }
    }
    
}
