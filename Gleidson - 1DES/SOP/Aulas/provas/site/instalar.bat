echo off
echo Criando a pasta "instala_site"
md instala_site
echo Acessando a pasta "instala_site"
cd instala_site
echo Criando as subpastas "imagens,paginas"
md imagens
md paginas
cd paginas
echo > pagina1.html
echo > pagina2.html
echo > pagina3.html
cd..
echo > index.html
cd..
cd conteudos
copy index.html ..\instala_site\index.html
copy pagina1.html ..\instala_site\paginas\pagina1.html
copy pagina2.html ..\instala_site\paginas\pagina2.html
copy pagina3.html ..\instala_site\paginas\pagina3.html
copy contato.png ..\instala_site\imagens
copy contato_ativo.png ..\instala_site\imagens
copy principal.png ..\instala_site\imagens
copy principal_ativo.png ..\instala_site\imagens
copy conteudo_ativo.png ..\instala_site\imagens
copy conteudo.png ..\instala_site\imagens







