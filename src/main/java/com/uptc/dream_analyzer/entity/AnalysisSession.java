package com.uptc.dream_analyzer.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class AnalysisSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "therapist_id")
    private Therapist therapist;

    @OneToMany(mappedBy = "session", cascade = CascadeType.ALL)
    private List<Analysis> analyses = new ArrayList<>();

    public AnalysisSession() {}

    public AnalysisSession(Long id, LocalDate startDate, LocalDate endDate, Therapist therapist) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.therapist = therapist;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public Therapist getTherapist() { return therapist; }
    public void setTherapist(Therapist therapist) { this.therapist = therapist; }

    public List<Analysis> getAnalyses() { return analyses; }
    public void setAnalyses(List<Analysis> analyses) { this.analyses = analyses; }
}
