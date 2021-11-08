/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miumg.edu.gt.ExamenFinalP2A.Servicio;

import miumg.edu.gt.ExamenFinalP2A.MdDepartamento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import miumg.edu.gt.ExamenFinalP2A.Dao.IDepDao;

/**
 *
 * @author USUARIOTC
 */

// 
@Service //lo defino como servicio
public class MdDepartamentoServiceImpl implements DepService{
    @Autowired 
    private IDepDao DepartamentoDaoI;
   
    @Override
    @Transactional(readOnly = true)
    public List<MdDepartamento> ListaDepartamentos() {
        return (List<MdDepartamento>) DepartamentoDaoI.findAll();       
    }
}
