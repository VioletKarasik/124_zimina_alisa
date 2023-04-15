function test(a,b)
{
    return a+b;
}
function test23(a,b)
{
    return a-b;
}

function leftclicked(initmargin)
{
    console.log('left click');
    var d = document.getElementById('move');
    d.style='margin: 0 0 0 '+inital+' ;';
    inital = inital - 10;
}
let margleft = 10;
let margtop = 10;
function getRand(min,max)
{
    var randomNumber = Math.floor(Math.random() * max) + min;
    return randomNumber;
}
function clickright()
{
    var divr = document.getElementById('moving');
    let numb = Math.random();
    divr.style='margin:'+margtop+' 0 0 '+margleft+';';
    margleft = margleft + getRand(10,30);
}
function clickleft()
{
    var divr = document.getElementById('moving');
    
    divr.style='margin:'+margtop+' 0 0 '+margleft+';';
    margleft = margleft - getRand(15,35);
}
function clickup()
{
    var divr = document.getElementById('moving');
    
    divr.style='margin:'+margtop+' 0 0 '+margleft+';';
    margtop = margtop - getRand(25,35);
}
function clickdown()
{
    var divr = document.getElementById('moving');
    divr.style='margin:'+margtop+' 0 0 '+margleft+';';
    //divr.margtop=margtop;
    margtop = margtop + getRand(20,40);
}
a=5;
console.log(a);
b='99';
console.log(b);
let c = test(a,b);
let d = test23(a,b);
console.log(c);
console.log(d);
//print(test(a,b));