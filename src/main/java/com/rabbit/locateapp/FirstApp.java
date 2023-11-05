package com.rabbit.locateapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class FirstApp extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel buildLabel(final String labelText) {
		return new JLabel(labelText, SwingConstants.CENTER);
	}

	private static final String footerText = "© 2023 Rabbit Computing";
	static GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];

	public FirstApp() throws ClassNotFoundException, InstantiationException, IllegalAccessException,
			UnsupportedLookAndFeelException {
		// setExtendedState(JFrame.MAXIMIZED_BOTH);
		// setUndecorated(true);
		setLocation(250, 150);
		setTitle("First App");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		final JPanel jp = new JPanel();
		jp.setBackground(Color.WHITE);
		jp.setLayout(new BorderLayout());
		jp.add(buildLabel(footerText), BorderLayout.SOUTH);
		jp.setBorder(new EmptyBorder(10, 10, 10, 10));

		final JButton btn2 = new JButton("Normal");
		btn2.addActionListener(e -> device.setFullScreenWindow(null));

		final JPanel jp2 = new JPanel();
		jp2.setBackground(Color.WHITE);
		jp2.add(btn2);

		add(jp, BorderLayout.SOUTH);
		add(jp2, BorderLayout.NORTH);

		/*
		 * javax.swing.plaf.metal.MetalLookAndFeel
		 * javax.swing.plaf.nimbus.NimbusLookAndFeel
		 * com.sun.java.swing.plaf.motif.MotifLookAndFeel
		 * com.sun.java.swing.plaf.gtk.GTKLookAndFeel Default cross platform Java look
		 * and feel class: javax.swing.plaf.metal.MetalLookAndFeel
		 */
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		pack();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			try {
				new FirstApp().setVisible(true);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e) {
				e.printStackTrace();
			}
		});
	}
}
