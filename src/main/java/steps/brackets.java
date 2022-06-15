package steps;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.SQLException;



public class brackets {
    public static void main(String[] args){
            Scanner expression = new Scanner(System.in);
            System.out.println("Enter your expression:");//scanner asks to input the expression
            String NewExpression = expression.nextLine();


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
//            System.out.println("Brackets are incorrect!");
            break;
        }
    }

       if(count != 0)

    {   //we are checking if all of "(" are closed
        System.out.println("Brackets are incorrect!");
    } else

    {
        System.out.println("Brackets are correct!");
    }

        String alphRegex   = ".*[A-Z, a-z].*"; //check for letters and other non-math symbols
        String symbRegex = ".*[!@#$%^&~?>=<{}].*";
        String cyrRegex = ".*[А-Я, а-я].*";

        if (NewExpression.matches(alphRegex) || NewExpression.matches(symbRegex) || NewExpression.matches(cyrRegex)) {
            System.out.println("Contains invalid symbols!");
        }   else {
            System.out.println("Does not contain letters!");
        }

        String beforeRegex   = ".*[/*+(-].*"; //opening bracket and "-" can not be followed by math symbol
        String afterRegex = ".*[/*+)].*"; //closing bracket can't have math symbol before it
        for (int i = 0; i<NewExpression.length()-1;i++) {  //-1 is to compensate +1 for comparing pairs and avoid errors
            char firstNeighbourChar = NewExpression.charAt(i); //getting a character from the expression
            char secondNeighbourChar = NewExpression.charAt(i+1);
            String firstNeighbour = String.valueOf(firstNeighbourChar); //transforming it to string to access string methods
            String secondNeighbour = String.valueOf(secondNeighbourChar);

            if (firstNeighbour.matches(beforeRegex) && secondNeighbour.matches(afterRegex)){ //two of the neighbours should not be symbols
                System.out.println("Expression is invalid!");
                break;
            }
        }

        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn =
                    DriverManager.getConnection("jdbc:mysql://sql4.freemysqlhosting.net:3306", "sql4499788", "UMg8wJbG47");

            System.out.println("Connection to Store DB succesfull!");


        } catch (SQLException | ClassNotFoundException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());

    }
        Expression calculator = new ExpressionBuilder(NewExpression).build();
        double result = calculator.evaluate();
        System.out.println(result);

    }}

