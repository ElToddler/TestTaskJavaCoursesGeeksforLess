package steps;

public class LettersCheck {
    public void checkLetters(String NewExpression) {
        String alphRegex = ".*[A-Z, a-z].*"; //check for letters and other non-math symbols
        String symbRegex = ".*[!@#$%^&~?>=<{}].*";
        String cyrRegex = ".*[А-Я, а-я].*";

        if (NewExpression.matches(alphRegex) || NewExpression.matches(symbRegex) || NewExpression.matches(cyrRegex)) {
            System.out.println("Contains invalid symbols!");
        } else {
            System.out.println("Does not contain letters!");
        }
    }}
