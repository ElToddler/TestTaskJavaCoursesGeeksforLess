package steps;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class ExpressionsCalc {

    public float calculateExpression (String NewExpression){
    Expression calculator = new ExpressionBuilder(NewExpression).build();
    double result = calculator.evaluate();
        System.out.println(result);
        return 0;
    }}
