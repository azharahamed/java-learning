package exercises;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        // your code
        String stra = str1;
        int matchedIndex;
        for(int i=0;i<str2.length();i++){
            char a = str2.charAt(i);
            if(stra.indexOf(a) > -1){
                int index = stra.indexOf(a);
                if(index - (stra.length()-1) == 0){
                    stra = stra.substring(0,index);
                }
                else {
                    String first = stra.substring(0,index);
                    String second = stra.substring(index+1);
                    stra = first+second;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(Scramblies.scramble("rkqodlw","world"));
        System.out.println(Scramblies.scramble("cedewaraaossoqqyt","codewars"));
        System.out.println(Scramblies.scramble("katas","steak"));
        System.out.println(Scramblies.scramble("scriptjavx","javascript"));
        System.out.println(Scramblies.scramble("scriptingjava","javascript"));
        System.out.println(Scramblies.scramble("scriptsjava","javascripts"));
    }

}
