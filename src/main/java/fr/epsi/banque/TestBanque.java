package fr.epsi.banque;

import fr.epsi.banque.entites.Compte;
import fr.epsi.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {

        Compte[] comptes = new Compte[2];


        comptes[0] = new Compte(123456, 1500.50);


        comptes[1] = new CompteTaux(789012, 2000.75, 2.5);


        for (int i = 0; i < comptes.length; i++) {
            System.out.println(comptes[i]);
        }
    }
}
