package com.to_do_app;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class Menu extends JPanel {

	Border border = BorderFactory.createMatteBorder(-2, 1, -10, 1, new Color(255, 255, 255));

	// Secondary panel
	JPanel currentMenuPanel;
	private Content panelContent;

	// Main panels
	JPanel AgendaMenu;
	JPanel SpacesMenu;
	JPanel HistoryMenu;
	JPanel AnalyticsMenu;
	JPanel SettingsMenu;

	Menu(Content panelC) {
		this.panelContent = panelC;

		this.setPreferredSize(new Dimension(300, 1000));
		this.setBackground(new Color(39, 64, 96));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBorder(border);

		// ===== Initialization PANELS in Menu ===== //

		// === AGENDA Menu === //
		AgendaMenu = new JPanel();
		panelSetting(AgendaMenu);

		// Agenda Buttons
		MenuButton today = new MenuButton("Today");
		today.addActionListener((e) -> panelContent.setCurrentContentPanel(panelContent.TodayContent));

		MenuButton tomorrow = new MenuButton("Tomorrow");
		tomorrow.addActionListener((e) -> panelContent.setCurrentContentPanel(panelContent.TomorrowContent));

		MenuButton nextWeek = new MenuButton("Next Week");
		nextWeek.addActionListener((e) -> panelContent.setCurrentContentPanel(panelContent.NextWeekContent));

		// Add buttons to AgendaMenu
		AgendaMenu.add(today);
		AgendaMenu.add(tomorrow);
		AgendaMenu.add(nextWeek);

		// ========== SPACES Menu ========== //
		SpacesMenu = new JPanel();
		panelSetting(SpacesMenu);

		// Spaces Buttons
		MenuButton everytimeTask = new MenuButton("EveryTime Task");
		everytimeTask.addActionListener((e) -> panelContent.setCurrentContentPanel(panelContent.EveryTimeContent));

		MenuButton newSpace = new MenuButton("+ Create Space");
		newSpace.addActionListener((e) -> panelContent.setCurrentContentPanel(panelContent.NewSpaceContent));

		// Add buttons to SpacesMenu
		SpacesMenu.add(everytimeTask);
		SpacesMenu.add(newSpace);

		// ========== HISTORY Menu ========== //
		HistoryMenu = new JPanel();
		panelSetting(HistoryMenu);

		// History Buttons
		MenuButton lastWeek = new MenuButton("Last Week");
		lastWeek.addActionListener((e) -> panelContent.setCurrentContentPanel(panelContent.LastWeekContent));

		MenuButton lastMonth = new MenuButton("Last Month");
		lastMonth.addActionListener((e) -> panelContent.setCurrentContentPanel(panelContent.LastMonthContent));

		MenuButton lastHalfYear = new MenuButton("Last Half Year");
		lastHalfYear.addActionListener((e) -> panelContent.setCurrentContentPanel(panelContent.LastHalfYearContent));

		MenuButton lastYear = new MenuButton("Last Year");
		lastYear.addActionListener((e) -> panelContent.setCurrentContentPanel(panelContent.LastYearContent));

		MenuButton custom = new MenuButton("Custom");
		custom.addActionListener((e) -> panelContent.setCurrentContentPanel(panelContent.CustomContent));

		// Add buttons to HistoryMenu
		HistoryMenu.add(lastWeek);
		HistoryMenu.add(lastMonth);
		HistoryMenu.add(lastHalfYear);
		HistoryMenu.add(lastYear);
		HistoryMenu.add(custom);

		// ========== ANALYTICS Menu ========== //
		AnalyticsMenu = new JPanel();
		panelSetting(AnalyticsMenu);

		// Analytics Buttons
		MenuButton done = new MenuButton("Done");
		done.addActionListener((e) -> panelContent.setCurrentContentPanel(panelContent.DoneContent));

		MenuButton discipline = new MenuButton("Discipline");
		discipline.addActionListener((e) -> panelContent.setCurrentContentPanel(panelContent.DisciplineContent));

		// Add buttons to AnalyticsMenu
		AnalyticsMenu.add(done);
		AnalyticsMenu.add(discipline);

		// ========== SETTINGS Menu ========== //
		SettingsMenu = new JPanel();
		panelSetting(SettingsMenu);

		// Setting Button
		MenuButton interfaceApp = new MenuButton("Interface");
		interfaceApp.addActionListener((e) -> panelContent.setCurrentContentPanel(panelContent.InterfaceAppContent));

		// Add buttons to SettingsMenu
		SettingsMenu.add(interfaceApp);
	}

	private void panelSetting(JPanel panel) {
		panel.setPreferredSize(new Dimension(300, 1000));
		panel.setBackground(new Color(39, 64, 96));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	}

	// Change the panels
	public void setCurrentMenuPanel(JPanel newPanel) {
		if (currentMenuPanel != null) {
			this.remove(currentMenuPanel);
		}
		if (newPanel != null) {
			this.add(newPanel);
			currentMenuPanel = newPanel;
			revalidate();
			repaint();
		}
	}

}

