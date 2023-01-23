let pokemons = [];
const cardPoke = document.getElementById("cardPoke");
const url = "https://pokeapi.co/api/v2/pokemon";
const pokemon_num = 151; 
const search = document.getElementById("search");
const form = document.getElementById("form");

const listaPokemons =  async () => {
    
    for ( let i = 1; i <= pokemon_num; i++){
        await getAllPokemon(i);
    }
    pokemons.forEach((pokemon) => createPokemoncard(pokemon));
    };

const removaPokemon = () => {
    const pokemonsEls = document.getElementsByClassName("pokemon");
    let removPokemon = [];
    
    for (let i = 0; i < pokemonsEls.length; i++){
        const pokemonEl = pokemonsEls[i];
        removPokemon = [...removPokemon,pokemonEl];
    }
    removPokemon.forEach((remPoke) => remPoke.remove());
}  

const getPokemon = async (id)  => {
    const searchPokemons = pokemons.filter((poke) => poke.name === id );
    removaPokemon();
    searchPokemons.forEach((pokemon) =>  createPokemoncard(pokemon));
}

const getAllPokemon = async (id) => {
    const res = await  fetch(`${url}/${id}`);
    const pokemon =  await res.json();
    pokemons = [...pokemons,pokemon];
}

listaPokemons();

function  createPokemoncard(pokemon){
    const pokemonEl = document.createElement("div")
    pokemonEl.classList.add("pokemon");
    const poke_types = pokemon.types.map((el) =>  el.type.name).slice(0,1);
    const name  = pokemon.name[0].toUpperCase() +  pokemon.name.slice(1);
    const poke_stat = pokemon.stats.map((el) => el.stat.name);
    const stats = poke_stat.slice(0,3);
    const base_value  = pokemon.stats.map((el) => el.base_stat)
    const base_stat = base_value.slice(0,3);
    const stat = stats.map((stat) => {
        return `<li class="names" >${stat}</li>`;
    }).join("");
    const base = base_stat.map((base) => {
        return `<li class="base" >${base}</li>`;
    }).join("");
    const pokeInnerHTML = `<div class="img-conteiner">
    <img  id="pokemons" src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${pokemon.id}.png" alt="${name}"/>
    </div>
    <div class="info">
    <span class="number">#${pokemon.id.toString().padStart(3, "0")}</span>
    <h3 class="name">${name}</h3>
    <small class="type"><span>${poke_types}</span></small>
    </div>
    <div class="stats">
    <h2>Status</h2>
    <div class="flex">
    <ul>${stat}</ul>
    <ul>${base}</ul>
    </div>
    </div>`;
    pokemonEl.innerHTML = pokeInnerHTML;
    cardPoke.appendChild(pokemonEl);
}

form.addEventListener("submit", (e) => {
    e.preventDefault();
    const searchItem = search.Value;
    if(searchItem){
        getPokemon(searchItem);
        search.value = "";
    } else if( searchItem === ""){
        pokemons =[];
        removaPokemon();
        listaPokemons();
    }
});