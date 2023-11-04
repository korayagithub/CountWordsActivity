import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter words/phrases/sentence here: ");
        String words = scanner.nextLine();

        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}
