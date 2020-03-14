package SimpleDotCom;

import java.util.Scanner;

public class simpleDotCom {
    int numberOfHit = 0;
    int locationCells[];
    public void setLocationCells(int[] loc){
        locationCells = loc;
    }
    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result ="miss";
        for(int cell:locationCells) {
            if (guess == cell) {
                result = "hit";
                numberOfHit++;
                break;
            }
        }
        if(numberOfHit==locationCells.length){
            result="kill";
        }
        return result;
    }
}

