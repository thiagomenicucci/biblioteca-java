# Guia de Desenvolvimento no IntelliJ IDEA para o Projeto Biblioteca Java

Este guia detalha os passos para configurar, importar, executar e depurar o projeto "Sistema de Gerenciamento de Biblioteca" no IntelliJ IDEA, uma das IDEs mais populares para desenvolvimento Java. Ele é destinado a desenvolvedores júnior que estão começando a usar o IntelliJ ou que precisam de um passo a passo para este projeto específico.

## 1. Pré-requisitos

Antes de começar, certifique-se de ter o seguinte instalado:

- **Java Development Kit (JDK) 17 ou superior**: O IntelliJ IDEA precisa de um JDK para compilar e executar projetos Java. Você pode baixar a versão mais recente do site oficial da Oracle ou usar distribuições open-source como o OpenJDK.
- **IntelliJ IDEA**: Baixe e instale a versão Community (gratuita) ou Ultimate (paga) do IntelliJ IDEA no site oficial da JetBrains.

## 2. Importando o Projeto no IntelliJ IDEA

Se você já clonou o repositório do projeto para o seu computador, siga estes passos para importá-lo no IntelliJ:

1. **Abrir o IntelliJ IDEA**: Inicie o IntelliJ IDEA.
2. **Abrir Projeto Existente**: Na tela de boas-vindas, selecione `Open` (ou `File > Open...` se você já tiver um projeto aberto).
3. **Navegar até a Pasta do Projeto**: Na janela de diálogo que se abre, navegue até a pasta raiz do projeto `biblioteca-java` (a pasta que contém `src`, `docs`, etc.). Selecione esta pasta e clique em `OK` (ou `Open`).

   O IntelliJ IDEA deve reconhecer automaticamente que é um projeto Java e configurar a estrutura. Você verá a estrutura de pastas no painel `Project` (geralmente à esquerda).

4. **Configurar o SDK do Projeto (se necessário)**:
   - Se o IntelliJ não conseguir detectar o JDK automaticamente ou se você tiver várias versões instaladas, pode ser necessário configurá-lo manualmente.
   - Vá em `File > Project Structure...` (atalho: `Ctrl+Alt+Shift+S` ou `Cmd+;` no macOS).
   - Na janela `Project Structure`, selecione `Project` em `Project Settings`.
   - Em `Project SDK`, clique em `New...` e selecione `JDK`. Navegue até o diretório de instalação do seu JDK (por exemplo, `C:\Program Files\Java\jdk-17` no Windows ou `/Library/Java/JavaVirtualMachines/openjdk-17/Contents/Home` no macOS).
   - Certifique-se de que o `Project language level` esteja configurado para a versão do Java que você está usando (por exemplo, `17 - New language features`).
   - Clique em `OK` para aplicar as alterações.

## 3. Entendendo a Estrutura do Projeto no IntelliJ

No painel `Project` do IntelliJ, você verá a seguinte estrutura:

```
biblioteca-java
├── .idea (pasta de configuração do IntelliJ)
├── src
│   └── main
│       └── java
│           └── com
│               └── biblioteca
│                   ├── main
│                   │   └── Main.java
│                   ├── model
│                   │   ├── Emprestimo.java
│                   │   ├── Livro.java
│                   │   └── Membro.java
│                   ├── repository
│                   │   ├── EmprestimoRepository.java
│                   │   ├── LivroRepository.java
│                   │   └── MembroRepository.java
│                   ├── service
│                   │   └── BibliotecaService.java
│                   └── view
│                       └── ConsoleView.java
├── .gitignore (para controle de versão com Git)
└── README.md
```

- A pasta `src/main/java` é onde todo o código-fonte Java do seu projeto está localizado.
- Cada subpasta dentro de `com.biblioteca` representa um pacote lógico, conforme a arquitetura definida (model, repository, service, view, main).

## 4. Executando o Projeto

Para executar o sistema de biblioteca no IntelliJ IDEA:

1. **Localize a Classe Principal**: No painel `Project`, navegue até `src/main/java/com/biblioteca/main/Main.java`.
2. **Executar**: Você tem algumas opções para executar:
   - **Botão Play**: Clique no pequeno ícone de 


