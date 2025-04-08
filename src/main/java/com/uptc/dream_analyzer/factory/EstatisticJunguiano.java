package com.uptc.dream_analyzer.factory;

public class EstatisticJunguiano implements Analyzer {

    @Override
    public void analyze(String sueño) {
        System.out.println("Análisis estadístico jungiano del sueño: " + sueño);
    }
}