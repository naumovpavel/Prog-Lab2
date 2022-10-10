package com.company;

import com.company.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Moltres("Tanjiro");
        Pokemon p2 = new Sylveon("Nezuko");
        Pokemon p3 = new Ralts("Zenitsu");
        Pokemon p4 = new Eevee("Inosuke");
        Pokemon p5 = new Kirlia("Giyu");
        Pokemon p6 = new Gallade("Sakonji");
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        //b.go();
        int[][] dp = new int[5][8];
        for(int i = 0; i < 5; i++) {
            dp[i][7] = 1;
        }
        for(int j = 0; j < 8; j++) {
            dp[4][j] = 1;
        }
        for(int i = 3; i >= 0; i--) {
            for(int j = 6; j >= 0; j--) {
                dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 8; j++) {
                System.out.printf("%4d", dp[i][j]);
            }
            System.out.println();
        }
    }
}
