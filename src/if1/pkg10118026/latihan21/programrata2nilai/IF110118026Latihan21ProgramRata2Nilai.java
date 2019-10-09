
package if1.pkg10118026.latihan21.programrata2nilai;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deskripsi Program	: menghitung rata2 nilai mhs
 */
public class IF110118026Latihan21ProgramRata2Nilai {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Scanner scanner = new Scanner(System.in);
		System.out.print("maukan jumlah Mahasiswa : ");
                
		int jmlMHS = scanner.nextInt();
		double rataMHS = 0;
                
		for( int i = 0; i < jmlMHS; i++){
			System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
			rataMHS += scanner.nextInt();
		}
		rataMHS /= jmlMHS;
		System.out.println("Maka, Rata-rata Nilainya adalah " + rataMHS);
                System.out.println("Developed by : Riski Dwi Sabariyanto");
	}

	
}
