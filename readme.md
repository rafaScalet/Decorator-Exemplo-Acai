# Decorator Exemplo Açai

> [!IMPORTANT]
Baixe o `zip` ou o `tar.gz` das [Releases](https://github.com/rafaScalet/Decorator-Exemplo-Acai/releases/tag/v1.0.0) caso queira somente os códigos

## Diagrama

![Diagrama](./Exemplo-Cafe.drawio.svg)

## Perguntas

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
