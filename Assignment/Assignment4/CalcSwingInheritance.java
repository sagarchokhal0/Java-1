import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
class CalcSwingInheritance extends JFrame{
	int left=10,top=10;
	final int width = 100,height = 40;
	public CalcSwingInheritance(){
		setTitle("Calculator");

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

		setSize(560,270);
		setLayout(null);
		setVisible(true);
	}
	private JLabel createLabel(String message){
		JLabel label = new JLabel(message);
		label.setBounds(left,top,width,height);
		left = left+width+10;
		add(label);
		return label;
	}
	private JButton createButton(String message){
		JButton button = new JButton(message);
		button.setBounds(left,top,width,height);
		left = left+width+10;
		add(button);
		return button;
	}
	private JTextField createTextField(){
		JTextField textfield = new JTextField();
		textfield.setBounds(left,top,width,height);
		top = top+height+10;
		left = 10;
		add(textfield);
		return textfield;
	}
	public static void main(String[] args){
		new CalcSwingInheritance();
	}
}