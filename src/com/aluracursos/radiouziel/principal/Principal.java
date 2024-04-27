package com.aluracursos.radiouziel.principal;

import com.aluracursos.radiouziel.modelos.Cancion;
import com.aluracursos.radiouziel.modelos.MisFavoritos;
import com.aluracursos.radiouziel.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kizz");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Auilar");
        miPodcast.setTitulo("Cafe.Tech");
        // Cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }
        // Podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total Reproducciones " + miCancion.getTotalDeRepodrucciones());
        System.out.println("Total De Megusta " + miCancion.getTotalDeMegusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(miPodcast);
        favoritos.adiciona(miCancion);
    }
}