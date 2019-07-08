package space.bean;

public class Singer {
	public int s_id;
	public String s_name;
	public String s_gender;
	public String s_img_url;
	public String s_bg_url;
	public String s_info;
	public Singer(int s_id, String s_name, String s_gender, String s_img_url, String s_bg_url, String s_info) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_gender = s_gender;
		this.s_img_url = s_img_url;
		this.s_bg_url = s_bg_url;
		this.s_info = s_info;
	}
	@Override
	public String toString() {
		return "Singer [s_id=" + s_id + ", s_name=" + s_name + ", s_gender=" + s_gender + ", s_img_url=" + s_img_url
				+ ", s_bg_url=" + s_bg_url + ", s_info=" + s_info + "]";
	}
	
}
