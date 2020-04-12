
import java.util.Scanner;

public class StringByWordLength {

    public static void main(String[] args) {

        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        StringBuilder newSentence = new StringBuilder();
        String[] sentenceArray = null;

        sentenceArray = sentence.split(" ");

        for (int i = 0; i < sentenceArray.length; i++) {

            for (int j = 0; j < sentenceArray.length - i - 1; j++) {

                if (sentenceArray[j + 1].length() < sentenceArray[j].length()) {

                    String temp = sentenceArray[j + 1];
                    sentenceArray[j + 1] = sentenceArray[j];
                    sentenceArray[j] = temp;
                }
            }
        }

        for (int i = 0; i < sentenceArray.length; i++) {

            newSentence.append(sentenceArray[i]);
            newSentence.append(" ");
        }

        System.out.println(newSentence);
    }
}