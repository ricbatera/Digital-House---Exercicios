import java.util.Scanner;

import notas.Notas;

public class Alunos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Notas aluno = new Notas();
		
		System.out.println("Digite o nome do Aluno:");
		aluno.nome = sc.nextLine();
		System.out.println("Digite a nota do 1� trimestre");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Digite a nota do 2� trimestre");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Digite a nota do 3� trimestre");
		aluno.nota3 = sc.nextDouble();
		
		aluno.status();
		
		sc.close();

	}

}
