package UI;

import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.images.Eyes;
import java.io.IOException;

public class test1 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		
		
		Eyes eyes = new Eyes();
		//eyes.setApiKey("UkDryyzbaRzgFj0HFDsUlXMWwhmQcbPGYwHa4104p2OW8110");
        // Initialize the eyes SDK and set your private API key.
    eyes.setApiKey("UkDryyzbaRzgFj0HFDsUlXMWwhmQcbPGYwHa4104p2OW8110");

        // Define the OS and hosting application to identify the baseline.
        eyes.setHostOS("Windows 7");
        eyes.setHostApp("My google chrome browser");

        BufferedImage img;

        try {

            // Start the test with a viewport size of 800x600.
        	
            eyes.open("Horlickks|Junior site", "h Screenshot test!", new RectangleSize(800, 600));

            // Load page image and validate.
            img = ImageIO.read(new URL("https://horlicks-in-agency-starterkit.unileversolutions.com/sk-eu/content/dam/brands/horlicks/india/1669529-junior-carousel-2xdha-desktop.jpg.rendition.1960.1960.jpg"));

            // Visual validation.
            eyes.checkImage(img, "Junior Horlicks: A Nutritional Drink for Kids | Unilever Horlicks");
            
            

            // End visual UI testing.
            eyes.close();

        } finally {

            // If the test was aborted before eyes.close was called, ends the test as aborted.
            eyes.abortIfNotClosed();

        }
	}

}
