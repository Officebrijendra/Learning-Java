import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What color is your light ?");
        int Light = sc.nextInt();
        
        // Here 1 stands for Red
        // 2 Stands for Yellow
        // 3 Stands for Green
        
        if(Light == 1){
            System.out.println("STOP");
        }
        else if(Light == 2){
            System.out.println("Ready");
        }
        else if(Light == 3){
            System.out.println("Go");
        }
        else{
            System.out.println("Wrong input");
        }
    }
}
