package bessa.morangon.rafael.testeComMain;

import bessa.morangon.rafael.dao.LivroDAO;
import bessa.morangon.rafael.model.Livro;

public class Teste {

	public static void main(String[] args) {

		try {

			Livro livro = new Livro();
			livro.setAutor("Rafael Guimarães Sakurai");
			livro.setIsbn("111-11-1111-111-1");
			livro.setPaginas(439);
			livro.setPreco(30.90);
			livro.setTitulo("Guia de estudos para certificação SCJA.");

			LivroDAO dao = new LivroDAO();

			livro = dao.salvar(livro);
			System.out.println("ID do livro salvo: " + livro.getId());

			// dao.excluir(2l);

			// dao.consultarPorId(4l);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
