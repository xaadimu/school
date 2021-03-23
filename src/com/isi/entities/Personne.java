package com.isi.entities;

import java.util.Scanner;

public class Personne {
    protected String nom;
    protected String prenom;

    public Personne() {
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    private Scanner scanner = new Scanner(System.in);
    public Personne saisie(){
        Personne p = new Personne();

        System.out.println("Entrer le Prenom");
        p.setPrenom(scanner.nextLine());

        System.out.println("Entrer le Nom");
        p.setNom(scanner.nextLine());
        return p;
    }
    public void affichage(Personne personne){
        System.out.println("PRENOM : " + personne.getPrenom());
        System.out.println("NOM : " + personne.getNom());
    }
}
