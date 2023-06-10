package Ventanas;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame{

		JLabel labeltitulo;
		JButton btncolor1, btncolor2, btncolor3;
		
		public Principal() {
			componentes();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //al cerrar la ventana se detiene el programa
			setSize(400,450); //tamaño de la ventana
			setLocationRelativeTo(null); //centra la ventana
			setLayout(null); //elimina toda pantilla
			setResizable(false); //evita que se pueda cambair el tamaño
			setVisible(true); //hace visible la ventana
			setTitle("Menu Principal");
		}
		
		public void componentes() {
			labeltitulo=new JLabel();
			labeltitulo.setBounds(118,25,180,20);
			labeltitulo.setText("Seleccione una opción");
			add(labeltitulo);
			
			btncolor1=new JButton();
			btncolor1.setBounds(50,50,100,30);
			btncolor1.setText("Color 1");
			add(btncolor1); 
			
			btncolor2=new JButton();
			btncolor2.setBounds(160,50,100,30);
			btncolor2.setText("Color 2");
			add(btncolor2); 
			
			btncolor3=new JButton();
			btncolor3.setBounds(270,50,100,30);
			btncolor3.setText("Color 3");
			add(btncolor3); 
			
			btncolor1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                getContentPane().setBackground(Color.RED);
	            }
	        });
			
			btncolor2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                getContentPane().setBackground(Color.BLUE);
	            }
	        });
			
			btncolor3.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                getContentPane().setBackground(Color.GREEN);
	            }
	        });
			
		}
		
	
}
