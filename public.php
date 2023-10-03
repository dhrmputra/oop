<?php
class kendaraan{
    public $nama;

    public function start() {
        echo "Kendaraan dimulai";
    }
}

$mobil = new Kendaraan();
$mobil->nama = "Mobil ";
echo $mobil->nama;
$mobil->start();
?>