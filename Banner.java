//Antje Cramer
//9/26/2022
//Prints the phrase with a cute banner
//Time elapsed: 15 minutes

public class Banner {
    public static void main(String[] args) {

        String decorline = "";
        //Ask for a phrase
        //ask for a character

        System.out.print("Enter a phrase: ");
        String phrase = System.console().readLine();

        System.out.print("Enter a decorator character: ");
        String decor = System.console().readLine();

        //Figure out how long the phrase is
        //Print out the decorator character as many times as characters in the phrase
        //Append it to a string each loop. that way you can just print it again
        //Print out the character + space + the phrase + space + character
        //print out decorator character row again

        int length = phrase.length();

        for(int i = 0; i < (length + 4); i++){
            decorline = decorline + decor;            
        }

        System.out.println(decorline);
        System.out.println(decor + " " + phrase + " " + decor);
        System.out.println(decorline);
    }}