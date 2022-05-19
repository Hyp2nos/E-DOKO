package com.example.test.radokov2.model;

public class Patient {
    private String nom;
    private String prenom;
    private String date;


    public Patient(String nom, String prenom, String date) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
