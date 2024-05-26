public class Odunc_Kitap extends Kitap{
    private static boolean odunc_durumu = true;
    public Odunc_Kitap(String kitap_adi,String yazar){
        super(kitap_adi,yazar);

    }
    public static boolean odunc_mu()
    {
        return odunc_durumu;
    }

    public static void setOdunc_durumu(boolean odunc_durumu) {
    }
}
