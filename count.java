public class count {
    
    int countDigits(int x)
    {
        int result =0;
        while (x>0){
            x = x/10;
            result++;
        }
        return result;
    } 
}
