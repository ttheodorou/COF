package com.thomas.cof.presentation;

import com.thomas.cof.service.PersonnageService;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/**
 * Classe pour lancer le programme
 * Created by TS on 10/02/2017.
 */
public class Lanceur {

    public static void main(String[] args) {
        System.out.println("test de thomas");
//
//        //        -------------------------
//        // Pour ouvrir un fichier excel existant
//        // Méthode perso d'après javadoc
//        XSSFWorkbook COF_TEST = null;
//        try {
//            // Permet d'ouvrir le fichier spécifié dans le chemin d'accès
//            COF_TEST = new XSSFWorkbook("D://Documents/IdeaProjects/cof/COF_TEST.xlsx");
//        } catch (IOException e) {
//            System.out.println("la récupération du fichier ne marche pas ! ");
//            e.printStackTrace();
//        }
//        System.out.println("COF_TEST.xlsx ouvert avec succès");
//        //        -------------------------
//        // Pour ouvrir un fichier excel existant
//        // Méthode tuto
//        File file = new File("COF_TEST2.xlsx");
//        FileInputStream fIP = null;
//        try {
//            fIP = new FileInputStream(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("erreur du fIP ! ");
//            e.printStackTrace();
//        }
//        //Get the workbook instance for XLSX file
//        try {
//            XSSFWorkbook workbook = new XSSFWorkbook(fIP);
//        } catch (IOException e) {
//            System.out.println("la récupération du fichier test2 ne marche pas ! ");
//            e.printStackTrace();
//        }
//        System.out.println("COF_TEST2.xlsx ouvert avec succès");
//
//        // fin de Pour ouvrir un fichier excel existant
////        -------------------------
//
//
////        -------------------------
//        // Crée un nouveau workbook > bon il est corrompu : je pense qu'il manque des choses !!
//        XSSFWorkbook workbook = new XSSFWorkbook();
//        //Create file system using specific name
//        File fichierExcelTest_NOM = new File("fichierExcelTest.xlsx");
//        FileOutputStream out = null;
//        try {
//            out = new FileOutputStream(fichierExcelTest_NOM);
//            // write operation workbook using file out object
//            workbook.write(out);
//            out.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(" erreur de file not found! ");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println(" erreur de ioexception ! ");
//            e.printStackTrace();
//        }
//        System.out.println("fichierExcelTest.xlsx écrit avec succès");
//
//        // fin de test pour la création d'un nouveau doc excel
////        --------------------------------------
//
//        //        -------------------------
//        // Crée une nouvelle feuille excel
//        XSSFSheet feuilleXL = COF_TEST.createSheet("feuilleGenereeEnJava");
//        int idxligne = 1;
//        int idxColonne = 1;
//        XSSFSheet feuille2XL = COF_TEST.getSheet("unAutreNom");
//        XSSFRow ligne1 = feuille2XL.getRow(idxligne);
//        XSSFCell cellule1 = ligne1.getCell(idxColonne);
//        String contenuCellule = cellule1.getStringCellValue();
//        System.out.println("contenu du fichier excel :");
//        System.out.println(contenuCellule);
//
//        String contenuAEcrire = "JAFA CRI";
//        XSSFCell celluleEnEcriture = ligne1.createCell(2);
//        celluleEnEcriture.setCellValue(contenuAEcrire);

        PersonnageService personnageService = new PersonnageService();
        personnageService.ecrireUnPersonnage();
    }
}
