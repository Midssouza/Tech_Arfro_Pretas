package triatleta;

public class TestaTriatleta {

	public static void main(String[] args) {
		
		Triatleta triatleta = new Triatleta("Maria");
		
		triatleta.aquecer();
		triatleta.correr();
		triatleta.nadar();
		triatleta.pedalar();
		triatleta.cansou();
	}

}
