import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class beginnerS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            Map<String,String> ips = new HashMap<>();
            for(int i = 0;i<n;i++){
                String name = scanner.next();
                String ip = scanner.next();
                ips.put(ip, name);
            }
            for(int i = 0;i<m;i++){
                String nm = scanner.next();
                String ipOf = scanner.next();
                String temp = ipOf;
                ipOf = ipOf.replace(";","");
                System.out.println(nm + " " + temp + " #" + ips.get(ipOf));
            }

        scanner.close();
    }
}
