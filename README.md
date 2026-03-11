# Cliente-OrdemCrescente

# Sistema de Cadastro e Ordenação de Clientes em Java

Este repositório contém um projeto em Java que demonstra a manipulação de vetores com objetos. O programa permite cadastrar múltiplos clientes, analisar os seus dados de crédito e aplicar algoritmos de ordenação.

## Funcionalidades

O sistema interage com o utilizador via terminal e realiza as seguintes operações:
- Cadastro Dinâmico: Lê a quantidade de clientes desejada e instancia um vetor de objetos com o tamanho exato.
- Entrada de Dados: Recebe o Nome e o Crédito de cada cliente.
- Acesso Direto: Localiza e imprime os dados exclusivamente do primeiro cliente cadastrado (índice 0).
- Busca de Máximo: Percorre o vetor para identificar e exibir o maior valor de crédito entre todos os clientes.
- Ordenação Crescente: Utiliza a lógica de ordenação para reorganizar e exibir os clientes do menor para o maior crédito.

## Tecnologias Utilizadas

- Linguagem: Java
- Bibliotecas: java.util.Scanner para entrada de dados.
- Conceitos Aplicados: Orientação a Objetos, Arrays e Algoritmos de Ordenação.

## Estrutura do Código

O projeto é dividido em duas partes principais:
1. Clienteee: Uma classe modelo que representa o cliente, contendo os seus atributos (nome e cred) e métodos de acesso. O método toString() foi sobrescrito para formatar a exibição dos dados.
2. DemoClientee: A classe principal que gere o fluxo de execução, interação com o utilizador e as lógicas de busca e ordenação.

## Como Executar

Pré-requisitos: Precisas de ter o Java JDK instalado na tua máquina.

1. Clona este repositório:
   git clone https://github.com/vvankxs7/Cliente-OrdemCrescente).git

2. Abre o terminal na pasta onde os arquivos estão localizados.

3. Compila os arquivos Java:
   javac DemoClientee.java

4. Executa o programa:
   java DemoClientee

## Autor

- Cauê - Desenvolvimento inicial - https://github.com/vvankxs7
