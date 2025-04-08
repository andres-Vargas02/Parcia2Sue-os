package com.uptc.dream_analyzer.entity;
public abstract class Dream implements Cloneable {
    private String narrative;
    private int duration; 
    private double emotionalIntensity;

    // Método abstracto para implementación específica en subclases (opcional)
    public abstract String getDreamType();

    // Método clone() para implementar el patrón Prototype
    @Override
    public Dream clone() {
        try {
            Dream clonedDream = (Dream) super.clone();
            // No se necesita clonación profunda para String (son inmutables)
            return clonedDream;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Nunca debería ocurrir
        }
    }

    // Método para modificar la narrativa (usado en clones)
    public void modifyNarrative(String newNarrative) {
        this.narrative = newNarrative;
    }

    // Getters y Setters (implementación base)
    public String getNarrative() {
        return narrative;
    }

    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getEmotionalIntensity() {
        return emotionalIntensity;
    }

    public void setEmotionalIntensity(double emotionalIntensity) {
        this.emotionalIntensity = emotionalIntensity;
    }
}