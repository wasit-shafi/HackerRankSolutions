document.getElementById('btn0').addEventListener('click', write);
document.getElementById('btn1').addEventListener('click', write);
document.getElementById('btnSum').addEventListener('click', write);
document.getElementById('btnSub').addEventListener('click', write);
document.getElementById('btnMul').addEventListener('click', write);
document.getElementById('btnDiv').addEventListener('click', write);
document.getElementById('btnClr').addEventListener('click', clear);
document.getElementById('btnEql').addEventListener('click', equalTo);

function write(e)
{
    let btn = e.target || e.srcElement;    
    
    div = document.getElementById('res');
    div.innerHTML = document.getElementById(btn.id).innerHTML + div.innerHTML;
}

function clear()
{
    document.getElementById('res').innerHTML = '';
}

function equalTo()
{
    result = getResult();
    clear();
    document.getElementById('res').innerHTML = result;
}

function getResult()
{
    let op1 = "";
    let opr = "";
    let op2 = "";
    let ans = '';

    let text = document.getElementById('res').innerHTML;
    let i = 0;
    while(text.charAt(i) == '0' || text.charAt(i) == '1') op1 = op1 + text.charAt(i++);
    opr = text.charAt(i);
    while(i < text.length) op2 = op2 + text.charAt(i++);

    
    switch(opr)
    {
        case '+' : ans = intToBinary(binaryToInt(op1) + binaryToInt(op2)); break;
        case '-' : ans = intToBinary(binaryToInt(op1) - binaryToInt(op2)); break;
        case '*' : ans = intToBinary(binaryToInt(op1) * binaryToInt(op2)); break;
        case '/' : ans = intToBinary(binaryToInt(op1) / binaryToInt(op2)); break;
    }
    return ans;
}

function binaryToInt(binaryString)
{
    let num = 0;
    let powerOfTwo = 1;
    for(let i = binaryString.length - 1; i >= 0 ; i--)
    {
        if(binaryString.charAt(i) == '1') num += powerOfTwo;
        powerOfTwo = powerOfTwo * 2;
    }
    return num;
}

function intToBinary(num)
{
    let binary = '';
    while(num != 0)
    {
        binary = (num %  2) + binary;
        num = parseInt(num / 2);
    }
    return binary;
}