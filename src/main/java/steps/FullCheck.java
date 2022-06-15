package steps;

public class FullCheck {
    public FullCheck(String newExpression) {

    }

    public static boolean fullCheck(String NewExpression){
    BracketsCheck bracketsCheck = new BracketsCheck(); //checking brackets...
        if (Boolean.TRUE.equals(bracketsCheck.checkBrackets(NewExpression))){



            LettersCheck lettersCheck = new LettersCheck();//checking letters...
             if (Boolean.TRUE.equals(lettersCheck.checkLetters(NewExpression))){


                 neighboursCheck neighboursCheck = new neighboursCheck();//checking neighbour symbols...
                 return Boolean.TRUE.equals(neighboursCheck.checkNeighbours(NewExpression));

}}
        else {System.out.println("Expression is invalid!");}
        return false;
    }}
