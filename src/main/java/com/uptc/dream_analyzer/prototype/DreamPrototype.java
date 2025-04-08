package com.uptc.dream_analyzer.prototype;import java.util.Objects;

import com.uptc.dream_analyzer.entity.Dream;

public class DreamPrototype extends Dream implements Cloneable {
    private RegisterPrototype register;  

    // Constructor que recibe un Dream y crea un registro asociado
    public DreamPrototype(Dream dream) {
        Objects.requireNonNull(dream, "El sueño no puede ser nulo");
        this.setNarrative(dream.getNarrative());
        this.setDuration(dream.getDuration());
        this.setEmotionalIntensity(dream.getEmotionalIntensity());
        this.register = new RegisterPrototype();
        this.register.addDream(dream);  // Registra el sueño original
    }

    // Implementación del método abstracto de la clase padre
    @Override
    public String getDreamType() {
        return "Prototipo Registrado";
    }

    // Clone mejorado con clonación profunda
    @Override
    public DreamPrototype clone() {
        DreamPrototype cloned = (DreamPrototype) super.clone();
        cloned.register = this.register.clone();  // Clona el registro
        return cloned;
    }

    // Método para añadir nuevos sueños al registro
    public void addToRegister(Dream dream) {
        this.register.addDream(dream);
    }

    // Método para modificar notas del terapeuta en el registro
    public void updateTherapistNotes(String notes) {
        this.register.setTherapistNotes(notes);
    }

    // Getter para acceder al registro (solo lectura)
    public RegisterPrototype getRegister() {
        return register.clone();  // Devuelve copia defensiva
    }

    @Override
    public String toString() {
        return String.format("Sueño [%s] - Duración: %dmin - Intensidad: %.1f",
                getNarrative(), getDuration(), getEmotionalIntensity());
    }
}