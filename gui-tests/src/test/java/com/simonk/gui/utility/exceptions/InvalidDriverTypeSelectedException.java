package com.simonk.gui.utility.exceptions;

public class InvalidDriverTypeSelectedException extends Exception {

	private static final long serialVersionUID = -2919782329688010242L;

	public InvalidDriverTypeSelectedException(String message) {
		super(message);
	}
	
	public InvalidDriverTypeSelectedException() {
		super();
	}
}
