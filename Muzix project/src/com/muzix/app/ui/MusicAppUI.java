package com.muzix.app.ui;
import java.sql.SQLException;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;

import com.muzix.app.exception.InvalidEmailException;

import com.muzix.app.exception.InvalidPasswordException;
import com.muzix.app.exception.InvalidSongIdException;
import com.muzix.app.exception.InvalidUserNameException;
import com.muzix.app.exception.NotFoundException;
import com.muzix.app.model.Music;
import com.muzix.app.model.User;
import com.muzix.app.service.MusicService;
import com.muzix.app.service.MusicServiceImpl;


public class MusicAppUI {

	private Scanner scan=new Scanner(System.in);
	private static MusicService service=new MusicServiceImpl();

	public void RegisterUser()  {
		User user= new User();
		System.out.println("Enter User Details to Register=>  ");
	
		
			System.out.print("User Name : ");
			String userName=scan.next()+scan.nextLine();
			try {
				if(userName.length()<2)
				{
					throw new InvalidUserNameException("Enter correct User Name to Register :"+userName);
				}
				user.setUserName(userName);
			} catch (InputMismatchException e) {
				// TODO: handle exception
				e.getMessage();
				System.out.println("Enter the correct name : "+userName);
			}
			
			System.out.print("Email : ");
			String userEmail=scan.next()+scan.nextLine();
			String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			
				if(userEmail.matches(regex)) {
					System.out.println("Correct Email Address");
					user.setUserEmail(userEmail);
				}
				else {
					throw new InvalidEmailException("Enter Correct Email Address");
				}
			
			System.out.print("Password : ");
			String password = scan.next()+scan.nextLine();
			if(password.length()<8)
			{
				throw new InvalidPasswordException("Passowrd Atleast 8 character");
			}
			else {
				user.setPassword(password);
			}
			
			
			User savedUser;
			try {
				savedUser = service.ReisterUser(user);
				System.out.println("User Added Successfully..");
				System.out.println(savedUser);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		
	}

	public boolean uesrLogIn()
	{
		System.out.print("Name : ");
		String userName=scan.next()+scan.nextLine();
		System.out.print("Password : ");
		String password=scan.next()+scan.nextLine();
		try {
			return service.userLogIn(userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
	
	
	public MusicAppUI() throws SQLException  {
		service=new MusicServiceImpl();
	}
	public void displayPlaylist() 
	{
		System.out.println("The PlayList : ");
		List<Music> song=null;
		try {
			song = service.PlayList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(song);
	}
		
	public void displayFavouriteSongs() 
	{
		System.out.println("The Favourite Songs are : ");
		List<String> song=null;
		try {
			song = service.FavouriteSongs();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(song);
	}
	
	public void displayRecomanded()
	{
		System.out.println("The Recomanded Songs are : ");
		List<String> song=null;
		try {
			song = service.recomandedService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(song);
	}
	public void addFavouriteSongs(){
		System.out.println("Enter Song Details: ");
		System.out.println("Song Name:");
		String songName=scan.next()+scan.nextLine();
		System.out.println("Film Name:");
		String filmName=scan.next()+scan.nextLine();
		System.out.println("Singer Name:");
		String singerName=scan.next()+scan.nextLine();
	
		
	
		Music music=new Music(songName,filmName,singerName);
		Music savedMusic;
		try {
			savedMusic = service.addFavouriteSongs(music);
			System.out.println("song Added Successfully:");
			System.out.println(savedMusic);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void showAllUserDetails() {
		// TODO Auto-generated method stub
		List<User> uList;
		try {
			uList=service.getAllUser();
			for (User user :uList) {
				System.out.println(user.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void deleteSongById() 
	{
		System.out.print("song ID : ");
		int songid=0;
		try {
			
			songid=scan.nextInt();
			if(songid>1000)
			{
				throw new InvalidSongIdException("Enter songid : "+songid);
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println("Enter the Integer Value ");
		}
		
		try {
			boolean value = service.deleteSongById(songid);
			if(value==false)
			{
				throw new NotFoundException("song id Not Found : "+songid);
			}
			else {
				System.out.println(" Song Deleted Successfully");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
