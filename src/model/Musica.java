package model;

public class Musica {
	
	public String nome;
	public String nomeArtista;
	public int duracao;
	
	public Musica() {}
	
	public Musica(String nome, String nomeArtista, int duracao) {
		this.nome = nome;
		this.nomeArtista = nomeArtista;
		this.duracao = duracao;
	}
	
	public String toString() {
		return "Musica: [Nome da musica: " + nome + "] [Nome do Artista: " + nomeArtista + "] [Duração: " + duracao + "]";
	}
	
}
