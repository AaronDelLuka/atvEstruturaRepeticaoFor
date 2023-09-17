package atvEstruturaRepeticaoFor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1)
		int soma = 0;

        for (int i = 7; i <= 20; i++) {
            soma += i;
        }

        System.out.println("A soma dos números de 7 a 20 é: " + soma);
        */
		/* 2)
		Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número inteiro positivo: ");
        int numero1 = scanner.nextInt();

        System.out.print("Informe o segundo número inteiro positivo: ");
        int numero2 = scanner.nextInt();

        if (numero1 > 0 && numero2 > 0) {
            int limiteInferior = Math.min(numero1, numero2);
            int limiteSuperior = Math.max(numero1, numero2);

            System.out.println("Números inteiros entre " + limiteInferior + " e " + limiteSuperior + ":");

            for (int i = limiteInferior; i <= limiteSuperior; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Por favor, informe números inteiros positivos.");
        }
        */
		/* 3)
		Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número natural para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido. Por favor, insira um número natural.");
        } else {
            long fatorial = 1; // Usando um long para lidar com fatoriais grandes.

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println(numero + "! = " + fatorial);
        }
        */
		/* 4)
		Scanner scanner = new Scanner(System.in);
        int idade, soma = 0, contador = 0;

        System.out.println("Informe as idades (digite um número negativo para encerrar):");

        while (true) {
            idade = scanner.nextInt();

            if (idade < 0) {
                break; // Encerra o loop se um número negativo for digitado.
            }

            soma += idade;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade informada.");
        }
        */
		/* 5)
		Scanner scanner = new Scanner(System.in);
        int numero, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        System.out.println("Informe os números (digite 0 para encerrar):");

        while (true) {
            numero = scanner.nextInt();

            if (numero == 0) {
                break; // Encerra o loop se 0 for digitado.
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("Maior número informado: " + maior);
            System.out.println("Menor número informado: " + menor);
        } else {
            System.out.println("Nenhum número informado ou somente o número 0 foi informado.");
        }
        */
		/* 6)
		Scanner scanner = new Scanner(System.in);
        int totalPessoas = 10;
        int somaIdades = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Informe a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / totalPessoas;

        System.out.println("A média das idades informadas é: " + mediaIdades);
        */
		/* 7)
		Scanner scanner = new Scanner(System.in);
        int totalNumeros = 10;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Informe o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior número informado é: " + maior);
        System.out.println("O menor número informado é: " + menor);
        */
		/* 8)
		Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base (primeiro número): ");
        int base = scanner.nextInt();

        System.out.print("Informe o expoente (segundo número): ");
        int expoente = scanner.nextInt();

        int resultado = 1;

        if (expoente >= 0) {
            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }
        } else {
            System.out.println("O expoente deve ser não negativo para este cálculo.");
        }

        System.out.println("O resultado da potência é: " + resultado);
        */
		/* 9)
		Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Números ímpares de 1 até " + numero + ":");

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        */
		/* 10)
		Scanner scanner = new Scanner(System.in);
        int contadorFemininoEntre20e40 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();

            System.out.println("Informe o sexo da pessoa " + i + " (M para masculino, F para feminino):");
            char sexo = scanner.next().charAt(0);

            if (idade >= 20 && idade <= 40 && sexo == 'F') {
                contadorFemininoEntre20e40++;
            }
        }

        System.out.println("Quantidade de pessoas do sexo feminino entre 20 e 40 anos: " + contadorFemininoEntre20e40);
        */
		/* 11)
		Scanner scanner = new Scanner(System.in);
        int contadorMasculinoEntre60e80 = 0;
        int contadorFemininoEntre50e70 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o sexo da pessoa " + i + " (M para masculino, F para feminino):");
            char sexo = scanner.next().charAt(0);

            System.out.println("Informe o peso da pessoa " + i + ":");
            double peso = scanner.nextDouble();

            if (sexo == 'M' && peso >= 60 && peso <= 80) {
                contadorMasculinoEntre60e80++;
            }

            if (sexo == 'F' && peso >= 50 && peso <= 70) {
                contadorFemininoEntre50e70++;
            }
        }

        System.out.println("Quantidade de homens com peso entre 60 e 80 kg: " + contadorMasculinoEntre60e80);
        System.out.println("Quantidade de mulheres com peso entre 50 e 70 kg: " + contadorFemininoEntre50e70);
        */
		/* 12)
		Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de multiplicação de " + numero + ":");

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        */
	}

}
