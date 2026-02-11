# 🏷️ Sistema de Etiquetas de Produtos (Herança & Polimorfismo)

Este projeto é uma aplicação de console desenvolvida em **Java** para demonstrar o poder do **Polimorfismo** e da **Herança**. O sistema gerencia diferentes tipos de produtos (comuns, usados e importados), tratando-os de forma genérica em uma lista, mas executando comportamentos específicos para cada tipo no momento da exibição.

## 🎯 Objetivos do Projeto
* Aplicar os conceitos de **Herança** para reaproveitamento de código.
* Implementar **Polimorfismo** através da sobreposição de métodos (`@Override`).
* Utilizar modificadores de acesso `protected` para permitir o acesso de subclasses aos atributos da superclasse.
* Praticar a manipulação e formatação de datas com `SimpleDateFormat`.

## 🛠️ Tecnologias e Conceitos Utilizados
* **Java**: Linguagem principal.
* **Herança**: As classes `ImportedProduct` e `UsedProduct` herdam da classe base `Product`.
* **Polimorfismo**: Chamada do método `priceTag()` que se comporta de maneira diferente dependendo do tipo real do objeto na lista.
* **Upcasting**: Armazenamento de diferentes subclasses em uma única `List<Product>`.

## 📂 Estrutura das Entidades

O projeto utiliza uma hierarquia de classes para organizar os diferentes tipos de produtos:

| Classe | Descrição |
| :--- | :--- |
| **Product** | Superclasse que contém o nome e preço básico. |
| **ImportedProduct** | Subclasse de `Product` que adiciona uma taxa de alfândega e calcula o preço total. |
| **UsedProduct** | Subclasse de `Product` que inclui a data de fabricação do item. |
| **Program** | Classe principal que gerencia a entrada de dados e utiliza o polimorfismo para imprimir as etiquetas. |

## 🚀 Como Executar

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/seu-usuario/seu-repositorio-polimorfismo.git](https://github.com/seu-usuario/seu-repositorio-polimorfismo.git)

## 👤 Autor

**Gustavo Canzi**

* **LinkedIn:** [https://www.linkedin.com/in/gustavo-canzi](https://www.linkedin.com/in/gustavo-canzi)
* **Email:** [gustavo.canzi@gmail.com](mailto:gustavo.canzi@gmail.com)