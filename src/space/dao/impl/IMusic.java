package space.dao.impl;

import java.util.List;

import space.bean.Music;

public interface IMusic {
//	根据限制查询
	List<?> getListLimited(String[] field, String[] value);
//	查询所有音乐
	public List<?> getAll();
//	根据IDlist查询music list
	List<?> getListFromID(int[] ID);
	int updateMusic(String[] field, String[] value, int ID);
	int addMusic(Music m);
}
