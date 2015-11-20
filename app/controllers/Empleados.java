package controllers;

import java.util.List;

import com.google.gson.Gson;

import models.Empleado;
import play.mvc.*;

public class Empleados extends CRUD {

	
	public static void listado(){
		    	
    	render(); 
	}
	
	
	public static void verListado(){
		List<Empleado> empleados=Empleado.find("order by id").fetch(); 
    	String json = new Gson().toJson(empleados);    	
    	renderJSON(json);     	
	}
	
	
	public static void guardar(Long idEmpleado,String nombre, String apellido){		
		Empleado editar=Empleado.findById(idEmpleado);
		editar.nombre=nombre;
		editar.apellido=apellido;	
		editar.save();				
	}
    

}
