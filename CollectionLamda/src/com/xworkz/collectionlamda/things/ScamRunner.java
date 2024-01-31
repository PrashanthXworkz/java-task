package com.xworkz.collectionlamda.things;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collectionlamda.dto.ScamDto;

public class ScamRunner {

	public static void main(String[] args) {
		ScamDto scam=new ScamDto();
		
		
		List<ScamDto> list=new ArrayList<ScamDto>();
		list.add(new ScamDto("w001","Ankush","phishing","shimoga"));
		list.add(new ScamDto("w002","sahil","built","gadag"));
		list.add(new ScamDto("w003","Ayan","phishing","belagum"));
		list.add(new ScamDto("w004","prajwal","phishing","kodagu"));
		
		Collections.sort(list);
		System.out.println(list);
		

	}

}
