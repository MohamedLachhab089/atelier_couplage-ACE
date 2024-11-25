package com.med;

import com.med.dao.Etudiant;
import com.med.dao.EtudiantDAODictionary;
import com.med.dao.EtudiantDTO;
import com.med.metier.EtudiantManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EtudiantDTO etudiantDTO = new EtudiantDTO();
        EtudiantDAODictionary etudiantDAODictionary = new EtudiantDAODictionary();
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDTO, etudiantDAODictionary);

        etudiantManager.addEtudiant(new Etudiant(1, "Mohamed", "Lachhab", "medlhb@gmail.com"));
        etudiantManager.addEtudiant(new Etudiant(2, "Ali", "BenAli", "ali@gmail.com"));
        etudiantManager.addEtudiant(new Etudiant(3, "Ayoub", "Mouchrif", "ayb@gmail.com"));
        etudiantManager.addEtudiant(new Etudiant(4, "Hamza", "derg", "hamza@gmail.com"));

        System.out.println("List des etudiants:\n");
        for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
            System.out.println(etudiant);
        }

    }
}