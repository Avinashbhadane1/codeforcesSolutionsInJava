import java.util.Scanner;

public class div4E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            long [] a = new long[n];
            long [] b = new long[m];
            StringBuilder spikes = new StringBuilder();
            for(int i = 0;i<n;i++){
                a[i] = scanner.nextLong();
            }
            for(int i = 0;i<m;i++){
                b[i] = scanner.nextLong();
                spikes.append(String.valueOf(b[i]));
            }
            scanner.nextLine();
            String ins = scanner.nextLine();
            StringBuilder builder = new StringBuilder();
            for(int i = 0;i<k;i++){
                if(ins.charAt(i)=='L'){
                    for(int j = 0;j<n;j++){
                        if(!builder.toString().contains(String.valueOf(j))){
                            a[j]--;
                            if(spikes.toString().contains(String.valueOf(a[j]))){
                                builder.append(String.valueOf(j));
                            }
                        }
                    }
                }else{
                    for(int j = 0;j<n;j++){
                        if(!builder.toString().contains(String.valueOf(j))){
                            a[j]++;
                            if(spikes.toString().contains(String.valueOf(a[j]))){
                                builder.append(String.valueOf(j));
                            }
                        }
                    }
                }

                System.out.print(n - builder.toString().length() + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
