/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miumg.edu.gt.ExamenFinalP2A.Servicio;

import miumg.edu.gt.ExamenFinalP2A.MdProfesion;
import java.util.List;


//muestra las profesionse ingresadas
public interface ProService {
    public List<MdProfesion>LProff();
    
    public void GuardarPro(MdProfesion proff);
    
    public void BorrarPro(MdProfesion proff);
    
    public MdProfesion EncontrarPro(MdProfesion proff);    
}
