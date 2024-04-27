package com.aluracursos.radiouziel.modelos;

public class Audio {
    private String titulo;
    private int totalDeRepodrucciones;
    private int totalDeMegusta;
    private int clasificacion;

    public void meGusta(){
        this.totalDeMegusta++;
    }

    public void reproduce(){
        this.totalDeRepodrucciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeRepodrucciones() {
        return totalDeRepodrucciones;
    }

    public void setTotalDeRepodrucciones(int totalDeRepodrucciones) {
        this.totalDeRepodrucciones = totalDeRepodrucciones;
    }

    public int getTotalDeMegusta() {
        return totalDeMegusta;
    }

    public void setTotalDeMegusta(int totalDeMegusta) {
        this.totalDeMegusta = totalDeMegusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}