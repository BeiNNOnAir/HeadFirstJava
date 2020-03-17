package SimpleDotCom;

import java.util.ArrayList;
import java.util.Scanner;

public class simpleDotCom {
    int numberOfHit = 0;
    ArrayList<Integer> locationCells = new ArrayList<Integer>();
    public void setLocationCells(ArrayList<Integer> loc){
        locationCells = loc;
    }
    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result ="miss";
        boolean ifIn = locationCells.contains(guess);
        if (ifIn==true){
            locationCells.remove(locationCells.indexOf(guess));
            if(locationCells.isEmpty()){
                result="kill";
            }else {
                result="hit";
            }
        }
        return result;
    }
}

