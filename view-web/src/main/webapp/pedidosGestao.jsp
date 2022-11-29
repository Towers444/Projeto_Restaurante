<%-- 
    Document   : pedidosGestao
    Created on : 29 de nov de 2022, 09:44:16
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

    <title>Sabor e Arte - Página Principal</title>
</head>

<main class="flex-fill">
    <div class="container">

    </div>
</main>

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
<script src="/node_modules/bootstrap/dist/js/bootstrap.bundle.min.js"></script></body>