package com.to_do_app;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImageCreator extends ImageIcon {

	HashMap<String, ImageIcon> imgIcons = new HashMap<>();

	// ========== SuperMenu ==========//
	ImageIcon agendaIcon = resizeImage("src/main/resources/Img/SuperMenu/agenda.png", 50, 50);
	ImageIcon spacesIcon = resizeImage("src/main/resources/Img/SuperMenu/spaces.png", 50, 50);
	ImageIcon historyIcon = resizeImage("src/main/resources/Img/SuperMenu/history.png", 50, 50);
	ImageIcon analyticsIcon = resizeImage("src/main/resources/Img/SuperMenu/analytics.png", 50, 50);
	ImageIcon settingsIcon = resizeImage("src/main/resources/Img/SuperMenu/settings.png", 50, 50);

	ImageIcon doneIcon = resizeImage("src/main/resources/Img/CheckBox/done.png", 25, 25);
	ImageIcon needToDoneIcon = resizeImage("src/main/resources/Img/CheckBox/needToDone.png", 25, 25);
	ImageIcon futureTaskIcon = resizeImage("src/main/resources/Img/CheckBox/futureTask.png", 20, 20);

	ImageCreator(String name) {
		imgIcons.put("done", doneIcon);
		imgIcons.put("needToDone", needToDoneIcon);
		imgIcons.put("futureTask", futureTaskIcon);
		imgIcons.put("agenda", agendaIcon);
		imgIcons.put("spaces", spacesIcon);
		imgIcons.put("history", historyIcon);
		imgIcons.put("analytics", analyticsIcon);
		imgIcons.put("settings", settingsIcon);

		setImageIcon(imgIcons.get(name));
	}

	void setImageIcon(ImageIcon icon) {
		if (icon != null) {
			this.setImage(addPaddingToIcon(icon.getImage(), 3, 0));
		}
	}

	private Image addPaddingToIcon(Image image, int paddingTop, int paddingBottom) {
		int width = image.getWidth(null);
		int height = image.getHeight(null) + paddingTop + paddingBottom;

		BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = newImage.createGraphics();
		g2d.drawImage(image, 0, paddingTop, null);
		g2d.dispose();

		return newImage;
	}

	// ===== Function for RESIZE Images ===== //
	public ImageIcon resizeImage(String imagePath, int width, int height) {
		try {
			BufferedImage originalImage = ImageIO.read(new File(imagePath));
			Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);

			return new ImageIcon(resizedImage);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
