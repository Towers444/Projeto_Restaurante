<%-- 
    Document   : carrinho
    Created on : 29 de nov de 2022, 09:24:42
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

    <link rel="stylesheet" href="dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="font/bootstrap-icons.css">
    <link rel="stylesheet" href="css/estilos.css">

    <title>Sabor e Arte - Carrinho de Compras</title>
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
                            <a class="nav-link text-white" href="index.jsp">Principal</a>
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
                            <li class="nav-item">
                                <span class="badge rounded-pill bg-light text-danger position-absolute ms-4 mt-0"
                                    title="5 produto(s) no carrinho"><small>5</small></span>
                                <a href="carrinho.jsp" class="nav-link text-white">
                                    <i class="bi-cart" style="font-size:24px;line-height:24px;"></i>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>

        <main class="flex-fill">
            <div class="container">
                <h1>Carrinho de Compras</h1>
                <ul class="list-group mb-3">
                    <li class="list-group-item py-3">
                        <div class="row g-3">
                            <div class="col-4 col-md-3 col-lg-2">
                                <a href="#">
                                    <img src="" class="img-thumbnail">
                                </a>
                            </div>
                            <div class="col-8 col-md-9 col-lg-7 col-xl-8 text-left align-self-center">
                                <h4>
                                    <b><a href="#" class="text-decoration-none text-danger">
                                            Lasanha a Bolonhesa</a></b>
                                </h4>
                                <h5>
                                    .
                                </h5>
                            </div>
                            <div
                                class="col-6 offset-6 col-sm-6 offset-sm-6 col-md-4 offset-md-8 col-lg-3 offset-lg-0 col-xl-2 align-self-center mt-3">
                                <div class="input-group">
                                    <button class="btn btn-outline-dark btn-sm" type="button">
                                        <i class="bi-caret-down" style="font-size: 16px; line-height: 16px;"></i>
                                    </button>
                                    <input type="text" class="form-control text-center border-dark" value="2">
                                    <button class="btn btn-outline-dark btn-sm" type="button">
                                        <i class="bi-caret-up" style="font-size: 16px; line-height: 16px;"></i>
                                    </button>
                                    <button class="btn btn-outline-danger border-dark btn-sm" type="button">
                                        <i class="bi-trash" style="font-size: 16px; line-height: 16px;"></i>
                                    </button>
                                </div>
                                <div class="text-end mt-2">
                                    <small class="text-secondary">Valor kg: R$ 3,99</small><br>
                                    <span class="text-dark">Valor Item: R$ 15,00</span>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="list-group-item py-3">
                        <div class="text-end">
                            <h4 class="text-dark mb-3">
                                Valor Total: R$ 30,00
                            </h4>
                            <a href="index.jsp" class="btn btn-outline-success btn-lg">
                                Continuar Comprando                            
                            </a>
                            <a href="fechamento_itens.jsp" class="btn btn-danger btn-lg ms-2 mt-xs-3">Fechar Compra</a>
                        </div>
                    </li>
                </ul>
            </div>
        </main>

        <footer class="border-top text-muted bg-light">
            <div class="container">
                <div class="row py-3">
                    <div class="col-12 col-md-4 text-center">
                        &copy; 2022 - Sabor e Arte
                    </div>
                    <div class="col-12 col-md-4 text-center">
                        <a href="contato.jsp" class="text-decoration-none text-dark">
                            Contato pelo Site
                        </a><br>
                        </a><br>
                        Telefone: <a href="phone:28999990000" class="text-decoration-none text-dark">
                            (31) 99999-0000
                        </a>
                    </div>
                </div>
            </div>
        </footer>
    </div>
      <script src="script/node_modules/bootstrap/js/src/alert.js"></script>
    <script src="script/node_modules/bootstrap/js/src/carousel.js"></script>
    <script src="script/node_modules/bootstrap/js/src/base-component.js"></script>
    <script src="script/node_modules/bootstrap/js/src/button.js"></script><!-- comment -->
    <script src="script/node_modules/bootstrap/js/src/collapse.js"></script><!-- comment -->
    <script src="script/node_modules/bootstrap/js/src/dropdown.js"></script>
    <script src="script/node_modules/bootstrap/js/src/modal.js"></script><!-- comment -->
    <script src="script/node_modules/bootstrap/js/src/offcanvas.js"></script><!-- comment -->
    <script src="script/node_modules/bootstrap/js/src/popover.js"></script><!-- comment -->
    <script src="script/node_modules/bootstrap/js/src/scrollspy.js"></script>
    <script src="script/node_modules/bootstrap/js/src/tab.js"></script><!-- comment -->
    <script src="script/node_modules/bootstrap/js/src/toast.js"></script>
    <script src="script/node_modules/bootstrap/js/src/tooltip.js"></script>
</body>

</html>