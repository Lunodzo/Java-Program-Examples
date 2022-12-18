public class CountCharacter{
    public static void main(String[] args) {
        String myString = "raaandom";
        char myChar = 'a';
        int counter = 0;

        for(int i = 0;i<myString.length();i++){
            if (myString.charAt(i) == myChar) {
                counter++;
            }
        }
        System.out.printf("There are %d characters\n", +counter);
    }
}

//THIS PROGRAM HOW MANY TIME CHARACTER myChar HAS APPEARED IN THE WORD HELP IN myString