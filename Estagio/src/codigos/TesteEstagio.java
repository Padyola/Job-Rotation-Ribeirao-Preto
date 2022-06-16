package codigos;

/* 1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);



Ao final do processamento, qual será o valor da variável SOMA?



2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.



IMPORTANTE:

Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;



3) Descubra a lógica e complete o próximo elemento:



a) 1, 3, 5, 7, _9__

b) 2, 4, 8, 16, 32, 64, _128___

c) 0, 1, 4, 9, 16, 25, 36, _49___

d) 4, 16, 36, 64, _100___

e) 1, 1, 2, 3, 5, 8, _13___

f) 2,10, 12, 16, 17, 18, 19, _200___



4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?



IMPORTANTE:

a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.

b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)

c) Explique como chegou no resultado.

 

5) Escreva um programa que inverta os caracteres de um string.



IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;

 */

public class TesteEstagio {

	public static void main(String[] args) {
		
//Questão numero 1
		
		VariavelSoma soma = new VariavelSoma();
		System.out.println("Resultado da questão 1 = " + soma.getSoma());
		
		System.out.println();
		
//Questão numero 2
		
		//Somente os numeros que pertencem a sequencia vão aparecer a mensagem.
		System.out.println("Resultado Questão 2 ");
		int numero = 144;
		int i;
		for( i = 0; i < 30; i++); {
			if (Fibonacci.fibo(i) == numero); {
				System.out.println("O numero " + numero + " pertence a sequencia de fibonacci");
			}
		}
		
		System.out.println("\n");
		
		
			

	
//Questão numero 3
		
		
		/*Em relação a essa pergunta é complicada a interpretação pois creio que a pergunta não foi feita
		da maneira certa, pois no momento em que ambos se cruzarem, nenhum estará mais proximo pois estarão
		no mesmo ponto.
		porém o caminhão leva quase meia hora a mais para chegar a ribeirão preto.
		O carro chega em franca em 54 minutos, enquanto o caminhão leva quase cerca de 85 minutos para chegar
		até ribeirão preto. */
			
		
//Questão numero 4
		
		System.out.println("Resultado questão 3 " + "\n" + "\n"
				+ "a) 1, 3, 5, 7, (9)\r\n"
				+ "\r\n"
				+ "b) 2, 4, 8, 16, 32, 64, (128)\r\n"
				+ "\r\n"
				+ "c) 0, 1, 4, 9, 16, 25, 36, (49)\r\n"
				+ "\r\n"
				+ "d) 4, 16, 36, 64, (100)\r\n"
				+ "\r\n"
				+ "e) 1, 1, 2, 3, 5, 8, (13)\r\n"
				+ "\r\n"
				+ "f) 2,10, 12, 16, 17, 18, 19, (200)\r\n"
				+ "");
		
		
		
//Questão numero 5
		
		
		System.out.println("Questão 5" + "\n" + "(String invertida) ");
		InverteString invert = new InverteString();
		System.out.println(invert.getStr());
	}
			
		
			
}

    

	


