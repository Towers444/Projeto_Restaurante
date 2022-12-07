

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

        <title>Sabor e Arte - Página Gestão</title>
        <style>
            p {
                font-style: italic;
                font-size: small;
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
                                <a class="nav-link text-white" href="gestao.jsp">Principal</a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link text-white" href="gerenciarCardapio.jsp">Cardápio</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="gerenciarestoque.jsp">Estoque</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="gerenciarfuncionario.jsp">Funcionários</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="pedidosGestao.jsp">Pedidos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link text-white" href="fornecedores.jsp">Fornecedores</a>
                            </li>
                        </ul>
                        <div class="align-self-end">
                            <ul class="navbar-nav">
                                <li class="nav-item">
                                    <a href="index.jsp" class="nav-link text-white">Visualizar como cliente</a>
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
                    <p id="descricao">Seja bem vindo ao Sistema Sabor e Arte, um projeto para a administração de restaurantes. 
                        Essa sessão é dedicada a gestão do sistema e nela você pode encontrar funções como o gerenciamento
                        de cardápio, o gerenciamento de pedidos, gerenciamento de estoque e uma página de créditos dos 
                        desenvolvedores do projeto.</p>
                </div>
            </main>



            <footer class="border-top text-muted bg-light">
                <div class="container">
                    <div class="row py-3">
                        <div class="col-12 col-md-4 text-center">
                            &copy; 2022 - Sabor e Arte <br>
                        </div>
                        <div class="col-12 col-md-4 text-center">
                            <a href="contato.jsp" class="text-decoration-none text-dark">
                                Contato pelo Site
                            </a><br>

                        </div>
                    </div>
                </div>
            </footer>
        </div>
        <script src="/node_modules/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
    </body>

</html>