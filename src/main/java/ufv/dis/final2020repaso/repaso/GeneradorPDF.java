package ufv.dis.final2020repaso.repaso;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneradorPDF {
	
	public static void generar(Usuario u) {
		
		String filename = "pdfs/" + u.getDni() + ".pdf";
		Date hoy = new Date();
		
		
		try {
			
			Document document=new Document();
			PdfWriter.getInstance(document,new FileOutputStream(filename));
			
			document.open();document.add(new Paragraph(u.getNombre()));
			document.open();document.add(new Paragraph(u.getApe()));
			document.open();document.add(new Paragraph(u.getEmail()));
			document.open();document.add(new Paragraph(u.getDni()));
			document.open();document.add(new Paragraph(u.getNacimiento()));
			
			document.open();document.add(new Paragraph("fecha de creacion del usuario: "+hoy));
			
			document.close();
			
		} catch (FileNotFoundException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
