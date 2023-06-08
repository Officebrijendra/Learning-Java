import java.io.BufferedReader;
public class Buffer {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        System.out.println(name);
        
    }
}
