package exercicioDIO;

public interface Navegador {

	 void exibirPagina(String url);

	 void adicionarPagina(boolean abrirNovaAba, String url);

	 void atualizarPagina(boolean atualizar);


}
