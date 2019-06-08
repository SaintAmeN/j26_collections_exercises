package com.javagda25.zad3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("123", "Pawel", "Gawel", Gender.MALE));
        students.add(new Student("234", "Marian", "Aawgf", Gender.MALE));
        students.add(new Student("546", "Lucjan", "Hawed", Gender.MALE));
        students.add(new Student("547", "Ania", "Jawrfhg", Gender.FEMALE));
        students.add(new Student("982", "Asia", "Ysaefsg", Gender.FEMALE));
        students.add(new Student("931", "Basia", "Oaegwseg", Gender.FEMALE));
        students.add(new Student("916", "Ewelina", "Qseg", Gender.FEMALE));
        students.add(new Student("782", "Florian", "Gsaasf", Gender.MALE));

        // wypisanie pierwszego obiektu
        System.out.println(students.get(0));
        // wypisanie wszystkich: ( pamiętaj o nadpisaniu metody toString w klasie Student!)
        System.out.println(students);


    }
}
