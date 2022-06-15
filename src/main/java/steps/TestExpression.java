package steps;
import java.util.Scanner;




public class TestExpression {
    public static void main(String[] args){
            Scanner expression = new Scanner(System.in);
            System.out.println("Enter your expression:");//scanner asks to input the expression
            String NewExpression = expression.nextLine();

         BracketsCheck bracketsCheck = new BracketsCheck();
         bracketsCheck.checkBrackets(NewExpression);

         LettersCheck lettersCheck = new LettersCheck();
         lettersCheck.checkLetters(NewExpression);


         neighboursCheck neighboursCheck = new neighboursCheck();
         neighboursCheck.checkNeighbours(NewExpression);

         ExpressionsCalc expressionsCalc = new ExpressionsCalc();
         expressionsCalc.calculateExpression(NewExpression);

         DatabaseConnection databaseConnection = new DatabaseConnection();
         databaseConnection.connectDatabase();


    }}

