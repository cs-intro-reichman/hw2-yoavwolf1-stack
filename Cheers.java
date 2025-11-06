// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        
        //receiving the input and declaring the variables
        String word = args[0].toUpperCase();
        int rounds = Integer.parseInt(args[1]);
        String AnLetters = "AEFHILMNORSX"; //all the letters that need "an" before them 
        String AorAN = ""; // this variable holds "a " or "an "
        char letter = ' ';
        int i = 0;

        //goes over all the letters in the input word and prints by the required format
        while(i < word.length()) {
            letter = word.charAt(i);
            //checks if that letter requires "a" or "an" before it
            if(AnLetters.indexOf(letter) == -1) AorAN = "a ";
            else AorAN = "an ";
            System.out.println("Give me " + AorAN + letter + ": " + letter + "!");
            i++;
        }
        System.out.println("What does that spell?");

        //prints the input word X times (X is given via the input)
        i = 0;
        while(i < rounds){
            System.out.println(word + "!!!");
            i++;
        }
    }
}