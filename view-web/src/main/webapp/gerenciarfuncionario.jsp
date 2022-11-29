<%-- 
    Document   : gerenciarfuncionario
    Created on : 29 de nov de 2022, 09:40:49
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="apple-touch-icon" sizes="180x180" href="/img/favicon/apple-icon-180x180.png">
    <link rel="icon" type="image/png" sizes="192x192" href="/img/favicon/android-icon-192x192.png">
    <link rel="icon" type="image/png" sizes="32x32" href="/img/favicon/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="96x96" href="/img/favicon/favicon-96x96.png">
    <link rel="icon" type="image/png" sizes="16x16" href="/img/favicon/favicon-16x16.png">
    <link rel="manifest" href="/img/favicon/manifest.json">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="msapplication-TileImage" content="/img/favicon/ms-icon-144x144.png">
    <meta name="theme-color" content="#ffffff">

    <link rel="stylesheet" href="/node_modules/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/node_modules/bootstrap-icons/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/css/estilos.css">

    <title>Sabor e Arte - Gerenciamento dos Funcionários</title>
</head>
<style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;700&family=Roboto:wght@100;300;400;500;700;900&family=Source+Sans+Pro:wght@200;300;400;600;700;900&display=swap');


button {
  cursor: pointer;
}

.container {
  width: 90%;
  height: 80%;
  border-radius: 10px;
}

.header {
  min-height: 70px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin: auto 12px;
}

.header span {
  font-weight: 900;
  font-size: 20px;
  word-break: break-all;
}

#new {
  font-size: 16px;
  padding: 8px;
  border-radius: 5px;
  border: none;
  color: white;
  background-color: rgb(168, 17, 12);
}

.divTable {
  padding: 10px;
  width: auto; 
  height:inherit; 
  overflow:auto;
}

.divTable::-webkit-scrollbar {
  width: 12px;
  background-color: white; 
}

.divTable::-webkit-scrollbar-thumb {
  border-radius: 10px;
  background-color: rgb(245, 126, 126); 
}

table {
  width: 100%;
  border-spacing: 10px;
  word-break: break-all;
  border-collapse: collapse;
}

thead {
  background-color: rgb(240, 162, 162);
}

tr {
  border-bottom: 1px solid rgb(253, 199, 199)!important;
}

tbody tr td {
  vertical-align: text-top;
  padding: 6px;
  max-width: 50px;
}

thead tr th {
  padding: 5px;
  text-align: start;
  margin-bottom: 50px;
}

tbody tr {
  margin-bottom: 50px;
}

thead tr th.acao {
  width: 100px!important;
  text-align: center;
}

tbody tr td.acao {
  text-align: center;
}

@media (max-width: 700px) {
  body {
    font-size: 10px;
  }
  
  .header span {
    font-size: 15px;
  }

  #new {
    padding: 5px;
    font-size: 10px;
  }

  thead tr th.acao {
    width: auto!important;
  }
  
  td button i {
    font-size: 20px!important;
  }

  td button i:first-child {
    margin-right: 0;
  }

  .modal {
    width: 90%!important;
  }

  .modal label {
    font-size: 12px!important;
  }
}

.modal-container {
  width: 100vw;
  height: 100vh;
  position: fixed;
  top: 0;
  left: 0;
  background-color: rgba(0, 0, 0, 0.5);
  display: none;
  z-index: 999;
  align-items: center;
  justify-content: center;
}

.modal {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 40px;
  background-color: white;
  border-radius: 10px;
  width: 50%;
}

.modal label {
  font-size: 14px;
  width: 100%;
}

.modal input {
  width: 100%;
  outline: none;
  padding: 5px 10px; 
  width: 100%;
  margin-bottom: 20px;
  border-top: none;
  border-left: none;
  border-right: none;
}

.modal button {
  width: 100%;
  margin: 10px auto;
  outline: none;
  border-radius: 20px; 
  padding: 5px 10px; 
  width: 100%;
  border: none;
  background-color: rgb(134, 7, 3);
  color: white;
}

.active {
  display: flex;
}

.active .modal {
  animation: modal .4s;
}

@keyframes modal {
  from {
    opacity: 0;
    transform: translate3d(0, -60px, 0);
  }
  to {
    opacity: 1;
    transform: translate3d(0, 0, 0);
  }
}

td button {
  border: none;
  outline: none;
  background: transparent;
}

td button i {
  font-size: 25px;
}

td button i:first-child {
  margin-right: 10px;
}
  </style>
