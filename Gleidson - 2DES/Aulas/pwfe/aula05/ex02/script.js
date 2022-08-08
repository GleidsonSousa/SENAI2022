var carrinho = [{
    "img": "https://bestchineseproducts.com/wp-content/uploads/2019/07/Nike-Walking-shoes.png",
    "nome": "Tênis NayKue Airton Jordão", 
    "qntd":2
    },
    {
    "img": "https://img.ifunny.co/images/53e408fa3628e6509c9f51de01fa11c16f43f4167b7beece03b6bf35eea9206f_1.jpg",
    "nome": "Chinelo pimenta da Ardidas 3 riscos", 
    "qntd":4
    },   
    {
        "img": "https://ae01.alicdn.com/kf/HTB13IDMKh1YBuNjy1zcq6zNcXXaY/Shorts-dos-homens-bermuda-2018-ver-o-praia-shorts-homem-pumba-carta-impress-o-masculina-marca.jpg_Q90.jpg_.webp",
        "nome": "Bermuda Pumba panteira 'negra'", 
        "qntd":1
        },
        
        {
            "img": "https://img.elo7.com.br/product/main/243C95B/camisa-jacare-jacare.jpg",
            "nome": "Camisa del laCosta", 
            "qntd":6
            }  

];

var itemCarrinho = document.querySelector(".item-carrinho");
function carregar(){
       
        carrinho.forEach(item =>{
            let novoItem =  itemCarrinho.cloneNode(true);

            novoItem.classList.remove("modelo");

        novoItem.querySelector("#img-item").src = item.img;
        novoItem.querySelector("#nome-item").innerHTML = item.nome;
        novoItem.querySelector("#qntd-item").value = item.qntd;

            document.querySelector(".carrinho").appendChild(novoItem);       
        });
}

function removerItem(e) {
    e.parentNode.remove();
}