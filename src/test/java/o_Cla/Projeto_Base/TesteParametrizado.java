package o_Cla.Projeto_Base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class TesteParametrizado {
private Funcionario f;
 	
 	@ParameterizedTest
 	@CsvSource({
 		"1711, Iguin, 6000, 5, true, 6900",
 		"1351, Vazaee, 5000, 0, true, 5500",
 		"4599, Lari, 5000, 0, false, 5000"
 	})
 	public void calculaSalarioBruto(int matricula, String nome,double salarioBase, int depend, boolean insalu, double resul) {
 		f = new Funcionario(matricula, nome, salarioBase, depend, insalu);
 		
 		//Teste Getters
 		assertEquals(matricula, f.getMatricula());
 		assertEquals(nome, f.getNome());
 		assertEquals(salarioBase, f.getSalarioBase(), 0.01);
 		assertEquals(depend, f.getNroDependentes());
 		assertEquals(insalu, f.getInsalubridade());
 		
 		//Teste método SalarioBruto
 		assertEquals(resul, f.getSalarioBruto(), 0.01);
 	}

}
