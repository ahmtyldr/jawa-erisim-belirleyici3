public class örnek {

 protected int kasa = 123;//burda protected erişim belirleyici kullandık
                          // ama diyelimki herkezin erişmesini istemiyoruz
    
    public int getKasa() {
        return kasa;
    }

    public void setKasa(int kasa) { //o zaman burdaki gibi setter methodunun içine if koşulu
                                    //yazarak bu erişim belirleyiciye herkezin erişmesini
        if (kasa==123) {           //engellemiş oluruz
            System.out.println("kasaya eriştiniz");
        }
        else{System.out.println("erişiminiz engellendi");}
        this.kasa = kasa;
    }
    

} 

