public class roughWork {
    public static String shift(String s ){
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            char newC = (char) ((c -'a' +25 )%26 + 'a');
            builder.append(newC);
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        String s= "aabb";
        s = shift(s);
        System.out.println(s);
    }
}
