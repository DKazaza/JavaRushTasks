package com.javarush.task.task21.task2113;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Hippodrome {
    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    private List<Horse> horses;
    public List<Horse> getHorses() {
        return horses;
    }
    static Hippodrome game;

    void run(){
        for(int i=0; i<100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            }
            catch (Exception e) {}
        }
    }
    void move(){
        for(Horse curh: horses) {
            curh.move();
        }
    }
    void print(){
        for(Horse curh: horses) {
            curh.print();
        }
        for (int i=0; i<10; i++)
            System.out.println();
    }

    public Horse getWinner(){
        Horse top = horses.get(0);
        for (Horse curh : horses) {
            if(curh.getDistance()> top.getDistance())
                top = curh;
        }
        return top;
    }
    public void printWinner(){
        System.out.println("Winner is "+getWinner().getName()+"!");
    }

    public static void main(String[] args) {
        List<Horse> horses1 = new ArrayList<>();
        Horse n1 = new Horse("Diego", 3, 0);
        Horse n2 = new Horse("Amigo", 4, 0);
        Horse n3 = new Horse("Bulba", 3, 0);
        horses1.add(n1);
        horses1.add(n2);
        horses1.add(n3);
        game = new Hippodrome(horses1);
        game.run();
        game.printWinner();

    }
}
