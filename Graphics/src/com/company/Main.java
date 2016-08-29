package com.company;

public class Main {

    public static void main(String[] args) {
        int N = 7;
        int M = 10;

        int [][] graph = {
                {0,1,0,0,1,0,1},
                {1,0,1,0,1,0,0},
                {0,1,0,0,1,0,0},
                {0,0,0,0,0,1,1},
                {1,1,1,0,0,1,1},
                {0,0,0,1,1,0,0},
                {1,0,0,1,1,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0}
        };

        for (int i = 0; i < graph.length; i++) {
            int amount = 0;
            for (int j = 0; j < graph[i].length; j++) {
                amount += graph[i][j];
            }
            System.out.println("перекресток номер " + i + " - " + amount + " светофоров");
        }
    }
}
