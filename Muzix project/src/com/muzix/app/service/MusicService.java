package com.muzix.app.service;
import java.sql.SQLException;

import com.muzix.app.model.Music;
import com.muzix.app.model.User;
import java.util.List;


public interface MusicService {
	 public User ReisterUser(User user) throws SQLException;
	 public boolean userLogIn(String userEmail, String password) throws SQLException;
	 public List<Music> PlayList() throws Exception;
		public List<String> FavouriteSongs() throws Exception;
	 public Music addFavouriteSongs(Music music) throws Exception;
	public List<String> recomandedService() throws Exception;

	public List<User> getAllUser() throws SQLException;
	public boolean deleteSongById(int userId)throws SQLException;


}
