package com.uptc.dream_analyzer.factory;

public class CognitivoJunguiano implements Analyzer {

    @Override
    public void analyze(String sueño) {
        System.out.println("Análisis cognitivo jungiano del sueño: " + sueño);
    }
}