package com.uptc.dream_analyzer.factory;

public class ConductualEmocional implements Analyzer {

    @Override
    public void analyze(String sueño) {
        System.out.println("Análisis emocional conductual del sueño: " + sueño);
    }
}
