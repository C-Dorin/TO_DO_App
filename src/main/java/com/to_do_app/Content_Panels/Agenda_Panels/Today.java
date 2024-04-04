package com.to_do_app.Content_Panels.Agenda_Panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class Today extends JPanel {

	Border border = BorderFactory.createBevelBorder(1, new Color(255, 255, 255), new Color(100, 100, 100));
	Border emptyBorder = BorderFactory.createEmptyBorder(0, 0, 0, 0);

	int activeLines = 50;
	int completedLines = 7;

	ImageIcon doneIcon;
	ImageIcon not_doneIcon;

	LocalDate todayDate = LocalDate.now();
	String day = String.valueOf(todayDate.getDayOfMonth());
	String month = todayDate.getMonth().toString().toLowerCase();

	public Today() {
		this.setLayout(new BorderLayout());

		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

		contentPanel.setBackground(new Color(55, 80, 107));

		JLabel todayLabel = new JLabel("Today");
		todayLabel.setLayout(null);
		todayLabel.setForeground(new Color(255, 255, 255));
		todayLabel.setFont(new Font("American Typewriter", Font.BOLD, 60));
		// todayLabel.setBounds(70, 60, 200, 80);
		todayLabel.setAlignmentX(1);
		todayLabel.setAlignmentY(1);
		todayLabel.setBorder(border);
		contentPanel.add(todayLabel);

		JLabel date = new JLabel();
		month = month.substring(0, 1).toUpperCase() + month.substring(1);
		date.setText(day + " " + month);
		date.setForeground(new Color(115, 150, 200));
		date.setFont(new Font("Annai MN", Font.BOLD, 20));
		date.setHorizontalAlignment(JLabel.LEFT);
		date.setBounds(75, 128, 180, 30);
		// date.setBorder(border);
		contentPanel.add(date);

		JLabel active = new JLabel("Active");
		active.setForeground(new Color(200, 190, 25));
		active.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		contentPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				active.setBounds(getWidth() / 7, 180, 100, 40);
			}
		});
		contentPanel.add(active);

		// CheckBoxIcon needToDoneCheck = new CheckBoxIcon("needToDone");

		for (int i = 1; i < activeLines; i++) {
			int lines = i;
			JCheckBox checkBox = new JCheckBox();
			// checkBox.setIcon(needToDoneCheck);

			checkBox.setText(" Test");
			checkBox.setForeground(new Color(255, 255, 255));
			checkBox.setFont(new Font("Chalkboard SE", Font.BOLD, 20));
			checkBox.setFocusable(false);
			contentPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentResized(java.awt.event.ComponentEvent evt) {
					checkBox.setBounds(getWidth() / 7, 180 + lines * 55, getWidth() - getWidth() / 4, 40);
				}
			});
			contentPanel.add(checkBox);
		}

		JButton addTask = new JButton("add Task");
		addTask.setForeground(new Color(75, 150, 235));
		addTask.setFont(new Font("Chalkboard SE", Font.BOLD, 25));
		contentPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				addTask.setBounds(getWidth() / 7 - 20, 240 + (activeLines - 1) * 55, 150, 25);
			}
		});
		addTask.setBorder(emptyBorder);
		contentPanel.add(addTask);

		JButton removeTask = new JButton("remove Task");
		removeTask.setForeground(new Color(170, 100, 210));
		removeTask.setFont(new Font("Chalkboard SE", Font.BOLD, 25));
		contentPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				removeTask.setBounds(getWidth() - getWidth() / 7 - 150, 240 + (activeLines - 1) * 55, 150, 25);
			}
		});
		removeTask.setBorder(emptyBorder);
		contentPanel.add(removeTask);

		JLabel completed = new JLabel("Completed");
		completed.setForeground(new Color(50, 190, 25));
		completed.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		contentPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				completed.setBounds(getWidth() / 7, 350 + (activeLines - 1) * 55, 150, 40);
			}
		});
		contentPanel.add(completed);

		// CheckBoxIcon doneCheck = new CheckBoxIcon("done");

		for (int i = 1; i < completedLines; i++) {
			int lines = i;
			JCheckBox checkBox = new JCheckBox();
			// checkBox.setIcon(doneCheck);

			checkBox.setText(" Test");
			checkBox.setForeground(new Color(255, 255, 255));
			checkBox.setFont(new Font("Chalkboard SE", Font.BOLD, 20));
			checkBox.setFocusable(false);
			contentPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentResized(java.awt.event.ComponentEvent evt) {
					checkBox.setBounds(getWidth() / 7, 295 + (lines + activeLines) * 55, getWidth() - getWidth() / 4, 40);
				}
			});
			contentPanel.add(checkBox);
		}

		JScrollPane scrollPane = new JScrollPane(contentPanel);
		this.add(scrollPane, BorderLayout.CENTER);
	}

	// @Override
	// public void paint(Graphics g) {
	// super.paint(g);

	// Graphics2D g2D = (Graphics2D) g;

	// //
	// *********************************************************************************//
	// RenderingHints qualityHints = new
	// RenderingHints(RenderingHints.KEY_ANTIALIASING,
	// RenderingHints.VALUE_ANTIALIAS_ON);
	// qualityHints.put(RenderingHints.KEY_RENDERING,
	// RenderingHints.VALUE_RENDER_QUALITY);
	// g2D.setRenderingHints(qualityHints);
	// //
	// *********************************************************************************//

	// g2D.setPaint(new Color(120, 160, 190));
	// g2D.setStroke(new BasicStroke(1));

	// int activeLine = 230;
	// int completedLine = 400;

	// for (int i = 0; i < activeLines; i++) {
	// g2D.drawLine(getWidth() / 7, activeLine + i * 55,
	// getWidth() - getWidth() / 7, activeLine + i * 55);
	// }

	// for (int i = 0; i < completedLines; i++) {
	// g2D.drawLine(getWidth() / 7, completedLine + (activeLines + i - 1) * 55,
	// getWidth() - getWidth() / 7,
	// completedLine + (activeLines + i - 1) * 55);
	// }
	// }
}