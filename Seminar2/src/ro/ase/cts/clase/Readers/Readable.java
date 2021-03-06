package ro.ase.cts.clase.Readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public interface Readable {
	
	List<Aplicant> readAplicanti(String file)  throws FileNotFoundException;

}
