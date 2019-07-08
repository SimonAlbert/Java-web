package space.bean;

import java.util.Date;

public class Music {
	public int m_id;
	public int m_singer_id;
	public int m_album_id;
	public int m_manager_id;
	public String m_name;
	public String m_url;
	public Date update_time;
	public String m_class;
	public String m_singer_name;
	public String m_album_name;
	public Music(int m_id, String m_name, int m_singer_id, String m_url, int m_album_id, int m_manager_id,
			Date update_time, String m_class, String m_singer_name, String m_album_name) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.m_singer_id = m_singer_id;
		this.m_url = m_url;
		this.m_album_id = m_album_id;
		this.m_manager_id = m_manager_id;
		this.update_time = update_time;
		this.m_class = m_class;
		this.m_singer_name = m_singer_name;
		this.m_album_name = m_album_name;
	}
	public String getM_album_name() {
		return m_album_name;
	}
	public void setM_album_name(String m_album_name) {
		this.m_album_name = m_album_name;
	}
	@Override
	public String toString() {
		return "Music [m_id=" + m_id + ", m_name=" + m_name + ", m_singer_id=" + m_singer_id + ", m_url=" + m_url
				+ ", m_album_id=" + m_album_id + ", m_manager_id=" + m_manager_id + ", update_time=" + update_time
				+ ", m_class=" + m_class + "]";
	}
	public String toValueString() {
		return "'" + m_id + "','" + m_name + "','" + m_singer_id + "','" + m_url
				+ "','" + m_album_id + "','" + m_manager_id + "','" + update_time
				+ "','" + m_class + "'";
	}
	public int getM_id() {
		return m_id;
	}
	public String getM_singer_name() {
		return m_singer_name;
	}
	public void setM_singer_name(String m_singer_name) {
		this.m_singer_name = m_singer_name;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public int getM_singer_id() {
		return m_singer_id;
	}
	public void setM_singer_id(int m_singer_id) {
		this.m_singer_id = m_singer_id;
	}
	public int getM_album_id() {
		return m_album_id;
	}
	public void setM_album_id(int m_album_id) {
		this.m_album_id = m_album_id;
	}
	public int getM_manager_id() {
		return m_manager_id;
	}
	public void setM_manager_id(int m_manager_id) {
		this.m_manager_id = m_manager_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_url() {
		return m_url;
	}
	public void setM_url(String m_url) {
		this.m_url = m_url;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public String getM_class() {
		return m_class;
	}
	public void setM_class(String m_class) {
		this.m_class = m_class;
	}
	
}
