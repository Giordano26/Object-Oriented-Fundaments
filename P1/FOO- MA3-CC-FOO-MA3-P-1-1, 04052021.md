# FOO- MA3-CC-FOO-MA3-P-1-1, 04/05/2021 #

Nome = Stefano Martins Ferreira Giordano

RA = 00277890



# 1 PROBLEMA: Interpretação de Modelos Funcionais

###### Justificativa


* Verdadeiro pois a função é total, já que todos elementos do seu domíonio estão definidos e também a mesma depende dos valores a e b, já que uma vez o modelo matemático usado depende das faces do dado
* Falsa pois a aplicação de jogar(4,3) fornece o valor G --> 4+3 = 7
* Verdadeira pois a função jogar exemplifica uma lógica de modelo, pois fubã traduziu correntamente uma ideia para uma função matemática e seu dominio é estruturado já que neste função, pertence aos inteiros positivos no intervalo de {1,2,3,4,5,6}

###### Resposta

2. I e III

# 2 PROBLEMA: Computações e Códigos Válidos

###### Justificativa

* Verdadeiro pois a passagem (5,6) produz o valor 'G' do tipo char, já que 5+6 = 11
* Verdadeiro pois a chamada do método j passando (10,20) resulta em 'P' segundo o código, já que 10+20 = 30, porém o código se torna inválido, uma vez que 10 e 20 não poderiam retornar um valor do jogo, já que o dado so possui 6 faces numeradas de 1 a 6, calcular uma possibilidade de 10 e 20 não faz sentido para a função matemática criada para o jogo.
* Verdadeiro pois não há uma validação para os valores do domínio, a proteção não é feita, há apenas a validação para o retorno da imagem. se a+b for 7 ou a+b for 11, de resto não há uma validação para os valor a ou b estarem no escopo de 1 a 6.

###### Resposta

4 . I,II e III

# 3 PROBLEMA: Composição Funcional

###### Justificativa 

* Verdadeiro,  Pois em primeira instância, na função jogarPremiado, se a soma der diferente de  7 e 11, há a chamada da função novaJogada, que retornará G caso a soma for 12, por isso a passagem direta de (6,6) em ambos modelos matemáticos retornará 12.
* Falso, olhando a instrução (A) podemos considerar sim uma correta implementação, já que no modelo matemático o valor da função novaJogada é G se (a+b) existe em {12}. Olhando para a lógica de máquina, se soma for igual a 12, if(s == 12), há o retorno de G, caracterizando essa instrução como uma tradução correta
* Verdadeiro pois o método jPremiado produz G quando as somas de a e b dão 7, 11 e 12, já que dentro do próprio metodo jPremiado há chamada da função nJogada que retorna G caso soma seja 12

###### Resposta

2 . I e III





