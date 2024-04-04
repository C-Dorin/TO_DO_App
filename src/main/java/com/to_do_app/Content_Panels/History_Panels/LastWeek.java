package com.to_do_app.Content_Panels.History_Panels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.time.LocalDate;

public class LastWeek extends JPanel {

	Border border = BorderFactory.createBevelBorder(1, new Color(255, 255, 255), new Color(100, 100, 100));
	Border emptyBorder = BorderFactory.createEmptyBorder(0, 0, 0, 0);

	int LinesDay1 = 3;
	int LinesDay2 = 4;
	int LinesDay3 = 1;
	int LinesDay4 = 1;
	int LinesDay5 = 1;
	int LinesDay6 = 1;
	int LinesDay7 = 1;

	LocalDate Day1 = LocalDate.now().minusDays(7);
	String day1 = String.valueOf(Day1.getDayOfMonth());
	String month1 = Day1.getMonth().toString().toLowerCase();

	LocalDate Day2 = LocalDate.now().minusDays(6);
	String day2 = String.valueOf(Day2.getDayOfMonth());
	String month2 = Day2.getMonth().toString().toLowerCase();

	LocalDate Day3 = LocalDate.now().minusDays(5);
	String day3 = String.valueOf(Day3.getDayOfMonth());
	String month3 = Day3.getMonth().toString().toLowerCase();

	LocalDate Day4 = LocalDate.now().minusDays(4);
	String day4 = String.valueOf(Day4.getDayOfMonth());
	String month4 = Day4.getMonth().toString().toLowerCase();

	LocalDate Day5 = LocalDate.now().minusDays(3);
	String day5 = String.valueOf(Day5.getDayOfMonth());
	String month5 = Day5.getMonth().toString().toLowerCase();

	LocalDate Day6 = LocalDate.now().minusDays(2);
	String day6 = String.valueOf(Day6.getDayOfMonth());
	String month6 = Day6.getMonth().toString().toLowerCase();

	LocalDate Day7 = LocalDate.now().minusDays(1);
	String day7 = String.valueOf(Day7.getDayOfMonth());
	String month7 = Day7.getMonth().toString().toLowerCase();

