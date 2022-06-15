package steps;
import java.util.Scanner;

public class TestExpression {
    public static void main(String[] args){
            Scanner expression = new Scanner(System.in);
            System.out.println("Enter your expression:");//scanner asks to input the expression
            String NewExpression = expression.nextLine();

         BracketsCheck bracketsCheck = new BracketsCheck(); //checking brackets...
        if (Boolean.TRUE.equals(bracketsCheck.checkBrackets(NewExpression))){



         LettersCheck lettersCheck = new LettersCheck();//checking letters...
         if (Boolean.TRUE.equals(lettersCheck.checkLetters(NewExpression))){


         neighboursCheck neighboursCheck = new neighboursCheck();//checking neighbour symbols...
        if (Boolean.TRUE.equals(neighboursCheck.checkNeighbours(NewExpression))){

         ExpressionsCalc expressionsCalc = new ExpressionsCalc();//if all is ok calculating the expression
         expressionsCalc.calculateExpression(NewExpression);

         DatabaseConnection databaseConnection = new DatabaseConnection();//establishing database connection
         databaseConnection.connectDatabase();



    }}}
        else {System.out.println("Expression is invalid!");}
    }}

