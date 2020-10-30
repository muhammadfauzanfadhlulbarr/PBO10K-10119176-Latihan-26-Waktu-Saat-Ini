import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Latihan17
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program : Waktu Saat Ini
 */
public class Latihan26 {
    public static void main(String[] args) {
        int detik, menit, jam, hari, tanggal, bulan, tahun;
        GregorianCalendar waktu = new GregorianCalendar();
        String nama_bulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        String nama_hari[] = {"Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        detik = waktu.get(Calendar.SECOND);
        menit = waktu.get(Calendar.MINUTE);
        jam =  waktu.get(Calendar.HOUR_OF_DAY);
        hari = waktu.get(Calendar.DAY_OF_WEEK);
        tanggal = waktu.get(Calendar.DAY_OF_MONTH);
        bulan = waktu.get(Calendar.MONTH);
        tahun = waktu.get(Calendar.YEAR);
        System.out.println("Hari ini adalah hari : "+nama_hari[hari]+", "+tanggal+" "+nama_bulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik);

    }
}

