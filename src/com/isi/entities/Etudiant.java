package com.isi.entities;

import java.util.Scanner;

public class Etudiant extends Personne {
    private int mat;

    public Etudiant() {
    }


    public Etudiant(String nom, String prenom, int mat) {
        super(nom, prenom);
        this.mat = mat;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
    private Scanner scanner = new Scanner(System.in);
    public Etudiant saisie (){
        Etudiant e = new Etudiant();
        System.out.println("Entrer le Matricule");
        e.setMat(Integer.parseInt(scanner.nextLine()));

        System.out.println("Entrer le Prenom");
        e.setPrenom(scanner.nextLine());

        System.out.println("Entrer le Nom");
        e.setNom(scanner.nextLine());
       return  e;
    }

    public void affichage (Etudiant etudiant){
        System.out.println("MATRICULE : " + etudiant.getMat());
        System.out.println("PRENOM : " + etudiant.getPrenom());
        System.out.println("NOM : " + etudiant.getNom());
    }
}
