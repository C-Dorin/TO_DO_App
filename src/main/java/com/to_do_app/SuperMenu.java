package com.to_do_app;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class SuperMenu extends JPanel {

	private Menu panelMenu;

	Border border = BorderFactory.createEmptyBorder();

	SuperMenu(Menu panelM) {
		this.panelMenu = panelM;

		this.setBackground(new Color(27, 47, 69));
		this.setPreferredSize(new Dimension(70, 1000));
		this.setLayout(null);

		panelMenu.setCurrentMenuPanel(panelMenu.AgendaMenu);

		// ===== Initialization BUTTONS in SuperMenu ===== //

		// Image of buttons
		ImageCreator AgendaImage = new ImageCreator("agenda");
		ImageCreator SpacesImage = new ImageCreator("spaces");
		ImageCreator HistoryImage = new ImageCreator("history");
		ImageCreator AnalyticsImage = new ImageCreator("analytics");
		ImageCreator SettingsImage = new ImageCreator("settings");

		// === Create BUTTONS in SuperMenu === //
		// Agenda Button
		JButton AgendaButton = new JButton();
		AgendaButton.setIcon(AgendaImage);
		AgendaButton.setBounds(0, 0, 68, 68);
		AgendaButton.addActionListener((e) -> panelMenu.setCurrentMenuPanel(panelMenu.AgendaMenu));
		AgendaButton.setBorder(border);

		// Spaces Button
		JButton SpacesButton = new JButton();
		SpacesButton.setIcon(SpacesImage);
		SpacesButton.setBounds(0, 70, 68, 68);
		SpacesButton.addActionListener((e) -> panelMenu.setCurrentMenuPanel(panelMenu.SpacesMenu));
		SpacesButton.setBorder(border);

		// History Button
		JButton HistoryButton = new JButton();
		HistoryButton.setIcon(HistoryImage);
		HistoryButton.setBounds(0, 140, 68, 68);
		HistoryButton.addActionListener((e) -> panelMenu.setCurrentMenuPanel(panelMenu.HistoryMenu));
		HistoryButton.setBorder(border);

		// Analytics Button
		JButton AnalyticsButton = new JButton();
		AnalyticsButton.setIcon(AnalyticsImage);
		AnalyticsButton.setBounds(0, 210, 68, 68);
		AnalyticsButton.addActionListener((e) -> panelMenu.setCurrentMenuPanel(panelMenu.AnalyticsMenu));
		AnalyticsButton.setBorder(border);

		// Settings Button
		JButton SettingsButton = new JButton();
		SettingsButton.setIcon(SettingsImage);
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				SettingsButton.setBounds(0, getHeight() - 72, 66, 68);
			}
		});
		SettingsButton.addActionListener((e) -> panelMenu.setCurrentMenuPanel(panelMenu.SettingsMenu));
		SettingsButton.setBorder(border);

		// === Add BUTTONS in SuperMenu === //
		this.add(AgendaButton);
		this.add(SpacesButton);
		this.add(HistoryButton);
		this.add(AnalyticsButton);
		this.add(SettingsButton);
	}
}