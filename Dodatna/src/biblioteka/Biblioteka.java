package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	
	
	public void dodajKnjigu(Knjiga knjiga) {
		if(knjiga == null || knjige.contains(knjiga))
			throw new RuntimeException("Greska pri unosu knjige");
		knjige.add(knjiga);
	}

	
	public void obrisiKnjigu(Knjiga knjiga) {
		if(knjiga == null || !knjige.contains(knjiga))
			throw new RuntimeException("Greska pri brisanju knjige");
		knjige.add(knjiga);
	knjige.remove(knjiga);

	}

	
	public LinkedList<Knjiga> vratiSveKnjige() {
		
		
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac) {
       // naslov knjiga ne sme biti null - ne sme bitiiiiiiiiiiiiiiiii
		if(naslov == null) throw new RuntimeException("Naslov ne sme biti null");
		LinkedList<Knjiga> rezultat = new LinkedList<Knjiga>();
		for (int i = 0; i < knjige.size(); i++) {
			if(knjige.get(i).getNaslov().contains(naslov))
				rezultat.add(knjige.get(i));
		}
		return null;
	}

}
