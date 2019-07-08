package space.bean;

public class Album {
	public int a_id;
	public int a_singer_id;
	public int a_collect;
	public String a_name;
	public String a_img_url;
	public String a_info;
	public String a_singer_name;
	public Album(int a_id, int a_singer_id, int a_collect, String a_name, String a_img_url, String a_info,
			String a_singer_name) {
		super();
		this.a_id = a_id;
		this.a_singer_id = a_singer_id;
		this.a_collect = a_collect;
		this.a_name = a_name;
		this.a_img_url = a_img_url;
		this.a_info = a_info;
		this.a_singer_name = a_singer_name;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public int getA_singer_id() {
		return a_singer_id;
	}
	public void setA_singer_id(int a_singer_id) {
		this.a_singer_id = a_singer_id;
	}
	public int getA_collect() {
		return a_collect;
	}
	public void setA_collect(int a_collect) {
		this.a_collect = a_collect;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public String getA_img_url() {
		return a_img_url;
	}
	public void setA_img_url(String a_img_url) {
		this.a_img_url = a_img_url;
	}
	public String getA_info() {
		return a_info;
	}
	public void setA_info(String a_info) {
		this.a_info = a_info;
	}
	public String getA_singer_name() {
		return a_singer_name;
	}
	public void setA_singer_name(String a_singer_name) {
		this.a_singer_name = a_singer_name;
	}
	@Override
	public String toString() {
		return "Album [a_id=" + a_id + ", a_singer_id=" + a_singer_id + ", a_collect=" + a_collect + ", a_name="
				+ a_name + ", a_img_url=" + a_img_url + ", a_info=" + a_info + ", a_singer_name=" + a_singer_name + "]";
	}
	
}
