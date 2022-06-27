package br.com.titansoftwares.titantesteweb.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String placa, modelo;

    Date dataEntrada


}
