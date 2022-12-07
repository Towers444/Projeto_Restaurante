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
                    <img src="img/slides/tendtudo.jpg" class="d-none d-md-block w-100" alt="" id="tendtudo">
            </div>

            <main class="flex-fill">
                <div class="container">
                    <p id="descricao">TendTudo</p>
                    <p>tendtudocefet@gmail.com</p>
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