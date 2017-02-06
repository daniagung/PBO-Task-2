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
public class Mahasiswa
{
	private String nama;
	private long nim;
	private double ipk;
	
	public Mahasiswa(String nama, long nim, double ipk)
	{
		this.nama = nama;
		this.nim = nim;
		this.ipk = ipk;
	}
	
	public void display()
	{
		System.out.println("Mahasiswa bernama " + nama + " dengan NIM " + nim + " memiliki IPK " + ipk + ".");
	}
}
