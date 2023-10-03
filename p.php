<?php
class Animal
{
 function __construct(){
    echo "ini adalah isi method construct <br/>";
 }
 function getName(){
    return "Aku adalah Didok Rawr!";
 }
}
$Lion = new Animal();
echo $Lion->getName();
?>