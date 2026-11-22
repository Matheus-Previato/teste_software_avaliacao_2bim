# Testes de Software — Semanas 10 e 11

| Semana | Projeto ou relatório | Resultado |
|---|---|---|
| 10 | [Bubble Sort](semana-10/bubblesort-tdd) | 3 testes aprovados |
| 10 | [Conta Bancária](semana-10/conta-bancaria-tdd-maven) | 6 testes aprovados |
| 10 | [Estoque](semana-10/estoque-tdd) | 10 testes aprovados |
| 10 | [Carrinho de Compras](semana-10/carrinho-compras-tdd) | 11 testes aprovados |
| 11 | [Integração com Spring Boot](semana-11/exercicios_integracao_springboot) | 5 testes aprovados |

## Executar os testes

Com JDK 17 e Maven, execute na raiz:

```bash
mvn clean verify
```

O comando executa os cinco módulos. O JaCoCo verifica **100% das linhas e das ramificações em cada classe da Semana 10**. Os relatórios HTML ficam em `target/site/jacoco/index.html` dentro de cada módulo TDD. O registro de execução está em [evidências da Semana 10](semana-10/evidencias-tdd.md).

No GitHub, abra **Actions → Testes e cobertura** para consultar a execução. A execução publica os relatórios no artefato **relatorios-de-testes**.

Projetos-base e enunciados de [JoaoChoma/teste_software_2026](https://github.com/JoaoChoma/teste_software_2026).