<body>
  <div class="d-flex flex-column wrapper">
    <nav class="navbar navbar-expand-lg navbar-dark bg-danger border-bottom shadow-sm mb-3">
        <div class="container">
            <a class="navbar-brand" href="/"><b>Sabor e Arte</b></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target=".navbar-collapse">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav flex-grow-1">
                    <li class="nav-item">
                        <a class="nav-link text-white" href="/gestao.html">Principal</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link text-white" href="/gerenciarCardapio.html">Cardápio</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-white" href="/gerenciarestoque.html">Estoque</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-white" href="/gerenciarfuncionario.html">Funcionários</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link text-white" href="/pedidosGestao.html">Pedidos</a>
                  </li>
                </ul>
                <div class="align-self-end">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a href="/index.html" class="nav-link text-white">Visualizar como cliente</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </nav>
  <div class="container">
    <div class="header">
      <span>Cadastro de Funcionários</span>
      <button onclick="openModal()" id="new">Incluir</i></button>
    </div>

    <div class="divTable">
      <table>
        <thead>
          <tr>
            <th>Nome</th>
            <th>Função</th>
            <th>Salário</th>
            <th class="acao">Editar</th>
            <th class="acao">Excluir</th>
          </tr>
        </thead>
        <tbody>
        </tbody>
      </table>
    </div>

    <div class="modal-container">
      <div class="modal">
        <form>
          <label for="m-nome">Nome</label>
          <input id="m-nome" type="text" required />
  
          <label for="m-funcao">Função</label>
          <input id="m-funcao" type="text" required />
  
          <label for="m-salario">Salário</label>
          <input id="m-salario" type="number" required />
          <button id="btnSalvar">Salvar</button>
        </form>
      </div>
    </div>

  </div>
  <script>
    const modal = document.querySelector('.modal-container')
const tbody = document.querySelector('tbody')
const sNome = document.querySelector('#m-nome')
const sFuncao = document.querySelector('#m-funcao')
const sSalario = document.querySelector('#m-salario')
const btnSalvar = document.querySelector('#btnSalvar')

let itens
let id

function openModal(edit = false, index = 0) {
  modal.classList.add('active')

  modal.onclick = e => {
    if (e.target.className.indexOf('modal-container') !== -1) {
      modal.classList.remove('active')
    }
  }

  if (edit) {
    sNome.value = itens[index].nome
    sFuncao.value = itens[index].funcao
    sSalario.value = itens[index].salario
    id = index
  } else {
    sNome.value = ''
    sFuncao.value = ''
    sSalario.value = ''
  }
  
}

function editItem(index) {

  openModal(true, index)
}

function deleteItem(index) {
  itens.splice(index, 1)
  setItensBD()
  loadItens()
}

function insertItem(item, index) {
  let tr = document.createElement('tr')

  tr.innerHTML = `
    <td>${item.nome}</td>
    <td>${item.funcao}</td>
    <td>R$ ${item.salario}</td>
    <td class="acao">
      <button onclick="editItem(${index})"><i class='bx bx-edit' ></i></button>
    </td>
    <td class="acao">
      <button onclick="deleteItem(${index})"><i class='bx bx-trash'></i></button>
    </td>
  `
  tbody.appendChild(tr)
}

btnSalvar.onclick = e => {
  
  if (sNome.value == '' || sFuncao.value == '' || sSalario.value == '') {
    return
  }

  e.preventDefault();

  if (id !== undefined) {
    itens[id].nome = sNome.value
    itens[id].funcao = sFuncao.value
    itens[id].salario = sSalario.value
  } else {
    itens.push({'nome': sNome.value, 'funcao': sFuncao.value, 'salario': sSalario.value})
  }

  setItensBD()

  modal.classList.remove('active')
  loadItens()
  id = undefined
}

function loadItens() {
  itens = getItensBD()
  tbody.innerHTML = ''
  itens.forEach((item, index) => {
    insertItem(item, index)
  })

}

const getItensBD = () => JSON.parse(localStorage.getItem('dbfunc')) ?? []
const setItensBD = () => localStorage.setItem('dbfunc', JSON.stringify(itens))

loadItens()

  </script>
  
  <footer class="border-top text-muted bg-light">
    <div class="container">
        <div class="row py-3">
            <div class="col-12 col-md-4 text-center">
                &copy; 2022 - Centro Federal de Educação Tecnológica de Minas Gerais
            </div>
            <div class="col-12 col-md-4 text-center">
                <a href="/contato.html" class="text-decoration-none text-dark">
                    Contato pelo Site
                </a><br>
                </a><br>
                Telefone: <a href="phone:28999990000" class="text-decoration-none text-dark">
                    (28) 99999-0000
                </a>
            </div>
        </div>
    </div>
</footer>
</div>
<script src="/node_modules/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>