package br.com.jgsjnr.bancodigital;
import br.com.jgsjnr.bancodigital.classes.Cliente;
import br.com.jgsjnr.bancodigital.classes.Conta;
import br.com.jgsjnr.bancodigital.classes.ContaCorrente;
import br.com.jgsjnr.bancodigital.classes.ContaPoupanca;


public class BancoDigital {

	public static void main(String[] args) {
		Cliente JJ = new Cliente();
		JJ.setNome("JJ");
		
		Conta cc = new ContaCorrente(JJ);
		Conta poupanca = new ContaPoupanca(JJ);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
