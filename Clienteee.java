public class Clienteee {
	private String nome;
	private float cred;

	public void setNome(String nome){
		this.nome=nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setCred(float cred){
		this.cred=cred;
	}

	public float getCred(){
		return this.cred;
	}

	public String toString(){
	String r;
	r = "\nNome: "+this.nome+"\nCreditos: "+this.cred;
	return r;
	}
}
