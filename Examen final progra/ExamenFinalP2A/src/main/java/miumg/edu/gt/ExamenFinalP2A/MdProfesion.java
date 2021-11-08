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

@Data
@Entity
@Table(name = "tb_profesion")
public class MdProfesion implements Serializable{    
    private  static final long seialVersionUTD=1L; 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //genera los datos AI
    private Long id_profesion;                          //col para el id de la profesion
    private String descripcion_profesion;               //col para descripcion de la profesion
    
}
