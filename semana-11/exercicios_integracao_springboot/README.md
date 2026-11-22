# Semana 11 — Testes de integração com Spring Boot

Foram executados cinco casos de teste com JUnit 5, Spring Boot 3.3.13, Spring Data JPA, H2 em memória e MockMvc.

| Caso | Verificação |
|---|---|
| CT01 — Cadastro válido | Cadastra Teclado por 150, confirma que recebeu um ID e consulta nome e preço no repositório. |
| CT02 — Nome inválido | Confirma `IllegalArgumentException` para nome em branco e compara a contagem de registros antes e após a tentativa. |
| CT03 — Atualização de preço | Cadastra Mouse por 80, altera para 95 e confere o preço consultando o registro persistido. |
| CT04 — Cadastro pela API | Envia `POST /produtos` e verifica HTTP 200, ID numérico, nome e preço no JSON. |
| CT05 — Consulta pela API | Cadastra via POST, extrai o ID do JSON e confere o produto retornado por `GET /produtos/{id}`. |

Os testes usam `@SpringBootTest` para carregar a aplicação. O serviço e o repositório são reais e acessam o H2. Nos cenários de persistência, `flush()` envia as mudanças pendentes ao banco e `clear()` limpa o contexto de persistência, de modo que a verificação volta a consultar o registro. A anotação `@Transactional` faz o Spring reverter ao final de cada teste as alterações realizadas na transação de teste.

O MockMvc simula requisições HTTP dentro da aplicação e percorre o controller, o serviço e o repositório sem iniciar um servidor HTTP. O recurso de configuração do Mockito permite que o listener de teste do Spring inicialize em ambientes que restringem o carregamento dinâmico de agentes Java.

Execute `mvn test` nesta pasta ou use `mvn clean verify` na raiz do repositório.

[Enunciado original](https://github.com/JoaoChoma/teste_software_2026/tree/main/aulas/SEMANA11/exercicios_integracao_springboot)
