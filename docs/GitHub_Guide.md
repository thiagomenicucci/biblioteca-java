# Guia de Publicação no GitHub para o Projeto Biblioteca Java

Este guia detalha os passos para publicar o seu projeto "Sistema de Gerenciamento de Biblioteca" no GitHub. O GitHub é uma plataforma essencial para desenvolvedores, permitindo o controle de versão, colaboração e a exibição de seu trabalho em um portfólio. Este guia é focado em desenvolvedores júnior que estão aprendendo a usar o Git e o GitHub.

## 1. Pré-requisitos

Antes de começar, certifique-se de ter o seguinte:

- **Conta no GitHub**: Se você ainda não tem uma, crie uma conta gratuita em [github.com](https://github.com/).
- **Git Instalado**: O Git é um sistema de controle de versão distribuído. Você pode baixá-lo e instalá-lo em [git-scm.com](https://git-scm.com/).
- **Projeto Java Local**: O projeto `biblioteca-java` deve estar salvo em seu computador.

## 2. Criando um Novo Repositório no GitHub

Um repositório (ou "repo") é onde seu projeto será armazenado no GitHub.

1. **Acesse o GitHub**: Faça login na sua conta do GitHub.
2. **Crie um Novo Repositório**: No canto superior direito da página, clique no sinal de `+` e selecione `New repository` (ou vá diretamente para [github.com/new](https://github.com/new)).
3. **Configure o Repositório**:
   - **Repository name**: Dê um nome ao seu repositório. Sugestão: `biblioteca-java-portfolio` ou `sistema-biblioteca-java`. Escolha um nome claro e descritivo.
   - **Description (optional)**: Adicione uma breve descrição do seu projeto. Ex: "Um sistema simples de gerenciamento de biblioteca em Java para fins de portfólio."
   - **Public ou Private**: Para um projeto de portfólio, é altamente recomendável que seja `Public`, para que recrutadores e outros desenvolvedores possam vê-lo.
   - **Initialize this repository with**: **NÃO** marque a opção `Add a README file`, `Add .gitignore` ou `Choose a license` neste momento. Faremos isso manualmente para que você entenda o processo completo. Se você marcar, o GitHub criará um repositório com arquivos iniciais, o que pode complicar o primeiro `push` do seu projeto local.
   - Clique em `Create repository`.

4. **Página do Repositório Vazio**: Após a criação, você será redirecionado para uma página que mostra instruções sobre como configurar seu repositório local e fazer o primeiro `push`. Mantenha esta página aberta, pois ela contém os comandos que você precisará.

## 3. Inicializando o Repositório Local e Fazendo o Primeiro Push

Agora, você vai transformar sua pasta de projeto local em um repositório Git e enviá-la para o GitHub.

1. **Abra o Terminal/Prompt de Comando**: Navegue até a pasta raiz do seu projeto `biblioteca-java` no seu computador.
   ```bash
   cd /caminho/para/sua/pasta/biblioteca-java
   ```
   (Substitua `/caminho/para/sua/pasta/biblioteca-java` pelo caminho real do seu projeto).

2. **Inicialize o Repositório Git Local**: Este comando cria um novo repositório Git vazio na sua pasta atual.
   ```bash
   git init
   ```
   Você verá uma mensagem como `Initialized empty Git repository in .../.git/`.

3. **Adicione os Arquivos ao Staging Area**: O "staging area" (ou índice) é um local onde você prepara as mudanças que deseja incluir no próximo commit. O comando abaixo adiciona todos os arquivos do seu projeto.
   ```bash
   git add .
   ```
   O `.` significa "todos os arquivos e pastas no diretório atual".

4. **Crie o Primeiro Commit**: Um commit é um "instantâneo" das suas mudanças. Cada commit deve ter uma mensagem descritiva.
   ```bash
   git commit -m "Initial commit: Project setup and core functionalities"
   ```
   A mensagem entre aspas é a descrição do seu commit. Seja claro e conciso.

5. **Renomeie a Branch Principal (Opcional, mas Recomendado)**: Por padrão, o Git cria uma branch chamada `master`. O GitHub e a comunidade de desenvolvimento têm adotado `main` como o nome padrão para a branch principal. É uma boa prática renomear a sua branch local para `main`.
   ```bash
   git branch -M main
   ```

6. **Conecte seu Repositório Local ao GitHub**: Você precisa informar ao Git onde está o repositório remoto no GitHub. Copie o comando fornecido na página do seu repositório vazio no GitHub. Ele será algo parecido com:
   ```bash
   git remote add origin https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git
   ```
   Substitua `SEU_USUARIO` pelo seu nome de usuário do GitHub e `SEU_REPOSITORIO` pelo nome que você deu ao seu repositório.

7. **Faça o Primeiro Push**: Finalmente, envie suas mudanças locais para o repositório remoto no GitHub.
   ```bash
   git push -u origin main
   ```
   - `git push`: Envia as mudanças.
   - `-u origin main`: Define a branch `main` do repositório remoto (`origin`) como a branch upstream para sua branch local `main`. Isso significa que, a partir de agora, você pode usar apenas `git push` e `git pull` sem especificar `origin main`.

   Você pode ser solicitado a inserir seu nome de usuário e senha do GitHub. Se você usa autenticação de dois fatores ou chaves SSH, o processo pode ser ligeiramente diferente (você precisará de um Personal Access Token em vez da senha).

   Após o push, atualize a página do seu repositório no GitHub. Você verá todos os seus arquivos lá!

## 4. Boas Práticas para Repositórios GitHub

Para manter seu portfólio profissional e facilitar a colaboração (mesmo que seja apenas com você mesmo no futuro):

- **`.gitignore`**: Crie um arquivo `.gitignore` na raiz do seu projeto. Este arquivo informa ao Git quais arquivos e pastas ele deve ignorar (não rastrear). Para projetos Java, você deve ignorar:
   - Arquivos de classe compilados (`.class`)
   - Diretórios de saída de compilação (`out/`, `target/`, `build/`)
   - Arquivos de configuração da IDE (`.idea/`, `.project`, `.classpath`, `.settings/`)
   - Arquivos temporários ou de log.
   
   Um `.gitignore` básico para Java seria:
   ```
   # Compiled class files
   *.class

   # Log files
   *.log

   # BlueJ files
   *.ctxt
   *.addons

   # Mobile Tools for Java (J2ME)
   .mtj.tmp/
   .metadata/

   # Package Files
   *.jar
   *.war
   *.ear
   *.zip
   *.tar.gz
   *.rar

   # IDEs
   .idea/
   .vscode/
   *.iml
   *.ipr
   *.iws
   .project
   .classpath
   .settings/

   # Build artifacts
   /out/
   /build/
   /target/

   # Maven
   pom.xml.tag
   pom.xml.releaseBackup
   pom.xml.versionsBackup
   pom.xml.next
   release.properties
   dependency-reduced-pom.xml
   buildNumber.properties
   .mvn/timing.properties
   .mvn/wrapper/maven-wrapper.jar

   # Gradle
   .gradle/
   build/
   *.gradle.kts.enc
   *.gradle.kts.sig

   # Eclipse
   .project
   .classpath
   .settings/
   *.launch
   .externalToolBuilders/

   # OS generated files
   .DS_Store
   .Trashes
   Thumbs.db
   ```
   Crie este arquivo na raiz do seu projeto (`biblioteca-java/.gitignore`), adicione-o ao Git (`git add .gitignore`) e faça um commit (`git commit -m "Add .gitignore file"`) e push (`git push`).

- **Commits Frequentes e Descritivos**: Faça commits pequenos e focados. Cada commit deve representar uma única mudança lógica. As mensagens de commit devem ser claras e explicar o que foi feito.

- **Branches**: Para novas funcionalidades ou correções de bugs, crie branches separadas (ex: `git checkout -b feature/nova-funcionalidade`). Trabalhe na branch, faça commits e, quando terminar, mescle de volta para `main` (`git merge feature/nova-funcionalidade`) e exclua a branch (`git branch -d feature/nova-funcionalidade`).

- **README.md Completo**: O `README.md` é a primeira coisa que as pessoas veem. Certifique-se de que ele seja claro, conciso e contenha todas as informações relevantes sobre o projeto (funcionalidades, como executar, tecnologias usadas, etc.). O `README.md` que você criou anteriormente já é um bom começo.

- **Licença**: Adicione um arquivo `LICENSE` ao seu repositório para informar como outras pessoas podem usar seu código. A licença MIT é uma escolha popular para projetos de código aberto.

- **Issues**: Use a seção "Issues" do GitHub para rastrear bugs, sugestões de melhoria ou novas funcionalidades. Isso ajuda a organizar o trabalho.

- **Pull Requests (PRs)**: Se você estiver colaborando ou quiser simular um fluxo de trabalho de equipe, use Pull Requests para propor mudanças de uma branch para outra. Isso permite revisões de código antes da mesclagem.

## Conclusão

Publicar seu projeto no GitHub é um passo crucial para qualquer desenvolvedor. Ele não apenas serve como um portfólio, mas também o familiariza com ferramentas e práticas padrão da indústria. Continue explorando o Git e o GitHub para aprimorar suas habilidades de controle de versão e colaboração.

