package com.med.dao;

import com.med.presentation.EtudiantDAOInterface;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDTO implements EtudiantDAOInterface {

    private List<Etudiant> etudiants = new ArrayList<>();

    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }

    @Override
    public Etudiant getEtudiantById(String id) {
        return null;
    }

    @Override
    public boolean updateEtudiant(Etudiant etudiant) {
        for (int i = 0; i < etudiants.size(); i++) {
            if (etudiants.get(i).getId() == etudiant.getId()) {
                etudiants.set(i, etudiant);
                return true;
            }
        }
        return false;
    }

}
