package com.gowor;

import java.io.IOException;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Pozycja extends TagSupport {
	
	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspTagException {
		Lista parent = (Lista) findAncestorWithClass(this, Lista.class);
		if (parent == null)
			throw new JspTagException("Incorrect tag.");
		JspWriter out = pageContext.getOut();
		try {
			out.println("<li>");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		return EVAL_BODY_INCLUDE;
	}
}
