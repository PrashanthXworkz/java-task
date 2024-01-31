package com.xworkz.applications;

import java.util.ArrayList;
import java.util.List;

public class CollectRunner {

	public static void main(String[] args) {
		List<String> listall=new ArrayList<String>();
		listall.add("upittu");
		listall.add("dose");
		listall.add("holige");
		listall.add("roti");
		listall.add("chapati");
		listall.add("idli");
		listall.add("vada");
		listall.add("paddu");
		listall.add("ricebath");
		listall.add("pongal");
		listall.add("neerdosa");
		listall.add("panipuri");
		listall.add("masaladosa");
		listall.add("rice sambar");
		listall.add("puliyogare");
		listall.add("keasribath");
		listall.add("milkshake");
		listall.add("sajje");
		listall.add("roti");
		listall.add("curdrice");
		listall.add("majjige");
		listall.add("avalakki");
		listall.add("manadakki");
		listall.add("mirchi");
		listall.add("combo meals");
		listall.add("bisibelebath");
		listall.add("shavigebath");
		listall.add("noodles");
		listall.add("kachori");
		listall.add("samosa");
		System.out.println("food is present:"+listall.contains("dose"));
		System.out.println("food is remove:"+listall.remove("curdrice"));
		System.out.println("food size:"+listall.size());
		

	}

}
