import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*****Bill*****");
        System.out.println("Rate of Pencil : ");
        int R1 = sc.nextInt();
        System.out.println("Rate of Pen : ");
        int R2 = sc.nextInt();
        System.out.println("Rate of Eraser : ");
        int R3 = sc.nextInt();

        int sum;
        sum = R1+R2+R3;
        System.out.println("Total Bill: " + sum);
        int Total;
        Total = sum + (sum*18)/100;
        System.out.println("After adding 18% GST on Bill: " + Total );

    }
}
