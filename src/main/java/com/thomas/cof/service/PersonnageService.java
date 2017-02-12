package com.thomas.cof.service;

import com.thomas.cof.dao.PersonnageDAO;
import com.thomas.cof.domaine.Personnage;
import org.apache.log4j.Logger;

/**
 * Created by TS on 11/02/2017.
 */
public class PersonnageService {

    private final static Logger logger = Logger.getLogger(PersonnageService.class);

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

        logger.debug("sortie du service");
    }



}
