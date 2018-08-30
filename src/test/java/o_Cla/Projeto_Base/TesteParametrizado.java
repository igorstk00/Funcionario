package o_Cla.Projeto_Base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class TesteParametrizado {
private Funcionario f;
 	
 	@ParameterizedTest
 	@CsvSource({
 		"1711, Iguin, 6000, 5, true, 6900, 5025",
 		"1351, Vazaee, 3000, 0, true, 3300, 2805",
 		"4599, Lari, 1800, 3, false, 1854, 1773"
 	})
 	public void calculaSalarioBruto(int matricula, String nome,double salarioBase, int depend, boolean insalu, double salBruto, double salLiquido) {
 		f = new Funcionario(matricula, nome, salarioBase, depend, insalu);
 		
 		//Teste Getters
 		assertEquals(matricula, f.getMatricula());
 		assertEquals(nome, f.getNome());
 		assertEquals(salarioBase, f.getSalarioBase(), 0.01);
 		assertEquals(depend, f.getNroDependentes());
 		assertEquals(insalu, f.getInsalubridade());
 		
 		//Teste método SalarioBruto
 		assertEquals(salBruto, f.getSalarioBruto(), 0.01);
 		
 		//Teste método SalarioLiquido
 		assertEquals(salLiquido, f.getSalarioLiquido(), 0.01);
 	}

}
