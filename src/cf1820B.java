import java.util.Scanner;

public class cf1820B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            String s = scanner.next();
            if(s.equals("1")){
                System.out.println(1);
                continue;
            }
            s+=s;
            long inc = 0;
            long maxLen = 0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    inc++;
                }else{
                    maxLen = Math.max(maxLen,inc);
                    inc = 0;
                }
            }
            maxLen = Math.max(maxLen,inc);
            if(maxLen==s.length()){
                System.out.println((maxLen/2)*(maxLen/2));
                continue;
            }
            if(maxLen==0){
                System.out.println(0);
                continue;
            }
            if((maxLen+1)%2==0){
                System.out.println(((maxLen+1)/2)*((maxLen+1)/2));
            }else{
                System.out.println((((maxLen+1)/2)+1)*((maxLen+1)/2));
            }
        }
        scanner.close();
    }
}
