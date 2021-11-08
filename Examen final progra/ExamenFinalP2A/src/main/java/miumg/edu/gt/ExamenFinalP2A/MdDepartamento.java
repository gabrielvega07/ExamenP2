/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miumg.edu.gt.ExamenFinalP2A;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author USUARIOTC
 */


//Tabla de departamento (crea la tabla si no existe)
@Data
@Entity
@Table(name = "tb_departamento")
public class MdDepartamento implements Serializable{  
    
    //crea los atributos de la tabla 
    private  static final long seialVersionUTD=1L;
    
    @Id 
    
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    
    private Long id_depto;
    
    private String descripcion_depto;
}
