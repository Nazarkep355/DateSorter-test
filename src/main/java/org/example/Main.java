package org.example;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateSorter dateSorter = new DateSorter();

        List localeDates = List.of(LocalDate.parse("2004-07-01"),
                LocalDate.parse("2005-01-02"),
                LocalDate.parse("2007-01-01"),
                LocalDate.parse("2032-05-03"));
        Collection sortDates = dateSorter.sortDates(localeDates);
         int g = 0;
    }
}