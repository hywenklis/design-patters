# Padrão Strategy - Sistema de Desconto em Kotlin

## Introdução

Este projeto demonstra a implementação do padrão de projeto **Strategy** em Kotlin. O padrão Strategy é utilizado para definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. Neste exemplo, simulamos um sistema de descontos em uma loja, onde diferentes estratégias de desconto (como desconto por fidelidade ou sazonal) podem ser aplicadas dinamicamente.

## Tecnologias Utilizadas

- **Kotlin**: Linguagem moderna, expressiva e concisa que roda na JVM.
- **JVM**: A Máquina Virtual Java para executar o bytecode compilado em Kotlin.
- **Gradle** *(opcional)*: Para compilar e rodar o projeto.

## Estrutura do Projeto

```
src/
├── main/
│   └── kotlin/
│       ├── DiscountStrategy.kt         # Interface que define o comportamento do desconto
│       ├── LoyaltyDiscount.kt          # Estratégia concreta para desconto de fidelidade
│       ├── SeasonalDiscount.kt         # Estratégia concreta para desconto sazonal
│       ├── NoDiscount.kt               # Estratégia concreta para nenhum desconto
│       └── StoreCart.kt                # Contexto que aplica a estratégia de desconto
```

## Padrão de Projeto: Strategy

### O que é o Padrão Strategy?

O padrão **Strategy** é um padrão de design comportamental que permite que uma classe escolha seu comportamento (ou algoritmo) em tempo de execução. Em vez de implementar vários algoritmos em uma única classe, os algoritmos são encapsulados em classes separadas, e a classe principal delega o comportamento para uma dessas estratégias.

### Por que usar o Padrão Strategy?

- **Flexibilidade**: Você pode alterar o algoritmo ou estratégia sem modificar o cliente.
- **Manutenibilidade**: Encapsular diferentes comportamentos em classes separadas torna o código mais fácil de manter e estender.
- **Princípio Aberto/Fechado**: Novas estratégias podem ser adicionadas sem modificar o código existente.

### Exemplo

Neste projeto, a estratégia de desconto é aplicada em um carrinho de compras. Existem três estratégias de desconto:

1. **NoDiscount**: Nenhum desconto é aplicado.
2. **LoyaltyDiscount**: Um desconto de 10% é aplicado para clientes fiéis.
3. **SeasonalDiscount**: Um desconto de 20% é aplicado durante promoções sazonais.

## Explicação do Código

### 1. **Interface DiscountStrategy**

Esta interface define o contrato para aplicar um desconto.

```kotlin
interface DiscountStrategy {
    fun applyDiscount(amount: Double): Double
}
```

### 2. **Contexto StoreCart**

A classe `StoreCart` atua como o contexto que mantém a estratégia de desconto atual e a utiliza para calcular o preço final. A estratégia pode ser alterada em tempo de execução.

### 3. **Função Principal (main)**

Na função `main`, demonstramos como diferentes estratégias de desconto podem ser aplicadas dinamicamente ao carrinho de compras.

## Como Executar o Projeto

### 1. Pré-requisitos

- **Kotlin** instalado em sua máquina.

### 2. Clonar o Repositório

Clone este repositório para sua máquina local.

```bash
git clone https://github.com/hywenklis/design-patters.git
cd design-patters
```

### 3. Compilar e Executar

Se estiver usando o Gradle, você pode compilar e rodar o projeto com o seguinte comando:

```bash
./gradlew run
```

Alternativamente, se você estiver usando uma IDE como IntelliJ IDEA, basta abrir o projeto e executar a função `main` diretamente da IDE.

### 4. Exemplo de Saída

Ao rodar a aplicação, você verá a seguinte saída no console:

```
Total sem desconto: 100.0
Total com desconto de fidelidade: 90.0
Total com desconto sazonal: 80.0
```

## Conclusão

Este projeto demonstra como o padrão Strategy pode ser utilizado de forma eficaz para implementar estratégias de desconto intercambiáveis em um sistema de carrinho de compras. Ao utilizar o padrão Strategy, garantimos que novos tipos de desconto podem ser adicionados facilmente sem modificar o código existente.

Sinta-se à vontade para experimentar e adicionar mais estratégias de desconto e aprimorar as existentes!
