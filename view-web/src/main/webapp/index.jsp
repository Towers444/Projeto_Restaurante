<%-- 
    Document   : index
    Created on : 29 de nov de 2022, 09:16:18
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!doctype html>
<html lang="pt-br">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="apple-touch-icon" sizes="180x180" href="img/favicon/apple-icon-180x180.png">
        <link rel="icon" type="image/png" sizes="192x192" href="img/favicon/android-icon-192x192.png">
        <link rel="icon" type="image/png" sizes="32x32" href="img/favicon/favicon-32x32.png">
        <link rel="icon" type="image/png" sizes="96x96" href="img/favicon/favicon-96x96.png">
        <link rel="icon" type="image/png" sizes="16x16" href="img/favicon/favicon-16x16.png">
        <link rel="manifest" href="img/favicon/manifest.json">
        <meta name="msapplication-TileColor" content="#ffffff">
        <meta name="msapplication-TileImage" content="img/favicon/ms-icon-144x144.png">
        <meta name="theme-color" content="#ffffff">

        <link rel="stylesheet" href="dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="font/bootstrap-icons.css">
        <link rel="stylesheet" href="css/estilos.css">

        <title>Sabor e Arte - Página Principal</title>
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

            .divTable{
                border-spacing: 10px;
                word-break: break-all;
                border-collapse: collapse;
            }

            table {
                padding: 10px;
                margin-bottom: 30px;
                width: auto;
                height:inherit;
                overflow:auto;
                width: 100%;
            }

            .divTable::-webkit-scrollbar {
                width: 12px;
                background-color: white;
            }

            .divTable::-webkit-scrollbar-thumb {
                border-radius: 10px;
                background-color: rgb(245, 126, 126);
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
    </head>

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
                                <a class="nav-link text-white" href="">Principal</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="ComandaCliente.jsp">Comanda</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="contato.jsp">Contato</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="quemsomos.jsp">Quem Somos</a>
                            </li>
                        </ul>
                        <div class="align-self-end">
                            <ul class="navbar-nav">
                                <li class="nav-item">
                                    <a href="loginGestao.jsp" class="nav-link text-white">Gestão</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </nav>

            <div class="container">
                <div id="carouselMain" class="carousel slide carousel-dark" data-bs-ride="carousel">
                    <div class="carousel-indicators">
                        <button type="button" data-bs-target="#carouselMain" data-bs-slide-to="0" class="active"></button>
                        <button type="button" data-bs-target="#carouselMain" data-bs-slide-to="1"></button>
                        <button type="button" data-bs-target="#carouselMain" data-bs-slide-to="2"></button>
                    </div>
                    <div class="carousel-inner">
                        <div class="carousel-item active" data-bs-interval="3000">
                            <img src="img/slides/banner.jpg" class="d-none d-md-block w-100" alt="">
                            <img src="img/slides/slide01small.jpg" class="d-block d-md-none  w-100" alt="">
                        </div>
                        <div class="carousel-item" data-bs-interval="3000">
                            <img src="img/slides/banner.jpg" class="d-none d-md-block w-100" alt="">
                            <img src="img/slides/slide01small.jpg" class="d-block d-md-none  w-100" alt="">
                        </div>
                        <div class="carousel-item" data-bs-interval="3000">
                            <img src="img/slides/banner.jpg" class="d-none d-md-block w-100" alt="">
                            <img src="img/slides/slide01small.jpg" class="d-block d-md-none  w-100" alt="">
                        </div>
                    </div>
                    <button class="carousel-control-prev" type="button" data-bs-target="#carouselMain" data-bs-slide="prev">
                        <span class="carousel-control-prev-icon"></span>
                        <span class="visually-hidden">Anterior</span>
                    </button>
                    <button class="carousel-control-next" type="button" data-bs-target="#carouselMain" data-bs-slide="next">
                        <span class="carousel-control-next-icon"></span>
                        <span class="visually-hidden">Próximo</span>
                    </button>
                </div>
                <hr class="mt-3">
            </div>

            <main class="flex-fill">
                <div class="container">
                    <div class="row">
                        <div class="col-12 col-md-5">
                            <form class="justify-content-center justify-content-md-start mb-3 mb-md-0">
                                <div class="input-group input-group-sm">
                                    <input type="text" class="form-control" placeholder="Digite aqui o que procura">
                                    <button class="btn btn-danger">Buscar</button>
                                </div>
                            </form>
                        </div>
                        <div class="col-12 col-md-7">
                            <div class="d-flex flex-row-reverse justify-content-center justify-content-md-start">
                                <form class="d-inline-block">
                                    <select class="form-select form-select-sm">
                                        <option>Ordenar pelo nome</option>
                                        <option>Ordenar pelo menor preço</option>
                                        <option>Ordenar pelo maior preço</option>
                                    </select>
                                </form>
                                <nav class="d-inline-block me-3">
                                    <ul class="pagination pagination-sm my-0">
                                        <li class="page-item">
                                            <a class="page-link" href="#">1</a>
                                        </li>
                                        <li class="page-item">
                                            <a class="page-link" href="#">2</a>
                                        </li>
                                        <li class="page-item disabled">
                                            <a class="page-link" href="#">3</a>
                                        </li>
                                        <li class="page-item">
                                            <a class="page-link" href="#">4</a>
                                        </li>
                                        <li class="page-item">
                                            <a class="page-link" href="#">5</a>
                                        </li>
                                        <li class="page-item">
                                            <a class="page-link" href="#">6</a>
                                        </li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                    </div>

                    <hr mt-3>

                    <sql:setDataSource var= "conexao" driver= "com.mysql.jdbc.Driver" url= "jdbc:mysql://saborearte.chwxs6wwh47k.us-east-1.rds.amazonaws.com/sys?useSSL=false" user= "admin"  password= "saborearteC*1" />

                    <sql:query dataSource = "${conexao}" var = "result">
                        SELECT * from produto;
                    </sql:query>   

                    <%! int index = 0; %>    
                            
                    <div class="organizacao">    
                        <div class="row g-6">
                            <c:forEach var = "row" items = "${result.rows}">
                                <div class="col-12 col-sm-6 col-md-4 col-lg-3 col-xl-2">
                                    <div class="card text-center bg-light">
                                        <a href="#" class="position-absolute end-0 p-2 text-danger">
                                            <i class="bi-suit-heart" style="font-size: 24px; line-height: 24px;"></i>
                                        </a>
                                        <div class="card-header">
                                            <span> R$ </span> <c:out value = "${row.valor}"/>
                                        </div>
                                        <div class="card-body">
                                            <h5 class="card-title"><c:out value = "${row.nome}"/></h5>
                                            <p class="card-text truncar-3l">
                                                <c:out value = "${row.descricao}"/>
                                            </p>
                                        </div>
                                        <div class="card-footer">
                                            <button class="btn btn-danger mt-2 d-block" data-nome="${row.nome}" data-descricao="${row.descricao}" data-valor="${row.valor}" onclick="openModal(true, this)" id="new"></i> Adicionar ao Carrinho </button>
                                            <small class="text-success">320,5kg em estoque</small>
                                        </div>
                                    </div>
                                </div>
                                            
                                <% index++; %>
                            </c:forEach>
                        </div>

                    </div>   
                </div>

                <hr class="mt-3">

                <div class="row pb-3">
                    <div class="col-12">
                        <div class="d-flex flex-row-reverse justify-content-center justify-content-md-start">
                            <form class="d-inline-block">
                                <select class="form-select form-select-sm">
                                    <option>Ordenar pelo nome</option>
                                    <option>Ordenar pelo menor preço</option>
                                    <option>Ordenar pelo maior preço</option>
                                </select>
                            </form>
                            <nav class="d-inline-block me-3">
                                <ul class="pagination pagination-sm my-0">
                                    <li class="page-item">
                                        <a class="page-link" href="#">1</a>
                                    </li>
                                    <li class="page-item">
                                        <a class="page-link" href="#">2</a>
                                    </li>
                                    <li class="page-item disabled">
                                        <a class="page-link" href="#">3</a>
                                    </li>
                                    <li class="page-item">
                                        <a class="page-link" href="#">4</a>
                                    </li>
                                    <li class="page-item">
                                        <a class="page-link" href="#">5</a>
                                    </li>
                                    <li class="page-item">
                                        <a class="page-link" href="#">6</a>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
        </div>
    </main>



    <footer class="border-top text-muted bg-light">
        <div class="container">
            <div class="row py-3">
                <div class="col-12 col-md-4 text-center">
                    &copy; 2022 - Sabor e Arte <br>
                </div>
                <div class="col-12 col-md-4 text-center">
                    <a href="/contato.jsp" class="text-decoration-none text-dark">
                        Contato pelo Site
                    </a><br>
                </div>
            </div>
        </div>
    </footer>

    <div class="modal-container">
        <div class="modal">
            <form method="post" action="pedidoServlet?op=a">
                <label for="m-nome-prato">Nome do Prato</label>
                <input id="m-nome-prato" name="nome" type="text" required />

                <label for="m-descricao">Características</label>
                <input id="m-descricao" name="descricao" type="text" required />

                <label for="m-valor">Valor</label>
                <input id="m-valor" name="valor" type="number" required />

                <input type="submit" value="Salvar" />
            </form>
        </div>
    </div>

    <script>
        const modal = document.querySelector('.modal-container')
        const tbody = document.querySelector('tbody')
        const sNome = document.querySelector('#m-nome-prato')
        const sDescricao = document.querySelector('#m-descricao')
        const sValor = document.querySelector('#m-valor')
        const btnSalvar = document.querySelector('#btnSalvo')

        let itens
        let id

        function openModal(edit = false, target) {
            modal.classList.add('active')

            modal.onclick = e => {
                if (e.target.className.indexOf('modal-container') !== -1) {
                    modal.classList.remove('active')
                }
            }

            if (edit) {
                sNome.value = target.getAttribute('data-nome')
                sValor.value = target.getAttribute('data-valor')
            } else {
                sNomePrato.value = ''
                sDescricao.value = ''
                sValor.value = ''
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
      <td>${item.nomeprato}</td>
      <td>${item.descricao}</td>
      <td>R$ ${item.valor}</td>
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

            if (sNomePrato.value == '' || sDescricao.value == '' || sValor.value == '') {
                return
            }

            e.preventDefault();

            if (id !== undefined) {
                itens[id].nomeprato = sNomePrato.value
                itens[id].descricao = sDescricao.value
                itens[id].valor = sValor.value
            } else {
                itens.push({'nome-prato': sNomePrato.value, 'descricao': sDescricao.value, 'valor': sValor.value})
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
    <script src="js/src/alert.js"></script>
    <script src="js/src/base-component.js"></script>
    <script src="js/src/button.js"></script><!-- comment -->
    <script src="js/src/collapse.js"></script><!-- comment -->
    <script src="js/src/dropdown.js"></script>
    <script src="js/src/modal.js"></script><!-- comment -->
    <script src="js/src/offcanvas.js"></script><!-- comment -->
    <script src="js/src/popover.js"></script><!-- comment -->
    <script src="js/src/scrollspy.js"></script>
    <script src="js/src/tab.js"></script><!-- comment -->
    <script src="js/src/toast.js"></script>
    <script src="js/src/tooltip.js"></script>



</body>

</html>