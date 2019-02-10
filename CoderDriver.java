package UGA;
import UGA.CoderMethods;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;

public class CoderDriver extends Application{
	
	CoderMethods driver = new CoderMethods();
	
	//overriding init method
    public void init()
    {

    }//init
    
  //overriding start method
    public void start(Stage stage)
    {
    	//setting title
    	stage.setTitle("Easy Java Coder");
    	
    	//creating borderpane
    	BorderPane root = new BorderPane();
    	
    	//creating lable for welcome message
    	Label welcome = new Label();
    	welcome.setText("Welcome to the Easy Java Coder");
    	//creating button
    	Button enter = new Button();
    	enter.setText("Enter");
    	
    	//creating HBox to put textfield and enter button
    	HBox mid = new HBox();
    	TextField code = new TextField("Enter Code");
    	
    	//creating menu bar and adding menu
    	MenuBar menu = new MenuBar();
    	Menu code1 = new Menu("Choose Method To Create");
    	MenuItem add = new MenuItem("Create Addition Method");
    	MenuItem sub = new MenuItem("Create Subtraction Method");
    	MenuItem mult = new MenuItem("Create Multiplication Method");
    	MenuItem varAdd = new MenuItem("Create Variable Addition Method");
    	MenuItem varSub = new MenuItem("Create Variable Subtraction Method");
    	MenuItem varMult = new MenuItem("Create Variable Multiplication Method");
    	//MenuItem div = new MenuItem("Create Division Method");
    	MenuItem helloWorld = new MenuItem("Create Hello World Method");
    	menu.getMenus().add(code1);
    	code1.getItems().addAll(helloWorld, add, sub, mult, varAdd, varSub, varMult);
    	root.setTop(menu);
    	
    	//event handler for hello world menu item
    	helloWorld.setOnAction(new EventHandler<ActionEvent>() {
    	    public void handle(ActionEvent event) {
    	    	Button helloButton = new Button("Click to create Hello World Method");
    	        HBox uInput = new HBox();
    	        Stage helloW = new Stage();
    	        uInput.setPadding(new Insets(30, 20, 20, 20));
    	        uInput.getChildren().add(helloButton);
    	        helloW.setScene(new Scene(uInput, 300, 100));
    	        helloW.show();
    	        
    	        helloButton.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						driver.helloWorld();
						helloW.close();
					}
    	        });
    	    }
    	});
    	
    	//event handler for addition method menu item
    	add.setOnAction(new EventHandler<ActionEvent>() {
    	    public void handle(ActionEvent event) {
    	    	Button numButton = new Button("Enter");
    	    	TextField nums = new TextField("Please Enter Numbers Separated by Spaces");
    	    	TextField varName = new TextField("Please Enter Variable Name");
    	        VBox uInput = new VBox();
    	        Stage add = new Stage();
    	        uInput.setPadding(new Insets(30, 20, 20, 20));
    	        uInput.getChildren().addAll(varName, nums, numButton);
    	        uInput.setSpacing(10);
    	        add.setScene(new Scene(uInput, 400, 200));
    	        add.show();
    	        
    	        //add button event handler
    	        numButton.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						String [] numString = nums.getText().trim().split(" ");
						String name = varName.getText();
						int[]numInts = new int[50];
						for(int i = 0; i < numString.length; i++)
						{
							numInts[i] = Integer.parseInt(numString[i]);
						}
						driver.addition(numInts, name);
						add.close();
					} });
    	    }
    	});
    	
    	//event handler for subtraction method menu item
    	sub.setOnAction(new EventHandler<ActionEvent>() {
    	    public void handle(ActionEvent event) {
    	    	Button numButton = new Button("Enter");
    	    	TextField nums = new TextField("Please Enter Numbers Separated by Spaces");
    	    	TextField varName = new TextField("Please Enter Variable Name");
    	        VBox uInput = new VBox();
    	        Stage sub = new Stage();
    	        uInput.setPadding(new Insets(30, 20, 20, 20));
    	        uInput.getChildren().addAll(varName, nums, numButton);
    	        uInput.setSpacing(10);
    	        sub.setScene(new Scene(uInput, 400, 200));
    	        sub.show();
    	        
    	        //subtraction button event handler
    	        numButton.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						String [] numString = nums.getText().trim().split(" ");
						String name = varName.getText();
						int[]numInts = new int[50];
						for(int i = 0; i < numString.length; i++)
						{
							numInts[i] = Integer.parseInt(numString[i]);
						}
						driver.subtraction(numInts, name);
						sub.close();
					} });
    	    }
    	});
    	
    	//event handler for multiplication method menu item
    	mult.setOnAction(new EventHandler<ActionEvent>() {
    	    public void handle(ActionEvent event) {
    	    	Button numButton = new Button("Enter");
    	    	TextField nums = new TextField("Please Enter Numbers Separated by Spaces");
    	    	TextField varName = new TextField("Please Enter Variable Name");
    	        VBox uInput = new VBox();
    	        Stage mult = new Stage();
    	        uInput.setPadding(new Insets(30, 20, 20, 20));
    	        uInput.getChildren().addAll(varName, nums, numButton);
    	        uInput.setSpacing(10);
    	        mult.setScene(new Scene(uInput, 400, 200));
    	        mult.show();
    	        
    	        //subtraction button event handler
    	        numButton.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						String [] numString = nums.getText().trim().split(" ");
						String name = varName.getText();
						int[]numInts = new int[50];
						for(int i = 0; i < numInts.length; i++)
						{
							numInts[i] = 1;
						}
						for(int i = 0; i < numString.length; i++)
						{
							numInts[i] = Integer.parseInt(numString[i]);
						}
						driver.multiply(numInts, name);
						mult.close();
					} });
    	    }
    	});
    	
    	//event handler for multiplication method menu item
    	/*div.setOnAction(new EventHandler<ActionEvent>() {
    	    public void handle(ActionEvent event) {
    	    	Button numButton = new Button("Click to Add Numbers You Want to Divide");
    	    	TextField nums = new TextField("Please Enter Two Numbers Separated by Spaces");
    	        VBox uInput = new VBox();
    	        Stage div = new Stage();
    	        uInput.setPadding(new Insets(30, 20, 20, 20));
    	        uInput.getChildren().addAll(nums, numButton);
    	        div.setScene(new Scene(uInput, 400, 100));
    	        div.show();
    	        
    	        //subtraction button event handler
    	        numButton.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						String [] numString = nums.getText().trim().split(" ");
						int[]numInts = new int[50];
						for(int i = 0; i < numString.length; i++)
						{
							numInts[i] = Integer.parseInt(numString[i]);
						}
						driver.divide(numInts, "divided");
						driver.closer();
						div.close();
					} });
    	    }
    	});*/
    	
    	//event handler for variable addition method menu item
    	varAdd.setOnAction(new EventHandler<ActionEvent>() {
    	    public void handle(ActionEvent event) {
    	    	Button numButton = new Button("Enter");
    	    	TextField vars = new TextField("Please Enter the Two Variables You Want to Add Together");
    	    	TextField varName = new TextField("Please Enter New Variable Name");
    	        VBox uInput = new VBox();
    	        Stage varAdd = new Stage();
    	        uInput.setPadding(new Insets(30, 20, 20, 20));
    	        uInput.getChildren().addAll(varName, vars, numButton);
    	        uInput.setSpacing(10);
    	        varAdd.setScene(new Scene(uInput, 400, 200));
    	        varAdd.show();
    	        
    	        //subtraction button event handler
    	        numButton.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						String [] varString = vars.getText().trim().split(" ");
						String name = varName.getText();
						driver.varAdd(varString[0], varString[1], name);
						varAdd.close();
					} });
    	    }
    	});
    	
    	//event handler for variable subtraction method menu item
    	varSub.setOnAction(new EventHandler<ActionEvent>() {
    	    public void handle(ActionEvent event) {
    	    	Button numButton = new Button("Enter");
    	    	TextField vars = new TextField("Please Enter the Two Variables You Want to Add Together");
    	    	TextField varName = new TextField("Please Enter New Variable Name");
    	        VBox uInput = new VBox();
    	        Stage varSub = new Stage();
    	        uInput.setPadding(new Insets(30, 20, 20, 20));
    	        uInput.getChildren().addAll(varName, vars, numButton);
    	        uInput.setSpacing(10);
    	        varSub.setScene(new Scene(uInput, 400, 200));
    	        varSub.show();
    	        
    	        //subtraction button event handler
    	        numButton.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						String [] varString = vars.getText().trim().split(" ");
						String name = varName.getText();
						driver.varSub(varString[0], varString[1], name);
						varSub.close();
					} });
    	    }
    	});
    	
    	//event handler for variable multiplication method menu item
    	varMult.setOnAction(new EventHandler<ActionEvent>() {
    	    public void handle(ActionEvent event) {
    	    	Button numButton = new Button("Enter");
    	    	TextField vars = new TextField("Please Enter the Two Variables You Want to Add Together");
    	    	TextField varName = new TextField("Please Enter New Variable Name");
    	        VBox uInput = new VBox();
    	        Stage varMult = new Stage();
    	        uInput.setPadding(new Insets(30, 20, 20, 20));
    	        uInput.getChildren().addAll(varName, vars, numButton);
    	        uInput.setSpacing(10);
    	        varMult.setScene(new Scene(uInput, 400, 200));
    	        varMult.show();
    	        
    	        //subtraction button event handler
    	        numButton.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						String [] varString = vars.getText().trim().split(" ");
						String name = varName.getText();
						driver.varAdd(varString[0], varString[1], name);
						varMult.close();
					} });
    	    }
    	});
    	
    	//event handler for clicking enter button
    	enter.setOnAction(new EventHandler<ActionEvent> (){

			@Override
			public void handle(ActionEvent event) {
				String input = code.getText();
				HBox returnInput = new HBox();
				Stage message = new Stage();
				Label mes = new Label();
				mes.setText(input);
				returnInput.getChildren().add(mes);
				message.setScene(new Scene(returnInput, 50, 50));
				message.setWidth(200);
				message.show();
			}
    	});
    	
    	//putting hbox in middle of borderpane
    	root.setCenter(mid);
    	
    	//adding textfield and button to middle hbox
    	mid.getChildren().addAll(welcome);
    	mid.setPadding(new Insets(50, 30, 30, 30));
    	mid.setSpacing(10);
    	
    	//setting the scene
        stage.setScene(new Scene(root, 270, 250));
        stage.setResizable(false);
        stage.show();
    }//start
    
  //overriding stop method
    public void stop()
    {
    	
    }//stop
	
	public static void main(String[] args) {
		CoderMethods driver = new CoderMethods();
		
		try {
		    Application.launch(args);
		} catch (UnsupportedOperationException e) {
		    System.out.println(e);
		    System.err.println("If this is a DISPLAY problem, then your X server connection");
		    System.err.println("has likely timed out. This can generally be fixed by logging");
		    System.err.println("out and logging back in.");
		    System.exit(1);
		} // try
		
		
		/*int[] numbers = {1,2,3,4,5};
		driver.addition(numbers, "added");
		driver.subtraction(numbers, "subbed");
		driver.multiply(numbers, "mult");
		driver.printerMethod("mult");
		driver.printerMethod("subbed");
		driver.printerMethod("added");
		driver.varAdd("mult", "added", "combined");
		driver.varSub("mult", "added", "combined1");
		driver.varMult("mult", "added", "combined2");
		driver.varDiv("mult", "added", "combined3");
		driver.printerMethod("combined");
		driver.printerMethod("combined1");
		driver.printerMethod("combined2");
		driver.printerMethod("combined3");
		driver.closer();*/
	}
	
}
