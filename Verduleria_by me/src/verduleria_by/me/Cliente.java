/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verduleria_by.me;

/**
 *
 * @author darygarav
 */
public class Cliente {
    
    
    
    private int rut, telefono;
    private char dv;
    private String nom, direcc,email;

    public Cliente() {
    }

    public Cliente(int rut, int telefono, char dv, String nom, String direcc, String email) {
        this.rut = rut;
        this.telefono = telefono;
        this.dv = dv;
        this.nom = nom;
        this.direcc = direcc;
        this.email = email;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
