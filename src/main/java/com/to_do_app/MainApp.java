package com.to_do_app;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MainApp extends JFrame {

	private SuperMenu superMenu;
	private Menu menu;
	private Content content;

	MainApp() {
		this.setTitle("TO DO");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(1045, 380));
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);

		content = new Content();
		menu = new Menu(content);
		superMenu = new SuperMenu(menu);

		content.setLayout(new BorderLayout());
		content.add(menu, BorderLayout.WEST);
		content.setCurrentContentPanel(content.TodayContent);

		this.add(superMenu, BorderLayout.WEST);
		this.add(content, BorderLayout.CENTER);
		this.setVisible(true);
	}
}
