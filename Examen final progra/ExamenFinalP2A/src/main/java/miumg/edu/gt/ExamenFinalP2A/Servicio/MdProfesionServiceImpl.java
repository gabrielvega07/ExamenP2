/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miumg.edu.gt.ExamenFinalP2A.Servicio;

import miumg.edu.gt.ExamenFinalP2A.MdProfesion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import miumg.edu.gt.ExamenFinalP2A.Dao.IProDao;

/**
 *
 * @author USUARIOTC
 */


@Service
public class MdProfesionServiceImpl implements ProService {
    @Autowired
    private IProDao ProfesionDaoI;

    @Override
    @Transactional(readOnly = true)
    public List<MdProfesion> LProff() {
        return (List<MdProfesion>) ProfesionDaoI.findAll();       
    }

    @Override
    @Transactional
    public void GuardarPro(MdProfesion proff) {
       ProfesionDaoI.save(proff);      
    }

    @Override
    @Transactional
    public void BorrarPro(MdProfesion proff) {
        ProfesionDaoI.delete(proff);        
    }

    @Override
    @Transactional(readOnly = true)
    public MdProfesion EncontrarPro(MdProfesion proff) {
       return ProfesionDaoI.findById(proff.getId_profesion()).orElse(null);       
    }  
}
