package cpFrom23Dec25;
import java.util.Scanner;

public class date23Dec252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        boolean c2 = false;
        boolean c3 = false;
        boolean c4 = false;
        if(pass.length()<5){
            System.out.println("Too weak");
        }else{
            for(char c : pass.toCharArray()){
                int x = (int)c;
                if((x>=65 && x<= 90) ){
                    c2 = true;
                }
                if((x>=97 && x<= 122)){
                    c3 = true;
                }
                if(x>=48 && x<=57){
                    c4 = true;
                }
            }
            if(c2 && c4 &&c3){
                System.out.println("Correct");
            }else {
                System.out.println("Too weak");
            }
        }
    }
}
