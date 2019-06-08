package com.javagda25.zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaA = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listaA.add(new Random().nextInt(1000));
        }

        double sum = 0.0;
        for (Integer element : listaA) {
            sum += element;
        }
        System.out.println("Suma: " + sum);
        System.out.println("Średnia: " + (sum / listaA.size()));

        // kopiowanie elementów listy A do listy B
        List<Integer> listaB = new ArrayList<>(listaA);
        Collections.sort(listaB);
//        listaB.addAll(listaA); // alternatywa dla kopiowania elementów z listy A do listy B

        if (listaB.size() % 2 == 0) { // parzysta
            int indeksLewySrodkowy = (listaB.size() / 2) - 1;
            int indeksPrawySrodkowy = (listaB.size() / 2);

            double mediana = (listaB.get(indeksLewySrodkowy) + listaB.get(indeksPrawySrodkowy)) / 2.0;

            System.out.println("Mediana: " + mediana);
        } else { //
            int indeksSrodkowy = (listaB.size() / 2);
            int mediana = listaB.get(indeksSrodkowy);

            System.out.println("Mediana: " + mediana);
        }

        int min = listaA.get(0);
        int max = listaA.get(0);

        for (Integer elementListy : listaA) {
            if (min > elementListy) {
                min = elementListy;
            }
            if (max < elementListy) {
                max = elementListy;
            }
        }
        System.out.println("Min:" + min);
        System.out.println("Max:" + max);

        // znajdowanie indeksu maksymalnego elementu i minimalnego elmementu
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < listaA.size(); i++) {
            if (max == listaA.get(i)) {
                indexMax = i;
            }
            if (min == listaA.get(i)) {
                indexMin = i;
            }
        }
        System.out.println("Index max: " + indexMax);
        System.out.println("Index min: " + indexMin);

        // znajdowanie indeksów maksymalnego elementu i minimalnego elementu
        System.out.println("Index max (indexof):" + listaA.indexOf(max));
        System.out.println("Index min (indexof):" + listaA.indexOf(min));
    }


}