package entities;

import java.time.LocalDate;

public class Usuario {
	 private String nome;
	    private int anoNascimento;

	    public Usuario(String nome, int anoNascimento) {
	        this.nome = nome;
	        this.anoNascimento = anoNascimento;
	    }

	    public int calcularIdade() {
	        int anoAtual = LocalDate.now().getYear();
	        return anoAtual - anoNascimento;
	    }
	}


