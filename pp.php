<?php
class Animal
{
 function __construct(){
 echo "ini adalah isi method construct <br/>";
}
function __destruct() {
echo "ini adalah isi method destruct <br/>";
}
function getName(){
return "Aku adalah Didok Rawr! <br />";
}
}
$Lion = new Animal();
echo $Lion->getName();