/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miumg.edu.gt.ExamenFinalP2A.Dao;

import miumg.edu.gt.ExamenFinalP2A.MdProfesion;
import org.springframework.data.repository.CrudRepository;

public interface IProDao extends  CrudRepository<MdProfesion, Long> {
    
}
