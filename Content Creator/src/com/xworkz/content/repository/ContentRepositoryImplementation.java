package com.xworkz.content.repository;

import com.xworkz.content.dto.ContentDto;

public class ContentRepositoryImplementation  implements ContentRepository{
	
	private ContentDto[] content=new ContentDto[3];
	private int index=0;

	@Override
	public boolean onSave(ContentDto contentdto) {
		if(this.index<content.length) {
			content[index]=contentdto;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public ContentDto[] read() {
		return content;
	}

	@Override
	public boolean update(String email, ContentDto contentdto) {
		for(int i=0;i<content.length;i++) {
			if(content[i]!=null) {
				if(content[i].getEmail().equalsIgnoreCase(email)) {
					content[i]=contentdto;
					return true;
				}
			}
		}
		return false;
	}

}
