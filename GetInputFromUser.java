import java.util.Scanner;
public class GetInputFromUser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String s = in.nextLine();
        System.out.println("You enetered a string " + s);

        int i = in.nextInt();
        System.out.println("You entered a integer " + i);

        float f = in.nextFloat();
        System.out.println("You entered a float" + f);

        
    }
}
