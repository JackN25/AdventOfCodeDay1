public class AdventMethods {
    private String currentLine;

    public AdventMethods(String input) {
        currentLine = input;
    }

    public String findFirstNumber(){
        int index  = 0;
        for (int i = 0; i < currentLine.length(); i++) {
            if (Character.isDigit(currentLine.charAt(i))) {
                index = i;
                i = currentLine.length();
            }
        }
        return currentLine.charAt(index) + "";
    }

    public String findLastNumber(){
        int index = 0;
        for (int i = currentLine.length() - 1; i >= 0; i--) {
            if (Character.isDigit(currentLine.charAt(i))) {
                index = i;
                i = -1;
            }
        }
        return currentLine.charAt(index) + "";

    }

    public void replaceWords(){
        if(currentLine.contains("oneight")) {
            currentLine = currentLine.replace("oneight", "18");
        }
        if(currentLine.contains("sevenine")) {
            currentLine = currentLine.replace("sevenine", "79");
        }
        if(currentLine.contains("twone")) {
            currentLine = currentLine.replace("twone", "21");
        }
        if(currentLine.contains("eightwo")) {
            currentLine = currentLine.replace("eightwo", "82");
        }
        if(currentLine.contains("one")) {
            currentLine = currentLine.replace("one", "1");
        }
        if(currentLine.contains("two")) {
            currentLine = currentLine.replace("two", "2");
        }
        if(currentLine.contains("three")) {
            currentLine = currentLine.replace("three", "3");
        }
        if(currentLine.contains("four")) {
            currentLine = currentLine.replace("four", "4");
        }
        if(currentLine.contains("five")) {
            currentLine = currentLine.replace("five", "5");
        }
        if(currentLine.contains("six")) {
            currentLine = currentLine.replace("six", "6");
        }
        if(currentLine.contains("seven")) {
            currentLine = currentLine.replace("seven", "7");
        }
        if(currentLine.contains("eight")) {
            currentLine = currentLine.replace("eight", "8");
        }
        if(currentLine.contains("nine")) {
            currentLine = currentLine.replace("nine", "9");
        }
    }
}
