package com.thomas.cof.presentation;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/**
 * Classe pour lancer le programme
 * Created by TS on 10/02/2017.
 */
public class Lanceur {

    public static void main(String[] args) {
        System.out.println("test de thomas");

        //        -------------------------
        // Pour ouvrir un fichier excel existant
        // Méthode perso d'après javadoc
        try {
            // Permet d'ouvrir le fichier spécifié dans le chemin d'accès
            XSSFWorkbook COF_TEST = new XSSFWorkbook("D://Documents/IdeaProjects/cof/COF_TEST.xlsx");
        } catch (IOException e) {
            System.out.println("la récupération du fichier ne marche pas ! ");
            e.printStackTrace();
        }
        System.out.println("COF_TEST.xlsx ouvert avec succès");
        //        -------------------------
        // Pour ouvrir un fichier excel existant
        // Méthode tuto
        File file = new File("COF_TEST2.xlsx");
        FileInputStream fIP = null;
        try {
            fIP = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("erreur du fIP ! ");
            e.printStackTrace();
        }
        //Get the workbook instance for XLSX file
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(fIP);
        } catch (IOException e) {
            System.out.println("la récupération du fichier test2 ne marche pas ! ");
            e.printStackTrace();
        }
        System.out.println("COF_TEST2.xlsx ouvert avec succès");

        // fin de Pour ouvrir un fichier excel existant
//        -------------------------



//        -------------------------
        // Crée un nouveau workbook > bon il est corrompu : je pense qu'il manque des choses !!
        XSSFWorkbook workbook = new XSSFWorkbook();
        //Create file system using specific name
        File fichierExcelTest_NOM = new File("fichierExcelTest.xlsx");
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(fichierExcelTest_NOM);
            // write operation workbook using file out object
            workbook.write(out);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println(" erreur de file not found! ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(" erreur de ioexception ! ");
            e.printStackTrace();
        }
        System.out.println("fichierExcelTest.xlsx écrit avec succès");

        // fin de test pour la création d'un nouveau doc excel
//        --------------------------------------





    }
}
