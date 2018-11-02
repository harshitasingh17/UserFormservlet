package com.cg.service;

public class ServiceImpl implements Service {

	@Override
	public boolean nameValidate(String name) {
		// TODO Auto-generated method stub
		if(name!=null){
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public boolean ageValidate(int age) {
		// TODO Auto-generated method stub
		if(age>0){
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public boolean contactValidate(long contact) {
		// TODO Auto-generated method stub
		return true;
	}

}
