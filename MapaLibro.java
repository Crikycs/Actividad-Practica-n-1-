import java.util.HashMap;
import java.util.Map;



public class MapaLibro {
	
	private static Map<String, Libro> mapa_libro;

	public static Map<String, Libro> getMapa_libro() {
		return mapa_libro;
	}

	public void setMapaLibro(Map<String, Libro> mapa_libro) {
		MapaLibro.mapa_libro = mapa_libro;
	}

	public MapaLibro() {
		super();
		mapa_libro = new HashMap<String, Libro>();
	}
	
	

}
