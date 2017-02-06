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
public class Dosen
{
	private String nama;
	private long nip;
	Mahasiswa mhsWali[];
	
	public Dosen(String nama, long nip, int banyak)
	{
		this.nama = nama;
		this.nip = nip;
		this.mhsWali = new Mahasiswa[banyak];
	}
	
	public void addMahasiswaWali(Mahasiswa mhs)
	{
		int x = 0;
		while(mhsWali[x] != null)
		{
			x++;
		}
		if(x <= mhsWali.length-1)
		{
			mhsWali[x] = mhs;
		}
		else
			System.out.println("Penuh!");
	}
	
	public void displayDosen()
	{
		System.out.println("Dosen " + nama + " dengan NIP " + nip + " memiliki " + mhsWali.length + " Mahasiswa Wali");
	}
	
	public Mahasiswa getMahasiswaWali(int i)
	{
		return mhsWali[i];
	}
	
}