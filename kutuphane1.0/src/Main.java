import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Kutuphane kutuphane = new Kutuphane();
        Kitap kitap1 = new Kitap("Tutunamayanlar","Oguz Atay");
        Kitap kitap2 = new Kitap("Kozmos","Carl Sagan");
        Kitap kitap3 = new Kitap("Simyaci", "Paulo Coelho");
        kutuphane.kitap_ekle(kitap1);
        kutuphane.kitap_ekle(kitap2);
        kutuphane.kitap_ekle(kitap3);
        Scanner s = new Scanner(System.in);
        while (true)
        {
            System.out.println("kitap ekle (1 e bas)");
            System.out.println("kitap ara (2 ye bas)");
            System.out.println("kitap odunc al (3 e bas)");
            System.out.println("kitabi geri ver (4 e bas)");
            System.out.println("cikis (5 e bas)");
            int secim = s.nextInt();
            s.nextLine();
            switch (secim)
            {
                case 1 :
                    System.out.println("kitap adi : ");
                    String kitap_adi = s.nextLine();
                    System.out.println("yazar : ");
                    String yazar = s.nextLine();
                    kutuphane.kitap_ekle(new Kitap(kitap_adi,yazar));
                    System.out.println("kitap basariyla eklendi : " + kitap_adi + "," + yazar);
                    break;
                case 2 :
                    System.out.println("kitap adi : ");
                    kitap_adi = s.nextLine();
                    System.out.println("kitabiniz bulundu : "+ kutuphane.kitap_ara(kitap_adi).getKitap_adi() + "," + kutuphane.kitap_ara(kitap_adi).getYazar());
                    break;
                case 3:
                    System.out.println("kitap adi : ");
                    kitap_adi = s.nextLine();
                    System.out.println("adiniz : ");
                    String ad = s.nextLine();
                    System.out.println("soyadiniz : ");
                    String soyad = s.nextLine();
                    kutuphane.kitap_odunc_al(kitap_adi,kutuphane.uye_ekle(new Uye_Sistemi(ad, soyad)));
                    if(kutuphane.kitap_odunc_al(kitap_adi,kutuphane.uye_ekle(new Uye_Sistemi(ad, soyad))))
                        System.out.println("kitap odunc verildi. " + Uye_Sistemi.getAd() +" " + Uye_Sistemi.getSoyad());
                    else System.out.println("kitap odunc verilemedi.");
                    break;
                case 4:
                    System.out.println("kitap adi? : ");
                    kitap_adi = s.nextLine();
                    System.out.println("kac gun gecikti? : ");
                    int geciken_gun = s.nextInt();
                    kutuphane.kitap_teslim_et(kitap_adi);
                    if(kutuphane.gecikme_ucreti_hesapla(geciken_gun)>0)
                    {
                        System.out.println("kitap alindi fakat " + kutuphane.gecikme_ucreti_hesapla(geciken_gun) + " odemeniz var");
                    }else System.out.println("odemeniz yok tesekkurler");
                    break;
                case 5 :
                    s.close();
                    System.out.println("cikis yapiliyor...");
                    System.exit(0);
                default:
                    System.out.println("gecersiz secim.");
            }
        }
    }
}