<%-- 
    Document   : cadastro
    Created on : 29 de nov de 2022, 09:23:14
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
    
    <title>Sabor e Arte - Cadastro</title>
</head>

<body style="min-width:372px;">
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
                <h1>Informe seus dados, por favor</h1>
                <hr>
                <form class="mt-3">
                    <div class="row">
                        <div class="col-sm-12 col-md-6">
                            <fieldset class="row gx-3">
                                <legend>Dados Pessoais</legend>
                                <div class="form-floating mb-3">
                                    <input class="form-control" type="text" id="txtNome" placeholder=" " autofocus />
                                    <label for="txtNome">Nome</label>
                                </div>
                                <div class="form-floating mb-3 col-md-6 col-xl-4">
                                    <input class="form-control" type="text" id="txtCPF" placeholder=" " />
                                    <label for="txtCPF">CPF</label>
                                </div>
                                <div class="form-floating mb-3 col-md-6 col-xl-4">
                                    <input class="form-control" type="date" id="txtDataNascimento" placeholder=" " />
                                    <label for="txtDataNascimento" class="d-inline d-sm-none d-md-inline d-lg-none">Data
                                        Nascimento</label>
                                    <label for="txtDataNascimento" class="d-none d-sm-inline d-md-none d-lg-inline">Data
                                        de Nascimento</label>
                                </div>
                            </fieldset>
                            <fieldset>
                                <legend>Contatos</legend>
                                <div class="form-floating mb-3 col-md-8">
                                    <input class="form-control" type="email" id="txtEmail" placeholder=" " />
                                    <label for="txtEmail">E-mail</label>
                                </div>
                                <div class="form-floating mb-3 col-md-6">
                                    <input class="form-control" placeholder=" " type="text" id="txtTelefone" />
                                    <label for="txtTelefone">Telefone</label>
                                </div>
                            </fieldset>
                        </div>
                        <div class="col-sm-12 col-md-6">
                            <fieldset class="row gx-3">
                                <legend>Endereço</legend>
                                <div class="form-floating mb-3 col-md-6 col-lg-4">
                                    <input class="form-control" type="text" id="txtCEP" placeholder=" " />
                                    <label for="txtCEP">CEP</label>
                                </div>
                                <div class="mb-3 col-md-6 col-lg-8 align-self-end">
                                    <textarea class="form-control text-muted bg-light"
                                        style="height: 58px; font-size: 14px;"
                                        disabled>Digite o CEP para buscarmos o endereço.</textarea>
                                </div>
                                <div class="clearfix"></div>
                                <div class="form-floating mb-3 col-md-4">
                                    <input class="form-control" type="text" id="txtNumero" placeholder=" " />
                                    <label for="txtNumero">Número</label>
                                </div>
                                <div class="form-floating mb-3 col-md-8">
                                    <input class="form-control" type="text" id="txtComplemento" placeholder=" " />
                                    <label for="txtComplemento">Complemento</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input class="form-control" type="text" id="txtReferencia" placeholder=" " />
                                    <label for="txtReferencia">Referência</label>
                                </div>
                            </fieldset>
                            <fieldset class="row gx-3">
                                <legend>Senha de Acesso</legend>
                                <div class="form-floating mb-3 col-lg-6">
                                    <input class="form-control" type="password" id="txtSenha" placeholder=" " />
                                    <label for="txtSenha">Senha</label>
                                </div>
                                <div class="form-floating mb-3 col-lg-6">
                                    <input class="form-control" id="txtConfirmacaoSenha" placeholder=" " />
                                    <label class="form-label" for="txtConfirmacaoSenha">Confirmação da Senha</label>
                                </div>
                            </fieldset>
                        </div>
                    </div>
                    <hr />
                    <div class="form-check mb-3">
                        <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                        <label class="form-check-label" for="flexCheckDefault">
                            Desejo receber informações sobre promoções.
                        </label>
                    </div>
                    <div class="mb-3 text-left">
                        <a class="btn btn-lg btn-light btn-outline-danger" href="/">Cancelar</a>
                        <input type="button" value="Criar meu cadastro" class="btn btn-lg btn-danger"
                            onclick="window.location.href='confirmarcadastro.jsp'" />
                    </div>
                </form>
            </div>
        </main>

        <footer class="border-top text-muted bg-light">
            <div class="container">
                <div class="row py-3">
                    <div class="col-12 col-md-4 text-center text-md-left">
                        &copy; 2022 - Sabor e Arte
                    </div>
                    <div class="col-12 col-md-4 text-center text-md-right">
                        <a href="contato.jsp" class="text-decoration-none text-dark">Contato pelo site</a><br>
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