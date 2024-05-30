package com.first.crud.domain.annotation;

import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Table(name = "annotation")
@Entity(name = "annotation")
@EqualsAndHashCode(of = "id")
public class Annotation {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;
}
