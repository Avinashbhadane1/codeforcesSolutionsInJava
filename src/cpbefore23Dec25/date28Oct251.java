package cpbefore23Dec25;

import java.util.*;

public class date28Oct251 {
    public static boolean check(String t,int l){
        boolean alreadyCorrect = false;
        int count = 0;
        for(int i = 0;i<l-1;i++){
            String temp = String.valueOf(t.charAt(i)+""  + t.charAt(i+1));
            if(temp.equals("ab") || temp.equals("ba")){
                count++;
            }
        }
        if(Objects.equals(t, "ab") || Objects.equals(t, "ba") || Objects.equals(t, "aba") || Objects.equals(t, "bab")
        ||Objects.equals(t, "b")||Objects.equals(t, "a")
        ){
            count = 1;
        }
        if(count==1||count==2){
            alreadyCorrect = true;
        }
        return alreadyCorrect;
    }
    public static int findMin(ArrayList<Integer> arrayList){
        int min = Integer.MAX_VALUE;
        for(int k:arrayList){
            if(min>k){
                min = k;
            }
        }
        return min;
    }
    public static int baPattern(String temp){
        ArrayList<String> ab = new ArrayList<>();
        for(int i = 0;i<temp.length();i++){
            ab.add(String.valueOf(temp.charAt(i)));
        }
        int moveA = 0;
        while(!check(temp,temp.length())){
            for(int i = 0;i<temp.length()-1;i++){
                if(Objects.equals(ab.get(i), "a") && Objects.equals(ab.get(i + 1), "b")){
                    ab.set(i,"b");
                    ab.set(i+1,"a");

                    StringBuilder builder = new StringBuilder();
                    for(String c:ab){
                        builder.append(c);
                    }
                    temp = builder.toString();
                    moveA++;
                }
            }
        }
        return moveA;
    }
    public static int abPattern(String temp){

        ArrayList<String> ab = new ArrayList<>();
        for(int i = 0;i<temp.length();i++){
            ab.add(String.valueOf(temp.charAt(i)));
        }
        int moveB = 0;
        while(!check(temp,temp.length())){
            for(int i = 0;i<temp.length()-1;i++){
                if(Objects.equals(ab.get(i), "b") && Objects.equals(ab.get(i + 1), "a")){
                    ab.set(i,"a");
                    ab.set(i+1,"b");

                    StringBuilder builder = new StringBuilder();
                    for(String c:ab){
                        builder.append(c);
                    }
                    temp = builder.toString();
                    moveB++;
                }
            }
        }
        return moveB;
        }
    public static int abaPattern(String temp) {
        int no_of_moves = 0;
        ArrayList<String> segments = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            current.append(c);

            // whenever we see 'b', we end the current segment
            if (c == 'b') {
                segments.add(current.toString());
                System.out.println(current.toString());
                current = new StringBuilder();
            }
        }

        // if something remains after the last 'b', add it as the last segment
        if (!current.isEmpty()) {
            segments.add(current.toString());
        }

        // process each segment to count moves
        for (String part : segments) {
            no_of_moves += Math.min(abPattern(part), baPattern(part));
        }

        return no_of_moves;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<Integer> moves = new ArrayList<>();
//        for(int i = 0;i<n;i++){
//            int length = sc.nextInt();
//            String text = sc.nextLine();
//            if(check(text,length)){
//                System.out.println(0);
//            }else{
//
//            }
//        }
        int b = abaPattern("abababa");
        System.out.println(b);
    }

}
