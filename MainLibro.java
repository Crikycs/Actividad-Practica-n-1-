import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;


public class MainLibro {
	
	public static void main(String[] args) throws Throwable {

		XMLReader reader = XMLReaderFactory.createXMLReader();
		ParserLibroXML parserlibro = new ParserLibroXML();

		reader.setContentHandler(parserlibro);

		reader.parse(new InputSource(new FileInputStream("libros.xml")));

		mostrar();
		}

		public static void mostrar(){
			HashMap<String, Libro> mapaLibro = null;
			for (String nombre: mapaLibro.keySet())
		{
		   	String value = mapaLibro.get(nombre).toString();
		   	System.out.println(value);
		} 
		}	

}
	
//	public static void main(String[] args) throws SAXException, FileNotFoundException, IOException {
//		
//		XMLReader reader = 
//				XMLReaderFactory.createXMLReader();
//				
//				ParserLibroXML parserLibro = null;
//				parserLibro = new ParserLibroXML();
//				
//				reader.setContentHandler(parserLibro);
//				
//				reader.parse(new InputSource(new FileInputStream("libro.xml")));
//		
//	}
//
//	public static void mostrar(){
//		
//		Libro libro = null;
//		List<Libro> libros_list = new ArrayList<Libro>();
//		libros_list = (List<Libro>) MapaLibro.getMapa_libro();
//		libro = MapaLibro.getMapa_libro().get("")
//		System.out.println("Este es el libro 1:");
//		
//		
//		
//	}
//	
//	public static int getNLibros(){
//		int l= 0;
//		
//		return  l;
//	}
//}
