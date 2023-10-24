public class MoreOperators {
    
    public static void main (String[] args) {

        int score = 10;
        //++score;
        --score;

        System.out.print (score);

    }

}


//You can make the ++ in its out line, or you can put it in the print line before the variable.
//Putting ++ in front of score is called prefixing
//If you put the ++ after the variable, it's called postfixing
//Post fixed operators will not change the variable until the expression has been evaluated -- You'll have ot include a separate print line