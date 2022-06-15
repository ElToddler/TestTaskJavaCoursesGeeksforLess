package steps;

public class CountNumbers {
    public void countNumbers(String NewExpression) {
        String numRegex = ".*[0-9].*"; //
        int counter = 0;

        for (int i = 0; i<NewExpression.length();i++) {
            char isNumber = NewExpression.charAt(i);
            String isANumber = String.valueOf(isNumber);

            if (isANumber.matches(numRegex)){ //checking symbols one by one
                counter++;

            }
        }
        System.out.println("This expression contains "+ counter + " numbers.");
        }}
