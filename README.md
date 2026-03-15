# Winery Web Services Project

## Descrição

Este projeto tem como objetivo demonstrar a criação e o consumo de **Web Services SOAP em Java**, utilizando **JAX-WS** e **Maven**.

Foram desenvolvidos dois serviços principais:

* **WineStockService** – responsável por disponibilizar o menu de vinhos e registrar pedidos.
* **WineWarningService** – responsável por enviar um aviso quando o estoque de vinhos estiver insuficiente.

Além dos serviços, também foram criados **clientes consumidores** que acessam esses serviços através de seus arquivos **WSDL**, utilizando geração automática de classes via **wsimport (plugin jaxws-maven-plugin)**.

---

## Tecnologias Utilizadas

* Java
* JAX-WS (Jakarta XML Web Services)
* Maven
* SOAP Web Services

---

## Estrutura do Projeto

O projeto foi dividido em duas partes principais:

### 1. Servidor (Winery)

Responsável por publicar os serviços SOAP:

* `WineStockService`
* `WineWarningService`

Os serviços são publicados utilizando:

```
Endpoint.publish()
```

Exemplo de endpoints:

```
http://localhost:8085/WineStockService
http://localhost:8086/WineWarningService
```

---

### 2. Cliente (WineOrderClient)

Projeto responsável por consumir os serviços SOAP.

O cliente utiliza o **plugin jaxws-maven-plugin** para gerar automaticamente as classes Java a partir dos arquivos **WSDL**.

Essas classes são utilizadas para:

* acessar o menu de vinhos
* realizar pedidos
* receber avisos de estoque insuficiente

---

## Funcionamento

1. O servidor publica os serviços SOAP.
2. O cliente acessa os arquivos **WSDL**.
3. O Maven gera automaticamente as classes de consumo do serviço.
4. O cliente executa chamadas aos métodos remotos, como:

* `getMenu()`
* `placeOrder()`
* `sendWarn()`

---

## Integrantes

* **João Victor Oliveira dos Santos** — RM557948
* **Matheus Alcântara Estevão** — RM558193
* **Nicolle Pellegrino Jelinski** — RM558610
* **Pedro Pereira dos Santos** — RM552047
* **Eric Segawa Montagner** — RM558224

---

## Observação

Para executar o projeto corretamente:

1. Execute primeiro o **servidor (Loader)** para publicar os serviços.
2. Em seguida execute os **clientes** para consumir os serviços SOAP.
