package com.uptc.dream_analyzer.factory;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        String sueño = "Estaba volando sobre una ciudad en ruinas iluminada por una luna roja.";

        TherapeuticalApproachFactory factory = FactoryProvider.getFactory("jungiano");

        Analyzer simb = factory.getSymbolicAnalyzer();
        Analyzer emo = factory.getEmotionAnalyzer();
        Analyzer stat = factory.getStatisticalAnalyzer();
        Analyzer cog = factory.getCognitiveAnalyzer();

        simb.analyze(sueño);
        emo.analyze(sueño);
        stat.analyze(sueño);
        cog.analyze(sueño);

        System.out.println("----- Ahora usando enfoque conductual -----");

        factory = FactoryProvider.getFactory("conductual");

        simb = factory.getSymbolicAnalyzer();
        emo = factory.getEmotionAnalyzer();
        stat = factory.getStatisticalAnalyzer();
        cog = factory.getCognitiveAnalyzer();

        simb.analyze(sueño);
        emo.analyze(sueño);
        stat.analyze(sueño);
        cog.analyze(sueño);
    }
}


