package com.uni;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repository {

    /*
    public List<Felder> readFromFile(String fileName, String character) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] attributes;
        Felder felder;
        List<Felder> listeFelder = new ArrayList<>();
        while (line != null) {
            attributes = line.split(character);
            felder = new Felder(attributes[0], attributes[1], attributes[2], attributes[3]);
            listeFelder.add(felder);

            line = bufferedReader.readLine();
        }

        return listeFelder;
    }

     */
    public class ReadFile {
        public static void main(String[] args) {
            try {
                File myObj = new File("filename.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    public void writeToFile(String fileName, List<Felder> liste, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Felder felder : liste) {
            String line = felder.getId() + character + felder.getUnternehmensname() + character +
                    felder.getUnternehmensgrosse() + character + felder.getAnzahlMitarbeiter() + character + felder.getEinkomenVonKunde() + character + felder.getOrt();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

}
