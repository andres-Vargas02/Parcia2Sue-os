package com.uptc.dream_analyzer.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String content;

    private LocalDate creationDate;

    @OneToOne
    @JoinColumn(name = "session_id")
    private AnalysisSession session;

    public Report() {}

    public Report(Long id, String content, LocalDate creationDate, AnalysisSession session) {
        this.id = id;
        this.content = content;
        this.creationDate = creationDate;
        this.session = session;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public LocalDate getCreationDate() { return creationDate; }
    public void setCreationDate(LocalDate creationDate) { this.creationDate = creationDate; }

    public AnalysisSession getSession() { return session; }
    public void setSession(AnalysisSession session) { this.session = session; }
}
