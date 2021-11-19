package com.muzix.app.model;

import java.util.List;

public class Music {
	private int songid;
	private String songName;
	private String filmName;
	private String singerName;
public Music()
{
		
}
public Music(String songName)
{
	super();
	this.songName = songName;
	
}
public Music(String songName,String filmName,String singerName)
{
	
}
//public Music(String songName, String filmName, String singerName) {
	//super();
	//this.songName = songName;
	//this.filmName = filmName;
	//this.singerName = singerName;
//}
public int getSongid() {
	return songid;
}

public void setSongid(int songid) {
	this.songid = songid;
}
public String getSongName() {
	return songName;
}
public void setSongName(String songName) {
	this.songName = songName;
}
public String getFilmName() {
	return filmName;
}
public void setFilmName(String filmName) {
	this.filmName = filmName;
}
public String getSingerName() {
	return singerName;
}
public void setSingerName(String singerName) {
	this.singerName = singerName;
}
@Override
public String toString() {
	return "MusicPlayer [songid=" + songid + ",songName=" + songName + ", filmName=" + filmName + ", singerName=" + singerName + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((filmName == null) ? 0 : filmName.hashCode());
	result = prime * result + ((singerName == null) ? 0 : singerName.hashCode());
	result = prime * result + ((songName == null) ? 0 : songName.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Music other = (Music) obj;
	if (filmName == null) {
		if (other.filmName != null)
			return false;
	} else if (!filmName.equals(other.filmName))
		return false;
	if (singerName == null) {
		if (other.singerName != null)
			return false;
	} else if (!singerName.equals(other.singerName))
		return false;
	if (songName == null) {
		if (other.songName != null)
			return false;
	} else if (!songName.equals(other.songName))
		return false;
	return true;
}

}
