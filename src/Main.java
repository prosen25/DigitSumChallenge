//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1000));
        System.out.println(sumDigits(5));
    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }

        int sumDigit = 0;
        while (number > 0) {
            sumDigit += number % 10;
            number = number / 10;
        }

        return sumDigit;
    }
}