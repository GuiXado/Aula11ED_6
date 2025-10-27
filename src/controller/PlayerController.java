package controller;

import model.Musica;
import br.gui.listagenerica.*;

public class PlayerController {

	public void adicionaMusica(Lista<Musica> lista, String musica) {
		String[] vetor = musica.split(";");
		int dur = Integer.parseInt(vetor[2]);
		
		try {
			lista.addLast(new Musica(vetor[0], vetor[1] , dur));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void removeMusica(Lista<Musica> lista, int posicao) throws Exception {
		Musica aux = lista.get(posicao - 1);
		System.out.println(aux.toString());
		lista.remove(posicao - 1);
		
	}
	
	public void executaPlaylist(Lista<Musica> lista) throws Exception {
		Musica aux;
		if (lista.isEmpty()) throw new Exception ("Lista vazia");
		for (int i = 0; i < lista.size(); i++) {	
			aux = lista.get(i);
			System.out.println("Em execução!");
			System.out.println(aux.toString());
			Thread.sleep(aux.duracao);
		}
	}	
}