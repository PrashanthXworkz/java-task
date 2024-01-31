package com.xworkz.voter.repository;

import com.xworkz.voter.dto.VoterAppsDto;

public interface VoterRepository {
	
	boolean onSave(VoterAppsDto voterappsdto);
	VoterAppsDto[] read();

}
