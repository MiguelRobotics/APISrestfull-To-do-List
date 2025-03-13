# APISrestfull-To-do-List
API To do List.

Observação : A maquina limitada afetou o desenvolvimento então estou interrompendo o projeto até poder toca-lo em uma estrtura melhor.

# Desafios e Dificuldades Enfrentados no Desenvolvimento do Projeto

Este repositório contém o código do projeto de gerenciamento de tarefas, que foi desenvolvido utilizando **JDK 8** e versionado no **GitHub**. Durante o desenvolvimento, encontrei uma série de desafios e dificuldades, principalmente devido às limitações do ambiente de desenvolvimento. A seguir, compartilho minha trajetória e as lições aprendidas ao longo do processo.

## 1. Ambiente Limitado

Durante a configuração do projeto, enfrentei desafios devido ao uso de um sistema **Windows 32 bits**, o que limitou as opções de ferramentas e JDKs compatíveis. As versões mais recentes das ferramentas de desenvolvimento não eram compatíveis com a arquitetura de 32 bits do meu computador, exigindo ajustes e soluções alternativas.

## 2. Migração para o IntelliJ IDEA

Inicialmente, eu estava usando o **Eclipse 2010**, que não possuía suporte adequado para ferramentas mais modernas e dependências necessárias para o projeto. Como alternativa, migrei para o **IntelliJ IDEA 2016**, que, embora mais robusto, ainda exigia alguns ajustes de configuração para funcionar corretamente com o JDK 8 e as dependências do Maven.

## 3. Configuração Manual do JDK

Uma das dificuldades foi a necessidade de configurar manualmente o **JDK 8** no IntelliJ IDEA. Baixei o JDK 8 de fontes confiáveis, como o **Adoptium**, e ajustei o caminho do JDK nas configurações do IntelliJ. Além disso, foi necessário modificar o arquivo `pom.xml` para garantir que o Maven utilizasse a versão correta do JDK.

## 4. Reimportação do Projeto

Após configurar o JDK, precisei reimportar o projeto no IntelliJ IDEA para garantir que todas as dependências fossem baixadas corretamente. Esse processo foi necessário para resolver eventuais problemas de dependências que não estavam sendo resolvidas automaticamente.

## 5. Conexão com o GitHub

Para versionar o código e garantir que as mudanças fossem bem documentadas, configurei o **GitHub** diretamente no IntelliJ IDEA. Isso permitiu que eu compartilhasse o código com outras pessoas e mantivesse um histórico das alterações feitas no projeto.

## 6. Lições Aprendidas

- **Compatibilidade entre Ferramentas**: Aprendi que a escolha das ferramentas de desenvolvimento precisa ser compatível com o sistema operacional e o hardware disponível. A flexibilidade e adaptação são essenciais para o sucesso do projeto.
  
- **Leitura de Logs e Documentação**: Enfrentei muitos erros durante o desenvolvimento, e a leitura cuidadosa dos logs e documentação foi essencial para solucionar os problemas.

- **Importância da Flexibilidade**: Ter flexibilidade para escolher diferentes ferramentas e ajustar o processo de desenvolvimento conforme as limitações do ambiente é crucial para o sucesso, especialmente quando o hardware não é ideal.

Este projeto foi desenvolvido utilizando **JDK 8** e todas as dependências foram gerenciadas pelo **Maven**. O código está versionado no **GitHub** e pode ser acessado para contribuições e melhorias.

## Tecnologias Utilizadas

- **JDK 8**
- **Maven**
- **Spring Boot**
- **IntelliJ IDEA**
- **GitHub**

---

Espero que você goste de explorar o código e contribua para melhorias futuras!

## Como Executar

1. Clone este repositório para o seu ambiente local.
2. Certifique-se de ter o **JDK 8** instalado.


---

Este projeto ainda está em desenvolvimento, e novas funcionalidades serão adicionadas à medida que o projeto evolui.

