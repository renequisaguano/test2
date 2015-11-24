package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Empleado extends Model {	
	public String nombre;
	public String apellido;
	@Column(columnDefinition="TEXT")
	public String perfilProfesiona;
		
	public String toString(){
		return apellido+" "+nombre;
	}    
}
