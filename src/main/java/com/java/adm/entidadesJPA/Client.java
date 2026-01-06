package com.java.adm.entidadesJPA;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clientes")
@Getter @Setter @NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private boolean state;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Company> companies = new ArrayList<>();

    public Client(String name){
        this.name = name;
    }

    public void addCompany(Company company) {
        companies.add(company);
        company.setOwner(this);
    }

}
