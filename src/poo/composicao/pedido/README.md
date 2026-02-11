# 🛒 Sistema de Gestão de Pedidos

Este projeto é uma aplicação de console desenvolvida em **Java** para exercitar conceitos avançados de **Programação Orientada a Objetos (POO)**. O foco principal é a implementação de **composição de objetos** e o uso de **tipos enumerados (Enums)** para representar estados de um processo de negócio.

## 🎯 Objetivos do Projeto
* Praticar a composição de objetos (um pedido tem um cliente e vários itens).
* Implementar associações do tipo "tem-um" e "tem-vários".
* Manipular datas e horas com as APIs modernas do Java (`LocalDate` e `LocalDateTime`).
* Utilizar o padrão `StringBuilder` para geração de relatórios formatados em texto.

## 🛠️ Tecnologias e Conceitos Utilizados
* **Java 17**: Versão utilizada para o desenvolvimento.
* **Enumerações**: Para representar o `OrderStatus` (PENDING_PAYMENT, PROCESSING, etc.).
* **Composição**: 
    * `Order` possui um `Client` (1:1).
    * `Order` possui uma lista de `OrderItem` (1:N).
* **Encapsulamento**: Uso rigoroso de modificadores de acesso e métodos getters/setters.
* **Tratamento de Strings**: Formatação de moeda e datas no sumário final.

## 📂 Estrutura das Entidades

O sistema é composto pelas seguintes classes:

| Classe | Responsabilidade |
| :--- | :--- |
| **Client** | Armazena dados do cliente (Nome, E-mail, Data de Nascimento). |
| **Product** | Define o nome e o preço base de um produto. |
| **OrderItem** | Representa o item no carrinho, guardando a quantidade e o preço no momento da venda. |
| **Order** | Classe central que gerencia os itens, o cliente e calcula o valor total. |
| **OrderStatus** | Enum que define o ciclo de vida do pedido. |

## 🚀 Como Executar

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)

## 👤 Autor

**Gustavo Canzi**

* **LinkedIn:** [https://www.linkedin.com/in/gustavo-canzi](https://www.linkedin.com/in/gustavo-canzi)
* **Email:** [gustavo.canzi@gmail.com](mailto:gustavo.canzi@gmail.com)