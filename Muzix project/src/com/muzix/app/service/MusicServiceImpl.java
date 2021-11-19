package com.muzix.app.service;
import java.sql.SQLException;
import java.util.List;

import com.muizx.app.dao.MusicDao;
import com.muizx.app.dao.MusicDaoJdbcImpl;
import com.muzix.app.model.Music;
import com.muzix.app.model.User;



public class MusicServiceImpl implements MusicService{
private MusicDao daoObject;
	
	public MusicServiceImpl() {
	
		try {
			daoObject=new MusicDaoJdbcImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Override
	public  List<Music> PlayList() throws Exception {
		return daoObject.PlayList();
	
	}
	@Override
	public List<String> FavouriteSongs() throws Exception {
		return daoObject.FavouriteSongs() ;
	
	}

	@Override
	public List<String> recomandedService() throws SQLException {
		return daoObject.recomandedService() ;
	}
	@Override
	public Music addFavouriteSongs(Music music) throws Exception {
		return daoObject.addFavouriteSongs(music);
	}
	
	@Override
	public boolean userLogIn(String userName, String password) throws SQLException {
		// TODO Auto-generated method stub
		return daoObject.userLogIn(userName,password);
	}
	@Override
	public User ReisterUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		return daoObject.ReisterUser(user);
	}

	@Override
	public List<User> getAllUser() throws SQLException {
		// TODO Auto-generated method stub
		return daoObject.getAllUser();
	}
		
	@Override
	public boolean deleteSongById(int songid) throws SQLException {
		// TODO Auto-generated method stub
		return daoObject.deleteSongById(songid);
		
		
	}
	

}

