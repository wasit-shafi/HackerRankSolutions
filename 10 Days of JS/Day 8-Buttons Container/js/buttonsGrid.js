function rotateClockWise()
{
    let temp = document.getElementById("btn1").innerHTML;
    document.getElementById("btn1").innerHTML = document.getElementById("btn4").innerHTML;
    document.getElementById("btn4").innerHTML = document.getElementById("btn7").innerHTML;
    document.getElementById("btn7").innerHTML = document.getElementById("btn8").innerHTML;
    document.getElementById("btn8").innerHTML = document.getElementById("btn9").innerHTML;
    document.getElementById("btn9").innerHTML = document.getElementById("btn6").innerHTML;
    document.getElementById("btn6").innerHTML = document.getElementById("btn3").innerHTML;
    document.getElementById("btn3").innerHTML = document.getElementById("btn2").innerHTML;
    document.getElementById("btn2").innerHTML = temp;
}