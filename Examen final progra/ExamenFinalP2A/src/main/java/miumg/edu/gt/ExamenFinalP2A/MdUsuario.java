/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miumg.edu.gt.ExamenFinalP2A;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author USUARIOTC
 */

//gnera la tabla de usuarios si no hay
@Data
@Entity
@Table(name = "tb_usuarios")
public class MdUsuario implements Serializable {
    
    private  static final long seialVersionUTD=1L;
    
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY) //valores AI
    
    @Column(name = "ID_USUARIO")                        //
    private Long id_usuario;
    
    @Column(name = "ID_DEPTO")
    private Long id_depto;
    
    @Column(name = "ID_PROFESION")
    private Long id_profesion;
    private String nombre;
    private String apellido;
    private String correo_electronico;
    private String telefono;
    
    @Column(name = "Fecha_Nacimiento")
    @Temporal(TemporalType.DATE)
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fecha_nacimiento;
    private Double longitud;
    private Double latitud;
    
    @Column(name = "fecha_registro")
    
    @Temporal(TemporalType.DATE)
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fecha_registro;
}
