package com.wangjh.XML.selfEditor;

/**
 * @author wjh
 * @date 2022/6/8 4:20 PM
 * @email 1151777592@qq.com
 */
public class Address {
	private String province;
	private String city;
	private String town;

	@Override
	public String toString() {
		return "Address{" +
				"province='" + province + '\'' +
				", city='" + city + '\'' +
				", town='" + town + '\'' +
				'}';
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}
}
