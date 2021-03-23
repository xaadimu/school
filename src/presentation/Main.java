package presentation;

import com.isi.entities.Etudiant;
import com.isi.entities.Personne;
import com.isi.entities.Professeur;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------PERSONNE--------");
        Personne p = new Personne();
        Personne personne = p.saisie();
        p.affichage(personne);
        System.out.println("-------ETUDIANT--------");
        Etudiant e = new Etudiant();
        Etudiant etudiant = e.saisie();
        e.affichage(etudiant);
        System.out.println("-------PROFESSEUR-------");
        Professeur pr = new Professeur();
        Professeur professeur = pr.saisie();
        pr.affichage(professeur);

    }
}
