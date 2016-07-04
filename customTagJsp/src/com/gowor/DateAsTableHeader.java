package com.gowor;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DateAsTableHeader extends TagSupport {

	private static final long serialVersionUID = 1L;
	
	private String date;
	
	
	
	@Override
	public int doStartTag() {
		JspWriter out = pageContext.getOut();
		try {
			out.println("<table><tr><th>" + date + ": ");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doEndTag() {
		JspWriter out = pageContext.getOut();
		try {
			out.println("</th></tr></table>");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return EVAL_PAGE;
	}


	public void setDate(String date) {
		this.date = date;
	}
}
