package Employe;
public class CleaningService extends Employee{
    String name;
    String status, job;
    int nip;
    int gaji;
    int bonus;
    int potongan;
    int waktuKerja;
    int totalGaji;
    
public void name(){
          System.out.println("Nama Pekerja : " +name);
      }
      public void status(){
          System.out.println("Status Pekerja : " +status);
      }
      public void job(){
          System.out.println("Job Pekerja : " +job);
      }
      public void nip(){
          System.out.println("NIP Pekerja : " +nip);
      }
      public void gaji(){
          System.out.println("Gaji Pekerja : " +gaji);
      }
      public void bonus(){
          System.out.println("Bonus Pekerja : " +bonus);
      }
      public void potongan(){
          System.out.println("Potongan gaji Pekerja : " +potongan);
      }
      public void waktuKerja(){
          System.out.println("Waktu Kerja : " +waktuKerja+ " jam");
      }
      public void totalGaji(){
          int totalGaji = gaji+bonus;
          System.out.println("Total gaji Pekerja : " +totalGaji);
      }
    
    
}
