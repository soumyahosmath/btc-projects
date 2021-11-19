package com.muizx.app.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.muzix.app.model.Music;
import com.muzix.app.model.User;

public class MusicDaoImpl implements MusicDao {
	private static Map<String, Music> mu=new HashMap<>();
	@Override
	public List<Music> PlayList() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> FavouriteSongs() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Music addFavouriteSongs(Music music) throws SQLException {
		mu.put(music.getSongName(), music);
		return null;
	}

	@Override
	public List<String> recomandedService() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User ReisterUser(User user) throws SQLException {
		
		return null;
	}

	@Override
	public boolean userLogIn(String userName, String password) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAllUser() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteSongById(int userId) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}


}
