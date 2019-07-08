package space.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import space.bean.Album;
import space.util.DBUtil;

public class AlbumDao {
		public List<?> getListLimited(String[] field, String[] value) {
			// TODO Auto-generated method stub
			String sql="select * from album where ";
			for(int i=0;i<field.length;i++) {
				sql = sql+field[i]+'='+value[i]+' ';
			}
			sql = sql+';';
			ResultSet res=DBUtil.executeQuery(sql, null);
			List<Album> list=new ArrayList<>();
			try {
				while(res.next()) {
					int a_id=res.getInt("a_id");
					int a_singer_id=res.getInt("a_singer_id");
					int a_collect=res.getInt("a_collect");
					String a_name=res.getString("a_name"); 
					String a_img_url=res.getString("a_img_url");
					String a_info=res.getString("a_info");
					String a_singer_name=res.getString("a_singer_name");
					Album a=new Album(a_id, a_singer_id, a_collect, a_name, a_img_url, a_info,
							 a_singer_name);
					list.add(a);
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}

		public List<?> getAll() {
			String sql="select * from album";
			ResultSet res=DBUtil.executeQuery(sql, null);
			List<Album> list=new ArrayList<>();
			try {
				while(res.next()) {
					int a_id=res.getInt("a_id");
					int a_singer_id=res.getInt("a_singer_id");
					int a_collect=res.getInt("a_collect");
					String a_name=res.getString("a_name"); 
					String a_img_url=res.getString("a_img_url");
					String a_info=res.getString("a_info");
					String a_singer_name=res.getString("a_singer_name");
					Album a=new Album(a_id, a_singer_id, a_collect, a_name, a_img_url, a_info,
							 a_singer_name);
					list.add(a);
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
//
//		@Override
//		public List<?> getListFromID(int[] ID) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public int addMusic(Music m) {
//			// TODO Auto-generated method stub
//			String sql="insert into music(?) values(?);";
//			Object[] objs= {"m_id, m_name, m_singer_id, m_url, m_album_id, m_manager_id,update_time, m_class", 
//					m.toValueString()};
//			int x = DBUtil.executeUpdate(sql, objs);
//			return x;
//		}
//
//		@Override
//		public int updateMusic(String[] field, String[] value, int ID) {
//			// TODO Auto-generated method stub
//			
//			return 0;
//		}

	
}
