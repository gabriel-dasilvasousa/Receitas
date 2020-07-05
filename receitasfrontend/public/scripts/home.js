const buttonSearch = document.querySelector("a.search");
const modal = document.querySelector("#modal");
const fechar = document.querySelector("#modal .header a");

buttonSearch.addEventListener("click", () => {
    modal.classList.toggle("hide");
});

fechar.addEventListener("click", () => {
    modal.classList.toggle("hide");
});