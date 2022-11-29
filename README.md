# Projeto Restaurante
## Por André HP, João T, Rayanne e Seynabou.
### Curso: Informática - 2° ano A 
### Cefet MG - BH 2022


#
#
#
#
#  
# 
#
#

# Descrição.

Tendo em vista que o tema do nosso projeto são os restaurantes, decidimos criar um site direcionado ao cliente e a gestão do restaurante. O cliente por sua vez terá acesso a disponibilidade a um cardápio online, em que neste ele poderá realizar os seus pedidos, informando a quantidade destes e as suas respectivas características, informando os itens adicionais e os que deseja retirar. Já a gestão do restaurante poderá acessar os pedidos e visualizar tais especificações, além de criar e alterar os cardápios de acordo com o estoque do estabelecimento, por meio da inserção de valores, descrição, disponibilidade e informações de armazenamento.

- Visão do cliente
- Visão da gestão
- Desktop e WEB 



## O que automatizar? Por que automatizar? Benefícios? 

O recurso a ser automatizado é o sistema virtual do restaurante na parte que diz respeito ao atendimento ao cliente, ou seja: cardápios, setor de reclamação, elogio e sugestões, entre outros. Em que esses passam a ser de acesso virtual, tendo em vista a importância de reduzir o uso de materiais como folhas e impressões para cada indivíduo ter acesso a tais informações, além de se tornar mais prático, pois cada pessoa possui em seu celular o conteúdo necessário para fazer o pedido e também se mostra viável, pois menu é mutável a cada atualização em caso de futuras mudanças.

> O objetivo é modernizar o modelo convencional,
> tornando tanto o gerenciamento
> quanto o uso do cliente mais práticos e funcionais.
> Para isso, buscamos elaborar uma interface 
> mais fluída e intuitiva, trazendo também uma série
> de funcionalidades para melhorar a experiência
> do usuário.

## Usuários Envolvidos?

Os usuários envolvidos nesse processo são aos funcionários da gestão do restaurante que terão a opção de cadastrar suas opções no sistema para a formação de um cardápio on-line, disponibilização de mesas, formação de estoque, e também dos clientes que terão acesso ao conteúdo para fazerem seus pedidos e consultar os produtos. 




## Dados a serem tratados e dependência desses.

Os dados a serem tratados são inicialmente na parte de gestão do sistema, as características visuais do cardápio que poderão ser realizadas por meio da seleção de "templates"  já prontos ou a confecção do seu próprio. Logo, seguindo com o processo de cadastro dos produtos no estoque, em que recebe o nome do alimento seguido do seu preço e informações de armazenamento. Por fim, também será incluído em uma área específica do sistema, uma aba para obtenção de dados para a área restrita da gestão do restaurante.

## Apresentação dos Requisitos Levantados e Lista de Requisitos.


Os requisitos necessários para o funcionamento do sistema, quando referente a montagem do cardápio será o nome do produto,  suas informações dos valores, imagem e dados para armazenamento. Já para o pedido de um item no cardápio será necessário a sua seleção, seguido da quantidade e as características da composição dele, permitindo acréscimos ou rejeições. Por fim, será gerada um pedido que será entregue a gestão, para que o prato seja produzido e entregue ao cliente.

## Lista de Funcionalidades e Caso de Uso.

O sistema disponibilizará para os seus usuários a montagem de um cardápio interativo, que será projetado em um meio digital, do qual também pode ser acessado pelo escaneamento de um Qr Code,  em que neste será possível realizar pedidos que serão enviados direto para a cozinha, onde poderão ser preparados no menor tempo possível. 

## Ordem de Dependências (sequência de eventos/processos cronológicos)

Para iniciar o projeto seguiremos a seguinte ordem cronológica, organizar um site em que será possível o usuário adicionar os produtos, tratando os campos de entrada como nome, imagens, valores e os exibidos na tela conforme são adicionados. Seguido de promover interatividade aos produtos acrescentados, possibilitando que dito a suas características e quantidades seja enviada uma requisição ao site da cozinha.

## Tecnologias a Utilizar.

As linguagens de programação que serão utilizadas para o desenvolvimento do trabalho será java-web, incorporando Java, Html, Css e JavaScript, por meio da plataforma NetBeans. Além de sites para a confecção de QrCode, e alguns como o Google Fontes e Css Gradientes para a formação dos templates. 


## Arquitetura MVC.

Para a construção do projeto utilizaremos como recursos de entrada a página index.html, seguido de um controlador que ficará sob responsabilidade do Servlet.java e por fim a execução em páginas .jsp.

## Integrações a Efetuar com BD.

Os dados que serão inseridos se integrarão a um banco de dados, subdividido este entre produtos, valores e descrição. Tornando possível o armazenamento dessas informações sem a perda delas. 

## Templates.

O site terá uma organização inicial, tendo um design simples e atrativo, podendo posteriormente ser melhor ajustado ao desejo do cliente. Ademais na confecção do cardápio, já haverem diversos templates customizados que permitem escolha ao cliente e também será possível este adicionar um modelo de sua preferência. 

> Nota: O projeto sofreu algumas alterações ao longo do desenvolvimento e alguns aspectos foram repensados, contudo a essência foi mantida.

