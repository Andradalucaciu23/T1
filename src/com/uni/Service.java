package com.uni;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Service {
    /*
    public List<Integer> sortListeMitarbeiterByAnzahl(List<Integer> liste) {
        return liste.stream()
                .sorted((felder, otherFelder) -> felder.getAnzahlMitarbeiter().compareTo(otherFelder.getAnzahlMitarbeiter()))
                .collect(Collectors.toList());
    }

     */


    public String getMostFrequentPlace(List<Felder> liste) {
        Map.Entry<String, Long> maxLocation = liste.stream()
                .collect(Collectors.groupingBy(Felder::getOrt, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(NullPointerException::new);

        return maxLocation.getKey() + ": " + maxLocation.getValue();
    }

}
