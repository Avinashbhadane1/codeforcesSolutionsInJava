
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class beginnerZA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        Map<String,Integer> names = new HashMap<>();
        while (t-->0){
            String s = scanner.nextLine();
            if(!names.containsKey(s)){
                System.out.println("OK");
                names.put(s,1);
            }else{
                int count = names.get(s);
                String newName = s + count;
                System.out.println(newName);
                names.put(s,count+1);
                names.put(newName,1);
            }
        }
        scanner.close();
    }
}
