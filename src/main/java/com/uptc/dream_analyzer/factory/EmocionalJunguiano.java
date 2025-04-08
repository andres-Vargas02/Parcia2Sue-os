package com.uptc.dream_analyzer.factory;

public class EmocionalJunguiano implements Analyzer {

    @Override
    public void analyze(String sueño) {
        System.out.println("Análisis emocional jungiano del sueño: " + sueño);
    }
}