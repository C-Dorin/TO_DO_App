package com.to_do_app.Content_Panels.Agenda_Panels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.time.LocalDate;

public class NextWeek extends JPanel {
	Border border = BorderFactory.createBevelBorder(1, new Color(255, 255, 255), new Color(100, 100, 100));
	Border emptyBorder = BorderFactory.createEmptyBorder(0, 0, 0, 0);

	int LinesDay1 = 2;
	int LinesDay2 = 2;
	int LinesDay3 = 2;
	int LinesDay4 = 2;
	int LinesDay5 = 2;
	int LinesDay6 = 2;
	int LinesDay7 = 2;

	LocalDate Day1 = LocalDate.now().plusDays(1);
	String day1 = String.valueOf(Day1.getDayOfMonth());
	String week1 = String.valueOf(Day1.getDayOfWeek()).toLowerCase();
	String month1 = Day1.getMonth().toString().toLowerCase();

	LocalDate Day2 = LocalDate.now().plusDays(2);
	String day2 = String.valueOf(Day2.getDayOfMonth());
	String week2 = String.valueOf(Day2.getDayOfWeek()).toLowerCase();
	String month2 = Day2.getMonth().toString().toLowerCase();

	LocalDate Day3 = LocalDate.now().plusDays(3);
	String day3 = String.valueOf(Day3.getDayOfMonth());
	String week3 = String.valueOf(Day3.getDayOfWeek()).toLowerCase();
	String month3 = Day3.getMonth().toString().toLowerCase();

	LocalDate Day4 = LocalDate.now().plusDays(4);
	String day4 = String.valueOf(Day4.getDayOfMonth());
	String week4 = String.valueOf(Day4.getDayOfWeek()).toLowerCase();
	String month4 = Day4.getMonth().toString().toLowerCase();

	LocalDate Day5 = LocalDate.now().plusDays(5);
	String day5 = String.valueOf(Day5.getDayOfMonth());
	String week5 = String.valueOf(Day5.getDayOfWeek()).toLowerCase();
	String month5 = Day5.getMonth().toString().toLowerCase();

	LocalDate Day6 = LocalDate.now().plusDays(6);
	String day6 = String.valueOf(Day6.getDayOfMonth());
	String week6 = String.valueOf(Day6.getDayOfWeek()).toLowerCase();
	String month6 = Day6.getMonth().toString().toLowerCase();

	LocalDate Day7 = LocalDate.now().plusDays(7);
	String day7 = String.valueOf(Day7.getDayOfMonth());
	String week7 = String.valueOf(Day7.getDayOfWeek()).toLowerCase();
	String month7 = Day7.getMonth().toString().toLowerCase();

