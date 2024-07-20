/*Write a Java program to replace all spaces in a sentence with #. 
All continuous spaces should be replaced with only one #. 
Example: There are   3   spaces. Should become: There#are#3#spaces.*/

public class ReplaceSpaces {

    public static void main(String[] args) {

        String input = "There are   3   spaces";

        String replaced = replaceSpaces(input);

        System.out.println("Orignal - " + input);
        System.out.println("Replace - " + replaced);

    }

    public static String replaceSpaces(String input) {
        String replaced = input.replaceAll("\\s+", "#");
        return replaced;
    }

}
