import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("First number is greater");
        }
        else if(b>a && b>c){
            System.out.println("Second number is greater");
        }
        else if(c>a && c>b){
            System.out.println("Third number is greater");
        }
        else{
            System.out.println("All are equal");
        }
    }
}