// ========== BUTTON TEMPLATE ========== //
class MenuButton extends JButton {

	// Types of Border
	Border emptyBorder = BorderFactory.createEmptyBorder(8, 5, 0, 0);
	Border roundBorder = new RoundBorder(8);

	// <TWO> borders in <ONE>
	CompoundBorder finalButtonBorder = new CompoundBorder(emptyBorder, roundBorder);

	MenuButton(String name) {
		this.setText(name);
		this.setForeground(new Color(255, 255, 255));
		this.setFont(new Font("Baloo Bhaina 2", Font.PLAIN, 25));
		this.setMaximumSize(new Dimension(295, 60));
		this.setBorder(finalButtonBorder);
		this.addMouseListener(new ButtonMouseListener());
	}

}

// ========== BUTTON BORDER ========== //
class RoundBorder extends AbstractBorder {
	private int radius;
	private int strokeWidth = 2;

	public RoundBorder(int radius) {
		this.radius = radius;
	}

	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		Graphics2D g2d = (Graphics2D) g.create();

		// Better drawing quality
		RenderingHints qualityHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		qualityHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

		g2d.setRenderingHints(qualityHints);
		g2d.setStroke(new BasicStroke(strokeWidth));
		g2d.drawRoundRect(x + strokeWidth / 2,
				y + strokeWidth / 2,
				width - strokeWidth,
				height - strokeWidth - 5,
				radius,
				radius);

		g2d.dispose();
	}

	// Set all 4 margins(left, top, right, bottom) to the value of radius
	@Override
	public Insets getBorderInsets(Component c, Insets insets) {
		insets.left = insets.top = insets.right = insets.bottom = radius;
		return insets;
	}
}

// ========== BUTTON ANIMATION ========== //
class ButtonMouseListener implements MouseListener {

	private static MenuButton lastButton;

	@Override
	public void mouseClicked(MouseEvent e) {
		MenuButton presentButton = (MenuButton) e.getSource();

		if (lastButton != null) {
			lastButton.setForeground(new Color(255, 255, 255));
		}

		lastButton = presentButton;
		presentButton.setForeground(new Color(5, 255, 5));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		MenuButton presentButton = (MenuButton) e.getSource();

		if (lastButton != null) {
			lastButton.setForeground(new Color(255, 255, 255));
		}

		lastButton = presentButton;
		presentButton.setForeground(new Color(5, 255, 5));

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		MenuButton presentButton = (MenuButton) e.getSource();
		if (!presentButton.equals(lastButton)) {
			presentButton.setForeground(new Color(150, 150, 150));
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		MenuButton presentButton = (MenuButton) e.getSource();
		if (!presentButton.equals(lastButton)) {
			presentButton.setForeground(new Color(255, 255, 255));
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}
}