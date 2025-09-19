import java.util.ArrayList;
import java.util.Scanner;

public class Problem_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* Format of input:
           > No. of elements: 5 
           > [1, 2, 30, 10, 12]
        */
        System.out.print("Enter the no. of elements to be entered: ");
        int num = in.nextInt();
        System.out.println();
        ArrayList<Integer> arr = new ArrayList<>();
        int res[] = new int[9];
        
        for(int i = 0; i < num; i++){
            int a = in.nextInt();
            arr.add(a);
        }
        
        for(int i = 0; i < arr.size(); i++){
            for(int j = 1; j <= 9; j++){
                if(arr.get(i) % j == 0) res[j - 1]++;
            }
        }
        
        for(int i = 0; i < res.length; i++){
            System.out.print(i+1 + ":" + res[i] + " ");
        }
    }
    
}
