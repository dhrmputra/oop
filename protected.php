<?php 
class Hewan {
    protected function tampilkanJenis(){
        return "Jenis Hewan " . $this->jenis;
    }
}

class Kucing extends Hewan {
    public function setJenis($jenis){
        $this->jenis = $jenis;
    }
    public function info(){
        echo $this->tampilkanJenis();
    }
}

$kucing = new Kucing();
$kucing->setJenis("Kucing Persia");
$kucing->info();
?>