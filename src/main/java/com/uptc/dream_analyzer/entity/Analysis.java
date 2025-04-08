package com.uptc.dream_analyzer.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity
public class Analysis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private AnalysisType type;

    @Lob
    private String result;

    private LocalDate analysisDate;

    @ManyToOne
    @JoinColumn(name = "dream_id")
    private Dream dream;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private AnalysisSession session;

    public Analysis() {}

    public Analysis(Long id, AnalysisType type, String result, LocalDate analysisDate, Dream dream, AnalysisSession session) {
        this.id = id;
        this.type = type;
        this.result = result;
        this.analysisDate = analysisDate;
        this.dream = dream;
        this.session = session;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public AnalysisType getType() { return type; }
    public void setType(AnalysisType type) { this.type = type; }

    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }

    public LocalDate getAnalysisDate() { return analysisDate; }
    public void setAnalysisDate(LocalDate analysisDate) { this.analysisDate = analysisDate; }

    public Dream getDream() { return dream; }
    public void setDream(Dream dream) { this.dream = dream; }

    public AnalysisSession getSession() { return session; }
    public void setSession(AnalysisSession session) { this.session = session; }
}
