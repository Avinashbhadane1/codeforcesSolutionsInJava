import java.util.ArrayList;
import java.util.Scanner;

public class beginner_contest13ZA {
    public static boolean linearSearch(ArrayList<String> a, String target){
        boolean found  =false;
        for (String string : a) {
            if (string.equals(target)) {
                found = true;
                break;
            }
        }
        return found;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            scanner.nextLine();
            ArrayList<String> a = new ArrayList<>();

            for(int i = 0;i<n;i++){
                String x = scanner.nextLine();
                if(!linearSearch(a,x)){
                    System.out.println("OK");
                }else{
                    while(linearSearch(a,x)){
                        if((int)x.charAt(x.length()-1) <48 && (int)x.charAt(x.length()-1)>57){
                            x=x+1;
                            break;
                        }else{
                            final char c = x.charAt(x.length() - 2);
                            if((int) c <48 && (int) c >57){

                            }
                        }
                    }
                    System.out.println(x);
                }
                a.add(x);
            }

        scanner.close();
    }
}
