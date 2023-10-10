package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class DateSorterTest {
    private DateSorter dateSorter;

    public DateSorterTest() {
        this.dateSorter = new DateSorter();
    }

    /**This test is made by conditional data:"
    thus: (2004-07-01, 2005-01-02, 2007-01-01, 2032-05-03)
     * would sort to
     * (2005-01-02, 2007-01-01, 2032-05-03, 2004-07-01)"
    *
    */
    @Test
    public void sortDates() {
        DateSorter dateSorter = new DateSorter();

        List localeDates = List.of(LocalDate.parse("2004-07-01"),
                LocalDate.parse("2005-01-02"),
                LocalDate.parse("2007-01-01"),
                LocalDate.parse("2032-05-03"));
        Collection sortDates = dateSorter.sortDates(localeDates);
        Collection shouldBeSortedLikeThis = List.of(LocalDate.parse("2005-01-02"),
                LocalDate.parse("2007-01-01"),
                LocalDate.parse("2032-05-03"),
                LocalDate.parse("2004-07-01"));
        Assertions.assertEquals(shouldBeSortedLikeThis,sortDates);
    }
}