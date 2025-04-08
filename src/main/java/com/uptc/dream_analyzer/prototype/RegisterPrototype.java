package com.uptc.dream_analyzer.prototype;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.uptc.dream_analyzer.entity.Dream;

public class RegisterPrototype implements Cloneable {
    private LocalDateTime registrationDate;
    private String therapistNotes;
    private List<Dream> register; 

    public RegisterPrototype() {
        this.registrationDate = LocalDateTime.now();
        this.therapistNotes = "Registro inicial";
        this.register = new ArrayList<>();  // Inicialización de la lista
    }

    // Método para añadir sueños al registro
    public void addDream(Dream dream) {
        if (dream != null) {
            register.add(dream);
        }
    }

    // Clone mejorado con copia de la lista
    @Override
    public RegisterPrototype clone() {
        try {
            RegisterPrototype cloned = (RegisterPrototype) super.clone();
            cloned.register = new ArrayList<>(this.register); // Copia superficial de la lista
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // Getters y Setters
    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setTherapistNotes(String notes) {
        this.therapistNotes = notes;
    }

    public String getTherapistNotes() {
        return therapistNotes;
    }

    public List<Dream> getRegister() {
        return new ArrayList<>(register); // Devuelve copia para proteger encapsulamiento
    }
}