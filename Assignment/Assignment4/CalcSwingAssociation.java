import javax.swing.*;
public class CalcSwingAssociation {
	int left=10,top=10;
	final int width = 100,height = 40;
	JFrame frame;
	public CalcSwingAssociation(){
		frame = new JFrame("Calculator");

		JLabel number1 = createLabel("number1: ");
		JTextField input_number1 = createTextField();

		JLabel number2 = createLabel("number2: ");
		JTextField input_number2 = createTextField();

		JLabel result = createLabel("result: ");
		JTextField input_result = createTextField();

		JButton add = createButton("ADD");
		JButton sub = createButton("SUB");
		JButton mul = createButton("MUL");
		JButton div = createButton("DIV");

		frame.setSize(560,270);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	private JLabel createLabel(String message){
		JLabel label = new JLabel(message);
		label.setBounds(left,top,width,height);
		left = left+width+10;
		frame.add(label);
		return label;
	}
	private JButton createButton(String message){
		JButton button = new JButton(message);
		button.setBounds(left,top,width,height);
		left = left+width+10;
		frame.add(button);
		return button;
	}
	private JTextField createTextField(){
		JTextField textfield = new JTextField();
		textfield.setBounds(left,top,width,height);
		top = top+height+10;
		left = 10;
		frame.add(textfield);
		return textfield;
	}
	public static void main(String[] args){
		new CalcSwingAssociation();
	}
}