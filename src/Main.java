import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {
        int sum = 0;
        File f = null;
        try {
            f = new File("inputFile");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String currentLine = s.nextLine();
                AdventMethods a = new AdventMethods(currentLine);
                String firstDigit = a.findFirstNumber();
                String lastDigit = a.findLastNumber();
                sum += Integer.parseInt(firstDigit + lastDigit);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println(sum);
    }
}