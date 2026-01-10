package com.java.adm.logic.classes;

import com.java.adm.logic.classes.Company;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "regimenes_fiscales")
@Getter @Setter
public class TaxRegime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "base_cost")
    private double baseCost;

    @OneToMany(mappedBy = "regime", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Company> companies = new ArrayList<>();
}