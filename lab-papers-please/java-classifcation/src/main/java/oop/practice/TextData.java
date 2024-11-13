package oop.practice;

public class TextData {
    String FileName;
    String text;
    int numberOfVowels;
    int numberOfConsonants;
    int numberOfLetters;
    int numberOfSentences;
    String longestWord;

    public TextData(String FileName, String text) {
        this.FileName = FileName;
        this.text = text;
        this.numberOfVowels = countCharacters("[aeiouyAEIOUY]");
        this.numberOfConsonants = countCharacters("[bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ]");
        this.numberOfLetters = countLetters();
        this.numberOfSentences = countSentences();
        this.longestWord = findLongestWord();
    }

    public String getFileName() {
        return FileName;
    }
    public String getText() {
        return text;
    }
    public int getNumberOfVowels() {
        return numberOfVowels;
    }
    private int countCharacters(String regex) {
        return text.replaceAll("[^" + regex + "]", "").length();
    }
    public int getNumberOfConsonants() {
        return numberOfConsonants;
    }
    public int getNumberOfLetters() {
        return numberOfLetters;
    }
    private int countLetters() {
        return text.replaceAll("[^a-zA-Z]", "").length();
    }
    public int getNumberOfSentences() {
        return numberOfSentences;
    }
    private int countSentences() {
        if (!text.matches(".*[.!?].*")) {
            return 0;
    }  String[] sentences = text.split("[.!?]+");
        return sentences.length;
    }
    public String getLongestWord() {
        return longestWord;
    }
    private String findLongestWord() {
        //splitting text by whitespace
        String[] words = text.split("[\\s]+");
        String longestWord = "";

        for (String word : words) {
            // all characters thar aren't words or -
            word = word.replaceAll("^[^a-zA-Z-]+|[^a-zA-Z-]+$", "");

            //if the word is valid
            if (!word.isEmpty() && word.matches("[a-zA-Z-]+")) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        //to not have null
        return longestWord.isEmpty() ? "" : longestWord;
    }



}
