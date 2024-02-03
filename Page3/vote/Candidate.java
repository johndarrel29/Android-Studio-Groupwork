package com.example.vote;

public class Candidate {
    static String[] presidentCandidates = {"Thea Nery", "Emlan Implica"};
    static String[] vicePresidentCandidates = {"Jasmine Saligan", "Jiu Tejome"};
    String name;
    static Candidate president = new Candidate();
    static Candidate vicePresident = new Candidate();

    // Getters and Setters
    public static Candidate getPresident() {
        return president;
    }

    public void setPresident(Candidate president) {
        Candidate.president = president;
    }

    public static Candidate getVicePresident() {
        return vicePresident;
    }

    public void setVicePresident(Candidate vicePresident) {
        Candidate.vicePresident = vicePresident;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}