	public LastWeek() {

		this.setBackground(new Color(55, 80, 107));
		this.setLayout(null);

		month1 = month1.substring(0, 1).toUpperCase() + month1.substring(1);
		month2 = month2.substring(0, 1).toUpperCase() + month2.substring(1);
		month3 = month3.substring(0, 1).toUpperCase() + month3.substring(1);
		month4 = month4.substring(0, 1).toUpperCase() + month4.substring(1);
		month5 = month5.substring(0, 1).toUpperCase() + month5.substring(1);
		month6 = month6.substring(0, 1).toUpperCase() + month6.substring(1);
		month7 = month7.substring(0, 1).toUpperCase() + month7.substring(1);

		JLabel nextWeekLabel = new JLabel("Last Week");
		nextWeekLabel.setForeground(new Color(255, 255, 255));
		nextWeekLabel.setFont(new Font("American Typewriter", Font.BOLD, 60));
		nextWeekLabel.setBounds(70, 60, 350, 80);
		// nextWeekLabel.setBorder(border);

		JLabel firstDay = new JLabel(day1 + " " + month1);
		firstDay.setForeground(new Color(115, 150, 200));
		firstDay.setFont(new Font("Annai MN", Font.BOLD, 20));
		firstDay.setHorizontalAlignment(JLabel.CENTER);
		firstDay.setBounds(75, 138, 160, 30);
		// firstDay.setBorder(border);

		JLabel lastDay = new JLabel(day7 + " " + month7);
		lastDay.setForeground(new Color(115, 150, 200));
		lastDay.setFont(new Font("Annai MN", Font.BOLD, 20));
		lastDay.setHorizontalAlignment(JLabel.CENTER);
		lastDay.setBounds(75, 168, 160, 30);
		// lastDay.setBorder(border);

		JLabel Date1 = new JLabel(day1 + " " + month1);
		Date1.setForeground(new Color(130, 150, 190));
		Date1.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Date1.setBounds(getWidth() / 7, 210, 200, 40);
			}
		});
		// Date1.setBorder(border);

		// CheckBoxIcon futureTaskCheck = new CheckBoxIcon("futureTask");

		for (int i = 1; i < LinesDay1; i++) {
			int lines = i;
			JCheckBox checkBox = new JCheckBox();
			// checkBox.setIcon(futureTaskCheck);
			checkBox.setText("  Test aufhei aih aeif aioef haei rrei fea er erai eg ir foeira ");
			checkBox.setForeground(new Color(255, 255, 255));
			checkBox.setFont(new Font("Chalkboard SE", Font.BOLD, 20));
			checkBox.setFocusable(false);
			this.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentResized(java.awt.event.ComponentEvent evt) {
					checkBox.setBounds(getWidth() / 7, 210 + lines * 55, getWidth() - getWidth() / 4, 40);
				}
			});
			this.add(checkBox);
		}

		int day2LinesTotal = LinesDay1;
		JLabel Date2 = new JLabel(day2 + " " + month2);
		Date2.setForeground(new Color(130, 150, 190));
		Date2.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Date2.setBounds(getWidth() / 7, 320 + (day2LinesTotal - 1) * 57, 200, 40);
			}
		});
		// Date2.setBorder(border);

		int day3LinesTotal = day2LinesTotal + LinesDay2 - 1;
		JLabel Date3 = new JLabel(day3 + " " + month3);
		Date3.setForeground(new Color(130, 150, 190));
		Date3.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Date3.setBounds(getWidth() / 7, 430 + (day3LinesTotal - 1) * 57, 200, 40);
			}
		});
		// Date3.setBorder(border);

		int day4LinesTotal = day3LinesTotal + LinesDay3 - 1;
		JLabel Date4 = new JLabel(day4 + " " + month4);
		Date4.setForeground(new Color(130, 150, 190));
		Date4.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Date4.setBounds(getWidth() / 7, 540 + (day4LinesTotal - 1) * 57, 200, 40);
			}
		});
		// Date4.setBorder(border);

		int day5LinesTotal = day4LinesTotal + LinesDay4 - 1;
		JLabel Date5 = new JLabel(day5 + " " + month5);
		Date5.setForeground(new Color(130, 150, 190));
		Date5.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Date5.setBounds(getWidth() / 7, 650 + (day5LinesTotal - 1) * 57, 200, 40);
			}
		});
		// Date5.setBorder(border);

		int day6LinesTotal = day5LinesTotal + LinesDay5 - 1;
		JLabel Date6 = new JLabel(day6 + " " + month6);
		Date6.setForeground(new Color(130, 150, 190));
		Date6.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Date6.setBounds(getWidth() / 7, 760 + (day6LinesTotal - 1) * 57, 200, 40);
			}
		});
		// Date6.setBorder(border);

		int day7LinesTotal = day6LinesTotal + LinesDay6 - 1;
		JLabel Date7 = new JLabel(day7 + " " + month7);
		Date7.setForeground(new Color(130, 150, 190));
		Date7.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Date7.setBounds(getWidth() / 7, 870 + (day7LinesTotal - 1) * 57, 200, 40);
			}
		});
		// Date7.setBorder(border);

		this.add(nextWeekLabel);
		this.add(firstDay);
		this.add(lastDay);
		this.add(Date1);
		this.add(Date2);
		this.add(Date3);
		this.add(Date4);
		this.add(Date5);
		this.add(Date6);
		this.add(Date7);

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2D = (Graphics2D) g;
		Graphics2D line = (Graphics2D) g;

		int day1Line = 260;
		int day2Line = 370;
		int day3Line = 480;
		int day4Line = 590;
		int day5Line = 700;
		int day6Line = 810;
		int day7Line = 920;

		// *********************************************************************************//
		RenderingHints qualityHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		qualityHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g2D.setRenderingHints(qualityHints);
		// *********************************************************************************//

		for (int i = 0; i < LinesDay1 - 1; i++) {
			if (i % 2 == 0) {
				g2D.setPaint(new Color(45, 65, 95));
			} else {
				g2D.setPaint(new Color(35, 40, 55));
			}

			g2D.fill(new RoundRectangle2D.Double(getWidth() / 7, day1Line + i * 57,
					getWidth() - 2 * getWidth() / 7, 55, 20, 20));
		}

		int day2LinesTotal = LinesDay1;
		for (int i = 0; i < LinesDay2 - 1; i++) {
			if (i % 2 == 0) {
				g2D.setPaint(new Color(45, 65, 95));
			} else {
				g2D.setPaint(new Color(35, 40, 55));
			}
			g2D.fill(new RoundRectangle2D.Double(getWidth() / 7, day2Line + (day2LinesTotal + i - 1)
					* 57, getWidth() - 2 * getWidth() / 7, 55, 20, 20));
		}

		int day3LinesTotal = day2LinesTotal + LinesDay2 - 1;
		for (int i = 0; i < LinesDay3 - 1; i++) {
			if (i % 2 == 0) {
				g2D.setPaint(new Color(45, 65, 95));
			} else {
				g2D.setPaint(new Color(35, 40, 55));
			}
			g2D.fill(new RoundRectangle2D.Double(getWidth() / 7, day3Line + (day3LinesTotal + i - 1)
					* 57, getWidth() - 2 * getWidth() / 7, 55, 20, 20));
		}

		int day4LinesTotal = day3LinesTotal + LinesDay3 - 1;
		for (int i = 0; i < LinesDay4 - 1; i++) {
			if (i % 2 == 0) {
				g2D.setPaint(new Color(45, 65, 95));
			} else {
				g2D.setPaint(new Color(35, 40, 55));
			}
			g2D.fill(new RoundRectangle2D.Double(getWidth() / 7, day4Line + (day4LinesTotal + i - 1)
					* 57, getWidth() - 2 * getWidth() / 7, 55, 20, 20));
		}

		int day5LinesTotal = day4LinesTotal + LinesDay4 - 1;
		for (int i = 0; i < LinesDay5 - 1; i++) {
			if (i % 2 == 0) {
				g2D.setPaint(new Color(45, 65, 95));
			} else {
				g2D.setPaint(new Color(35, 40, 55));
			}
			g2D.fill(new RoundRectangle2D.Double(getWidth() / 7, day5Line + (day5LinesTotal + i - 1)
					* 57, getWidth() - 2 * getWidth() / 7, 55, 20, 20));
		}

		int day6LinesTotal = day5LinesTotal + LinesDay5 - 1;
		for (int i = 0; i < LinesDay6 - 1; i++) {
			if (i % 2 == 0) {
				g2D.setPaint(new Color(45, 65, 95));
			} else {
				g2D.setPaint(new Color(35, 40, 55));
			}
			g2D.fill(new RoundRectangle2D.Double(getWidth() / 7, day6Line + (day6LinesTotal + i - 1)
					* 57, getWidth() - 2 * getWidth() / 7, 55, 20, 20));
		}

		int day7LinesTotal = day6LinesTotal + LinesDay6 - 1;
		for (int i = 0; i < LinesDay7 - 1; i++) {
			if (i % 2 == 0) {
				g2D.setPaint(new Color(45, 65, 95));
			} else {
				g2D.setPaint(new Color(35, 40, 55));
			}
			g2D.fill(new RoundRectangle2D.Double(getWidth() / 7, day7Line + (day7LinesTotal + i - 1)
					* 57, getWidth() - 2 * getWidth() / 7, 55, 20, 20));
		}

		line.setPaint(new Color(5, 225, 5));
		line.setStroke(new BasicStroke(1));

		line.drawLine(75, 138, 105, 138);
		line.drawLine(75, 138, 75, 168);
		line.drawLine(75, 168, 235, 168);
		line.drawLine(235, 168, 235, 198);
		line.drawLine(205, 198, 235, 198);

	}
}
