package com.uni;

import com.uni.Felder;
import com.uni.Repository;
import com.uni.Service;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Repository repo = new Repository();
        Service service = new Service();

        try {
            List<Felder> listeFelder = repo.ReadFile("C:\\Users\\User\\Desktop\\MAP\\Labor\\PraktischePrufung\\Felder.txt", "#");

            //System.out.println(service.sortListeTiereByName(listeTiere));
            //System.out.println(service.filterListeByDiaet(listeTiere, Diaet.carnivore));

            repo.writeToFile("C:\\Users\\User\\Desktop\\MAP\\Labor\\PraktischePrufung\\Statistik.txt", listeFelder, ",");
            service.getMostFrequentPlace(listeFelder);
            System.out.println(service.getMostFrequentPlace(listeFelder));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
