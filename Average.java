import java.util.Scanner;
public class Average {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of numbers: ");
        int num = sc.nextInt();
        int count =0;
        for(int i =1; i<=num; i++){
            int n = sc.nextInt();
            count = count + n; 
            // avg = count/num;
            // System.out.println("Average of Given num is:" + avg);

        }
        System.out.println(count/num);
        
        
    }
}
