package com.xworkz.voter.repository;

import com.xworkz.voter.dto.VoterAppsDto;

public class VoterRepositoryImplementation implements VoterRepository {
	
	private VoterAppsDto[] dtos=new VoterAppsDto[4];
	private int index=0;

	@Override
	public boolean onSave(VoterAppsDto voterappsdto) {
		if(this.index<this.dtos.length) {
			this.dtos[this.index]=voterappsdto;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public VoterAppsDto[] read() {
		return dtos;
	}

}
