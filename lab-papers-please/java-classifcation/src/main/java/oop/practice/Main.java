package oop.practice;
public class Main {
    public static void main(String[] args) {
        Display display1 = new Display(3840, 2160, 163, "Samsung Odyssey G9");
        Display display2 = new Display(1920, 1080, 82, "HP Pavilion 22cwa");
        Display display3 = new Display(3440, 1440, 110, "Acer Predator X34");

        System.out.println("\nTask 1 the comparison of displays:");
        display1.compareSize(display2);
        display1.compareSharpness(display2);
        display2.compareSize(display3);
        display2.compareSharpness(display3);
        display1.compareWithMonitor(display3);

        Assistant assistant = new Assistant("Assisant");
        assistant.assignDisplay(display1);
        assistant.assignDisplay(display2);
        assistant.assignDisplay(display3);

        assistant.assist();


//reading the files
        String filePath = "/Users/suleimanpasa/oop-course-repo/lab-papers-please/java-classifcation/src/main/resources/text.txt";
        FileReader fileReader = new FileReader();
        String fileContent = fileReader.readFileIntoString(filePath);

        // creating TextData
        TextData textData = new TextData(filePath, fileContent);

        System.out.println("File name: " + textData.getFileName());
        System.out.println("File content: " + textData.getText());
        System.out.println("Number of vowels: " + textData.getNumberOfVowels());
        System.out.println("Number of consonants: " + textData.getNumberOfConsonants());
        System.out.println("Number of letters: " + textData.getNumberOfLetters());
        System.out.println("Number of sentences: " + textData.getNumberOfSentences());
        System.out.println("The longest word: " + textData.getLongestWord());
    }


}

