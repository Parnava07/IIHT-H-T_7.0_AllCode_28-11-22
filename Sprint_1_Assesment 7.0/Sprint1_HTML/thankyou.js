function mouseover(){
    document.getElementById("thanks").innerHTML ="Thanks!";
    setTimeout(() => {
        document.getElementById("thanks").innerHTML ="Thank You!";
    },1000);
}