package exercicioDIO;

public class Usuario {

	public static void main(String[] args) {

		Iphone iphone = new Iphone();

		// Aparelho telefonico

		iphone.ligar(true);
		iphone.desligar(true);
		iphone.atender(true);
		iphone.desligar(true);
		iphone.iniciarCorreioDeVoz(false);
		iphone.iniciarCorreioDeVoz(true);

		System.out.println(" ");
		// Navegador

		iphone.exibirPagina("www.google.com");
		iphone.atualizarPagina(true);
		iphone.adicionarPagina(true, "www.duckduck.com");
		iphone.adicionarPagina(false, "null");
		
		System.out.println(" ");
		// Reproduto musical
		
		iphone.selecionarMusica("Held reflection");
		iphone.tocar(true);
		iphone.pausar(true);
		
		

	}
}
