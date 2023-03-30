package Employe;
public class Main {
    public static void main(String[] args) {
        System.out.println("Data Pekerja Kantor Delics\n===========================");
       Employee em = new Employee();
       
       CleaningService cs = new CleaningService();
       cs.job = "Cleaning Service";
       cs.name = "Malsac";
       cs.status = "Sudah Menikah";
       cs.nip = 98230;
       cs.gaji = 1700000;
       cs.bonus = 0;
       cs.potongan = 400000;
       cs.waktuKerja = 9;
       cs.totalGaji = (cs.gaji+cs.bonus)-cs.potongan;
       
       System.out.println("Pekerja 1");
       cs.job();
       cs.name();
       cs.status();
       cs.nip();
       cs.gaji();
       cs.bonus();
       cs.potongan();
       cs.waktuKerja();
       cs.totalGaji();
       System.out.println();
       
       Manager mgr = new Manager();
       mgr.job = "Manager";
       mgr.name = "Metawin";
       mgr.status = "Kuliah sms 6";
       mgr.nip = 63478;
       mgr.gaji = 2300000;
       mgr.bonus = 200000;
       mgr.potongan = 0;
       mgr.waktuKerja = 12;
       mgr.totalGaji = (mgr.gaji+mgr.bonus)-mgr.potongan;
       
       System.out.println("Pekerja 2");
       mgr.job();
       mgr.name();
       mgr.status();
       mgr.nip();
       mgr.gaji();
       mgr.bonus();
       mgr.potongan();
       mgr.waktuKerja();
       mgr.totalGaji();
       System.out.println();
       
       Bos bs = new Bos();
       bs.job = "Bos";
       bs.name = "Bright";
       bs.status = "Belum Menikah";
       bs.nip = 78124;
       bs.gaji = 3000000+(3000000*95/100);
       bs.bonus = 0;
       bs.potongan = 400000;
       bs.waktuKerja = 7;
       bs.totalGaji = (bs.gaji+bs.bonus)-bs.potongan;
       
       System.out.println("Pekerja 3");
       bs.job();
       bs.name();
       bs.status();
       bs.nip();
       bs.gaji();
       bs.bonus();
       bs.potongan();
       bs.waktuKerja();
       bs.totalGaji();
       
       System.out.println("===========================\nData Pekerja Kantor Delics Selesai");
       
       
       
               
               
              
    
    
    }
    
    
}
