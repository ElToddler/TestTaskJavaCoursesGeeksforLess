package steps;

public class neighboursCheck {
    public boolean checkNeighbours(String NewExpression){
    String beforeRegex   = ".*[/*+(-].*"; //opening bracket and "-" can not be followed by math symbol
    String afterRegex = ".*[/*+)].*"; //closing bracket can't have math symbol before it
        for (int i = 0; i<NewExpression.length()-1;i++) {  //-1 is to compensate +1 for comparing pairs and avoid errors
        char firstNeighbourChar = NewExpression.charAt(i); //getting a character from the expression
        char secondNeighbourChar = NewExpression.charAt(i+1);
        String firstNeighbour = String.valueOf(firstNeighbourChar); //transforming it to string to access string methods
        String secondNeighbour = String.valueOf(secondNeighbourChar);

        if (firstNeighbour.matches(beforeRegex) && secondNeighbour.matches(afterRegex)){ //two of the neighbours should not be symbols
            System.out.println("Expression is incorrect!");
            return false;
        }
    }

        return true;

    }

}
