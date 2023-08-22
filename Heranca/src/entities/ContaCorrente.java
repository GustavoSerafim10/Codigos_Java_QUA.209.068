package entities;

//como falo que ela e uma outra conta? eu simplesmente extendo ela.. com o extends 
public class ContaCorrente extends Conta {
	//Eu sobrescrevi tlg.. o que está la na conta que e SACAR , dai ele trás  o método de lá  tlg.
	//Dai na pagina principal eu vou trocar o saldo para PROTECTED em vez de private
	//Esse protected ele assível tnato para as "pais tanto para as filhas"
	@Override
	public void sacar(double saque) {
		saldo -= saque + 2.00;
	}
	
	
}
