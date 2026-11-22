# Semana 14 — Relatório de teste de usabilidade

**Atividade** — Avaliação prática de Testes de Software, Prova 02.

**Data da tentativa** — 22/11/2026.

**Sistema avaliado** — Mercado Livre Brasil.

**Situação** — Execução interrompida por falha de acesso. A coleta com participante e avaliador humanos continua pendente.

## Objetivo e cenário

Avaliar a facilidade de buscar, comparar e simular a compra de um fone de ouvido sem fio para uso diário. O roteiro prevê buscar “fone de ouvido Bluetooth”, selecionar entrega Full, ordenar pelos melhores avaliados, consultar os detalhes de um produto, adicioná-lo ao carrinho, iniciar a compra e voltar à página inicial. A simulação termina antes da confirmação de pagamento.

## Procedimento realizado

Um agente automatizado acessou https://www.mercadolivre.com.br/ em uma sessão de Chrome remoto. A página exibiu a mensagem “Hubo un error accediendo a esta pagina...”. Foi feita uma recarga da página e o erro persistiu. A sessão foi encerrada nesse ponto.

O intervalo entre a primeira navegação e o encerramento da observação foi de aproximadamente 24 segundos. Esse intervalo inclui operações da automação e a inspeção do erro. A duração do percurso de compra permanece sem medição.

## Registro das etapas

| Etapa | Resultado observado | Tempo da tarefa | Observações |
|---|---|---|---|
| Acessar o site | Bloqueada por erro de acesso | Sem medição isolada | Mensagem de erro persistiu após uma recarga. |
| Pesquisar o produto | Não executada | Sem medição | Depende do carregamento da interface. |
| Aplicar o filtro Full | Não executada | Sem medição | A disponibilidade do filtro ficou sem verificação. |
| Ordenar pelos melhores avaliados | Não executada | Sem medição | A disponibilidade dessa ordenação ficou sem verificação. |
| Comparar opções e abrir detalhes | Não executada | Sem medição | Nenhum produto selecionado. |
| Adicionar ao carrinho | Não executada | Sem medição | Carrinho sem verificação. |
| Simular o início da compra | Não executada | Sem medição | Fluxo de compra sem verificação. |
| Voltar à página inicial após a compra simulada | Não executada | Sem medição | O fluxo foi interrompido antes da pesquisa. |

## Análise dos resultados

A falha de acesso impediu avaliar a busca, os filtros, a comparação de produtos e o carrinho nesta sessão. A mensagem em espanhol oferece pouco contexto sobre a causa e os passos de recuperação para quem acessa a versão brasileira do serviço. Essa observação se restringe à tela de erro efetivamente exibida.

A causa técnica do erro permanece indeterminada. Os dados desta tentativa são insuficientes para concluir sobre o funcionamento do site em outros navegadores, redes ou sessões.

| Indicador do roteiro | Resultado desta tentativa |
|---|---|
| Participantes humanos observados | 0 |
| Sessões automatizadas tentadas | 1, interrompida no acesso |
| Taxa de usuários que chegaram ao carrinho | Sem dados de participantes humanos |
| Tempo médio do percurso completo | Sem execuções concluídas |
| Meta de 90% de adição ao carrinho | Sem dados para avaliar |
| Meta de até 4 minutos | Sem dados para avaliar |
| Formulário SUS | Sem aplicação |

## Conclusão e continuidade

A tentativa identificou um impedimento de acesso no ambiente utilizado. A conclusão da atividade requer uma sessão com o aluno como usuário final e um colega como avaliador, conforme a organização indicada pelo professor. O avaliador deve registrar os tempos, os resultados, os pedidos de ajuda e as dificuldades. A ficha de observação acompanha este relatório.

[Enunciado do professor](https://github.com/JoaoChoma/teste_software_2026/blob/main/aulas/SEMANA14/TESTE%20USUARIO%20FINAL.pdf)
