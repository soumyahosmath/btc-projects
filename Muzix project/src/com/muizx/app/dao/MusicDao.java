package com.muizx.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.muzix.app.model.Music;
import com.muzix.app.model.User;

public interface MusicDao {
	public User ReisterUser(User user) throws SQLException;
	 public boolean userLogIn(String userName, String password) throws SQLException;
		public List<Music> PlayList() throws SQLException;
	    public List<String> FavouriteSongs() throws SQLException; 
   public Music addFavouriteSongs(Music music) throws SQLException;
   public  List<String> recomandedService() throws SQLException;
	 public List<User> getAllUser() throws SQLException;
	 public boolean deleteSongById(int userId)throws SQLException;


}
