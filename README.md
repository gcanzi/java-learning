# ☕ Java Learning & Backend Development

Este repositório reúne projetos práticos desenvolvidos para consolidar o domínio da **Linguagem Java** e dos pilares da **Programação Orientada a Objetos (POO)**. Os projetos abrangem desde a modelagem de sistemas de vendas até o tratamento rigoroso de regras de negócio com exceções personalizadas.

---

## 🚀 Principais Projetos

### 1. Sistema de Reservas (Tratamento de Exceções)
Sistema de hotelaria que gerencia reservas de quartos, focado na robustez do código e validação de regras de negócio.
* **Funcionalidades:** * Cálculo automático de duração da estadia.
    * Atualização de datas com validações rigorosas (impedindo datas passadas ou check-out anterior ao check-in).
    * Lançamento de exceções personalizadas para erros de domínio.
* **Caminho:** `java-exceptions/src/`
* **Link:** [Visualizar Projeto](https://github.com/gcanzi/java-exceptions/tree/main)

### 2. Gestão de Itens e Preços (Herança & Polimorfismo)
Aplicação de console para etiquetagem de diferentes categorias de produtos, demonstrando a flexibilidade do polimorfismo.
* **Funcionalidades:**
    * Criação de etiquetas customizadas para produtos Comuns, Usados e Importados.
    * Cálculo de preço final incluindo taxas de alfândega para itens importados.
    * Exibição de data de fabricação para itens usados.
* **Caminho:** `java-learning/src/poo/polimorfismo/itens`
* **Link:** [Visualizar Projeto](https://github.com/gcanzi/java-learning/tree/master/src/poo/polimorfismo/itens)

### 3. Sistema de Pedidos (Composição & Enums)
Modelagem de um fluxo de vendas completo, focado na organização de objetos compostos e estados de pedido.
* **Funcionalidades:**
    * Associação entre Cliente, Pedido e Itens de Pedido (Composição 1:N).
    * Uso de Enumerações para controle do status do pedido (Pending, Processing, Shipped, Delivered).
    * Geração de sumário detalhado com cálculo de subtotal por item e total geral.
* **Caminho:** `java-learning/src/poo/composicao/pedido`
* **Link:** [Visualizar Projeto](https://github.com/gcanzi/java-learning/tree/master/src/poo/composicao/pedido)

---

## 🛠️ Conceitos Consolidados

| Conceito | Aplicação Prática |
| :--- | :--- |
| **Composição** | Estruturação de `Order` contendo `Client` e `OrderItem`. |
| **Herança** | Especialização de `Product` em `ImportedProduct` e `UsedProduct`. |
| **Polimorfismo** | Sobrescrita do método `priceTag()` para diferentes comportamentos em tempo de execução. |
| **Exceções Customizadas** | Criação da classe `DomainException` para capturar erros específicos de negócio. |
| **Datas** | Manipulação das classes `Date`, `LocalDate` e `LocalDateTime`. |

---

## ⚙️ Como executar os projetos

Cada diretório contém uma classe `Program.java` com o método `main`. Para testar:
1.  Clone o repositório.
2.  Importe os projetos em sua IDE de preferência (IntelliJ, Eclipse ou VS Code).
3.  Execute a classe `Program` dentro do pacote correspondente.

---
*Este repositório reflete minha evolução constante em Java, visando a transição para o Desenvolvimento Backend.*

## 👤 Autor

**Gustavo Canzi**

* **LinkedIn:** [https://www.linkedin.com/in/gustavo-canzi](https://www.linkedin.com/in/gustavo-canzi)
* **Email:** [gustavo.canzi@gmail.com](mailto:gustavo.canzi@gmail.com)