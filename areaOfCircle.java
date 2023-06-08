import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of radius: ");
        Double r = sc.nextDouble();
        Double area = 3.14 * r * r;
        System.out.println(area);

    }
}
