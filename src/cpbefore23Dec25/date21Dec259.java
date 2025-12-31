package cpbefore23Dec25;

import java.util.Scanner;

public class date21Dec259 {
    public static void main(String[] args) {
        //1845A

        Scanner sc = new Scanner(System.in);
        int nOfTestCases = sc.nextInt();
        while(nOfTestCases-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            if(x!=1){
                System.out.println("YES");
                System.out.println(n);
                for(int i = 0;i<n;i++){
                    System.out.print(1 + " ");
                }
                System.out.println();
            }else{
                if(k==1){
                    System.out.println("NO");
                }
                if(k==2){
                    if(n%2==0){
                        System.out.println("YES");
                        System.out.println(n/2);
                        for(int i = 0;i<n/2;i++){
                            System.out.print(2 + " ");
                        }
                        System.out.println();
                    }else{
                        System.out.println("NO");
                    }
                }
                if(k>2){
                    if(n%2==0){
                        System.out.println("YES");
                        System.out.println(n/2);
                        for(int i = 0;i<n/2;i++){
                            System.out.print(2 + " ");
                        }
                        System.out.println();
                    }else{
                        n= n-3;
                        System.out.println("YES");
                        System.out.println(1 + n/2);
                        for(int i = 0;i<n/2;i++){
                            System.out.print(2 + " ");
                        }
                        System.out.print(3);
                        System.out.println();
                    }
                }
            }
        }

        sc.close();
    }
}
