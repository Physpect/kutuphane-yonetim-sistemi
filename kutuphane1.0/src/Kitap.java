public class Kitap {
    private String kitap_adi;
    private String yazar;



    public Kitap(String kitap_adi,String yazar)
    {
        this.kitap_adi = kitap_adi;
        this.yazar = yazar;


    }
    public String getKitap_adi()
    {
        return kitap_adi;
    }

    public String getYazar()
    {
        return yazar;
    }



}