package com.example.arist.smartfashion;

public class productos {
    private String nombre;
    private String inf;
    private int foto;

    public productos() {
    }

    public productos(String nombre, String inf, int foto) {
        this.nombre = nombre;
        this.inf = inf;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInf() {
        return inf;
    }

    public void setInf(String inf) {
        this.inf = inf;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
