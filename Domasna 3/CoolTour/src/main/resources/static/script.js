

function changeBackground(a){
    switch(a){
        case "site": document.getElementById("bg").style.backgroundImage = "url('/default.png')"; break;
        case "aircraft": document.getElementById("bg").style.backgroundImage = "url('/aircraft.jpg')"; break;
        case "archeological_site": document.getElementById("bg").style.backgroundImage = "url('/archeological_site.png')"; break;
        case "battlefield": document.getElementById("bg").style.backgroundImage = "url('/battlefields.png')"; break;
        case "boundary_stone": document.getElementById("bg").style.backgroundImage = "url('/boundary_stone.jpg')"; break;
        case "castle": document.getElementById("bg").style.backgroundImage = "url('/castle.jpg')"; break;
        case "church": document.getElementById("bg").style.backgroundImage = "url('/church.jpg')"; break;
        case "city_gate": document.getElementById("bg").style.backgroundImage = "url('/city_port.jpg')"; break;
        case "memorial": document.getElementById("bg").style.backgroundImage = "url('/memorial.png')"; break;
        case "monastery": document.getElementById("bg").style.backgroundImage = "url('/monastery.png')"; break;
        case "monument": document.getElementById("bg").style.backgroundImage = "url('/monument.png')"; break;

    }
}

function Search(){
    changeBackground(document.getElementById("category").value);
}



