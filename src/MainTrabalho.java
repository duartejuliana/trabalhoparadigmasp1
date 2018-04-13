/*
 * Alunos:
 * Ana
 * Jean
 * Juliana Duarte RA1420539
 * Wilson
 * 
 * Process Classification Framework
 * �rea: Health Insurance Payor
 * Categoria: 12.5	Gerenciar programa de rela��es p�blicas
 * 12.5.1	Gerenciar rela��es com a comunidade
 * 12.5.2	Gerenciar rela��es de m�dia
 * 12.5.3	Promover a estabilidade pol�tica
 * 12.5.4	Criar comunicados de imprensa
 * 12.5.5	Emitir comunicado de imprensa
 */

import java.util.Scanner;

public class MainTrabalho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Comunidade comunidade = new Comunidade();
		Midia midia = new Midia();
		Politica politica = new Politica();
		Imprensa imprensa = new Imprensa();
		
		System.out.println("** Programa de gerenciamento de rela��es p�blicas. **\nGerenciando um programa de rela��es p�blicas atrav�s de habilidades de neg�cios e comunica��es.\n");
		System.out.println("Digite a �rea que deseja entrar:\n1 para Gerenciar rela��es com a comunidade\n2 para Gerenciar rela��es de m�dia\n3 para Promover a estabilidade pol�tica\n4 para Criar e emitir comunicados de imprensa\n");  

		int area=sc.nextInt();
		switch (area) {
			case 1:
				System.out.println(comunidade.getApresentacao());
				break;
				
			case 2:
				System.out.println(midia.getApresentacao());
				break;
				
			case 3:
				System.out.println("Dentro das estrat�gias de estabilidade pol�tica temos quatro setores. Digite qual voc� gostaria de visualizar:\n1 para Politica Geral\n2 para Programa Civico\n3 para Envolvimento dos Cidadaos\n4 para Plataforma de Conexao\n");
				int setores=sc.nextInt();
				switch (setores) {
					case 1:
						System.out.println("A pol�tica geral vigente na nossa empresa �:\n"+politica.getPolitica());
						System.out.println("Deseja alterar a pol�tica?\n1 para sim\n2 para n�o");
						int alterapolitica=sc.nextInt();
						if (alterapolitica == 1) {
							System.out.println("Digite a nova pol�tica:\n");
							String novapolitica=sc.next();
							politica.setPolitica(novapolitica);
							System.out.println("Pol�tica alterada com sucesso!\nNova pol�tica:\n" + politica.getPolitica());
						}
						break;
					case 2:
						System.out.println("O programa civico vigente na nossa empresa �:\n"+politica.getCivico());
						System.out.println("Deseja alterar o programa civico?\n1 para sim\n2 para n�o");
						int alteracivico=sc.nextInt();
						if (alteracivico == 1) {
							System.out.println("Digite o novo programa civico:\n");
							String novoprogramacivico=sc.next();
							politica.setCivico(novoprogramacivico);
							System.out.println("Programa civico alterado com sucesso!\nNovo programa civico:\n" + politica.getCivico());
						}
						break;
					case 3:
						System.out.println("O programa de envolvimento de cidadaos vigente na nossa empresa �:\n"+politica.getEnvolvimento());
						System.out.println("Deseja alterar o programa de envolvimento de cidadaos?\n1 para sim\n2 para n�o");
						int alteraenvolvimento=sc.nextInt();
						if (alteraenvolvimento == 1) {
							System.out.println("Digite o novo programa de envolvimento de cidadaos:\n");
							String novoenvolvimentocidadaos=sc.next();
							politica.setEnvolvimento(novoenvolvimentocidadaos);
							System.out.println("Programa de envolvimento de cidadaos alterado com sucesso!\nNovo programa de envolvimento de cidadaos:\n" + politica.getEnvolvimento());
						}
						break;
					case 4:
						System.out.println("A plataforma de conexao vigente na nossa empresa �:\n"+politica.getPlataforma());
						System.out.println("Deseja alterar a plataforma de conexao?\n1 para sim\n2 para n�o");
						int alteraplataforma=sc.nextInt();
						if (alteraplataforma == 1) {
							System.out.println("Digite a nova plataforma de conexao:\n");
							String novaplataformaconexao=sc.next();
							politica.setPlataforma(novaplataformaconexao);
							System.out.println("Plataforma de conexao alterada com sucesso!\nNova plataforma de conexao:\n" + politica.getPlataforma());
						}
				}
				break;
				
			case 4:
				imprensa.getApresentacao();
				System.out.println("Deseja criar um novo comunicado?\n1 para sim\n2 para n�o");
				int criacomunicado=sc.nextInt();
				if (criacomunicado == 1) {
					System.out.println("Digite o comunicado:\n");
					String novocomunicado=sc.next();
					imprensa.setComunicado(novocomunicado);
					System.out.println("Digite o canal de distribui��o (Op��es: web, jornais, m�dias sociais):\n");
					String canal=sc.next();
					imprensa.setCanal(canal);
					System.out.println("Comunicado criado com sucesso!\n" + imprensa.getComunicado() + "\nCanal: " + imprensa.getCanal());
				}
				break;
		}
		sc.close(); 
		System.out.println("\n\nObrigado por usar nosso sistema!");
	}

}
