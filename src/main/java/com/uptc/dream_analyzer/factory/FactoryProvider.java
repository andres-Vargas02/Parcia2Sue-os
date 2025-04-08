package com.uptc.dream_analyzer.factory;

public class FactoryProvider {
    public static TherapeuticalApproachFactory getFactory(String tipo) {
        if (tipo.equalsIgnoreCase("jungiano")) {
            return new JunguianoFactory();
        } else if (tipo.equalsIgnoreCase("conductual")) {
            return new ConductualFactory();
        }
        return null;
    }
}
