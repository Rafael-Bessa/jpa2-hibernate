package teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import dao.ProprietarioDAO;
import dao.VeiculoDAO;
import model.Proprietario;
import model.Veiculo;

public class TestePersistencia {
	
	
	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		veiculo.setAnoFabricacao(2022);
		veiculo.setAnoModelo(2019);
		veiculo.setFabricante("Honda");
		veiculo.setValor(new BigDecimal("120000"));
		veiculo.setModelo("HRV");
		
		Proprietario proprietario = new Proprietario();
		proprietario.setNome("Rafael Bessa");
		proprietario.setTelefone("11999999999");
		proprietario.setEmail("rafael@java");
		
		veiculo.setProprietario(proprietario);
		
		

		EntityManager em = Util.getEntityManager();
		
		VeiculoDAO v = new VeiculoDAO(em);
		ProprietarioDAO p = new ProprietarioDAO(em);

		em.getTransaction().begin();
	
		//A ordem IMPORTA, primeiro preciso persistir o proprietario antes do veiculo
		
		p.cadastrarProprietario(proprietario);
		v.cadastrarVeiculo(veiculo);
		
	
		em.getTransaction().commit();
		
		em.close();
		
	}

}
