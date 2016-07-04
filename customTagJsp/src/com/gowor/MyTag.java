package com.gowor;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport {

	private static final long serialVersionUID = 1L;
	
	private String customString;
	
	public void setCustomString(String customString) {
		this.customString = customString;
	}

	@Override
	public int doStartTag() {
		try {
			JspWriter out = pageContext.getOut();
			out.print("<h2>Custom H2 header: "+customString+"</h2>");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return SKIP_BODY;
	}
}
