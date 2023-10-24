package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> pastCalculations;
    public Calculator(){
        pastCalculations = new ArrayList<>();
    }

    public void addCalculation(String calculation){
        pastCalculations.add(calculation);
    }

    public  List<String> getPastCalculations(){
        return pastCalculations;
    }

    public void printPastCalculations(){
        for(String s: pastCalculations){
            System.out.println(s);
        }
    }



}
