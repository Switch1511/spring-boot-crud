package com.first.crud.domain.annotation;

import lombok.*;

import javax.persistence.*;

@Table(name = "annotation")
@Entity(name = "annotation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Annotation {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;

    private String description;
}
