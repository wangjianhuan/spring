package com.wangjh.selfEditor;

import java.beans.PropertyEditorSupport;

/**
 * @author wjh
 * @date 2022/6/8 4:23 PM
 * @email 1151777592@qq.com
 */
public class AddressPropertyEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] strings = text.split("_");
		Address address = new Address();
		address.setProvince(strings[0]);
		address.setCity(strings[1]);
		address.setTown(strings[2]);
		this.setValue(address);
	}
}
