# Sistema de Gerenciamento de Contatos

## Descrição
Este é um sistema simples de gerenciamento de contatos desenvolvido em Java, utilizando uma lista encadeada para armazenar os dados. O sistema permite adicionar, buscar, remover e listar contatos por meio de uma interface de linha de comando (CLI). Cada contato contém as informações de nome, número de telefone e e-mail.

### Funcionalidades
- **Adicionar Contato**: Permite ao usuário adicionar novos contatos à lista.
- **Buscar Contato**: Realiza uma busca linear por nome ou número de telefone para encontrar um contato específico.
- **Remover Contato**: Remove um contato existente com base no nome ou número de telefone.
- **Listar Contatos**: Exibe todos os contatos armazenados.

## Requisitos do Sistema
Para executar o sistema, você precisará de:
- Java JDK 8 ou superior
- Um terminal de linha de comando (CLI) para rodar o programa

## Configuração do Ambiente

### 1. Instalar o Java JDK
Se você ainda não tem o Java JDK instalado, siga os passos abaixo:
- Baixe e instale o JDK a partir do [site oficial da Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) ou use o gerenciador de pacotes da sua distribuição de sistema operacional.
- Verifique a instalação com o comando no terminal:

  ```bash
  java -version

Certifique-se de que o JDK esteja devidamente instalado e a versão seja 8 ou superior.
### 2. Configurar o Ambiente

Após instalar o JDK:

- Clone ou baixe o código-fonte deste repositório.
- Navegue até o diretório do projeto no terminal.

### 3. Compilar o Código

Para compilar as classes Java, execute o seguinte comando no terminal:

  ```bash
  javac Contact.java Node.java ContactList.java ContactManager.java
  ```

### 4. Executar o Sistema

Após a compilação, execute o programa com o seguinte comando:

  ```bash
  java ContactManager
  ```

### Como Usar o Sistema

Quando o sistema for executado, você verá um menu com as seguintes opções:

```console
Gerenciamento de Contatos:
1. Adicionar Contato
2. Buscar Contato
3. Remover Contato
4. Listar Todos os Contatos
5. Sair
Escolha uma opção: 
```

### Funcionalidades:

1. Adicionar Contato:
   - Escolha a opção 1.
   - Insira o nome, número de telefone e e-mail do novo contato.
   - Uma mensagem de confirmação será exibida.

2. Buscar Contato:
   - Escolha a opção 2.
   - Digite o nome ou o número de telefone do contato que deseja buscar.
   - Se o contato for encontrado, suas informações serão exibidas. Caso contrário, uma mensagem de erro será mostrada.

3. Remover Contato:
   - Escolha a opção 3.
   - Insira o nome ou número de telefone do contato que deseja remover.
   - Se o contato for removido com sucesso, uma mensagem de confirmação será exibida. Caso contrário, uma mensagem de erro será mostrada.

4. Listar Todos os Contatos:
   - Escolha a opção 4 para exibir todos os contatos armazenados no sistema.

5. Sair:
   - Escolha a opção 5 para sair do sistema.

### Estrutura do Código

O código está dividido nas seguintes classes:

1. Contact: Representa um contato individual com atributos como nome, telefone e e-mail.
2. Node: Representa um nó na lista encadeada que contém um contato e uma referência para o próximo nó.
3. ContactList: Gerencia a lista encadeada, fornecendo métodos para adicionar, buscar, remover e listar contatos.
4. ContactManager: Contém o método main e é responsável pela interação do usuário através de um menu CLI.