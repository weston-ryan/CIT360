/*
 * Ryan Weston - CIT 360
    MVC
   
 */
package mvc;

import java.awt.Graphics;
import java.awt.Shape;
import javax.swing.text.BadLocationException;
import javax.swing.text.Position;
import javax.swing.text.View;

/**
 *
 * @author westo
 */
public class MVC {

    // initialize the model, then it will initialize the view:
    private final int start_value = 5;
    
    public static void main(String[] args) {
       //create Model and View
		Model myModel;
                 myModel = new Model();
		View myView = new View() {
                    @Override
                    public float getPreferredSpan(int axis) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                    @Override
                    public void paint(Graphics g, Shape allocation) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                    @Override
                    public Shape modelToView(int pos, Shape a, Position.Bias b) throws BadLocationException {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                    @Override
                    public int viewToModel(float x, float y, Shape a, Position.Bias[] biasReturn) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };

		//tell Model about View. 
		myModel.addObserver(myView);
                               
                //create Controller and then tell it about Model and View.
                //then initialise the model
		Controller myController = new Controller();
		myController.addModel(myModel);
		myController.addView(myView);
		myController.initModel(start_value);

		//tell View about Controller 
		myView.addController(myController);
		     
    }
    
}
