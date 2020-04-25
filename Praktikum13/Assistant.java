package Praktikum13;

import java.util.*;

class Assistant {
    private int salary;
    private List recommendations;

    Assistant(int salary) {
        this.salary = salary;
        recommendations = new ArrayList();
    }

    private void addPersonToRecommendations(String name) {
        this.recommendations.add(name);
    }

    public void check(){
        for (Object o: recommendations){
            System.out.println(o);
        }
    }
}