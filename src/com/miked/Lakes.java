package com.miked;

import java.util.ArrayList;

/**
 * Created by miked on 10/5/2016.
 */
public class Lakes {
    public String name;
    private ArrayList<Double> times;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<Double> times) {
        this.times = times;
    }

    public Lakes(String name){
        this.name = name;
        this.times = new ArrayList<Double>();
    }
    public void writeRunningtimes(){

        System.out.println("Lake: " + name + "\nTimes: " + getTimes());


    }
    public void addTime(Double time){
        times.add(time);
    }
    public double getFastestTime() {
        Double fastestTime = Double.MAX_VALUE;
        //find the fastest time for each lake
        for (Object o : times) {
            Double time = (Double) o;
            if (time < fastestTime)
                fastestTime = time;

        }
        return fastestTime;
    }
    public void writeFastestTime(){
        System.out.println("Your fastest time at " + name +
        " was " + getFastestTime());
    }
}
