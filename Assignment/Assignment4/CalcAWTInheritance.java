import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
class CalcAWTInheritance extends Frame{
	int left=10,top=40;
	final int width = 100,height = 40;
	public CalcAWTInheritance(){
		setTitle("Calculator");
		Label number1 = createLabel("number1: ");
		TextField input_number1 = createTextField();

		Label number2 = createLabel("number2: ");
		TextField input_number2 = createTextField();

		Label result = createLabel("result: ");
		TextField input_result = createTextField();

		Button add = createButton("ADD");
		Button sub = createButton("SUB");
		Button mul = createButton("MUL");
		Button div = createButton("DIV");

		setSize(280,270);
		setLayout(null);
		setVisible(true);
	}
	private Label createLabel(String message){
		Label label = new Label(message);
		label.setBounds(left,top,width,height);
		left = left+width+10;
		add(label);
		return label;
	}
	private Button createButton(String message){
		Button button = new Button(message);
		button.setBounds(left,top,width/2,height);
		left = left+width/2+10;
		add(button);
		return button;
	}
	private TextField createTextField(){
		TextField textfield = new TextField();
		textfield.setBounds(left,top,width,height);
		top = top+height+10;
		left = 10;
		add(textfield);
		return textfield;
	}
	public static void main(String[] args){
		new CalcAWTInheritance();
	}
}