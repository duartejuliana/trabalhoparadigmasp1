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
		System.out.println("** Programa de gerenciamento de relações públicas. **\nGerenciando um programa de relações públicas através de habilidades de negócios e comunicações.\n");
		 
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