play` (um triângulo verde) que aparece ao lado da declaração da classe `Main` ou do método `main`.
   - **Menu de Contexto**: Clique com o botão direito no arquivo `Main.java` no painel `Project` e selecione `Run 'Main.main()'`. 
   - **Menu Run**: Vá em `Run > Run 'Main'` no menu superior.

   O console do IntelliJ (geralmente na parte inferior da tela) será aberto e exibirá a saída do programa, permitindo que você interaja com o sistema de biblioteca.

## 5. Depurando o Projeto

A depuração é uma ferramenta essencial para entender o fluxo do programa e identificar problemas. O IntelliJ IDEA oferece um depurador poderoso:

1. **Definir um Ponto de Parada (Breakpoint)**: Navegue até a linha de código onde você deseja que a execução do programa pause. Clique na margem esquerda da linha (ao lado do número da linha). Um círculo vermelho aparecerá, indicando um breakpoint.
   - Por exemplo, você pode definir um breakpoint no início do método `iniciar()` na classe `ConsoleView.java` para ver como o programa começa.

2. **Iniciar a Depuração**: Em vez de `Run`, clique no ícone de `Debug` (um inseto verde) ao lado da classe `Main` ou do método `main`, ou vá em `Run > Debug 'Main'`.

3. **Interagindo com o Depurador**: Quando a execução atingir o breakpoint, o programa pausará e o IntelliJ destacará a linha atual. As seguintes janelas e ferramentas serão úteis:
   - **Frames**: Mostra a pilha de chamadas dos métodos.
   - **Variables**: Exibe os valores das variáveis no escopo atual. Você pode inspecionar objetos e seus atributos.
   - **Console**: Ainda exibe a saída do programa, mas agora você pode interagir com ele enquanto o depurador está ativo.
   - **Botões de Controle do Depurador**: Na barra de ferramentas do depurador (geralmente na parte superior da janela de depuração), você encontrará botões como:
     - `Step Over` (F8): Executa a linha atual e avança para a próxima linha, pulando a entrada em chamadas de método.
     - `Step Into` (F7): Entra na chamada de método na linha atual, permitindo que você depure o código dentro desse método.
     - `Step Out` (Shift+F8): Sai do método atual e retorna para a linha que chamou esse método.
     - `Resume Program` (F9): Continua a execução do programa até o próximo breakpoint ou até o fim.
     - `Stop` (Ctrl+F2): Interrompe a sessão de depuração.

   Experimente usar esses botões para navegar pelo código e observar como os valores das variáveis mudam.

## 6. Configurações Úteis do IntelliJ para Desenvolvimento Java

O IntelliJ IDEA é altamente configurável. Aqui estão algumas configurações que podem melhorar sua experiência de desenvolvimento:

- **Configurações de Código (Code Style)**:
   - Vá em `File > Settings...` (ou `IntelliJ IDEA > Settings...` no macOS) e navegue até `Editor > Code Style > Java`.
   - Aqui você pode configurar o estilo de formatação do código (indentação, chaves, espaços, etc.). É uma boa prática seguir um padrão consistente, especialmente em projetos de equipe.
   - Você pode usar `Code > Reformat Code` (Ctrl+Alt+L ou Cmd+Alt+L) para formatar seu código automaticamente de acordo com as configurações.

- **Inspeções (Inspections)**:
   - Em `Settings/Preferences > Editor > Inspections`, você pode habilitar ou desabilitar várias inspeções de código que o IntelliJ realiza para encontrar possíveis erros, avisos e sugestões de melhoria.
   - Por exemplo, ele pode alertar sobre código não utilizado, possíveis `NullPointerExceptions`, ou sugerir o uso de recursos mais modernos do Java.

- **Plugins**: O IntelliJ possui um vasto ecossistema de plugins que podem estender sua funcionalidade.
   - Vá em `Settings/Preferences > Plugins`.
   - Alguns plugins úteis para desenvolvimento Java podem incluir ferramentas de análise de código, integração com frameworks específicos, ou temas visuais.

- **Atalhos de Teclado (Keymap)**:
   - Em `Settings/Preferences > Keymap`, você pode personalizar os atalhos de teclado para todas as ações do IntelliJ. Isso pode acelerar significativamente seu fluxo de trabalho.

- **Configurações de Compilação (Build, Execution, Deployment)**:
   - Em `Settings/Preferences > Build, Execution, Deployment > Compiler > Java Compiler`, você pode verificar e configurar a versão do compilador Java que o IntelliJ está usando.

- **Terminal Integrado**: O IntelliJ possui um terminal integrado (geralmente na parte inferior da tela, ao lado do console de execução) que permite executar comandos do sistema operacional diretamente da IDE. Isso é útil para comandos Git, Maven/Gradle, ou outros utilitários de linha de comando.

## Conclusão

Com este guia, você deve estar apto a importar, executar e depurar o projeto de biblioteca no IntelliJ IDEA, além de conhecer algumas configurações que podem otimizar seu ambiente de desenvolvimento. O IntelliJ é uma ferramenta poderosa; explore suas funcionalidades para se tornar um desenvolvedor Java mais eficiente.

