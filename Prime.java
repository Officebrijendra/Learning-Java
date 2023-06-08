import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number");
        int num = sc.nextInt();

        if(num % 2 ==0){
            System.out.println("Num is not prime");
        }
        else{
            System.out.println("Num is Prime");
        }
    }
}
