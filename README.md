# Busca CEP Java

Uma aplicação em Java para consulta de endereços via CEP, integrada à API pública do **ViaCEP**. O projeto faz chamadas HTTP de forma assíncrona/síncrona, converte as respostas JSON em objetos Java utilizando o **Gson** e registra as buscas realizadas.

---

## Tecnologias e Recursos Utilizados

* **Java 21**
* **HttpClient / HttpRequest / HttpResponse** (para consumo da API REST)
* **Java Records** (para representação imutável dos dados de CEP)
* **Gson** (para serialização e desserialização do JSON)
* **Git & GitHub** (para controle de versão)

---

## Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone (https://github.com/devfalcomer/busca-cep-java.git)