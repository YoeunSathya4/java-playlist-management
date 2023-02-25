package com.playlist.management;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.playlist.management.Album;
import com.playlist.management.Tracks;

public class AlbumTracks {

	private int id;
	private Album album;
	private final List<Tracks> tracks = new ArrayList<Tracks>();
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the album
	 */
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	
	
	/**
	 * @return the tracks
	 */
	public List<Tracks> getTracks() {
		return tracks;
	}
	
	public String toString() {
		
		
		String displayTracks = this.getTracks().stream()
					.map(s -> "\t- " + s.toString() + "\n")
					.collect(Collectors.joining());
		
		return "ID: " + this.getId() +
				", Albums: {" + this.getAlbum().toString() + "} " +
				", TRACKS: \n" + displayTracks;
	}
}
