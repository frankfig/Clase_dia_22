package Clase_dia_22.Programacion_dia22.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name= "persona")
public class Usuario
{
    @Id
    @Column(name = "id") 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String identificacion;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
}
