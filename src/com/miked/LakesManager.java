package com.miked;

import java.util.*;

public class LakesManager {

    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {

        Lakes cedar = new Lakes("Cedar");
        cedar.addTime(45.15);
        cedar.addTime(43.42);

        cedar.writeRunningtimes();
        cedar.writeFastestTime();

        Lakes harriet = new Lakes("Harriet");
        harriet.addTime(49.34);
        harriet.addTime(44.43);
        harriet.addTime(46.22);

        harriet.writeRunningtimes();
        harriet.writeFastestTime();

        Lakes como = new Lakes("Como");
        como.addTime(32.11);
        como.addTime(28.14);

        como.writeRunningtimes();
        como.writeFastestTime();

        System.out.println("Lake Name?");
        String lakeName = stringScanner.nextLine();
        

    }


//    //Ask the user how many training run times they would like to enter
//        System.out.println("How many training runs would you like to enter?");
//    int quantity = numberScanner.nextInt();
//    //for loop to enter desired number of training runs
//        for(
//    int i = 0;
//    i<quantity;i++)
//
//    {
//        //have user enter lake name(s)
//        System.out.println("What lake did you run around?");
//        String lakeName = stringScanner.nextLine();
//        //have user enter time for that lake
//        System.out.println("What was your time?");
//        Double newTime = numberScanner.nextDouble();
//        //create array list for times and add it to the list
//        ArrayList<Double> timeArray = new ArrayList<>();
//        timeArray.add(newTime);
//    }
}
//
//            //boolean variable to check if the lake exists in the hashmap
//            boolean containsLakeName = trainingTimes.containsKey(lake);
//            //if the lake does not exist in the data, add it
//            if(!containsLakeName){
//                ArrayList<Double> newTimes = new ArrayList<>();
//                newTimes.add(times);
//                trainingTimes.put(lake, newTimes);
//            //if the lake does exist, add the new time to the list
//            }else{
//                List timeList = (List)trainingTimes.get(lake);
//                timeList.add(times);

