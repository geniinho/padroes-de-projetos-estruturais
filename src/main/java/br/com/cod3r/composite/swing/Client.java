package br.com.cod3r.composite.swing;

import javax.swing.*;
import java.awt.*;

public class Client {

	public static void main(String[] args) {


		JLabel title = new JLabel("Titulo muito bonito");

		JFrame frame =new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		frame.add(title, BorderLayout.NORTH);

		JPanel panel = new JPanel(new FlowLayout());
		JLabel label = new JLabel("Click");
		JButton button= new JButton("Aqui, cero!");
		panel.add(label);
		panel.add(button);

		frame.add(panel, BorderLayout.CENTER);

		frame.setSize(400,200);
		frame.setVisible(true);
	}
}
