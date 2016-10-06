package com.miked;

import java.util.*;

public class LakesManager {

    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {
        //create lake objects and add times to them
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
        //New list for all lakes and times, add current lakes and times to that
        ArrayList<Lakes> allLakesAndtimes = new ArrayList<Lakes>();
        allLakesAndtimes.add(cedar);
        allLakesAndtimes.add(harriet);
        allLakesAndtimes.add(como);

        try {//ask user for lake name, if it exists add to it, if not, make a new one
            System.out.println("Enter name of lake, enter to quit");
            String lakeName = stringScanner.nextLine();
            if(lakeName.contains(Lakes.class.getName())) {
                while (lakeName.length() != 0) {
                    //new Lakes object
                    Lakes lake = new Lakes(lakeName);
                    //ask user to enter time for the new lake
                    System.out.println("Time for " + lakeName + " enter 0 to quit");  //todo could be more user friendly
                    double time = numberScanner.nextDouble();
                    //add the time(s) to the lake, enter 0 to quit
                    while (time != 0) {
                        lake.addTime(time);
                        //keep asking until user enters 0
                        System.out.println("Time for " + lakeName + " enter 0 to quit");  //todo could be more user friendly
                        time = numberScanner.nextDouble();

                    }
                    //Got all the times? Add Lakes object to a list
                    allLakesAndtimes.add(lake);

                    //And ask for next lake
                    System.out.println("Enter name of lake, enter to quit");
                    lakeName = stringScanner.nextLine();
                }
                //write all times and fastest times for each lake
                allLakesAndtimes.forEach(Lakes::writeRunningtimes);
                allLakesAndtimes.forEach(Lakes::writeFastestTime);
            }
            else {
                while (lakeName.length() !=0 ){
                    System.out.println("Time for " + lakeName + " enter 0 to quit.");
                    double time = numberScanner.nextDouble();
                    while (time != 0){
                        //TODO figure out how to add to the current lake
                        System.out.println("UNDER CONSTRUCTION");
                        break;

                    }
                }
            }
        }//input validation (sort of) for numbers
        catch (InputMismatchException ime){
            System.out.println("Error, please check your input and try again\n"
            + ime);
        }

    }

}