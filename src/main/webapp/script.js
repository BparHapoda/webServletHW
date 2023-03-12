'use strict'

let table = document.getElementById("tableG");

document.getElementById("c").addEventListener("click", addToTable, true);
document.getElementById("^").addEventListener("click", addToTable, true);
document.getElementById("%").addEventListener("click", addToTable, true);
document.getElementById("/").addEventListener("click", addToTable, true);
document.getElementById("7").addEventListener("click", addToTable, true);
document.getElementById("8").addEventListener("click", addToTable, true);
document.getElementById("9").addEventListener("click", addToTable, true);
document.getElementById("*").addEventListener("click", addToTable, true);
document.getElementById("4").addEventListener("click", addToTable, true);
document.getElementById("5").addEventListener("click", addToTable, true);
document.getElementById("6").addEventListener("click", addToTable, true);
document.getElementById("-").addEventListener("click", addToTable, true);
document.getElementById("1").addEventListener("click", addToTable, true);
document.getElementById("2").addEventListener("click", addToTable, true);
document.getElementById("3").addEventListener("click", addToTable, true);
document.getElementById("+").addEventListener("click", addToTable, true);
document.getElementById("0").addEventListener("click", addToTable, true);
document.getElementById(",").addEventListener("click", addToTable, true);
document.getElementById("+/-").addEventListener("click", addToTable, true);


function addToTable(evt) {
    if (evt.target.value === 'c') {
        table.value = '0';
    } else {
        if (table.value === '0') {
            table.value = evt.target.value.toString();
        } else {
            table.value = table.value.toString() + evt.target.value.toString();

        }
    }
}