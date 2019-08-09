package application;
import java.lang.Object;
import java.text.DecimalFormat;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.application.*;
import javafx.scene.input.*;
import javafx.scene.control.Button;
import javafx.scene.text.*;
import javafx.scene.*;
import java.util.ArrayList;
import java.awt.*;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.Scene;
public class Main extends Application{
	public static ArrayList<Integer> storage = new ArrayList<>();
	public static ArrayList<String> str = new ArrayList<>();
	public static ArrayList<String> str3 = new ArrayList<>();
	public static double sum =0;
	public static double subtract = 0;
	public static double divide = 0;
	public static double multiply = 0;
	
	public static double output = 0 ;
    public static Double output2 = null;
	public static String r = String.valueOf(output);
	public static String t = null;
	
	public static void Buutton(Button nut, Text tt, String th) {
	nut.setOnMouseClicked((MouseEvent yup) ->{
		if(sum == 0.0 && subtract == 0.0  && divide == 0 && multiply == 0.0) {
			System.out.println("This is running");
				str.clear();
				int firstx = 1;
				String firsty = th;
				str.add(firsty);
				str2 = str.toString();
				for(int i = 0; i<str2.length(); i++) {
					if(str2.charAt(i) == '[' || str2.charAt(i) == ']' || str2.charAt(i) == ',' || str2.charAt(i) == ' ') {
						
					}
					else {
						str1 += str2.charAt(i);
						System.out.println(str1);
					}
				}
				
				storage.add(firstx);
				r= String.valueOf(firstx);
				tt.setText("");
				tt.setText(str1);
				}
				if(sum>0 || subtract >0 || divide > 0 || multiply > 0) {
					System.out.println("This isn't running");
					System.out.println(str1);
					if(output==0) {
						str1= str1.substring(0, (str1.length()));
					}
					System.out.println(str1);
					System.out.println(str2);
					str3.clear();
					int firstx = 1;
					String firsty = th;
					str3.add(firsty);
					
					str2 = str3.toString();
					System.out.println(str3.size());
					for(int i = 0; i<str2.length(); i++) {
						if(str2.charAt(i) == '[' || str2.charAt(i) == ']' || str2.charAt(i) == ',' || str2.charAt(i) == ' ') {
							
						}
						else {
							System.out.println(str2.charAt(i));
							str4 += str2.charAt(i);
							System.out.println(str4);
						}
					}
					System.out.println(str4);
					storage.add(firstx);
					r= String.valueOf(firstx);
					tt.setText("");
					tt.setText(str4);
				}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch(args);
	}
	public static String str1 = "";
	public static String str2 = "";
	public static String str4 = "";
	@Override
public void start(Stage thirdStage) {
		
		
		
		
		Text display2 = new Text(400, 100, r);
		display2.setFont(Font.font("Veranda", 48));
		display2.setTextAlignment(TextAlignment.RIGHT);
		thirdStage.setTitle("Calculator");
		Button first = new Button();
		first.setText("1");
		first.setMinSize(90, 90);
		first.applyCss();
		Button second = new Button();
		second.setText("2");
		
		second.setMinSize(90, 90);
		Button third = new Button();
		third.setText("3");
		third.setMinSize(90, 90);
		Button fourth = new Button();
		fourth.setText("4");
		fourth.setMinSize(90, 90);
		Button fifth = new Button();
		fifth.setText("5");
		fifth.setMinSize(90, 90);
		Button sixth = new Button();
		sixth.setText("6");
		sixth.setMinSize(90, 90);
		Button seventh = new Button();
		seventh.setText("7");
		seventh.setMinSize(90, 90);
		Button eighth = new Button();
		eighth.setText("8");
		eighth.setMinSize(90, 90);
		Button ninth = new Button();
		ninth.setText("9");
		ninth.setMinSize(90, 90);
		Button tenth = new Button();
		tenth.setText("0");
		tenth.setMinSize(90, 90);
		Button eleventh = new Button();
		eleventh.setText("+");
		eleventh.setMinSize(90, 90);
		Button twelveth = new Button();
		twelveth.setText("-");
		twelveth.setMinSize(90, 90);
		Button thirteenth = new Button();
		thirteenth.setText("/");
		thirteenth.setMinSize(90, 90);
		Button fourteenth = new Button();
		fourteenth.setText("x");
		fourteenth.setMinSize(90, 90);
		Button fifthteenth = new Button();
		fifthteenth.setText("=");
		fifthteenth.setMinSize(90, 90);
		Button sixteenth = new Button();
		sixteenth.setText(".");
		sixteenth.setMinSize(90, 90);
		Button seventeenth = new Button();
		seventeenth.setText("back");
		seventeenth.setMinSize(90, 30);
		seventeenth.setLayoutX(300);
		seventeenth.setLayoutY(20);
		Text summers = new Text(90, 30, t);
		summers.setLayoutX(250);
		summers.setLayoutY(60);
	
		Buutton(first, display2, "1");
		
		Buutton(second, display2, "2");
		
		Buutton(third, display2, "3");
		
		Buutton(fourth, display2, "4");
		
		Buutton(fifth, display2, "5");
		
		Buutton(sixth, display2, "6");
		
		Buutton(seventh, display2, "7");
		
		Buutton(eighth, display2, "8");
		
		Buutton(ninth, display2, "9");
		
		Buutton(tenth, display2, "0");
		eleventh.setOnMouseClicked((MouseEvent yer) ->{
		sum++;
		System.out.println(sum);
		t = "Sum";
		summers.setText(t);
		if(subtract>0|| multiply>0 || divide >0) {
			subtract = 0;
			multiply = 0;
			divide = 0;
		}
		if(output!=0) {
			str1 = " ";
			str2 = " ";
			str3.clear();
			System.out.println(str3);
			System.out.println(str2);
			str1 = String.valueOf(output);
			System.out.println(str1);
			str4 = "";
			}
		});
		
		sixteenth.setOnMouseClicked((MouseEvent yer) -> {
			if(sum == 0 || subtract == 0 || divide == 0 || multiply == 0) {
				str.clear();
				int pointx = 0;
				String pointy = ".";
				str.add(pointy);
				str2 = str.toString();
				for(int i = 0; i<str2.length(); i++) {
					if(str2.charAt(i) == '[' || str2.charAt(i) == ']' || str2.charAt(i) == ',' || str2.charAt(i) == ' ') {
						
					}
					else {
						str1 += str2.charAt(i);
						System.out.println(str1);
					}
				}
				
				storage.add(pointx);
				r= String.valueOf(pointx);
				display2.setText("");
				display2.setText(str1);
				}
				if(sum>0 || subtract > 0 || divide > 0 || multiply > 0) {
					str1= str1.substring(0, (str1.length()-1));
					str3.clear();
					int pointx = 0;
					String pointy = ".";
					str3.add(pointy);
					str2 = str3.toString();
					for(int i = 0; i<str2.length(); i++) {
						if(str2.charAt(i) == '[' || str2.charAt(i) == ']' || str2.charAt(i) == ',' || str2.charAt(i) == ' ') {
							
						}
						else {
							str4 += str2.charAt(i);
							System.out.println(str4);
						}
					}
					
					storage.add(pointx);
					r= String.valueOf(pointx);
					display2.setText("");
					display2.setText(str4);
				}
		});
		
		twelveth.setOnMouseClicked((MouseEvent yer)-> {
			subtract++;
			t = "Subtract";
			summers.setText(t);
			if(sum>0|| multiply>0 || divide >0) {
				sum = 0;
				multiply = 0;
				divide = 0;
			}
			if(output!=0.0) {
				str1 = " ";
				str2 = " ";
				str3.clear();
				System.out.println(str3);
				System.out.println(str2);
				str1 = String.valueOf(output);
				System.out.println(str1);
				str4 = "";
				}
		});
		
		thirteenth.setOnMouseClicked((MouseEvent yer) -> {
			divide++;
			t = "Divide";
			summers.setText(t);
			if(subtract>0|| multiply>0 || sum >0) {
				subtract = 0;
				multiply = 0;
				sum = 0;
			}
			if(output!=0.0) {
				str1 = " ";
				str2 = " ";
				str3.clear();
				System.out.println(str3);
				System.out.println(str2);
				str1 = String.valueOf(output);
				System.out.println(str1);
				str4 = "";
				}
		});
		fourteenth.setOnMouseClicked((MouseEvent yer)-> {
			multiply++;
			t = "Multiply";
			summers.setText(t);
			if(subtract>0|| sum>0 || divide >0) {
				subtract = 0;
				sum = 0;
				divide = 0;
			}
			if(output!=0.0) {
				str1 = " ";
				str2 = " ";
				str3.clear();
				System.out.println(str3);
				System.out.println(str2);
				str1 = String.valueOf(output);
				System.out.println(str1);
				str4 = "";
				}
		});
		fifthteenth.setOnMouseClicked((MouseEvent g) ->
		{
			DecimalFormat dec = new DecimalFormat("#0.00000");
			if(sum >0 ) {
				System.out.println(str1);
				output = storage.get(0)+storage.get(1);
				Double sum1 = Double.parseDouble(str1);
				Double sum2 = Double.parseDouble(str4);
				output = sum1 + sum2;
				
			}
			else if(subtract >0) {
				output = storage.get(0)+storage.get(1);
				Double sum1 = Double.parseDouble(str1);
				Double sum2 = Double.parseDouble(str4);
				output = sum1 - sum2;
				
			}
			else if(divide >0) {
				output = storage.get(0)+storage.get(1);
				Double sum1 = Double.parseDouble(str1);
				Double sum2 = Double.parseDouble(str4);
				
				output = sum1 / sum2;
				
				
				
			}
			else if(multiply >0) {
				output = storage.get(0)+storage.get(1);
				Double sum1 = Double.parseDouble(str1);
				Double sum2 = Double.parseDouble(str4);
				output = sum1*sum2;
				
			}
			 if(output == Math.round(output)) {
				 int output2 = (int)output;
				 r = String.valueOf(output2);
				 System.out.println("true");
				 display2.setText(r);
			 }
			 else {
			r= String.valueOf(output);
			System.out.println(dec.format(output));
			display2.setText(dec.format(output));
			 }
			 output2 = output;
			display2.prefWidth(400);
			sum =0;
			subtract = 0;
			divide = 0;
			multiply = 0;
			t = "";
			summers.setText(t);
		}
				);
		seventeenth.setOnMouseClicked((MouseEvent yup) -> {
			output = 0;
			str1 = "";
			str2 = "";
			str4 = "";
			str.clear();
			str3.clear();
			display2.setText("");
		});
		
	
		HBox row0 = new HBox();
		row0.getChildren().add(display2);
		HBox row1 = new HBox();
		row1.getChildren().addAll(first , second, third, fourteenth);
		HBox row2 = new HBox();
		row2.getChildren().addAll(fourth, fifth, sixth, thirteenth );
		HBox row3 = new HBox();
		row3.getChildren().addAll(seventh, eighth, ninth, twelveth);
		HBox row4 = new HBox();
		row4.getChildren().addAll(tenth, sixteenth, fifthteenth, eleventh);
		Group group1 = new Group();
		group1.getChildren().addAll(row0, row1, row2, row3, row4, seventeenth, summers);
		row0.setLayoutY(0);
		row1.setLayoutY(200);
		row2.setLayoutY(300);
		row3.setLayoutY(400);
		row4.setLayoutY(500);
		row1.prefWidth(360);
		row2.prefWidth(360);
		row3.prefWidth(360);
		row4.prefWidth(360);
		Scene scene = new Scene(group1, 400, 650);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		thirdStage.setScene(scene);
		thirdStage.show();
	}
}
