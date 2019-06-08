package com.javagda25.zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainZad1b {
    public static void main(String[] args) {
        // do generowania tworzę random (generator)
        Random generator = new Random();

        // do wczytywania tworzę scanner
        Scanner scanner = new Scanner(System.in);

        // do wpisywania (przechowywania) tworzymy listę
        List<Integer> lista = new ArrayList<>();

        System.out.println("Podaj ilosc wczytanych liczb od uzytkownika: ");
        int iloscObiegowPetliScannera = scanner.nextInt();

        System.out.println("Podaj ilosc wylosowanych liczb:");
        int iloscObiegowPetliRandom = scanner.nextInt();

        // wczytanie liczb ze scannera
        while ((iloscObiegowPetliScannera--) > 0) {
            System.out.println("Podaj liczbę:");
            int liczbaZaladowana = scanner.nextInt();
            lista.add(liczbaZaladowana);
        }

        // wczytanie liczb z generatora
        while (iloscObiegowPetliRandom-- > 0) {
            int liczbaZaladowana = generator.nextInt(1000);
            lista.add(liczbaZaladowana);
        }

        // wypisanie listy
        System.out.println(lista);

        // sumowanie listy
        double suma = 0;
        for (Integer elementListy : lista) {
            suma += elementListy;
        }

        // wypisuję wynik na ekran
        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + (suma / lista.size()));
    }
}
