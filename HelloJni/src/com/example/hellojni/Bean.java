package com.example.hellojni;

public class Bean {
	public static final int Y_TYPE = 0; // view����0
	public static final int X_TYPE = 1; // view����2
	public static final int Z_TYPE = 2;// view ����3
	private int type;
	private String text;

	public Bean(int type, String text) {
		super();
		this.type = type;
		this.text = text;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
