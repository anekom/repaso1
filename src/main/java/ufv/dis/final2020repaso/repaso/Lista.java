package ufv.dis.final2020repaso.repaso;

import java.util.ArrayList;

public class Lista {
	
	
	private ArrayList<Usuario> usuario = new ArrayList<Usuario>();
	
	
	public Lista() {
		this.usuario = new ArrayList<Usuario>();	
	}
	
	public void addUsuario(Usuario u) {
		this.usuario.add(u);
	}
	
	
	public void removeUsuario(Usuario u) {
		this.usuario.remove(u);
	}
	
	
	public int sizeUsuario() {
		return this.usuario.size();
	}

}
