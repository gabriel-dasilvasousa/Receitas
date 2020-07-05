const cards = document.querySelectorAll("div.card");
const modal = document.querySelector("#modal");
const fechar = document.querySelector("#modal .header span a");

for(card of cards){
    card.addEventListener("click", () => {
        modal.classList.toggle("hide");
    });
}

fechar.addEventListener("click", () => modal.classList.toggle("hide"));
