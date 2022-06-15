package steps;
import java.util.Scanner;

public class TestExpression {
    public static void main(String[] args){
            Scanner expression = new Scanner(System.in);
            System.out.println("Enter your expression:");//scanner asks to input the expression
            String NewExpression = expression.nextLine();

       {
        FullCheck fullCheck;
           new FullCheck(NewExpression);
           if (Boolean.TRUE.equals(FullCheck.fullCheck(NewExpression))){

         ExpressionsCalc expressionsCalc = new ExpressionsCalc();//if all is ok calculating the expression
         double expressionResult = expressionsCalc.calculateExpression(NewExpression);

         DatabaseConnection databaseConnection = new DatabaseConnection();//establishing database connection
         databaseConnection.connectDatabase();



    }}
        CountNumbers countNumbers = new CountNumbers();
        countNumbers.countNumbers(NewExpression);
    }}



