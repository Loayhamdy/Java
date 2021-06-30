public class Main {

    public static void main(String[] args) {

        StringUtils test = new StringUtils();
        String one = test.betterString("loay", "hamdy", (str1, str2) -> str1.length() > str2.length());
        System.out.println(one);

        Boolean result = test.isLetter("loay", StringUtils::allLetters);
        System.out.println(result);


    }
    
}
