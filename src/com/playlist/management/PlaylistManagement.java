package com.playlist.management;

import java.util.LinkedList;
import java.util.List;

import com.playlist.management.Album;
import com.playlist.management.Tracks;
import com.playlist.management.Artist;

public class PlaylistManagement {

	// Main classs for run project
	public static void main(String[] args) {
		
		// 
		List<Artist> listArtists = new LinkedList<Artist>();
		
		Artist vanda = new Artist();
		vanda.setId(1);
		vanda.setName("Mam Vanda");
		vanda.setGender('M');
		vanda.setAge(25);
		listArtists.add(vanda);
		
		Artist gdevin = new Artist();
		gdevin.setId(2);
		gdevin.setName("G Davit");
		gdevin.setGender('M');
		gdevin.setAge(29);
		listArtists.add(gdevin);
		
		Artist vitu = new Artist();
		vitu.setId(3);
		vitu.setName("Vin Vitu");
		vitu.setGender('M');
		vitu.setAge(25);
		listArtists.add(vitu);
		
		Artist reven = new Artist();
		reven.setId(4);
		reven.setName("Reven Blaze");
		reven.setGender('M');
		reven.setAge(28);
		listArtists.add(reven);
		
		Artist heng = new Artist();
		heng.setId(5);
		heng.setName("HENG");
		heng.setGender('M');
		heng.setAge(24);
		listArtists.add(heng);
		
		Artist khem = new Artist();
		khem.setId(6);
		khem.setName("Khem");
		khem.setGender('M');
		khem.setAge(34);
		listArtists.add(khem);
		
		Artist piti = new Artist();
		piti.setId(7);
		piti.setName("Pi Ti");
		piti.setGender('M');
		piti.setAge(25);
		listArtists.add(piti);
		
		Artist techmeng = new Artist();
		techmeng.setId(8);
		techmeng.setName("Tech Meng");
		techmeng.setGender('M');
		techmeng.setAge(27);
		listArtists.add(techmeng);
		
		Artist davin = new Artist();
		davin.setId(9);
		davin.setName("Neang Davin");
		davin.setGender('M');
		davin.setAge(22);
		listArtists.add(davin);
		
		Artist rabee = new Artist();
		rabee.setId(10);
		rabee.setName("Neang Davin");
		rabee.setGender('M');
		rabee.setAge(28);
		listArtists.add(rabee);
		
		// Loop array artists 
		System.out.println("-------- Artis List---------");
		listArtists.forEach(System.out::println);
		System.out.println("-----------------");
		
		// Loop album
		Album vandaAlbum1 = new Album();
		vandaAlbum1.setId(1);
		vandaAlbum1.setName("Skull");
		vandaAlbum1.setYear(2020);
		vandaAlbum1.setArtist(vanda);
		Album vandaAlbum2 = new Album();
		vandaAlbum2.setId(2);
		vandaAlbum2.setName("Skull 2");
		vandaAlbum2.setYear(2020);
		vandaAlbum2.setArtist(vanda);
		
		// artist 2
		Album gdevinAlbum1 = new Album();
		gdevinAlbum1.setId(3);
		gdevinAlbum1.setName("album ");
		gdevinAlbum1.setYear(2020);
		gdevinAlbum1.setArtist(gdevin);
		Album gdevinAlbum2 = new Album();
		gdevinAlbum2.setId(4);
		gdevinAlbum2.setName("album 2");
		gdevinAlbum2.setYear(2020);
		gdevinAlbum2.setArtist(gdevin);
		
		// artist 3
		Album vituAlbum1 = new Album();
		vituAlbum1.setId(5);
		vituAlbum1.setName("album ");
		vituAlbum1.setYear(2020);
		vituAlbum1.setArtist(vitu);
		Album vituAlbum2 = new Album();
		vituAlbum2.setId(6);
		vituAlbum2.setName("album 2");
		vituAlbum2.setYear(2020);
		vituAlbum2.setArtist(vitu);
		
		// artist 4
		Album revenAlbum1 = new Album();
		revenAlbum1.setId(7);
		revenAlbum1.setName("album ");
		revenAlbum1.setYear(2020);
		revenAlbum1.setArtist(reven);
		Album revenAlbum2 = new Album();
		revenAlbum2.setId(8);
		revenAlbum2.setName("album 2");
		revenAlbum2.setYear(2020);
		revenAlbum2.setArtist(reven);
		
		// artist 5
		Album hengAlbum1 = new Album();
		hengAlbum1.setId(7);
		hengAlbum1.setName("album ");
		hengAlbum1.setYear(2020);
		hengAlbum1.setArtist(heng);
		Album hengAlbum2 = new Album();
		hengAlbum2.setId(8);
		hengAlbum2.setName("album 2");
		hengAlbum2.setYear(2020);
		hengAlbum2.setArtist(heng);
		
		System.out.println("");
		System.out.println("----- Album List Name & Artist---------");
		System.out.println(vandaAlbum1.toString());
		System.out.println(vandaAlbum2.toString());
		System.out.println(gdevinAlbum1.toString());
		System.out.println(gdevinAlbum2.toString());
		System.out.println(vituAlbum1.toString());
		System.out.println(vituAlbum2.toString());
		System.out.println(revenAlbum1.toString());
		System.out.println(revenAlbum2.toString());
		System.out.println(hengAlbum1.toString());
		System.out.println(hengAlbum2.toString());
		System.out.println("-----------------");
		
		
		// Loop album track
		AlbumTracks Album1 = new AlbumTracks();
		Album1.setId(1);
		Album1.setAlbum(vandaAlbum1);
		Album1.getTracks().add(new Tracks(1, "Cha Cha", "Disco", 3.2f));
		System.out.println("");
		System.out.println("----- Album Track---------");
		System.out.println(Album1.toString());
		System.out.println("-----------------");
		
	}

}
