
public class ReplaceSpaces {

    public static void main(String[] args) {
        String input = "There are   3   spaces.";
        String output = replaceSpacesWithHash(input);
        System.out.println(output);
    }

    public static String replaceSpacesWithHash(String sentence) {
        sentence = sentence.trim();
        return sentence.replaceAll("\\s+", "#");
    }
}
