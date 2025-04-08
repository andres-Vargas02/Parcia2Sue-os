package com.uptc.dream_analyzer.factory;

public class JunguianoFactory implements TherapeuticalApproachFactory {

    //Implementacion concreta tipo Junguiano
    //Devuelve los analizadores basados en Junguiano

    @Override
    public Analyzer getSymbolicAnalyzer() {
        return new SimbolicJunguiano();
    }

    @Override
    public Analyzer getEmotionAnalyzer() {
        return new EmocionalJunguiano();
    }

    @Override
    public Analyzer getStatisticalAnalyzer() {
        return new EstatisticJunguiano();
    }

    @Override
    public Analyzer getCognitiveAnalyzer() {
        return new CognitivoJunguiano();
    }
}
