package com.stage.cda.herculepro.ajax;

import java.util.List;

import com.stage.cda.herculepro.bean.Address;

public class AjaxResponseBody {

	String msg;
    List<Address> result;
    
	public AjaxResponseBody() {
	}

	public AjaxResponseBody(String msg, List<Address> result) {
		this.msg = msg;
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Address> getResult() {
		return result;
	}

	public void setResult(List<Address> addresses) {
		this.result = addresses;
	}
}
