package SimpleDotCom;

import java.util.*;
public class testDrive {
    public static void main (String[] args){
        simpleDotCom dot = new simpleDotCom();
        int rand = (int)(Math.random()*5);
        Integer[] loc = {rand,rand+1,rand+2};
        ArrayList<Integer> locArray = new ArrayList<Integer>();
        locArray.addAll(Arrays.asList(loc));
        int numberOfGuess = 0;
        boolean stillAlive=true;
        dot.setLocationCells(locArray);
        Scanner s = new Scanner(System.in);
        while(stillAlive){
            numberOfGuess++;
            System.out.println("Come On 胖丁");
            String stringGuess = s.nextLine();
            String result = dot.checkYourself(stringGuess);
            System.out.println(result);
            if(result=="kill"){
                stillAlive=false;
            }
        }
        System.out.println("You take "+numberOfGuess+" guesses");
    }
}
