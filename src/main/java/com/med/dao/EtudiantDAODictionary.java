package com.med.dao;

import com.med.presentation.EtudiantDAOInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EtudiantDAODictionary implements EtudiantDAOInterface {

    Map<Integer, Etudiant> etudiantMap = new HashMap<>();

    public Etudiant addEtudiant(Etudiant etudiant){
        etudiantMap.put(etudiant.getId(), etudiant);
        return etudiant;
    }

    public List<Etudiant> getAllEtudiants(){
        return new ArrayList<>(etudiantMap.values());
    }

    @Override
    public Etudiant getEtudiantById(String id) {
        return null;
    }

    @Override
    public boolean updateEtudiant(Etudiant etudiant) {
        Integer id = etudiant.getId();
        if(etudiantMap.containsKey(id)){
            etudiantMap.put(id, etudiant);
            return true;
        }
        return false;
    }

    public Etudiant getEtudiantById(int id){
        return etudiantMap.get(id);
    }

}
