package projeto_funcionarios;

public class ClassePrincipal {
	
	public static void main(String[] args) throws Exception{
		ClasseFuncionarios funcionario = new ClasseFuncionarios();
		//pessoa.setAtributoIdPessoa(1);
		funcionario.setAtributoNomeFuncionario("Leandro");
		funcionario.setAtributoRendaFuncionario(1.3);
		
		ClasseInsertSQL sql = new ClasseInsertSQL();
		sql.salvarDados(funcionario);	
	}
	

}
