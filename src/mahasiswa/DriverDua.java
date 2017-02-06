/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author Bismillah
 */
public class DriverDua
{
	public static void main(String[]args)
	{
		Mahasiswa mhs1 = new Mahasiswa("Dani",1301154646,4);
		Mahasiswa mhs2 = new Mahasiswa("Agung",1301140252,4);
		Mahasiswa mhs3 = new Mahasiswa("Prastiyo",1301140253,4);
		Mahasiswa mhs4 = new Mahasiswa("Sangat",1301140254,4);
		Mahasiswa mhs5 = new Mahasiswa("Pintar",1301140255,4);
		
		Dosen dos1 = new Dosen("Adlimatul",1301140256,5);
		dos1.addMahasiswaWali(mhs1);
		dos1.addMahasiswaWali(mhs2);
		dos1.addMahasiswaWali(mhs3);
		dos1.addMahasiswaWali(mhs4);
		dos1.addMahasiswaWali(mhs5);
		
		dos1.displayDosen();
		for(int i = 0; i < dos1.mhsWali.length; i++)
		{
			dos1.getMahasiswaWali(i).display();
		}
	}
}