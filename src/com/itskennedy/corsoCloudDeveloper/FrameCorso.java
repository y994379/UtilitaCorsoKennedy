package com.itskennedy.corsoCloudDeveloper;

import javax.swing.JFrame;

public class FrameCorso extends JFrame {
	
	private static final long serialVersionUID = 6106681630737716844L;

	public FrameCorso() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(500, 400);
		this.setSize(800,300);
		this.setTitle("Frame principale dell'applicazione");
		this.setResizable(false);
	}
}
