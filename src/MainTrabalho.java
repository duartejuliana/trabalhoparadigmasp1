/*
 * Alunos:
 * Ana
 * Jean
 * Juliana Duarte RA1420539
 * Wilson
 * 
 * Process Classification Framework
 * Área: Health Insurance Payor
 * Categoria: 12.5	Gerenciar programa de relações públicas
 * 12.5.1	Gerenciar relações com a comunidade
 * 12.5.2	Gerenciar relações de mídia
 * 12.5.3	Promover a estabilidade política
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
		
		System.out.println("** Programa de gerenciamento de relações públicas. **\nGerenciando um programa de relações públicas através de habilidades de negócios e comunicações.\n");
		System.out.println("Digite a área que deseja entrar:\n1 para Gerenciar relações com a comunidade\n2 para Gerenciar relações de mídia\n3 para Promover a estabilidade política\n4 para Criar e emitir comunicados de imprensa\n");  

		int area=sc.nextInt();
		switch (area) {
			case 1:
				System.out.println(comunidade.getApresentacao());
				break;
				
			case 2:
				System.out.println(midia.getApresentacao());
				break;
				
			case 3:
				System.out.println("Dentro das estratégias de estabilidade política temos quatro setores. Digite qual você gostaria de visualizar:\n1 para Politica Geral\n2 para Programa Civico\n3 para Envolvimento dos Cidadaos\n4 para Plataforma de Conexao\n");
				int setores=sc.nextInt();
				switch (setores) {
					case 1:
						System.out.println("A política geral vigente na nossa empresa é:\n"+politica.getPolitica());
						System.out.println("Deseja alterar a política?\n1 para sim\n2 para não");
						int alterapolitica=sc.nextInt();
						if (alterapolitica == 1) {
							System.out.println("Digite a nova política:\n");
							String novapolitica=sc.next();
							politica.setPolitica(novapolitica);
							System.out.println("Política alterada com sucesso!\nNova política:\n" + politica.getPolitica());
						}
						break;
					case 2:
						System.out.println("O programa civico vigente na nossa empresa é:\n"+politica.getCivico());
						System.out.println("Deseja alterar o programa civico?\n1 para sim\n2 para não");
						int alteracivico=sc.nextInt();
						if (alteracivico == 1) {
							System.out.println("Digite o novo programa civico:\n");
							String novoprogramacivico=sc.next();
							politica.setCivico(novoprogramacivico);
							System.out.println("Programa civico alterado com sucesso!\nNovo programa civico:\n" + politica.getCivico());
						}
						break;
					case 3:
						System.out.println("O programa de envolvimento de cidadaos vigente na nossa empresa é:\n"+politica.getEnvolvimento());
						System.out.println("Deseja alterar o programa de envolvimento de cidadaos?\n1 para sim\n2 para não");
						int alteraenvolvimento=sc.nextInt();
						if (alteraenvolvimento == 1) {
							System.out.println("Digite o novo programa de envolvimento de cidadaos:\n");
							String novoenvolvimentocidadaos=sc.next();
							politica.setEnvolvimento(novoenvolvimentocidadaos);
							System.out.println("Programa de envolvimento de cidadaos alterado com sucesso!\nNovo programa de envolvimento de cidadaos:\n" + politica.getEnvolvimento());
						}
						break;
					case 4:
						System.out.println("A plataforma de conexao vigente na nossa empresa é:\n"+politica.getPlataforma());
						System.out.println("Deseja alterar a plataforma de conexao?\n1 para sim\n2 para não");
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
				System.out.println("Deseja criar um novo comunicado?\n1 para sim\n2 para não");
				int criacomunicado=sc.nextInt();
				if (criacomunicado == 1) {
					System.out.println("Digite o comunicado:\n");
					String novocomunicado=sc.next();
					imprensa.setComunicado(novocomunicado);
					System.out.println("Digite o canal de distribuição (Opções: web, jornais, mídias sociais):\n");
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
