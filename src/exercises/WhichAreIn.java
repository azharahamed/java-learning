package exercises;

import java.util.ArrayList;
import java.util.List;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> temp = new ArrayList<String>();
        int i = 0;
        for(String a: array1){
            for(String b: array2){
                if(b.contains(a)){
                    temp.add(a);
                }
            }
        }
        System.out.println(temp + "Temp List");
        String returnString[] = new String[temp.size()];
        returnString = temp.toArray(new String[temp.size()]);
//        System.out.println(returnString + temp.toArray(new String[temp.size()]);
        return returnString;
    }

    public static void main(String[] args){
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[]{ "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[]{ "arp", "live", "strong" };
        System.out.println(r);
        System.out.println(inArray(a,b));
    }

}
