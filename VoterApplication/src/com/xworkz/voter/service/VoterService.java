package com.xworkz.voter.service;

import com.xworkz.voter.dto.VoterAppsDto;

public interface VoterService {
	
	boolean validateandSave(VoterAppsDto voterappsdto);
	boolean isExists(VoterAppsDto voterappsdto);
	void read();

}
