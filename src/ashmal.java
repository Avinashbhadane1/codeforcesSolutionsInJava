import java.util.Scanner;

public class ashmal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            String [] a = new String[n];
            for(int i = 0;i<n;i++){
                a[i]= scanner.next();
            }
            StringBuilder s = new StringBuilder(a[0]);
            for(int i = 1;i<n;i++){
                final int i1 = s.toString().compareTo(a[i]);
                if(i1 ==0){
                    s.insert(0,a[i]);
                }else if(i1 <0){
                    s.append(a[i]);
                }else{
                    s.insert(0,a[i]);
                }

            }
            System.out.println(s);
        }
        scanner.close();
    }
}
