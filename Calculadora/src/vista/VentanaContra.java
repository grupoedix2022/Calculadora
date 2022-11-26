package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class VentanaContra extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaContra dialog = new VentanaContra();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaContra() {
		setBounds(100, 100, 450, 150);
		getContentPane().setLayout(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JTextArea textArea = new JTextArea();
			textArea.setText("");
			contentPanel.add(textArea);
		}
		{
			JLabel label = new JLabel("New label");
			contentPanel.add(label);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		JButton okButton = new JButton("OK");
		okButton.setBounds(113, 77, 89, 23);
		getContentPane().add(okButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(237, 77, 89, 23);
		getContentPane().add(cancelButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(113, 42, 213, 22);
		getContentPane().add(textArea);
	}
}
