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
		System.out.println("** Programa de gerenciamento de rela��es p�blicas. **\nGerenciando um programa de rela��es p�blicas atrav�s de habilidades de neg�cios e comunica��es.\n");
		 
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your rollno");  
		 int rollno=sc.nextInt();  
		 System.out.println("Enter your name");  
		 String name=sc.next();  
		 System.out.println("Enter your fee");  
		 double fee=sc.nextDouble();  
		 System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);  
		 sc.close();  
	}

}
