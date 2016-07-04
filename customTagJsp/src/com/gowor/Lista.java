package com.gowor;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Lista extends TagSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() {
		JspWriter out = pageContext.getOut();
		try {
			out.println("<ol>");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doEndTag() {
		JspWriter out = pageContext.getOut();
		try {
			out.println("</ol>");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return EVAL_BODY_INCLUDE;
	}
}
