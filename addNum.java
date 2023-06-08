import java.util.Scanner;
public class addNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int input1 = sc.nextInt(); 
        int ans1 = 0;
         
        while (input1>0){
            ans1 = ans1*10 + input1%10 ;
            input1 /=10 ;
        }

        System.out.println("Enter the numbers: ");
        int input2 = sc.nextInt(); 
        int ans2 = 0;
         
        while (input2>0){
            ans2 = ans2*10 + input2%10 ;
            input2 /=10 ;
        }


        System.out.println(ans1 + ans2);

        
        


        
    }
    }

