package entities;

public class FuncionarioChefe extends Funcionario {
	
	    public FuncionarioChefe(String nome, int idade, double salarioBruto) {
	        super(nome, idade, salarioBruto);
	    }

	    @Override
	    public double calcularSalario() {
	        double bonificacao = salarioBruto * 0.05;
	        return salarioBruto + bonificacao;
	    }
	}



