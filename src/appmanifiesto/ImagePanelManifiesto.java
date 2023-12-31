package appmanifiesto;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class ImagePanelManifiesto extends JPanel {

	String imagePath;
	ImageIcon imageIcon;
	int pdfWidth, pdfHeight, imgWidth, imgHeight;

	public ImagePanelManifiesto () {
		initComponents ();
		//imagePath = DocModel.imgFilepath;
	}

	@Override
	public Dimension getPreferredSize () {
		ImageIcon imageIcon = (ImageIcon) imageLabel.getIcon ();
		Dimension imageSize = new Dimension (imageIcon.getIconWidth (), imageIcon.getIconHeight ());
		return imageSize;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    imageLabel = new javax.swing.JLabel();

    setBackground(new java.awt.Color(255, 255, 255));
    setPreferredSize(new java.awt.Dimension(1100, 1424));
    setLayout(null);

    imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image-manifiesto-vacia-NTA.png"))); // NOI18N
    imageLabel.setAlignmentY(0.0F);
    add(imageLabel);
    imageLabel.setBounds(0, 0, 1100, 1424);
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel imageLabel;
  // End of variables declaration//GEN-END:variables

public static void main (String args []) {
	JFrame frame = new JFrame ("Test for Manifierto Panel");
	frame.setContentPane (new JScrollPane (new ImagePanelManifiesto()));
	frame.setSize (1100, 800);	
	frame.setVisible (true);

 }
}