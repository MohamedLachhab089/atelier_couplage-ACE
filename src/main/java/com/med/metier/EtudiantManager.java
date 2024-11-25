package com.med.metier;

import com.med.dao.Etudiant;
import com.med.dao.EtudiantDAODictionary;
import com.med.dao.EtudiantDTO;
import com.med.presentation.EtudiantDAOInterface;

import java.util.List;

public class EtudiantManager {

    private final EtudiantDTO etudiantDTO;
    private final EtudiantDAODictionary etudiantDAODictionary;
    private EtudiantDAOInterface etudiantDAOInterface;

    public EtudiantManager(EtudiantDTO etudiantDTO, EtudiantDAODictionary etudiantDAODictionary) {
        this.etudiantDTO = etudiantDTO;
        this.etudiantDAODictionary = etudiantDAODictionary;
    }

    public Etudiant addEtudiant(Etudiant etudiant) {
        for (Etudiant e : etudiantDTO.getAllEtudiants()) {
            if (e.getEmail().equalsIgnoreCase(etudiant.getEmail())) {
                System.out.println("Erreur : l'email est déjà utilisé.");
                return null;
            }
        }
        return etudiantDTO.addEtudiant(etudiant);
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiantDTO.getAllEtudiants();
    }


    // ~~~~~~~~~~~~~~ etudiantDAODictionary ~~~~~~~~~~~~~~

    public Etudiant addEtudiant2(Etudiant etudiant){
        for (Etudiant e : etudiantDAODictionary.getAllEtudiants()) {
            if (e.getEmail().equalsIgnoreCase(etudiant.getEmail())) {
                System.out.println("Erreur : l'email est déjà utilisé (addEtudiant2).");
                return null;
            }
        }
        return etudiantDAODictionary.addEtudiant(etudiant);
    }

    public List<Etudiant> getAllEtudiants2() {
        return etudiantDAODictionary.getAllEtudiants();
    }

    // ~~~~~~~~~~~~~~ after adding EtudiantDAOInterface ~~~~~~~~~~~~~~

    public Etudiant addEtudiant3(Etudiant etudiant){
        for (Etudiant e : etudiantDAOInterface.getAllEtudiants()) {
            if (e.getEmail().equalsIgnoreCase(etudiant.getEmail())) {
                System.out.println("Erreur : l'email est déjà utilisé.");
                return null;
            }
        }
        return etudiantDAOInterface.addEtudiant(etudiant);
    }

    public List<Etudiant> getAllEtudiants3() {
        return etudiantDAOInterface.getAllEtudiants();
    }

    public boolean updateEtudiant(Etudiant etudiant) {
        return etudiantDAOInterface.updateEtudiant(etudiant);
    }
}
