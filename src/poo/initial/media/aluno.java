package poo.initial.media;

public class aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double mediaFinal() {
		return nota1 + nota2 + nota3; 
	}
	
	public double faltouNota() {
		if (mediaFinal() < 60.0) {
			return 60 - mediaFinal();
		} else {
			return 0;
		}
	}
}
