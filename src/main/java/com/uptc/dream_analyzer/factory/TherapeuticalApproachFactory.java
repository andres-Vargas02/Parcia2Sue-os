package com.uptc.dream_analyzer.factory;

public interface TherapeuticalApproachFactory {

    //Fábrica abstracta 
    
    Analyzer getSymbolicAnalyzer();
    Analyzer getEmotionAnalyzer();
    Analyzer getStatisticalAnalyzer();
    Analyzer getCognitiveAnalyzer();
}
