package org.com.shub.model;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		if(text.contains("Mr.") || text.contains("Mrs.")) {
			setValue(text.substring(text.indexOf(".")+1));
		}
		else {
			setValue(text);
		}
	}

}
