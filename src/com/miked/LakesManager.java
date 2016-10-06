package com.miked;

import java.util.*;

public class LakesManager {

    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {

        Lakes cedar = new Lakes("Cedar");
        cedar.addTime(45.15);
        cedar.addTime(43.42);

        Lakes harriet = new Lakes("Harriet");
        harriet.addTime(49.34);
        harriet.addTime(44.43);
        harriet.addTime(46.22);

        Lakes como = new Lakes("Como");
        como.addTime(32.11);
        como.addTime(28.14);

        ArrayList<Lakes> allLakesAndtimes = new ArrayList<Lakes>();
        allLakesAndtimes.add(cedar);
        allLakesAndtimes.add(harriet);
        allLakesAndtimes.add(como);

        try {
            System.out.println("Enter name of lake, enter to quit");
            String lakeName = stringScanner.nextLine();
            if(lakeName.contains(Lakes.class.getName())) {
                while (lakeName.length() != 0) {

                    Lakes lake = new Lakes(lakeName);

                    System.out.println("Time for " + lakeName + " enter 0 to quit");  //todo could be more user friendly
                    double time = numberScanner.nextDouble();
                    while (time != 0) {
                        lake.addTime(time);
                        System.out.println("Time for " + lakeName + " enter 0 to quit");  //todo could be more user friendly
                        time = numberScanner.nextDouble();

                    }
                    //Got all the times? Add Lakes object to a list
                    allLakesAndtimes.add(lake);

                    //And ask for next lake
                    System.out.println("Enter name of lake, enter to quit");
                    lakeName = stringScanner.nextLine();
                }
                allLakesAndtimes.forEach(Lakes::writeRunningtimes);
                allLakesAndtimes.forEach(Lakes::writeFastestTime);
            }
            else {
                while (lakeName.length() !=0 ){
                    System.out.println("Time for " + lakeName + " enter 0 to quit.");
                    double time = numberScanner.nextDouble();
                    while (time != 0){
                        //TODO figure out how to add to the current lake

                    }
                }
            }
        }
        catch (InputMismatchException ime){
            System.out.println("Error, please check your input and try again\n"
            + ime);
        }

    }

}