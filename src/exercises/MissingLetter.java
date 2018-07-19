package exercises;

public class MissingLetter {
    public static void main(String[] args){
        char[] test =  { 'a','b','c','d','f' };
        System.out.println(MissingLetter.findmissingLetter(test));
    }

    public static char findmissingLetter(char[] array){
        char missingChar = ' ';
        for(int i=0;i<array.length-1;i++){
            if((int)array[i+1] - (int)array[i] != 1){
                missingChar = (char)((int)array[i]+1);
            }
        }
        return missingChar;
    }

}
