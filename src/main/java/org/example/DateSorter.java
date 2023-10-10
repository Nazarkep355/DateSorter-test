package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 *
 *
 package sample;

 import java.time.LocalDate;
 import java.util.Collection;
 import java.util.List;

 /**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 *
 * Implement in single class. Don't chane constructor and signature method.
 */
public class DateSorter {

    /**
     * The implementation of this method should sort dates.
     * The output should be in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2004-07-01, 2005-01-02, 2007-01-01, 2032-05-03)
     * would sort to
     * (2005-01-02, 2007-01-01, 2032-05-03, 2004-07-01)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<Month> notRMonths = List.of(Month.MAY,Month.JUNE,Month.JULY,Month.AUGUST); //Months that dont contains 'r'

        List<LocalDate> notRDates = unsortedDates.stream()
                .filter(a->notRMonths.contains(a.getMonth()))
                .collect(Collectors.toList());//We find all dates with month doesnt contain 'r'

       List<LocalDate> sortedList = unsortedDates.stream()
               .filter(a->!notRMonths.contains(a.getMonth()))
               .collect(Collectors.toList());//We find all dates with month contains 'r'

        sortedList.sort((a,b)->a.compareTo(b));//These months go from first to last

        notRDates.sort((a,b)->b.compareTo(a));//These months go from last to first

        sortedList.addAll(notRDates); //We concat first list to second list

        return sortedList;
    }
}