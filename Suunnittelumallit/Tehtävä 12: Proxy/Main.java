package tsydeemi;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
		Image image2 = new ProxyImage("HiRes_10MB_Photo2");

		image1.displayImage();
		image1.displayImage();
		image2.displayImage();
		image2.displayImage();
		image1.displayImage();

		System.out.println("\n\nTulosta kuvan nimi");
		System.out.println("--------------------");
		image1.showData();
		image2.showData();

		ArrayList<Image> imageFolder = new ArrayList<>();

		Image image3 = new ProxyImage("HiRes_10MB_Photo3");
		Image image4 = new ProxyImage("HiRes_10MB_Photo4");
		Image image5 = new ProxyImage("HiRes_10MB_Photo5");
		Image image6 = new ProxyImage("HiRes_10MB_Photo6");

		imageFolder.add(image3);
		imageFolder.add(image4);
		imageFolder.add(image5);
		imageFolder.add(image6);

		System.out.println("\n\nTulosta tiedot valokuvakansion sisällöstä");
		System.out.println("-------------------------------------------");

		for (Image img : imageFolder) {
			img.showData();
		}

		System.out.println("\n\nLataa kuvat");
		System.out.println("-------------");
		for (Image img : imageFolder) {
			img.displayImage();
		}

	}
}
