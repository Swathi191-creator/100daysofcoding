package day35;

public class checkingStrings {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String arrayOne=concatenate(word1);
        String arrayTwo=concatenate(word2);
        return arrayOne.equals(arrayTwo);
    }
    public String concatenate(String[] str){
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<str.length;i++){
            builder.append(str[i]);
        }
        return builder.toString();
    }
}
