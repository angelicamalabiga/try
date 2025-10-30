import java.awt.Color;
import javax.swing.*;

	public class cla {

	    public cla() {
	    	
	    	
	        JTextField TextMalabiga = new JTextField(20);
	        JLabel LabelMalabiga = new JLabel("USERNAME");
	        JLabel LabelMalabiga3 = new JLabel("USERNAME");

	        JLabel LabelPassMalabiga = new JLabel("PASSWORD");
	        JTextField TextPassMalabiga = new JTextField(20);
	        

	        JButton btnSubmitMalabiga = new JButton("SUBMIT");
	        JButton btnCancelMalabiga = new JButton("CANCEL");

	        JPanel PanelMalabiga = new JPanel();
	        PanelMalabiga.setLayout(null);  
	        
	        LabelMalabiga.setForeground(Color.black);
	        LabelPassMalabiga.setForeground(Color.black);
	        btnSubmitMalabiga.setBackground(Color.green);
	        btnCancelMalabiga.setBackground(Color.red);
	   

	       
	        LabelMalabiga.setBounds(10, 10, 100, 30);  
	        TextMalabiga.setBounds(120, 10, 150, 30);  
	        LabelPassMalabiga.setBounds(10, 50, 100, 30);  
	        TextPassMalabiga.setBounds(120, 50, 150, 30);  
	        btnSubmitMalabiga.setBounds(10, 90, 100, 30);  
	        btnCancelMalabiga.setBounds(120, 90, 100, 30);  

	        
	        PanelMalabiga.add(LabelMalabiga);
	        PanelMalabiga.add(TextMalabiga);
	        PanelMalabiga.add(LabelPassMalabiga);
	        PanelMalabiga.add(TextPassMalabiga);
	        PanelMalabiga.add(btnSubmitMalabiga);
	        PanelMalabiga.add(btnCancelMalabiga);

	        JFrame FrameMalabiga = new JFrame();
	        FrameMalabiga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        FrameMalabiga.setTitle("Angelica Malabiga");
	        FrameMalabiga.setBounds(300, 300, 300, 200);  
	        FrameMalabiga.add(PanelMalabiga);
	        FrameMalabiga.setVisible(true);
	    }

	    public static void main(String[] args) {
	        new cla();
	    }
	}
