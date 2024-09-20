# Padrões de Projeto em Kotlin

## Introdução

Este projeto demonstra a implementação de três padrões de design fundamentais utilizando a linguagem **Kotlin**: **Strategy**, **Factory Method**, e **Decorator**. Cada padrão tem um propósito diferente (comportamental, de criação, e estrutural, respectivamente) e é implementado com exemplos práticos que podem ser aplicados em diversos contextos de desenvolvimento de software.

## Tecnologias Utilizadas

- **Kotlin**: Linguagem moderna e poderosa que roda na JVM.

---

## Padrão 1: Strategy - Sistema de Desconto

### Descrição

O padrão **Strategy** é um padrão comportamental que permite a seleção de algoritmos em tempo de execução. Neste exemplo, implementamos um sistema de desconto onde diferentes estratégias de desconto podem ser aplicadas dinamicamente a um carrinho de compras.

### Estrutura do Projeto

```
src/
├── main/
│   └── kotlin/
│       └── strategy/
│           ├── DiscountStrategy.kt         # Interface para estratégias de desconto
│           ├── LoyaltyDiscount.kt          # Estratégia de desconto de fidelidade
│           ├── SeasonalDiscount.kt         # Estratégia de desconto sazonal
│           ├── NoDiscount.kt               # Sem desconto
│           └── StoreCart.kt                # Contexto que aplica o desconto
```

### Funcionamento

A estratégia é aplicada pelo `StoreCart`, que aceita diferentes implementações de `DiscountStrategy` e aplica o desconto de acordo com a estratégia escolhida.

---

## Padrão 2: Factory Method - Transporte

### Descrição

O **Factory Method** é um padrão de criação que define uma interface para criar objetos, mas permite que as subclasses decidam qual classe concreta instanciar. No exemplo, implementamos uma fábrica de transporte, que pode criar veículos como carro e bicicleta.

### Estrutura do Projeto

```
src/
├── main/
│   └── kotlin/
│       └── factory/
│           ├── Transport.kt                # Interface para meios de transporte
│           ├── Car.kt                      # Implementação concreta de carro
│           ├── Bicycle.kt                  # Implementação concreta de bicicleta
│           ├── TransportFactory.kt         # Classe base da fábrica de transportes
│           ├── CarFactory.kt               # Fábrica concreta de carros
│           └── BicycleFactory.kt           # Fábrica concreta de bicicletas
```

### Funcionamento

Cada fábrica concreta (`CarFactory`, `BicycleFactory`) cria um tipo específico de transporte. O cliente pode usar qualquer fábrica sem conhecer a classe exata do transporte que está sendo criado.

---

## Padrão 3: Decorator - Notificações

### Descrição

O padrão **Decorator** é um padrão estrutural que permite adicionar funcionalidades a objetos de forma dinâmica. No exemplo, implementamos um sistema de notificações onde podemos adicionar comportamentos extras, como notificações por e-mail e Facebook, ao objeto base de notificação.

### Estrutura do Projeto

```
src/
├── main/
│   └── kotlin/
│       └── decorator/
│           ├── Notifier.kt                 # Interface de notificação
│           ├── BasicNotifier.kt            # Implementação básica de notificação
│           ├── NotifierDecorator.kt        # Decorador abstrato
│           ├── EmailNotifierDecorator.kt   # Decorador concreto para e-mail
│           └── FacebookNotifierDecorator.kt# Decorador concreto para Facebook
```

### Funcionamento

Decoradores adicionam funcionalidades extras ao objeto original de notificação. `EmailNotifierDecorator` adiciona notificações por e-mail, e `FacebookNotifierDecorator` adiciona mensagens no Facebook, sem alterar o comportamento básico.

---

## Como Executar o Projeto

### Pré-requisitos

- **Kotlin** instalado em sua máquina.

### Passos para executar:

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/hywenklis/design-patterns.git
   ```

2. **Executar com Gradle:**

   ```bash
   ./gradlew run
   ```

3. **Ou executar a função `main` diretamente da sua IDE (como IntelliJ IDEA).**

---

## Conclusão

Este projeto demonstrou a implementação de três importantes padrões de design em Kotlin: **Strategy**, **Factory Method** e **Decorator**. Cada um foi aplicado a um problema específico, ilustrando como os padrões podem ser utilizados para tornar o código mais flexível, manutenível e extensível.