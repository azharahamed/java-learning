package exercises;

public class DRoot {
    public static int digital_root(int n) {
        while (n > 9) {
            String number = Integer.toString(n);
            int sum = 0;
            for (char a : number.toCharArray()) {sum += Character.getNumericValue(a);}
            n = sum;
        }
        return n;
    }

    public static void main(String[] args){
        System.out.println(DRoot.digital_root(493193));
    }
}



