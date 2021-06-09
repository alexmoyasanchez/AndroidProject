package models;

import java.util.List;

public class User {

    String username;
    String password;
    String email;
    int idUser;
    int monedas;

    List<Object> listaObjetos;
    List<Game> listaPartidas;


    public User() {
    }


    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public List<Object> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<Object> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }
}