	public NextWeek() {

		this.setBackground(new Color(55, 80, 107));
		this.setLayout(null);

		month1 = month1.substring(0, 1).toUpperCase() + month1.substring(1);
		month2 = month2.substring(0, 1).toUpperCase() + month2.substring(1);
		month3 = month3.substring(0, 1).toUpperCase() + month3.substring(1);
		month4 = month4.substring(0, 1).toUpperCase() + month4.substring(1);
		month5 = month5.substring(0, 1).toUpperCase() + month5.substring(1);
		month6 = month6.substring(0, 1).toUpperCase() + month6.substring(1);
		month7 = month7.substring(0, 1).toUpperCase() + month7.substring(1);

		week1 = week1.substring(0, 1).toUpperCase() + week1.substring(1);
		week2 = week2.substring(0, 1).toUpperCase() + week2.substring(1);
		week3 = week3.substring(0, 1).toUpperCase() + week3.substring(1);
		week4 = week4.substring(0, 1).toUpperCase() + week4.substring(1);
		week5 = week5.substring(0, 1).toUpperCase() + week5.substring(1);
		week6 = week6.substring(0, 1).toUpperCase() + week6.substring(1);
		week7 = week7.substring(0, 1).toUpperCase() + week7.substring(1);

		JLabel nextWeekLabel = new JLabel("Next Week");
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

		JLabel Day1 = new JLabel(week1);
		Day1.setForeground(new Color(160, 135, 200));
		Day1.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Day1.setBounds(getWidth() / 7, 210, 170, 40);
			}
		});
		// Day1.setBorder(border);

		JLabel Date1 = new JLabel(day1 + " " + month1);
		Date1.setForeground(new Color(160, 135, 200));
		Date1.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		Date1.setHorizontalAlignment(SwingConstants.RIGHT);
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Date1.setBounds(getWidth() - getWidth() / 7 - 200, 210, 200, 40);
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
		JLabel Day2 = new JLabel(week2);
		Day2.setForeground(new Color(160, 135, 200));
		Day2.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Day2.setBounds(getWidth() / 7, 320 + (day2LinesTotal - 1) * 55, 170, 40);
			}
		});
		// Day2.setBorder(border);

		JLabel Date2 = new JLabel(day2 + " " + month2);
		Date2.setForeground(new Color(160, 135, 200));
		Date2.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		Date2.setHorizontalAlignment(SwingConstants.RIGHT);
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Date2.setBounds(getWidth() - getWidth() / 7 - 200, 320 + (day2LinesTotal - 1) * 55, 200, 40);
			}
		});
		// Date2.setBorder(border);

		for (int i = 1; i < LinesDay2; i++) {
			int lines = i;
			JCheckBox checkBox = new JCheckBox();
			// checkBox.setIcon(futureTaskCheck);
			checkBox.setText("  Test aufhei aih aeif aioef haei rrei fea er erai eg ir foeira ");
			checkBox.setForeground(new Color(255, 255, 255));
			checkBox.setFont(new Font("Chalkboard SE", Font.BOLD, 20));
			checkBox.setFocusable(false);
			this.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentResized(java.awt.event.ComponentEvent evt) {
					checkBox.setBounds(getWidth() / 7, 320 + (lines + day2LinesTotal - 1) * 55, getWidth() - getWidth() / 4, 40);
				}
			});
			this.add(checkBox);
		}

		int day3LinesTotal = day2LinesTotal + LinesDay2 - 1;
		JLabel Day3 = new JLabel(week3);
		Day3.setForeground(new Color(160, 135, 200));
		Day3.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Day3.setBounds(getWidth() / 7, 430 + (day3LinesTotal - 1) * 55, 170, 40);
			}
		});
		// Day3.setBorder(border);

		JLabel Date3 = new JLabel(day3 + " " + month3);
		Date3.setForeground(new Color(160, 135, 200));
		Date3.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		Date3.setHorizontalAlignment(SwingConstants.RIGHT);
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Date3.setBounds(getWidth() - getWidth() / 7 - 200, 430 + (day3LinesTotal - 1) * 55, 200, 40);
			}
		});
		// Date3.setBorder(border);

		for (int i = 1; i < LinesDay3; i++) {
			int lines = i;
			JCheckBox checkBox = new JCheckBox();
			// checkBox.setIcon(futureTaskCheck);
			checkBox.setText("  Test aufhei aih aeif aioef haei rrei fea er erai eg ir foeira ");
			checkBox.setForeground(new Color(255, 255, 255));
			checkBox.setFont(new Font("Chalkboard SE", Font.BOLD, 20));
			checkBox.setFocusable(false);
			this.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentResized(java.awt.event.ComponentEvent evt) {
					checkBox.setBounds(getWidth() / 7, 430 + (lines + day3LinesTotal - 1) * 55, getWidth() - getWidth() / 4, 40);
				}
			});
			this.add(checkBox);
		}

		int day4LinesTotal = day3LinesTotal + LinesDay3 - 1;
		JLabel Day4 = new JLabel(week4);
		Day4.setForeground(new Color(160, 135, 200));
		Day4.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Day4.setBounds(getWidth() / 7, 540 + (day4LinesTotal - 1) * 55, 170, 40);
			}
		});
		// Day4.setBorder(border);

		JLabel Date4 = new JLabel(day4 + " " + month4);
		Date4.setForeground(new Color(160, 135, 200));
		Date4.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		Date4.setHorizontalAlignment(SwingConstants.RIGHT);
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Date4.setBounds(getWidth() - getWidth() / 7 - 200, 540 + (day4LinesTotal - 1) * 55, 200, 40);
			}
		});
		// Date4.setBorder(border);

		for (int i = 1; i < LinesDay4; i++) {
			int lines = i;
			JCheckBox checkBox = new JCheckBox();
			// checkBox.setIcon(futureTaskCheck);

			checkBox.setText("  Test aufhei aih aeif aioef haei rrei fea er erai eg ir foeira ");
			checkBox.setForeground(new Color(255, 255, 255));
			checkBox.setFont(new Font("Chalkboard SE", Font.BOLD, 20));
			checkBox.setFocusable(false);
			this.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentResized(java.awt.event.ComponentEvent evt) {
					checkBox.setBounds(getWidth() / 7, 540 + (lines + day4LinesTotal - 1) * 55, getWidth() - getWidth() / 4, 40);
				}
			});
			this.add(checkBox);
		}

		int day5LinesTotal = day4LinesTotal + LinesDay4 - 1;
		JLabel Day5 = new JLabel(week5);
		Day5.setForeground(new Color(160, 135, 200));
		Day5.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Day5.setBounds(getWidth() / 7, 650 + (day5LinesTotal - 1) * 55, 170, 40);
			}
		});
		// Day5.setBorder(border);

		JLabel Date5 = new JLabel(day5 + " " + month5);
		Date5.setForeground(new Color(160, 135, 200));
		Date5.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		Date5.setHorizontalAlignment(SwingConstants.RIGHT);
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Date5.setBounds(getWidth() - getWidth() / 7 - 200, 650 + (day5LinesTotal - 1) * 55, 200, 40);
			}
		});
		// Date5.setBorder(border);

		for (int i = 1; i < LinesDay5; i++) {
			int lines = i;
			JCheckBox checkBox = new JCheckBox();
			// checkBox.setIcon(futureTaskCheck);
			checkBox.setText("  Test aufhei aih aeif aioef haei rrei fea er erai eg ir foeira ");
			checkBox.setForeground(new Color(255, 255, 255));
			checkBox.setFont(new Font("Chalkboard SE", Font.BOLD, 20));
			checkBox.setFocusable(false);
			this.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentResized(java.awt.event.ComponentEvent evt) {
					checkBox.setBounds(getWidth() / 7, 650 + (lines + day5LinesTotal - 1) * 55, getWidth() - getWidth() / 4, 40);
				}
			});
			this.add(checkBox);
		}

		int day6LinesTotal = day5LinesTotal + LinesDay5 - 1;
		JLabel Day6 = new JLabel(week6);
		Day6.setForeground(new Color(160, 135, 200));
		Day6.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Day6.setBounds(getWidth() / 7, 760 + (day6LinesTotal - 1) * 55, 170, 40);
			}
		});
		// Day6.setBorder(border);

		JLabel Date6 = new JLabel(day6 + " " + month6);
		Date6.setForeground(new Color(160, 135, 200));
		Date6.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		Date6.setHorizontalAlignment(SwingConstants.RIGHT);
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Date6.setBounds(getWidth() - getWidth() / 7 - 200, 760 + (day6LinesTotal - 1) * 55, 200, 40);
			}
		});
		// Date6.setBorder(border);

		for (int i = 1; i < LinesDay6; i++) {
			int lines = i;
			JCheckBox checkBox = new JCheckBox();
			// checkBox.setIcon(futureTaskCheck);

			checkBox.setText("  Test aufhei aih aeif aioef haei rrei fea er erai eg ir foeira ");
			checkBox.setForeground(new Color(255, 255, 255));
			checkBox.setFont(new Font("Chalkboard SE", Font.BOLD, 20));
			checkBox.setFocusable(false);
			this.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentResized(java.awt.event.ComponentEvent evt) {
					checkBox.setBounds(getWidth() / 7, 760 + (lines + day6LinesTotal - 1) * 55, getWidth() - getWidth() / 4, 40);
				}
			});
			this.add(checkBox);
		}

		int day7LinesTotal = day6LinesTotal + LinesDay6 - 1;
		JLabel Day7 = new JLabel(week6);
		Day7.setForeground(new Color(160, 135, 200));
		Day7.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Day7.setBounds(getWidth() / 7, 870 + (day7LinesTotal - 1) * 55, 170, 40);
			}
		});
		// Day7.setBorder(border);

		JLabel Date7 = new JLabel(day7 + " " + month7);
		Date7.setForeground(new Color(160, 135, 200));
		Date7.setFont(new Font("Chalkboard SE", Font.BOLD, 30));
		Date7.setHorizontalAlignment(SwingConstants.RIGHT);
		this.addComponentListener(new java.awt.event.ComponentAdapter() {
			public void componentResized(java.awt.event.ComponentEvent evt) {
				Date7.setBounds(getWidth() - getWidth() / 7 - 200, 870 + (day7LinesTotal - 1) * 55, 200, 40);
			}
		});
		// Date7.setBorder(border);

		for (int i = 1; i < LinesDay7; i++) {
			int lines = i;
			JCheckBox checkBox = new JCheckBox();
			// checkBox.setIcon(futureTaskCheck);

			checkBox.setText("  Test aufhei aih aeif aioef haei rrei fea er erai eg ir foeira ");
			checkBox.setForeground(new Color(255, 255, 255));
			checkBox.setFont(new Font("Chalkboard SE", Font.BOLD, 20));
			checkBox.setFocusable(false);
			this.addComponentListener(new java.awt.event.ComponentAdapter() {
				public void componentResized(java.awt.event.ComponentEvent evt) {
					checkBox.setBounds(getWidth() / 7, 870 + (lines + day7LinesTotal - 1) * 55, getWidth() - getWidth() / 4, 40);
				}
			});
			this.add(checkBox);
		}

		this.add(nextWeekLabel);
		this.add(firstDay);
		this.add(lastDay);
		this.add(Day1);
		this.add(Day2);
		this.add(Day3);
		this.add(Day4);
		this.add(Day5);
		this.add(Day6);
		this.add(Day7);
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

		// *********************************************************************************//
		RenderingHints qualityHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		qualityHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g2D.setRenderingHints(qualityHints);
		// *********************************************************************************//

		g2D.setPaint(new Color(120, 160, 190));
		g2D.setStroke(new BasicStroke(1));

		int day1Line = 260;
		int day2Line = 370;
		int day3Line = 480;
		int day4Line = 590;
		int day5Line = 700;
		int day6Line = 810;
		int day7Line = 920;

		for (int i = 0; i < LinesDay1; i++) {
			g2D.drawLine(getWidth() / 7, day1Line + i * 55,
					getWidth() - getWidth() / 7, day1Line + i * 55);
		}

		int day2LinesTotal = LinesDay1;
		for (int i = 0; i < LinesDay2; i++) {
			g2D.drawLine(getWidth() / 7, day2Line + (day2LinesTotal + i - 1) * 55,
					getWidth() - getWidth() / 7, day2Line + (day2LinesTotal + i - 1) * 55);
		}

		int day3LinesTotal = day2LinesTotal + LinesDay2 - 1;
		for (int i = 0; i < LinesDay3; i++) {
			g2D.drawLine(getWidth() / 7, day3Line + (day3LinesTotal + i - 1) * 55,
					getWidth() - getWidth() / 7, day3Line + (day3LinesTotal + i - 1) * 55);
		}

		int day4LinesTotal = day3LinesTotal + LinesDay3 - 1;
		for (int i = 0; i < LinesDay4; i++) {
			g2D.drawLine(getWidth() / 7, day4Line + (day4LinesTotal + i - 1) * 55,
					getWidth() - getWidth() / 7, day4Line + (day4LinesTotal + i - 1) * 55);
		}

		int day5LinesTotal = day4LinesTotal + LinesDay4 - 1;
		for (int i = 0; i < LinesDay5; i++) {
			g2D.drawLine(getWidth() / 7, day5Line + (day5LinesTotal + i - 1) * 55,
					getWidth() - getWidth() / 7, day5Line + (day5LinesTotal + i - 1) * 55);
		}

		int day6LinesTotal = day5LinesTotal + LinesDay5 - 1;
		for (int i = 0; i < LinesDay6; i++) {
			g2D.drawLine(getWidth() / 7, day6Line + (day6LinesTotal + i - 1) * 55,
					getWidth() - getWidth() / 7, day6Line + (day6LinesTotal + i - 1) * 55);
		}

		int day7LinesTotal = day6LinesTotal + LinesDay6 - 1;
		for (int i = 0; i < LinesDay7; i++) {
			g2D.drawLine(getWidth() / 7, day7Line + (day7LinesTotal + i - 1) * 55,
					getWidth() - getWidth() / 7, day7Line + (day7LinesTotal + i - 1) * 55);
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
