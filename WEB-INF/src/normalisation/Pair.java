package normalisation;

import java.util.HashSet;
import java.util.Set;

public class Pair {
	private String methode;
	private Set<String> mots;
	
	public Pair(){
		this.methode=new String();
		this.mots=new HashSet<>();
	}
	public String getMethode() {
		return methode;
	}

	public void setMethode(String methode) {
		this.methode = methode;
	}

	public Set<String> getMots() {
		return mots;
	}

	public void setMots(Set<String> mots) {
		this.mots = mots;
	}
  
 
}
