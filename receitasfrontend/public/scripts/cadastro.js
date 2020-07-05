const listLi = document.querySelectorAll('li');

for(li of listLi){
    li.addEventListener('click', clickHandle);
}



function clickHandle(event){

    const itemClicado = event.target;

    for(li of listLi){
        if(li.classList.contains('selected')){
            li.classList.remove('selected');    
        }
    }
    
    itemClicado.classList.toggle('selected');
}
