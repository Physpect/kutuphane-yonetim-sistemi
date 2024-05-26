import java.util.ArrayList;
public class Kutuphane {
    private ArrayList<Kitap> kitaplar;
    private ArrayList<Uye_Sistemi> uyeler;
    public Kutuphane(){
        kitaplar = new ArrayList<>();
        uyeler = new ArrayList<>();
    }
    public void kitap_ekle(Kitap kitap){
        kitaplar.add(kitap);
    }
    public Uye_Sistemi uye_ekle(Uye_Sistemi uye){
        uyeler.add(uye);
        return uye;
    }
    public Kitap kitap_ara(String kitap_adi){
        for(Kitap kitap : kitaplar){
            if (kitap.getKitap_adi().equalsIgnoreCase(kitap_adi)){
                return kitap;
            }
        }
        return null ;
    }
    public boolean kitap_odunc_al(String kitap_adi,Uye_Sistemi uye){
        Kitap kitap = kitap_ara(kitap_adi);
        if(kitap != null && Odunc_Kitap.odunc_mu()){
            Odunc_Kitap.setOdunc_durumu(false);
            return true;
        }
        else {
        return false;}
    }
    public boolean kitap_teslim_et(String kitap_adi){
        Kitap kitap = kitap_ara(kitap_adi);
        if (kitap != null && Odunc_Kitap.odunc_mu()){
            Odunc_Kitap.setOdunc_durumu(true);
            return true;
        }
        return false;
    }
    public double gecikme_ucreti_hesapla(int geciken_gun)
    {
        if(geciken_gun > 7)
        {
            return geciken_gun * 1.5;
        }
        return 0.0;
    }
}
