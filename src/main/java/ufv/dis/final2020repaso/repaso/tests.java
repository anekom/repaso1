package ufv.dis.final2020repaso.repaso;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests {

	@Test
	public void testInstance() {
		Usuario u = new Usuario("Andrea Maria", "Garcia", "andreeiitaa100gmail.com", "05/09/1996","53844304");
		
		assertEquals("Andrea Maria", u.getNombre());
	}
	
	
	
	@Test
	public void testAdd() {
		Usuario u = new Usuario("Andrea Maria", "Garcia", "andreeiitaa100gmail.com", "05/09/1996","53844304");
		
		Lista l = new Lista();
		
		l.addUsuario(u);
		
		assertEquals(1, l.sizeUsuario());
	}
	
	@Test
	public void testRemove() {
		Usuario u = new Usuario("Andrea Maria", "Garcia", "andreeiitaa100gmail.com", "05/09/1996","53844304");
		
		Lista l = new Lista();
		
		l.addUsuario(u);
		
		l.removeUsuario(u);
		
		assertEquals(0, l.sizeUsuario());
	}


}
