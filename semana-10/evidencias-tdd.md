# Semana 10 — Execução do TDD

Os projetos foram executados com Java 17, Maven 3.9.12 e JUnit 5. As mudanças partiram das falhas dos testes fornecidos ou dos novos cenários adicionados antes de implementar o comportamento.

| Projeto | Resultado inicial (RED) | Etapas até o resultado final (GREEN) |
|---|---|---|
| Bubble Sort | 2 de 3 testes falharam. O vetor já ordenado passou com o método vazio. | A ordenação por trocas adjacentes fez os 3 testes passarem. |
| Conta Bancária | Os 4 testes fornecidos falharam. | Depósito simples e acumulado passaram primeiro. Depois passaram os saques válido e acima do saldo. Um novo teste falhou com valores inválidos antes da validação. A suíte final também cobre saque do saldo exato. |
| Estoque | 4 de 6 testes falharam. | Os cenários de entrada passaram após implementar o acúmulo com validação. Os testes de retirada ainda registraram 2 falhas antes da implementação de saída. A suíte final inclui entrada zero, retirada inválida, retirada de todo o estoque e consulta ao nome. |
| Carrinho de Compras | Os primeiros testes de total, adição e remoção apontaram métodos ainda ausentes. Os testes de preço inválido falharam em 2 casos e os de desconto em 3 casos. | Cada comportamento foi validado antes do avanço. O teste de soma de vários produtos passou com o cálculo já implementado para a adição. Os casos de desconto incluem R$ 499,99, R$ 500,00, R$ 500,01 e R$ 600,00. |

No carrinho, adicionar um produto com preço negativo lança `IllegalArgumentException` antes de alterar os itens. Essa foi a opção adotada entre as duas previstas no enunciado. A implementação também rejeita preços não finitos, aceita preço zero e arredonda o total para centavos com `HALF_UP`. A conta bancária ignora depósitos ou saques com valores não positivos ou não finitos.

## Cobertura medida pelo JaCoCo

| Projeto | Testes | Linhas cobertas | Ramificações cobertas |
|---|---:|---:|---:|
| Bubble Sort | 3 | 11/11 (100%) | 6/6 (100%) |
| Conta Bancária | 6 | 11/11 (100%) | 10/10 (100%) |
| Estoque | 10 | 12/12 (100%) | 6/6 (100%) |
| Carrinho de Compras | 11 | 24/24 (100%) | 8/8 (100%) |

Execução final na raiz: `mvn clean verify`. Resultado: `BUILD SUCCESS`.
