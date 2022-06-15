package steps;

public class BracketsCheck {
    public boolean checkBrackets(String NewExpression) {
    char openBracket = '(';
    char closeBracket = ')';
    int count = 0;


        for(
    int i = 0; i<NewExpression.length();i++)

    { //we are checking if any of the symbols is a bracket and change the score if yes
        if (count >= 0) {                          // if the score does not go under 0 it means that ")" is not used before "("
            if (NewExpression.charAt(i) == openBracket) {
                count++;
            } else {
                if (NewExpression.charAt(i) == closeBracket) {
                    count--;

                }
            }
        } else {
            System.out.println("Expression is incorrect!");
            return false;
        }
    }

        //we are checking if all of "(" are closed
        return count == 0;
    }}
