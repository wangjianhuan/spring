package com.wangjh.selfEditor;

/**
 * @author wjh
 * @date 2022/6/8 4:22 PM
 * @email 1151777592@qq.com
 */
public class Customer {
	private String name;
	private Address address;

	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				", address=" + address +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
