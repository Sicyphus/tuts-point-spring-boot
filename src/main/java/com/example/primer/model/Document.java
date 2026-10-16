package com.example.primer.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "USERS")
public class Document {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="file_name")
    private String fileName;

    @Column(name ="file_date")
    private LocalDate fileDate;

    public Document (){

    }

    public Document (String fileName, LocalDate fileDate){
        this.fileName = fileName;
        this.fileDate = fileDate;
    }

    public Long getId (){
        return id;
    }

    public void setId (Long id){
        this.id = id;
    }

    public String getFileName (){
        return fileName;
    }

    public void setFileName (String fileName){
        this.fileName = fileName;
    }

    public LocalDate getfileDate (){
        return fileDate;
    }

    public void setFileDate (LocalDate fileDate){
        this.fileDate = fileDate;
    }

}