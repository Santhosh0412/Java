public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "I love   java programming";
        String reversedSentence = reverseSentence(sentence);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
    public static String reverseSentence(String sentence) {
        String[] words = sentence.trim().replaceAll("\\s+", " ").split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
