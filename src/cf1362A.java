import java.util.Scanner;

public class cf1362A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if(a==b){
                System.out.println(0);
                continue;
            }
            if(a>b){
                if(a%b!=0 || (a%2!=0) ){
                    System.out.println(-1);
                }else{
                    long multiple = a/b;
                    long pow = 0;
                    long ops= 0;
                    boolean doable = true;
                    while(multiple>1){
                        if(multiple%2!=0){
                            doable = false;
                            break;
                        }
                        multiple /= 2;
                        pow++;
                    }
                    while(pow>2){
                        pow -=3;
                        ops++;
                    }while(pow>1){
                        pow -=2;
                        ops++;
                    }while(pow>0){
                        pow -=1;
                        ops++;
                    }if(doable){
                        System.out.println(ops);
                    }else{
                        System.out.println(-1);
                    }
                }
            }else{
                if(b%a!=0 || b%2!=0){
                    System.out.println(-1);
                }else{
                    long multiple = b/a;
                    long pow = 0;
                    long ops= 0;
                    boolean doable = true;
                    while(multiple>1){
                        if(multiple %2!=0){
                            doable = false;
                            break;
                        }
                        multiple /= 2;
                        pow++;
                    }
                    while(pow>2){
                        pow -=3;
                        ops++;
                    }while(pow>1){
                        pow -=2;
                        ops++;
                    }while(pow>0){
                        pow -=1;
                        ops++;
                    }
                    if(doable){
                        System.out.println(ops);
                    }else{
                        System.out.println(-1);
                    }
                }
            }
        }
        scanner.close();
    }
}
