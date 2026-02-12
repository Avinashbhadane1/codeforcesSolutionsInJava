import java.util.Scanner;

public class date11Feb263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long p = scanner.nextLong();
            long q = scanner.nextLong();
            if( q%3==0){
                long x = q/3;
                boolean possible = false;
                x *= 2;
                int turn  = 0;
                if(x<p){
                    double xy = (double) p /q;
                    while(true){
                        if(xy==(double)2/3){
                            possible = true;
                            break;
                        }
                        if(xy< (double) 2/3){
                            break;
                        }
                        if(turn==0){
                            if(p%2==0 && q%3==0){
                                q--;
                            }else if(p%2==0){
                                p--;
                            }else if(q%3==0){
                                q--;
                            }else{
                                q--;
                            }
                            turn = 1;
                        }else{
                            if(p%2!=0 && q%3!=0){
                                p--;
                            }else if(p%2!=0){
                                p--;
                            }else{
                                q--;
                            }
                            turn = 0;
                        }

                    }
                    if(possible){
                        System.out.println("Bob");
                    }else{
                        System.out.println("Alice");
                    }
                }else if(x==p){
                    System.out.println("Bob");
                }else{
                    System.out.println("Alice");
                }
            }
        }
        scanner.close();
    }
}
