import java.util.Scanner;
public class SumofOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int odd =0;
        int even =0;
        for(int i =0; i<=n; i++){
            if(i%2==0){
                even += i;
                
            }else{
                odd += i;
                
            }
        }System.out.println(even);
        System.out.println(odd);
    }
}
