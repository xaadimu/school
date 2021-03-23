package com.isi.entities;

import java.util.Scanner;

public class Professeur extends Personne {
    private String matiere;

    public Professeur() {
    }

    public Professeur(String nom, String prenom, String matiere) {
        super(nom, prenom);
        this.matiere = matiere;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
    private Scanner scanner = new Scanner(System.in);
    public Professeur saisie(){
        Professeur pr = new Professeur();

        System.out.println("Entrer le Prenom");
        pr.setPrenom(scanner.nextLine());

        System.out.println("Entrer le Nom");
        pr.setNom(scanner.nextLine());

        System.out.println("Entrer la Matiere que vous enseignez");
        pr.setMatiere(scanner.nextLine());
        return pr;
    }


    public void affichage(Professeur professeur){
        System.out.println("PRENOM : " + professeur.getPrenom());
        System.out.println("NOM : " + professeur.getNom());
        System.out.println("MATIERE : " + professeur.getMatiere());

    }
}
