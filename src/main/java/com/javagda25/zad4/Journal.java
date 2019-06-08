package com.javagda25.zad4;

import java.util.*;

public class Journal {
    private Map<String, Student> studentMap = new HashMap<>();

    public void dodajStudenta(Student student) {
        // umieść w mapie studenta
        // kluczem wpisu jest indeks, wartością obiekt student
        studentMap.put(student.getIndeks(), student);
    }

    // usuwanie studenta
    public void usunStudenta(Student student) {
        // zwróć uwagę - parametrem jest INDEKS a nie obiekt studenta!
        studentMap.remove(student.getIndeks());
    }

    public void usunStudenta(String indeks) {
        studentMap.remove(indeks);
    }

    // opcja 2 - rzuć exception
    public Optional<Student> zwrocStudenta1(String indeks) {
        if (studentMap.containsKey(indeks)) {
            return Optional.ofNullable(studentMap.get(indeks));
        }
        return Optional.empty();
    }

    // opcja 2 - rzuć exception
    public Student zwrocStudenta2(String indeks) throws StudentNotFoundException {
        if (studentMap.containsKey(indeks)) {
            return studentMap.get(indeks);
        }
        throw new StudentNotFoundException("Student with this id wasn't found.");
    }

    /**
     * Metoda zwraca studneta. UWAGA! może zwrócić null jeśli się nie odnajdzie.
     *
     * @param indeks - indeks szukany
     * @return obiekt studeta lub null jesli go nie ma.
     */
    public Student zwrocStudenta2_zle(String indeks) {
        if (studentMap.containsKey(indeks)) {
            return studentMap.get(indeks);
        }
        return null;
    }

    public double podajSrednia(String indeks) throws StudentNotFoundException {
        double sum = 0.0;

        Student studentKtoregoSreniaLiczymy = zwrocStudenta2(indeks);
        for (Double ocena : studentKtoregoSreniaLiczymy.getListaOcen()) {
            sum += ocena;
        }

        return sum / studentKtoregoSreniaLiczymy.getListaOcen().size();
    }

    public List<Student> zwrocZagrozonych() {
        List<Student> listaWynikowa = new ArrayList<>();

        // magia
        Set<String> kopiaIndeksow = new HashSet<>(studentMap.keySet());
        for (String indeks : kopiaIndeksow) {
            try {
                if (podajSrednia(indeks) <= 2.0) {
                    listaWynikowa.add(studentMap.get(indeks));
                }
            } catch (StudentNotFoundException e) {
                System.out.println("Błąd, nie można było odnaleźć studenta.");
            }
        }

        return listaWynikowa;
    }

    public List<Student> zwrocPosortowanaListeStudentow() {
        // kopiuje wszystkich studentów z mapy (wartości) do listy
        List<Student> studentList = new ArrayList<>(studentMap.values());

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //  1 - o1 > o2
                //  0 - ==
                // -1 - o1 < o2
                int indeks1 = Integer.parseInt(o1.getIndeks());
                int indeks2 = Integer.parseInt(o2.getIndeks());

                return Integer.compare(indeks1, indeks2);
            }
        });

        return studentList;
    }

}

