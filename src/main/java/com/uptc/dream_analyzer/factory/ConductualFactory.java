package com.uptc.dream_analyzer.factory;
 
public class ConductualFactory implements TherapeuticalApproachFactory {

    //Implementacion concreta tipo conductual
    //Devuelve los analizadores basados en conductual


    @Override
    public Analyzer getSymbolicAnalyzer() {
        return new ConductualSimbolico();
    }

    @Override
    public Analyzer getEmotionAnalyzer() {
        return new ConductualEmocional();
    }

    @Override
    public Analyzer getStatisticalAnalyzer() {
        return new ConductualEstadistico();
    }

    @Override
    public Analyzer getCognitiveAnalyzer() {
        return new ConductualCognitivo();
    }
}
