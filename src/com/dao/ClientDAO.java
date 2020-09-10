package com.dao;

import java.util.HashMap;
import java.util.Map;

public class ClientDAO {
    private Map<Integer, Client> clients = new HashMap<>();

    public ClientDAO() {
// db memoire
        Compte compte1 = new Compte("1111", 1000);
        Compte compte2 = new Compte("2222", 2000);
        Compte compte3 = new Compte("3333", 3000);
        Compte compte4 = new Compte("4444", 4000);


        clients.put(1, new Client("ali", "babi", compte1));
        clients.put(2, new Client("tata", "tati", compte2));
        clients.put(3, new Client("mama", "mami", compte3));
        clients.put(4, new Client("dada", "dadi", compte4));
    }

    public void debiter(int key, double montant) {
        Compte compte = clients.get(key).getCompte();
        double solde = compte.getSolde() - montant;
        compte.setSolde(solde);

    }

    public Client getOne(int key) {
        return clients.get(key);
    }

}
