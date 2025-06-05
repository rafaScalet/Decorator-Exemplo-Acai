# Decorator Exemplo Açai

> [!IMPORTANT]
Baixe o `zip` ou o `tar.gz` das [Releases](https://github.com/rafaScalet/Decorator-Exemplo-Acai/releases/tag/v1.0.0) caso queira somente os códigos

## Diagrama

![Diagrama](./Exemplo-Cafe.drawio.svg)

## Perguntas

1. **Como solucionar esse problema aplicando o padrão decorador:**
Irá ter uma interface Açai, com métodos de descrição e custo que será implementado pelos Tamanhos e pelos Adicionais, as classes de tamanho implementam diretamente a interface. Haverá a classe abstrata Adicionais que também irá implementar a interface Açai e irá servir como base para os decoradores, os adicionais estende a classe abstrata.

2. **Seria possível utilizar o composite para o mesmo propósito? Justifique sua resposta:**
Possível seria, porém não seria a melhor opção, pois o padrão Composite é ideal quando existe uma árvore de objetos, onde os objetos individuais e as composições devem ser tratados da mesma forma. No composite você teria uma interface, o objeto base que seria o Açai Base os objetos Compostos que poderiam ser os adicionais. Porém na situação do açaí com adicionais, o objetivo é colocar as funcionalidades e modificar o comportamento do objeto original sem alterar a estrutura, por isso o padrão Decorator é o mais adequado de se utilizar.

## Usagem

### Clone o projeto:

- Usando https (opção padrão):
```bash
git clone https://github.com/rafaScalete/Decorator-Exemplo-Acai.git
```

- Usando ssh:
```bash
git clone git@github.com:rafaScalet/Decorator-Exemplo-Acai.git
```

- Usando o [GitHub CLI](https://cli.github.com/)
```bash
gh repo clone rafaScalet/Decorator-Exemplo-Acai
```

### Builde o projeto:

Copie o comando `build` do arquivo [mise.toml](mise.toml)

```bash
javac -d dist $(find src -name "*.java")
```

### Rode o projeto:

Copie o comando `execute` do arquivo [mise.toml](mise.toml)

```bash
java -cp dist Main
```
