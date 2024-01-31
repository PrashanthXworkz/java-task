package com.xworkz.google.repository;

import com.xworkz.google.dto.GoogleDto;

public class GoogleRepositoryImplementation implements GoogleAppsRepository {
	
	
       private	GoogleDto[] googleDtoList=new GoogleDto[4];
	  private int index=0;

	@Override
	public boolean onSave(GoogleDto googledto) {
		if(this.index<googleDtoList.length) {
			this.googleDtoList[this.index]=googledto;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public GoogleDto[] read() {
		return googleDtoList;
	}

	@Override
	public boolean update(String id, GoogleDto googledto) {
		for(int i=0;i<googleDtoList.length;i++) {
			if(googleDtoList[i]!=null) {
				if(googleDtoList[i].getId().equals(id)) {
					googleDtoList[i]=googledto;
					System.out.println(googleDtoList[i]);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean delete(String id) {
		for(int i=0;i<googleDtoList.length;i++) {
			if(googleDtoList[i]!=null) {
				if(googleDtoList[i].getId().equals(id)) {
					googleDtoList[i]=null;
					return true;
				}
			}
		}
		return false;
	}

}
