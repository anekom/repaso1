package ufv.dis.final2020repaso.repaso;

import java.util.Date;

public class Usuario {
	
	private String nombre;
	private String ape;
	private String email;
	private String dni;
	private Date nacimiento;
	
	
	
	public Usuario(String nombre, String ape, String email, String dni, Date nacimiento) {
		super();
		this.nombre = nombre;
		this.ape = ape;
		this.email = email;
		this.dni = dni;
		this.nacimiento = nacimiento;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApe() {
		return ape;
	}
	public void setApe(String ape) {
		this.ape = ape;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	
	
	
	

}
