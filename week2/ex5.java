package week2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class ex5 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    
    private final Color[] palette = {
            Color.BLACK, Color.RED, Color.GREEN, Color.BLUE,
            Color.CYAN, Color.MAGENTA, Color.color(0.95,0.9,0)
    };

    private int currentColorNum = 0; 

    private double prevX, prevY;   

    private boolean dragging;   

    private Canvas canvas;  

    private GraphicsContext g; 


    
    public void start(Stage stage) {
        
       
        
        canvas = new Canvas(600,400);
        g = canvas.getGraphicsContext2D();
        clearAndDrawPalette();
        
        canvas.setOnMousePressed( e -> mousePressed(e) );
        canvas.setOnMouseDragged( e -> mouseDragged(e) );
        canvas.setOnMouseReleased( e -> mouseReleased(e) );
        
        
        
        Pane root = new Pane(canvas);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Simple Paint");
        stage.show();
    }


    public void clearAndDrawPalette() {

        int width = (int)canvas.getWidth();    
        int height = (int)canvas.getHeight();  

        g.setFill(Color.WHITE);
        g.fillRect(0,0,width,height);

        int colorSpacing = (height - 56) / 7;

        g.setStroke(Color.GRAY);
        g.setLineWidth(3);
        g.strokeRect(1.5, 1.5, width-3, height-3);


        g.setFill(Color.GRAY);
        g.fillRect(width - 56, 0, 56, height);

        
        g.setFill(Color.WHITE);
        g.fillRect(width-53,  height-53, 50, 50);
        g.setFill(Color.BLACK);
        g.fillText("CLEAR", width-48, height-23); 

       
        
        for (int N = 0; N < 7; N++) {
            g.setFill( palette[N] );
            g.fillRect(width-53, 3 + N*colorSpacing, 50, colorSpacing-3);
        }

        

        g.setStroke(Color.WHITE);
        g.setLineWidth(2);
        g.strokeRect(width-54, 2 + currentColorNum*colorSpacing, 52, colorSpacing-1);

    } 


    private void changeColor(int y) {

        int width = (int)canvas.getWidth(); 
        int height = (int)canvas.getHeight(); 
        int colorSpacing = (height - 56) / 7;  
        int newColor = y / colorSpacing;       

        if (newColor < 0 || newColor > 6)      
            return;

       
        
        g.setLineWidth(2);
        g.setStroke(Color.GRAY);
        g.strokeRect(width-54, 2 + currentColorNum*colorSpacing, 52, colorSpacing-1);
        currentColorNum = newColor;
        g.setStroke(Color.WHITE);
        g.strokeRect(width-54, 2 + currentColorNum*colorSpacing, 52, colorSpacing-1);

    } 


    public void mousePressed(MouseEvent evt) {

        if (dragging == true)  
            return;            
                               
                       

        int x = (int)evt.getX();   
        int y = (int)evt.getY();   

        int width = (int)canvas.getWidth();    
        int height = (int)canvas.getHeight(); 

        if (x > width - 53) {
           
            if (y > height - 53)
                clearAndDrawPalette();  
            else
                changeColor(y); 
        }
        else if (x > 3 && x < width - 56 && y > 3 && y < height - 3) {
           
            prevX = x;
            prevY = y;
            dragging = true;
            g.setLineWidth(2);  
            g.setStroke( palette[currentColorNum] );
        }

    } 

    public void mouseReleased(MouseEvent evt) {
        dragging = false;
    }

    public void mouseDragged(MouseEvent evt) {

        if (dragging == false)
            return;  

        double x = evt.getX();   
        double y = evt.getY();   

        if (x < 3)                         
            x = 3;                          
        if (x > canvas.getWidth() - 57)      
            x = (int)canvas.getWidth() - 57;

        if (y < 3)                        
            y = 3;                          
        if (y > canvas.getHeight() - 4)      
            y = canvas.getHeight() - 4;

        g.strokeLine(prevX, prevY, x, y); 

        prevX = x; 
        prevY = y;

    } 


} 
