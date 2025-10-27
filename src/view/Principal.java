package view;

import javax.swing.JOptionPane;
import model.Musica;
import controller.PlayerController;
import br.gui.listagenerica.*;

public class Principal {

	public static void main(String[] args) {
	
		Lista<Musica> lista = new Lista<>();
		PlayerController pc = new PlayerController();

		String menu = "1 - Inserir música\n"
				+ "2 - Remover música\n"
				+ "3 - Executar playplist\n"
				+ "9 - Sair";
		
		int opc = 0;
			do {
				try {
				opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
				switch(opc) {
					case 1:
						String Nome_da_musica = JOptionPane.showInputDialog("Digite o nome da música");
						String nome_artista = JOptionPane.showInputDialog("Digite o nome do artista");
						int duracao = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração da música"));
						String musica = Nome_da_musica + ";" + nome_artista + ";" + duracao;
						
						pc.adicionaMusica(lista, musica);
						break;
					case 2:
							int posicao = Integer.parseInt(JOptionPane.showInputDialog("Música a ser removida (digite a posição)"));
							pc.removeMusica(lista, posicao);
						break;
					case 3:
							pc.executaPlaylist(lista);
						break;
					case 9:
						break;
						
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida");
				}
				
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			} while (opc != 9);
	}

}