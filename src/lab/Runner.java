package lab;

import javax.swing.*;

import java.awt.event.*;
import java.net.MalformedURLException.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Runner {

	private static ArrayList<House> houses;

	public static void main(String[] args) throws Exception {
		houses = new ArrayList<House>();

		Scanner inFile = new Scanner(new File("src/lab/info.txt"));

		while (inFile.hasNext()) {
			int squareft = inFile.nextInt();
			double bathrooms = inFile.nextDouble();
			int bedrooms = inFile.nextInt();
			int cost = inFile.nextInt();
			inFile.nextLine();
			String address = inFile.nextLine();
			double lotsize = inFile.nextDouble();
			boolean haspool = inFile.nextBoolean();
			String image = inFile.next();

			houses.add(new House(squareft, bathrooms, bedrooms, cost, address, lotsize, haspool, image));
		}

		for (int i = 0; i < houses.size(); i++) {
			System.out.println(houses.get(i));
		}

		MainPage();
	}

	public static void MainPage() throws Exception {
		// Create overall frame
		JFrame frame = new JFrame("Homes for Sale");

		// end program when red x is hit
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// give it size
		frame.setSize(1200, 1200);

		// everything else goes here

		// create pic object
		ImageIcon pic1 = new ImageIcon(houses.get(0).getimage());

		// scaleimage
		ImageIcon scaledPic1 = new ImageIcon(pic1.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

		//creates button for image to be clicked
		JButton house1 = new JButton(scaledPic1);
		
		// size of image
		house1.setBounds(20, 30, scaledPic1.getIconWidth(), scaledPic1.getIconHeight());
		
		//adds image
		frame.add(house1);
		//label for address
		JLabel LabelHouse1 = new JLabel(houses.get(0).getaddress());
		//size of address on screen
		LabelHouse1.setBounds(20, 180, 240, 30);
		//adding address
		frame.add(LabelHouse1);

		house1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);

				houseGUI(houses.get(0));
			}
		});
		// create pic object
				ImageIcon pic2 = new ImageIcon(houses.get(1).getimage());

				// scaleimage
				ImageIcon scaledPic2 = new ImageIcon(pic2.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

				JButton house2 = new JButton(scaledPic2);
				
				house2.setBounds(20, 220, scaledPic2.getIconWidth(), scaledPic2.getIconHeight());
				frame.add(house2);
				JLabel LabelHouse2 = new JLabel(houses.get(1).getaddress());
				LabelHouse2.setBounds(20, 370, 240, 30);
				frame.add(LabelHouse2);

				house2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(false);

						houseGUI(houses.get(1));
					}
				});
				// create pic object
				ImageIcon pic3 = new ImageIcon(houses.get(2).getimage());
				// scaleimage
				ImageIcon scaledPic3 = new ImageIcon(pic3.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

				JButton house3 = new JButton(scaledPic3);
				house3.setBounds(20, 410, scaledPic2.getIconWidth(), scaledPic1.getIconHeight());
				frame.add(house3);
				JLabel LabelHouse3 = new JLabel(houses.get(2).getaddress());
				LabelHouse3.setBounds(20, 560, 240, 30);
				frame.add(LabelHouse3);

				house3.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(false);

						houseGUI(houses.get(2));
					}
				});
				
				// create pic object
				ImageIcon pic4 = new ImageIcon(houses.get(3).getimage());

				// scaleimage
				ImageIcon scaledPic4 = new ImageIcon(pic4.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

				JButton house4 = new JButton(scaledPic4);
				house4.setBounds(350, 30, scaledPic4.getIconWidth(), scaledPic4.getIconHeight());
				frame.add(house4);
				JLabel LabelHouse4 = new JLabel(houses.get(3).getaddress());
				LabelHouse4.setBounds(350, 180, 240, 30);
				frame.add(LabelHouse4);

				house4.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(false);

						houseGUI(houses.get(3));
					}
				});
				// create pic object
				ImageIcon pic5 = new ImageIcon(houses.get(4).getimage());

				// scaleimage
				ImageIcon scaledPic5 = new ImageIcon(pic5.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

				JButton house5 = new JButton(scaledPic5);
				house5.setBounds(350, 220, scaledPic5.getIconWidth(), scaledPic5.getIconHeight());
				frame.add(house5);
				JLabel LabelHouse5 = new JLabel(houses.get(4).getaddress());
				LabelHouse5.setBounds(350, 370, 240, 30);
				frame.add(LabelHouse5);

				house5.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(false);

						houseGUI(houses.get(4));
					}
				});
				ImageIcon pic6 = new ImageIcon(houses.get(5).getimage());

				// scaleimage
				ImageIcon scaledPic6 = new ImageIcon(pic6.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));

				JButton house6 = new JButton(scaledPic6);
				house6.setBounds(350, 410, scaledPic6.getIconWidth(), scaledPic6.getIconHeight());
				frame.add(house6);
				JLabel LabelHouse6 = new JLabel(houses.get(5).getaddress());
				LabelHouse6.setBounds(350, 560, 240, 30);
				frame.add(LabelHouse6);

				house6.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(false);

						houseGUI(houses.get(5));
					}
				});


		// don't use a layout
		frame.setLayout(null);
		// build the frame(make it visisble)
		frame.setVisible(true);
	}
	// a GUI for a single house listing

	public static void houseGUI(House house) {
		
		//frame for house

		JFrame frame = new JFrame("House1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(1200, 1200);
		JButton goback = new JButton("Go back to home Page");
		goback.setBounds(10, 10, 200, 30);
		frame.add(goback);
		goback.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				try {
					MainPage();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		//image of pic
		
		ImageIcon pic1 = new ImageIcon(house.getimage());
		// scale pic object
		ImageIcon scaledPic1 = new ImageIcon(pic1.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
//button of pic
		JButton house1 = new JButton(scaledPic1);
		house1.setBounds(20, 50, scaledPic1.getIconWidth(), scaledPic1.getIconHeight());
		frame.add(house1);
//info label
		JLabel info = new JLabel("Information about this house:");
		info.setBounds(350, 20, 300, 30);
		frame.add(info);
//price of house
		JLabel price = new JLabel("Price:       $" + house.getcost());
		price.setBounds(350, 40, 300, 30);
		frame.add(price);
//address of house
		JLabel address = new JLabel("Address:       " + house.getaddress());
		address.setBounds(350, 60, 550, 30);
		frame.add(address);
// amount of square ft
		JLabel sqrft = new JLabel("Square Foot:       " + house.getsquareft());
		sqrft.setBounds(350, 80, 300, 30);
		frame.add(sqrft);
//number of bedrooms
		JLabel beds = new JLabel("Number of Bedrooms:       " + house.getbedrooms());
		beds.setBounds(350, 100, 300, 30);
		frame.add(beds);
//number of bathrooms
		JLabel baths = new JLabel("Number of Bathrooms:       " + house.getbathrooms());
		baths.setBounds(350, 120, 300, 30);
		frame.add(baths);
//lot size of property
		JLabel lotSize = new JLabel("Lot Size:       " + house.getlotsize());
		lotSize.setBounds(350, 140, 300, 30);
		frame.add(lotSize);
//does the house have a pool
		if (house.gethaspool() == true) {
			JLabel pool = new JLabel("Has Pool:       Yes");
			pool.setBounds(350, 160, 300, 30);
			frame.add(pool);
		}

		// don't use a layout
		frame.setLayout(null);
		// Build the Frame (make it visible)
		frame.setVisible(true);
	}
}

