package exercicioDIO;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, Navegador {

	public void exibirPagina(String url) {
		System.out.println(url);
	}

	public void adicionarPagina(boolean abrirNovaAba, String url) {
		if (abrirNovaAba == true) {
			System.out.println(url);
		}else System.out.println("");
	}

	public void atualizarPagina(boolean atualizar) {
		if (atualizar == true) {
			System.out.println("página atualizada.");
		}else 
			System.out.println("");
	}

	public void tocar(boolean tocando) {
		if (tocando == true) {
			System.out.println("reproduzindo música.");
		}
	}

	public void pausar(boolean pausado) {
		if (pausado == true) {
			System.out.println("música pausada.");
		}

	}

	public void selecionarMusica(String nomeMusica) {
		System.out.println("música: " + nomeMusica);
	}

	public void ligar(boolean ligar) {
		if (ligar == true) {
			System.out.println("realizar chamada");
		}
	}

	public void atender(boolean atender) {
		if (atender == true) {
			System.out.println("chamada iniciada");
		} else
			System.out.println("chamada rejeitada");
	}

	public void desligar(boolean desligar) {
		if (desligar == true) {
			System.out.println("chamada finalizada");
		}

	}

	public void iniciarCorreioDeVoz(boolean ouvirCorreioDeVoz) {
		if (ouvirCorreioDeVoz == true) {
			System.out.println("Ligar para correio de voz e ouvir a mensagem.");
		} else
			System.out.println("Não ligar para correio de voz.");

	}

}
