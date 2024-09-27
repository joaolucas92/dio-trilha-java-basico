package smartphone;

import dispositivos.navegador.Safari;
import dispositivos.reprodutormusical.Ipod;
import dispositivos.telefone.Phone;

public class Iphone implements Ipod, Phone, Safari {
	
	public static void main(String[] args) {
		Iphone ios1 = new Iphone();
		
		ios1.tocar();
		ios1.pausar();
		ios1.atender();
		ios1.ligar("43996110098");
		ios1.exibirPagina("www.amazon.com.br");
		ios1.atualizarPagina();
		ios1.adicionarNovaAba();
		ios1.iniciarCorreioVoz();
		ios1.selecionarMusica("I Don't Want to Miss a Thing - Aerosmith");
	}

	public void tocar() {
		System.out.println("REPRODUZINDO MUSICA NO IPOD");
	}

	public void pausar() {
		System.out.println("PAUSANDO MUSICA NO IPOD");
	}

	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO A MUSICA " + musica);
	}

	public void exibirPagina(String url) {
		System.out.println("ACESSANDO PAGINA: " + url);
	}

	public void adicionarNovaAba() {
		System.out.println("ABRINDO NOVA ABA");
	}

	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
	}

	public void ligar(String numero) {
		System.out.println("LIGANDO PARA " + numero);
	}

	public void atender() {
		System.out.println("ATENDENDO CHAMADA");		
	}

	public void iniciarCorreioVoz() {
		System.out.println("ACESSANDO CORREIO DE VOZ");
	}
	
}
