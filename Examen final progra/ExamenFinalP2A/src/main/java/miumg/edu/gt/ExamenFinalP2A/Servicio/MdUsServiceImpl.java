/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miumg.edu.gt.ExamenFinalP2A.Servicio;

import miumg.edu.gt.ExamenFinalP2A.MdUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import miumg.edu.gt.ExamenFinalP2A.Dao.IUsDao;

/**
 *
 * @author USUARIOTC
 */


@Service 
public class MdUsServiceImpl implements UsService {
    @Autowired
    private IUsDao UsuarioDaoI;
  
    
    @Override
    @Transactional(readOnly = true)
    public List<MdUsuario> ListaUs() {
        return (List<MdUsuario>) UsuarioDaoI.findAll();
    }

    @Override
    @Transactional
    public void GuardarUs(MdUsuario user) {
       UsuarioDaoI.save(user);
    }

    @Override
    @Transactional
    public void BorrarUs(MdUsuario user) {
       UsuarioDaoI.delete(user);
    }

    @Override
    @Transactional(readOnly = true)
    public MdUsuario EncontrarUs(MdUsuario user) {
        return  UsuarioDaoI.findById(user.getId_usuario()).orElse(null);
    }   
}
