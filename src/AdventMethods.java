public class AdventMethods {
    private String currentLine;

    public AdventMethods(String input) {
        currentLine = input;
    }

    public String findFirstNumber() {
        int index = 0;
        int firstDigitIndex = 0;
        int firstDigitWordIndex = 0;
        boolean firstDigitFound = false;
        String firstDigitWordActual = "";
        for (int i = 0; i < currentLine.length(); i++) {
            if (Character.isDigit(currentLine.charAt(i))) {
                firstDigitIndex = i;
                i = currentLine.length();
                firstDigitFound = true;
            }
        }
        if (firstDigitFound = false) {
            firstDigitIndex = -1;
        }
        if (currentLine.contains("one")) {
            if (currentLine.indexOf("one") <= firstDigitWordIndex) {
                firstDigitIndex = currentLine.indexOf("one");
                firstDigitWordActual = "one";
            }
        }
        if (currentLine.contains("two")) {
            if (currentLine.indexOf("two") <= firstDigitWordIndex) {
                firstDigitIndex = currentLine.indexOf("two");
                firstDigitWordActual = "two";

            }
        }
        if (currentLine.contains("three")) {
            if (currentLine.indexOf("three") <= firstDigitWordIndex) {
                firstDigitIndex = currentLine.indexOf("three");
                firstDigitWordActual = "three";

            }
        }
        if (currentLine.contains("four")) {
            if (currentLine.indexOf("four") <= firstDigitWordIndex) {
                firstDigitIndex = currentLine.indexOf("four");
                firstDigitWordActual = "four";

            }
        }
        if (currentLine.contains("five")) {
            if (currentLine.indexOf("five") <= firstDigitWordIndex) {
                firstDigitIndex = currentLine.indexOf("five");
                firstDigitWordActual = "five";

            }
        }
        if (currentLine.contains("six")) {
            if (currentLine.indexOf("six") <= firstDigitWordIndex) {
                firstDigitIndex = currentLine.indexOf("six");
                firstDigitWordActual = "six";

            }
        }
        if (currentLine.contains("seven")) {
            if (currentLine.indexOf("seven") <= firstDigitWordIndex) {
                firstDigitIndex = currentLine.indexOf("seven");
                firstDigitWordActual = "seven";

            }
        }
        if (currentLine.contains("eight")) {
            if (currentLine.indexOf("eight") <= firstDigitWordIndex) {
                firstDigitIndex = currentLine.indexOf("eight");
                firstDigitWordActual = "eight";

            }
        }
        if (currentLine.contains("nine")) {
            if (currentLine.indexOf("nine") <= firstDigitWordIndex) {
                firstDigitIndex = currentLine.indexOf("nine");
                firstDigitWordActual = "nine";

            }
        }
        if (firstDigitIndex < firstDigitWordIndex) {
            return currentLine.charAt(firstDigitIndex) + "";
        } else {
            if (firstDigitWordActual.equals("one")) {
                return "1";
            }
            if (firstDigitWordActual.equals("two")) {
                return "2";
            }
            if (firstDigitWordActual.equals("three")) {
                return "3";
            }
            if (firstDigitWordActual.equals("four")) {
                return "4";
            }
            if (firstDigitWordActual.equals("five")) {
                return "5";
            }
            if (firstDigitWordActual.equals("six")) {
                return "6";
            }
            if (firstDigitWordActual.equals("seven")) {
                return "7";
            }
            if (firstDigitWordActual.equals("eight")) {
                return "8";
            }
            if (firstDigitWordActual.equals("nine")) {
                return "9";
            }
        }
        return "";
    }
    public String findLastNumber() {
        int index = currentLine.length() -1;
        boolean lastDigitFound = false;
        int lastDigitIndex = 0;
        int lastDigitWordIndex = 0;
        String lastDigitWordActual = "";
        while (index >= 0  && !lastDigitFound) {
            if (Character.isDigit(currentLine.charAt(index))) {
                lastDigitFound = true;
                lastDigitIndex = index;
            }else {
                index --;
            }
        }
        if (currentLine.contains("one")) {
            if (currentLine.indexOf("one") >= lastDigitWordIndex) {
                lastDigitWordIndex = currentLine.indexOf("one");
                lastDigitWordActual = "one";
            }
        }
        if (currentLine.contains("two")) {
            if (currentLine.indexOf("two") >= lastDigitWordIndex) {
                lastDigitWordIndex = currentLine.indexOf("two");
                lastDigitWordActual = "two";

            }
        }
        if (currentLine.contains("three")) {
            if (currentLine.indexOf("three") >= lastDigitWordIndex) {
                lastDigitWordIndex = currentLine.indexOf("three");
                lastDigitWordActual = "three";

            }
        }
        if (currentLine.contains("four")) {
            if (currentLine.indexOf("four") >= lastDigitWordIndex) {
                lastDigitWordIndex = currentLine.indexOf("four");
                lastDigitWordActual = "four";

            }
        }
        if (currentLine.contains("five")) {
            if (currentLine.indexOf("five") >= lastDigitWordIndex) {
                lastDigitWordIndex = currentLine.indexOf("five");
                lastDigitWordActual = "five";

            }
        }
        if (currentLine.contains("six")) {
            if (currentLine.indexOf("six") >= lastDigitWordIndex) {
                lastDigitWordIndex = currentLine.indexOf("six");
                lastDigitWordActual = "six";

            }
        }
        if (currentLine.contains("seven")) {
            if (currentLine.indexOf("seven") >= lastDigitWordIndex) {
                lastDigitWordIndex = currentLine.indexOf("seven");
                lastDigitWordActual = "seven";

            }
        }
        if (currentLine.contains("eight")) {
            if (currentLine.indexOf("eight") >= lastDigitWordIndex) {
                lastDigitWordIndex = currentLine.indexOf("eight");
                lastDigitWordActual = "eight";

            }
        }
        if (currentLine.contains("nine")) {
            if (currentLine.indexOf("nine") >= lastDigitWordIndex) {
                lastDigitWordIndex = currentLine.indexOf("nine");
                lastDigitWordActual = "nine";

            }
        }
        if (lastDigitIndex > lastDigitWordIndex) {
            return currentLine.charAt(lastDigitIndex ) + "";
        } else {
            if (lastDigitWordActual.equals("one")) {
                return "1";
            }
            if (lastDigitWordActual.equals("two")) {
                return "2";
            }
            if (lastDigitWordActual.equals("three")) {
                return "3";
            }
            if (lastDigitWordActual.equals("four")) {
                return "4";
            }
            if (lastDigitWordActual.equals("five")) {
                return "5";
            }
            if (lastDigitWordActual.equals("six")) {
                return "6";
            }
            if (lastDigitWordActual.equals("seven")) {
                return "7";
            }
            if (lastDigitWordActual.equals("eight")) {
                return "8";
            }
            if (lastDigitWordActual.equals("nine")) {
                return "9";
            }
        }
        return "";

    }
}
