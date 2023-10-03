<?php
class Mobil {
    private $kecepatan = 0;

    private function tampilkanKecepatan(){
        return "Kecepatan " . $this->kecepatan. "km/jam";
    }
    private function tambahKecepatan($nilai) {
        $this->kecepatan += $nilai;
        echo $this->tampilkanKecepatan();
    }
}

class Contoh{
    private function privateMethod(){
            echo "Ini adalah private method";
        }
    public function publicMethod(){
            $this->privaeMethod();
        }
    }
$mobil = new Mobil();
$mobil->tambahKecepatan(50);
echo $mobil->tampilkanKecepatan();

$contoh = new Contoh();
$contoh->publicMethod();

?>