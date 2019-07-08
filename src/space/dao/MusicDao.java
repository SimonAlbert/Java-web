package space.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import space.bean.Music;
import space.dao.impl.IMusic;
import space.util.DBUtil;

public class MusicDao implements IMusic {

	@Override
	public List<?> getListLimited(String[] field, String[] value) {
		// TODO Auto-generated method stub
		String sql="select * from music where ";
		for(int i=0;i<field.length;i++) {
			sql = sql+field[i]+'='+value[i]+' ';
		}
		sql = sql+';';
		ResultSet res=DBUtil.executeQuery(sql, null);
		List<Music> list=new ArrayList<>();
		try {
			while(res.next()) {
				int m_id=res.getInt("m_id");
				String m_name=res.getString("m_name");
				int m_singer_id=res.getInt("m_singer_id");
				String m_url=res.getString("m_url");
				int m_album_id=res.getInt("m_album_id");
				int m_manager_id=res.getInt("m_manager_id");
				Date update_time=res.getDate("update_time");
				String m_class=res.getString("m_class");
				String m_singer_name=res.getString("m_singer_name");
				String m_album_name=res.getString("m_album_name");
				Music m=new Music(m_id, m_name, m_singer_id, m_url, m_album_id,
						m_manager_id, update_time, m_class, m_singer_name, m_album_name);
				list.add(m);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<?> getAll() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String sql="select * from Music;";
		ResultSet res=DBUtil.executeQuery(sql, null);
		List<Music> list=new ArrayList<>();
		try {
			while(res.next()) {

				int m_id=res.getInt("m_id");
				String m_name=res.getString("m_name");
				int m_singer_id=res.getInt("m_singer_id");
				String m_url=res.getString("m_url");
				int m_album_id=res.getInt("m_album_id");
				int m_manager_id=res.getInt("m_manager_id");
				Date update_time=res.getDate("update_time");
				String m_class=res.getString("m_class");
				String m_singer_name=res.getString("m_singer_name");
				String m_album_name=res.getString("m_album_name");
				Music m=new Music(m_id, m_name, m_singer_id, m_url, m_album_id,
						m_manager_id, update_time, m_class, m_singer_name, m_album_name);
				list.add(m);
//				m_id=res.getInt("m_id");
//				m_name=res.getString("m_name");
//				m_singer_id=res.getInt("m_singer_id");
//				m_url=res.getString("m_url");
//				m_album_id=res.getInt("m_album_id");
//				m_manager_id=res.getInt("m_manager_id");
//				update_time=res.getDate("update_time");
//				m_class=res.getString("m_class");
//				m=new Music(m_id, m_name, m_singer_id, m_url, m_album_id,
//						m_manager_id, update_time, m_class);
//				list.add(m);
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<?> getListFromID(int[] ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addMusic(Music m) {
		// TODO Auto-generated method stub
		String sql="insert into music(?) values(?);";
		Object[] objs= {"m_id, m_name, m_singer_id, m_url, m_album_id, m_manager_id,update_time, m_class", 
				m.toValueString()};
		int x = DBUtil.executeUpdate(sql, objs);
		return x;
	}

	@Override
	public int updateMusic(String[] field, String[] value, int ID) {
		// TODO Auto-generated method stub
		
		return 0;
	}

}
