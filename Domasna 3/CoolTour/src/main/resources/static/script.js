
function Search(){
    changeBackground(document.getElementById("category").value);
}
function changeBackground(a){

    switch(a){
        case "default": document.getElementById("bg").style.backgroundImage = "url('/static/default.png')"; break;
        case "aircraft": document.getElementById("bg").style.backgroundImage = "url('/static/aircraft.jpg')"; break;
        case "archeological_site": document.getElementById("bg").style.backgroundImage = "url('/static/archeological_site.png')"; break;
        case "battlefield": document.getElementById("bg").style.backgroundImage = "url('/static/battlefields.png')"; break;
        case "boundary_stone": document.getElementById("bg").style.backgroundImage = "url('/static/boundary_stone.jpg')"; break;
        case "castle": document.getElementById("bg").style.backgroundImage = "url('/static/castle.jpg')"; break;
        case "church": document.getElementById("bg").style.backgroundImage = "url('/static/church.jpg')"; break;
        case "city_gate": document.getElementById("bg").style.backgroundImage = "url('/static/city_port.jpg')"; break;
        case "memorial": document.getElementById("bg").style.backgroundImage = "url('/static/memorial.png')"; break;
        case "monastery": document.getElementById("bg").style.backgroundImage = "url('/static/monastery.png')"; break;
        case "monument": document.getElementById("bg").style.backgroundImage = "url('/static/monument.png')"; break;
    }
}


function Animacija(){

    var d=document.getElementById('object');
    d.style.backgroundColor="rgba(0, 0, 0, 0)";


    var opacity=0;
    function AddOpacity(){
       opacity=opacity+0.05;
       d.style.border="solid 1px";
        d.style.borderColor=`rgba(0,0,0,${opacity})`;
        d.style.backgroundColor=`rgba(255,255,255,${opacity})`;
        var c = d.childNodes;
        for(let i=0;i<c.length;i++){
            c[i].style.color=`rgba(0,0,0,${opacity})`;
            c[i].style.backgroundColor=`rgba(240, 255, 254 ,${opacity})`;
            c[i].style.border="solid 1px";
            c[i].style.borderColor=`rgba(0,0,0,${opacity})`;
        }
        if(opacity>=0.85){

            var c = d.childNodes;
            for(let i=0;i<c.length;i++){

                c[i].style.color=`rgba(0,0,0,1)`;

            }
            clearInterval(ID);
        }
    }

   var ID=setInterval(AddOpacity,35);

}


