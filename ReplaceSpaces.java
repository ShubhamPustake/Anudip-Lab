/*Write a Java program to replace all spaces in a sentence with #. 
All continuous spaces should be replaced with only one #. 
Example: There are   3   spaces. Should become: There#are#3#spaces.*/

public class ReplaceSpaces {

    public static void main(String[] args) {
        String sentence = "There are   3   spaces.";
        String result = replaceSpacesWithHash(sentence);
        System.out.println(result);
    }

    public static String replaceSpacesWithHash(String sentence) {
        StringBuilder result = new StringBuilder();
        boolean inSpace = false;

        for (char ch : sentence.toCharArray()) {
            if (ch == ' ') {
                if (!inSpace) {
                    result.append('#');
                    inSpace = true;
                }
            } else {
                result.append(ch);
                inSpace = false;
            }
        }

        return result.toString();
    }
}
