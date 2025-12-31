package cpbefore23Dec25;

import java.util.Scanner;

public class date20Dec252 {
    //1901A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        sc.nextLine();


        while(noOfTestCases!=0){
            int minVolume = 0;
            String temp1 = sc.nextLine();
            String [] nAndX = temp1.split(" ");
            int [] nAndXInt = new int[nAndX.length];
            for(int i = 0;i<nAndX.length;i++){
                nAndXInt[i] = Integer.parseInt(nAndX[i]);
            }
            String temp2 = sc.nextLine();
            String [] points = temp2.split(" ");
            int [] pts = new int[points.length+2];
            pts[0] = 0;
            for(int i = 1;i<points.length+1;i++){
                pts[i] = Integer.parseInt(points[i-1]);
            }
            pts[points.length+1] = nAndXInt[nAndXInt.length-1];
            for(int i = 0;i<pts.length-1;i++){

                if(i==pts.length-2){
                    final int minVolume1 = 2 * (pts[pts.length - 1] - pts[pts.length - 2]);
                    if(minVolume< minVolume1){
                        minVolume = minVolume1;
                    }
                }else{
                    final int i1 = pts[i + 1] - pts[i];
                    if(minVolume< i1){
                        minVolume = i1;
                    }
                }
            }
            System.out.println(minVolume);

            noOfTestCases--;
        }
    }
}
