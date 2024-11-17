package com.tarea.crud.Domain.entities;
import com.tarea.crud.Domain.DTO.CitasDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class PacienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String nombre;
    private int edad;
    private Date fechaNac;
    private String diagnostico;
    private String telefono;
    private String email;
    @OneToMany(mappedBy = "pacienteEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CitasEntity> citas;

}
