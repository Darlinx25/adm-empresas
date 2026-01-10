package com.java.adm.logic.classes;

import com.java.adm.logic.classes.Client;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "empresas")
@Getter @Setter @NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long rut;

    @Column(name = "company_num")
    private Long companyNum;

    @Column(name = "company_type")
    private String companyType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "regime_id")
    private TaxRegime regime;

    public Company(Long rut, Long companyNum, String companyType){
        this.rut = rut;
        this.companyNum = companyNum;
        this.companyType = companyType;
    }
}