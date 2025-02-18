# 21 - Jogo de Cartas ♧

## Descrição
**21** é um jogo simples desenvolvido em Java onde o jogador compete contra a máquina. 

O objetivo do jogo é obter uma mão com um valor o mais próximo possível de 21 pontos sem ultrapassá-lo.

## Regras do Jogo
1. O jogador inicia um novo jogo.
2. O jogador e a máquina recebem as cartas iniciais.
3. O jogador pode escolher pegar mais cartas ou parar.
4. A máquina joga automaticamente, pegando cartas enquanto tiver menos de 17 pontos.
5. O jogo termina quando:
   - O jogador ou a máquina ultrapassa 21 pontos (quem estourar perde).
   - Ambos decidem parar, sendo declarado vencedor quem tiver a maior pontuação.
   - Se ambos tiverem a mesma pontuação, ocorre um empate.

## Tecnologias Utilizadas
- Java
- Programação Orientada a Objetos (POO)

## Instalação e Execução
1. Clone este repositório:
   ```sh
   git clone https://github.com/Laura-Cintra/vinte-um.git
   ```
2. Navegue até o diretório do projeto:
   ```sh
   cd vinte-um
   ```
3. Compile o projeto:
   ```sh
   javac src/*.java
   ```
4. Execute o jogo:
   ```sh
   java src.Main
   ```

## Autor
Desenvolvido por Laura.
