package coo.develhope.apispringrepository02.entities;

import javax.persistence.*;

@Entity
@Table(name = "programming_language")
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    private int firstAppearanceYear;

    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguage(){
    }

    public ProgrammingLanguage(Long id, String name, int firstAppearanceYear, String inventor) {
        this.id = id;
        this.name = name;
        this.firstAppearanceYear = firstAppearanceYear;
        this.inventor = inventor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFirstAppearanceYear() {
        return firstAppearanceYear;
    }

    public void setFirstAppearanceYear(int firstAppearanceYear) {
        this.firstAppearanceYear = firstAppearanceYear;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
