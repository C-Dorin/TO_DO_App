package com.to_do_app.Content_Panels.Agenda_Panels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.time.LocalDate;

public class Tomorrow extends JPanel {
	Border border = BorderFactory.createBevelBorder(1, new Color(255, 255, 255), new Color(100, 100, 100));
	Border emptyBorder = BorderFactory.createEmptyBorder(0, 0, 0, 0);

	int activeLines = 7;

	LocalDate tomorrowDate = LocalDate.now().plusDays(1);
	String day = String.valueOf(tomorrowDate.getDayOfMonth());
	String month = tomorrowDate.getMonth().toString().toLowerCase();

	public Tomorrow() {
		this.setBackground(new Color(55, 80, 107));
		this.setLayout(null);

		JLabel tomorrowLabel = new JLabel("Tomorrow");
		tomorrowLabel.setForeground(new Color(255, 255, 255));
		tomorrowLabel.setFont(new Font("American Typewriter", Font.BOLD, 60));
		tomorrowLabel.setBounds(70, 60, 330, 80);
		// tomorrowLabel.setBorder(border);

		JLabel date = new JLabel();
		month = month.substring(0, 1).toUpperCase() + month.substring(1);
		date.setText(day + " " + month);
		date.setForeground(new Color(115, 150, 200));
		date.setFont(new Font("Annai MN", Font.BOLD, 20));
		date.setHorizontalAlignment(JLabel.LEFT);
		date.setBounds(75, 128, 330, 30);
		// date.setBorder(border);

		JLabel active = new JLabel("Coming Soon");
		active.setForeground(new Color(200, 130, 25));
		active.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				active.setBounds(getWidth() / 7, 180, 300, 50);
			}
		});

		// CheckBoxIcon futureTaskCheck = new CheckBoxIcon("futureTask");

		for (int i = 1; i < activeLines; i++) {
			int lines = i;
			JCheckBox checkBox = new JCheckBox();
			// checkBox.setIcon(futureTaskCheck);

			checkBox.setText("  Alergi");
			checkBox.setForeground(new Color(255, 255, 255));
			checkBox.setFont(new Font("Chalkboard SE", Font.BOLD, 20));
			checkBox.setFocusable(false);
			this.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentResized(java.awt.event.ComponentEvent evt) {
					checkBox.setBounds(getWidth() / 7, 180 + lines * 55, getWidth() - getWidth() / 4, 40);
				}
			});
			this.add(checkBox);
		}

		JButton addTask = new JButton("add Task");
		addTask.setForeground(new Color(75, 150, 235));
		addTask.setFont(new Font("Chalkboard SE", Font.BOLD, 25));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				addTask.setBounds(getWidth() / 7 - 20, 240 + (activeLines - 1) * 55, 150, 25);
			}
		});
		addTask.setBorder(emptyBorder);

		JButton removeTask = new JButton("remove Task");
		removeTask.setForeground(new Color(170, 100, 210));
		removeTask.setFont(new Font("Chalkboard SE", Font.BOLD, 25));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				removeTask.setBounds(getWidth() - getWidth() / 7 - 150, 240 + (activeLines - 1) * 55, 150, 25);
			}
		});
		removeTask.setBorder(emptyBorder);

		this.add(tomorrowLabel);
		this.add(date);
		this.add(active);
		this.add(addTask);
		this.add(removeTask);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2D = (Graphics2D) g;

		// *********************************************************************************//
		RenderingHints qualityHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		qualityHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g2D.setRenderingHints(qualityHints);
		// *********************************************************************************//

		g2D.setPaint(new Color(120, 160, 190));
		g2D.setStroke(new BasicStroke(1));

		int activeLine = 230;

		for (int i = 0; i < activeLines; i++) {
			g2D.drawLine(getWidth() / 7, activeLine + i * 55,
					getWidth() - getWidth() / 7, activeLine + i * 55);
		}
	}
}