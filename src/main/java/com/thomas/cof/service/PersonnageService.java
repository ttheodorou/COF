package com.thomas.cof.service;

import com.thomas.cof.dao.PersonnageDAO;
import com.thomas.cof.domaine.Personnage;

/**
 * Created by TS on 11/02/2017.
 */
public class PersonnageService {

    /**
     * méthode pour écrire un personnage en BD
     */
    public void ecrireUnPersonnage( ){
        Personnage perso = new Personnage();
        perso.setId(1);
        perso.setNom("TygarsSnow");
        perso.setJoueurNom("Thomas");
        perso.setNiveau(3);
        perso.setAge(50);
        perso.setPoids(100);
        perso.setTaille(112);
        perso.setProfil("Chevalier");
        perso.setRace("nain");
        perso.setSexe("homme");

        PersonnageDAO persoDao = new PersonnageDAO();
        persoDao.ecrireUnPersonnage(perso);
    }



}
