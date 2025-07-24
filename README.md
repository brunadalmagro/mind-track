# 🧠 MindTrack - Monitoramento de Pensamentos/Emoções

<div align="center">
  <img src="https://img.shields.io/badge/Spring_Boot-3.5.3-green" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Java-21-blue" alt="Java">
  <img src="https://img.shields.io/badge/PostgreSQL-16-blue" alt="PostgreSQL">
</div>

## 📌 Visão Geral
Aplicação para registro e análise de padrões emocionais para pessoas em tratamento psico-terapeutico, desenvolvida com:

- **Backend**: Spring Boot 3 + JPA/Hibernate
- **Frontend**: Thymeleaf + Bootstrap
- **Banco de Dados**: PostgreSQL

## 🛠 Configuração

### Pré-requisitos
| Componente    | Versão   |
|--------------|----------|
| Java         | 17+      |
| PostgreSQL   | 15+      |
| Maven        | 3.9+     |

🚀 Execução

Passos para rodar o projeto:
bash

# 1. Clonar o repositório
git clone https://github.com/brunadalmagro/mindtrack

# 2. Instalar dependências
mvn clean install

# 3. Iniciar a aplicação
mvn spring-boot:run

▶️ Acesse no navegador: http://localhost:8080/records



# 🧪 Testes
> **Automatizados (rodam sozinhos):**
bash

mvn test

## **Manuais (para você testar):**
 ###  Exemplo válido:
    Pensamento: "Estou sobrecarregado"
    Emoção: "Estresse"
    Intensidade: 9
    Situação: "Faculdade"

### Exemplo inválido (deve falhar):
    ```
    Pensamento: ""  # Vazio -> erro
    Intensidade: 11  # Acima do máximo (10)
    ```
# 🌐 Rotas da API
| Método | EndPoint | O que faz |
|--------|--------|----------|
| GET | /records | Mostra o formulário |
| POST | /records | Salva um novo registro |
| GET | /records/lists | Lista todos os registros | 

# 📝 Licença

**O projeto usa a licença MIT (permite que outros usem/modifiquem seu código livremente). Inclua um arquivo LICENSE na raiz.**
