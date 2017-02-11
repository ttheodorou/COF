package com.thomas.cof.dao;

import com.thomas.cof.domaine.Personnage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe de DAO du personnage
 * Created by TS on 11/02/2017.
 */
public class PersonnageDAO {
    private static final int _INDEX_PREMIERE_COLONNE_TABLE_PERSO = 1;
    private static final int _INDEX_DERNIERE_COLONNE_TABLE_PERSO = 10;
    private static final int _INDEX_PREMIERE_LIGNE_TABLE_PERSO = 2;
    private static final String _NOM_FEUILLE_EXL = "unAutreNom";
    private static final String _NOM_CLASSEUR_EXL = "COF_TEST.xlsx";

    /**
     * méthode pour écrire un personnage en BD
     * @param perso
     */
    public void ecrireUnPersonnage(Personnage perso){
     // TODO
        // Vérifier si l'enregistrement existe > modifier
        // Trouver une ligne non utilisée
        // Se positionner à cette ligne et écrire


        FileInputStream file =null;
        try {
            file = new FileInputStream(_NOM_CLASSEUR_EXL);
        } catch (FileNotFoundException e) {
            System.out.println("erreur a la création du file");
            e.printStackTrace();
        }


        // Création d'un classeur virtuel
        XSSFWorkbook classeurAEnregistrer = null;
        try {
            classeurAEnregistrer = new XSSFWorkbook(file);
        } catch (IOException e) {
            System.out.println("erreur a la récupération du classeur");
            e.printStackTrace();
        }

        // Récupération de la feuille à modifier
        XSSFSheet feuilleAModifier = classeurAEnregistrer.getSheet(_NOM_FEUILLE_EXL);

        // Récupération de la ligne à enregistrer
        // Pour l'instant je fais simple
        XSSFRow ligneAModifier = feuilleAModifier.getRow(_INDEX_PREMIERE_LIGNE_TABLE_PERSO);

        // Je positionne le curseur sur la première cellule
        int ID_CelluleEnCours = _INDEX_PREMIERE_COLONNE_TABLE_PERSO;

        // j'affecte à chaque cellule sa propriété
        Cell celluleEnCours = ligneAModifier.getCell(ID_CelluleEnCours++);
        if(celluleEnCours == null){
            celluleEnCours = ligneAModifier.createCell(ID_CelluleEnCours-1);
        }
        celluleEnCours.setCellValue(perso.getId());
        celluleEnCours = ligneAModifier.getCell(ID_CelluleEnCours++);
        if(celluleEnCours == null){
            celluleEnCours = ligneAModifier.createCell(ID_CelluleEnCours-1);
        }
        celluleEnCours.setCellValue(perso.getNom());
        celluleEnCours = ligneAModifier.getCell(ID_CelluleEnCours++);
        if(celluleEnCours == null){
            celluleEnCours = ligneAModifier.createCell(ID_CelluleEnCours-1);
        }
        celluleEnCours.setCellValue(perso.getJoueurNom());
        celluleEnCours = ligneAModifier.getCell(ID_CelluleEnCours++);
        if(celluleEnCours == null){
            celluleEnCours = ligneAModifier.createCell(ID_CelluleEnCours-1);
        }
        celluleEnCours.setCellValue(perso.getProfil());
        celluleEnCours = ligneAModifier.getCell(ID_CelluleEnCours++);
        if(celluleEnCours == null){
            celluleEnCours = ligneAModifier.createCell(ID_CelluleEnCours-1);
        }
        celluleEnCours.setCellValue(perso.getNiveau());
        celluleEnCours = ligneAModifier.getCell(ID_CelluleEnCours++);
        if(celluleEnCours == null){
            celluleEnCours = ligneAModifier.createCell(ID_CelluleEnCours-1);
        }
        celluleEnCours.setCellValue(perso.getRace());
        celluleEnCours = ligneAModifier.getCell(ID_CelluleEnCours++);
        if(celluleEnCours == null){
            celluleEnCours = ligneAModifier.createCell(ID_CelluleEnCours-1);
        }
        celluleEnCours.setCellValue(perso.getSexe());
        celluleEnCours = ligneAModifier.getCell(ID_CelluleEnCours++);
        if(celluleEnCours == null){
            celluleEnCours = ligneAModifier.createCell(ID_CelluleEnCours-1);
        }
        celluleEnCours.setCellValue(perso.getAge());
        celluleEnCours = ligneAModifier.getCell(ID_CelluleEnCours++);
        if(celluleEnCours == null){
            celluleEnCours = ligneAModifier.createCell(ID_CelluleEnCours-1);
        }
        celluleEnCours.setCellValue(perso.getTaille());
        celluleEnCours = ligneAModifier.getCell(ID_CelluleEnCours++);
        if(celluleEnCours == null){
            celluleEnCours = ligneAModifier.createCell(ID_CelluleEnCours-1);
        }
        celluleEnCours.setCellValue(perso.getPoids());

        try {
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        //On écrit sur le fichier
//        FileOutputStream out = null;
//        try {
//            out = new FileOutputStream(new File(_NOM_CLASSEUR_EXL));
//            classeurAEnregistrer.write(out);
//        } catch (FileNotFoundException e) {
//            System.out.println("ba merde : ça plante à la création du FileOutputStream !");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("ba merde : ça plante au .write(out) !");
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                if (out!=null) {
//                    out.close();
//                }
//            } catch (IOException e) {
//                System.out.println("ba le out veut pas se fermer !");
//                e.printStackTrace();
//            }
//        }

        System.out.println("je crois que ça a marché");
    }

    /**
     * méthode pour modifier un personnage en BD
     * @param perso
     */
    public void modifierUnPersonnage(Personnage perso){
        // TODO
        // récupérer l'enregistrement

    }

    /**
     * Méthode pour lire un personnage en BD
     * @return
     */
    public Personnage lireUnPersonnage(){
        Personnage perso = new Personnage();
        // TODO
        // récupérer la liste de tous les personnages
        // trouver celui recherché
        return perso;
    }

    /**
     * Méthode pour lire tous les personnages en BD
     * @return
     */
    public List<Personnage> lireTousLesPersonnages(){
        ArrayList<Personnage> listeDesPersonnages = new ArrayList<Personnage>();
        // TODO
        //
        return listeDesPersonnages;
    }

    /**
     * Méthode pour effacer un personnage en BD
     * @param perso
     */
    public void effacerUnPersonnage(Personnage perso){

    }
}
