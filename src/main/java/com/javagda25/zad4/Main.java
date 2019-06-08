package com.javagda25.zad4;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();

        Optional<Student> s = journal.zwrocStudenta1("123");
        if(s.isPresent()){
            Student wypakowany = s.get();
            System.out.println(wypakowany);
        }

        Student student = journal.zwrocStudenta2_zle("123");
        if(student != null){
            System.out.println(student.getImie());
        }

        try {
            Student student_2 = journal.zwrocStudenta2("123");
            // jeśli kod dotarł w to miejsce, to znaczy że student
            // istnieje

            System.out.println(student_2);
        } catch (StudentNotFoundException e) {
            System.out.println("Błąd, nie znaleziono studenta");
        }


    }
}
