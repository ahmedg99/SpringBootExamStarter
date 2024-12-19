package tn.spring.springboot.entities;


import lombok.Data;
import tn.spring.springboot.entities.enums.EnumExample;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data

public class TableExample implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private EnumExample enumExample;


}