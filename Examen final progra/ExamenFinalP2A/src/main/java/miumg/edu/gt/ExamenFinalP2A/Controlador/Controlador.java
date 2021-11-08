/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miumg.edu.gt.ExamenFinalP2A.Controlador;

import miumg.edu.gt.ExamenFinalP2A.MdProfesion;
import miumg.edu.gt.ExamenFinalP2A.MdUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import miumg.edu.gt.ExamenFinalP2A.Servicio.DepService;
import miumg.edu.gt.ExamenFinalP2A.Servicio.ProService;
import miumg.edu.gt.ExamenFinalP2A.Servicio.UsService;

/**
 *
 * @author USUARIOTC
 */

@Controller
public class Controlador {

    @Autowired 
    private UsService usuarioService;
    
    @Autowired 
    private DepService departamentoService;
        
    @Autowired 
    private ProService profesionService; 
    
    //dirige a la ruta en blanco por que es el index (inicio)
    @GetMapping("/")                       //get es una notacion de direccion o atajo
    public String begin(Model model) {
        
        var Users = usuarioService.ListaUs();       //iguala usuario a lista para mostrar los usuarios en el index
        
        model.addAttribute("usuario", Users);       //agrega el usueario
        
        var States = departamentoService.ListaDepartamentos(); //iguala departamentos a lista para mostrar los departamentoes ingresados en mysql en el index
        
        model.addAttribute("dep", States);          //
        
        var Professions = profesionService.LProff();    //muestra la lista de profesiones disponibles
        model.addAttribute("prof", Professions);
        return "Index";
    }
    
    @GetMapping("/guardar")                                     //ruta a boton agregar 
    
    //recibe los datos ingresados y los almacena en el usuario
    public String InsertUs(MdUsuario user, Model model) {
        var States = departamentoService.ListaDepartamentos();
        model.addAttribute("dep", States);
        var Professions = profesionService.LProff();
        model.addAttribute("rof", Professions);
        model.addAttribute("separador", " - ");
        return "InsertUs";                                  //ruta finaliza en ingresar usuario
    }
    
       @GetMapping("/guardar1")     //sigue la ruta del boton agregar profesion 
    public String InsertPro(MdProfesion proff) {
        return "InsertPro";     //finaliza la ruta con agregar la profesion 
    }
        @GetMapping("/editarU/{id_usuario}")        //ruta de boton editar usuario
        //recibe los datos modificados del usuario
    public String editar(MdUsuario user, Model model) {
        user = usuarioService.EncontrarUs(user);
        model.addAttribute("usuario", user);
        var states=departamentoService.ListaDepartamentos();
        model.addAttribute("departamento",states);
        model.addAttribute("separador", "-");
        var proff=profesionService.LProff();
        model.addAttribute("profesiones",proff);
        return "UpdateUs"; //guarda los datos modificados del usuario
    }
        @GetMapping("/editarP/{id_profesion}")      //ruta para editar profesion 
        
        //recibe los datos modificados de la profesion
    public String updatePro(MdProfesion proff, Model model) {
        proff = profesionService.EncontrarPro(proff);
        model.addAttribute("profesion", proff);
        return "UpdatePro";         //guarda la nueva profesion
    }
  
    @PostMapping("/add")                       //ruta para boton guardar usuario actualizar
    
    public String saveU(MdUsuario user) {
        usuarioService.GuardarUs(user);
        return "redirect:/";                        //ruta al index
    }
    
    //elimina el usuario
    @GetMapping("/eliminarU/{id_usuario}")
    public String DeleteUs(MdUsuario user) {
        usuarioService.BorrarUs(user);
        return "redirect:/";
    }
    //post es una notacion de acceso directo para botones
    @PostMapping("/add1")           //ruta boton guardar profesion
    public String savePro(MdProfesion proff) {
        profesionService.GuardarPro(proff);
        return "redirect:/";
    }
    
    
        //elimina profesion
    @GetMapping("/eliminarP/{id_profesion}")
    public String DeletePro(MdProfesion proff) {
        profesionService.BorrarPro(proff);
        return "redirect:/";
    }
    

}
