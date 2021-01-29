public class StringFunctions {
    public String reversestring(String str){



        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(str);

        // reverse StringBuilder input1
        input1=input1.reverse();

        // print reversed String
        return (input1.toString());


}
    public int getlength(String str){
        return str.length();

    }
}