/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miumg.edu.gt.ExamenFinalP2A.Servicio;

import miumg.edu.gt.ExamenFinalP2A.MdUsuario;
import java.util.List;


//muestra los usuarios ingresados en le index
public interface UsService { 
    public List<MdUsuario>ListaUs();
    
    public void GuardarUs(MdUsuario user);
    
    public void BorrarUs(MdUsuario user);
    
    public MdUsuario EncontrarUs(MdUsuario user);    
}
