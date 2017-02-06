/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

public class Driver
{
	public static void main(String [] args)
	{
		Mahasiswa mhs1 = new Mahasiswa("Dani Agung",1301154646,4);
		Mahasiswa mhs2 = new Mahasiswa("Fefe",1301140255,4);
		
		mhs1.display();
		mhs2.display();
	}
}