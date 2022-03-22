<h2>Projeto Meu Blog - ALPHA =V0.01</h2>
<div align="center">
    <img src="frontend/blog/src/assent/Video_Apresentacao.gif" width="800" height="450">
</div>

<p><br>
Primeiramente esse projeto é criado com objetivo de usar as tecnologias Java e Node.js em conjunto.
</p><br>

<p>
De inicio foi gerado o arquivo json usando:
</p>

```shell script
npm init -y
```
```shell script
npm i json-server
```
<h3>SPA(Single-Page Application) Angular</h3>
Seguindo o projeto, foi criado na parte de frontEnd usando angular algumas pastas: contato, feed, footer, home e navbar com o comando:

```shell script
ng g c (nome da pasta para criar)
```
<h2>Outras instalações no frontend:</h2>

```shell script
npm i bootstarp
```
```shell script
npm i jquery@~3.4.1
```
```shell script
npm i popper.js
```
```shell script
ng add @fortawesome/angular-fontawesome
```
<p>Instalar as 3 opções: free Solid icons, Free Regular Icons e Free brands Icons.</p><br>

<h2>Configurar na pasta angular.json</h2>

```shell script
            "styles": [
              "src/styles.css",
              "./node_modules/bootstrap/dist/css/bootstrap.min.css"
            ],
            "scripts": [
              "./node_modules/jquery/dist/jquery.js",
              "./node_modules/bootstrap/dist/js/bootstrap.js",
              "./node_modules/popper.js/dist/umd/popper.min.js"
            ]
          },
```