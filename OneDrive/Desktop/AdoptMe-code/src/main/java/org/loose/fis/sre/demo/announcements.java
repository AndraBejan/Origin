package org.loose.fis.sre.demo;

import javafx.fxml.FXML;
import org.dizitart.no2.objects.Id;

public class announcements {
    @Id
    private String titlu;
    private String descriere;

    public announcements(String titlu, String descriere) {
        this.titlu = titlu;
        this.descriere = descriere;


    }

    public String getTitlu() {
        return titlu;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    
}
