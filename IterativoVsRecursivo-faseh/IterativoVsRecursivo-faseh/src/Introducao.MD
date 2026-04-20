# Introdução à recursividade

1. O dicionário HOUAISS define a recursividade como "Propriedade daquilo que se pode repetir um número indefinido de vezes"
2. Para Wirth (1989), "um objeto é dito recursivo se ele consistir parcialmente ou for definido em tempos de si próprio."

Puga e Risseti descrevem um algoritmo recursivo como uma função que possui chamadas a si próprio, para resolver um problema, utilizando o princípio da divisão em partes menores.

* Problema pequeno: Resolvido imediatamente
* Senão, deve ser reduzido a um problema menor, da mesma natureza, aplicado o método sucessivas vezes, até chegar à solução completa. (Puga e Risseti)

A função recursiva precisa:

* Um **caso base**: garante a saída da função, é a menor instância do problema
* **Caso recursivo**: chamada da função a si mesma, passando uma instância menor do problema.

[//]: # (Implemente o algoritmo para cálculo do fatorial de um número qualquer, em modo iterativo e em modo recursivo.)