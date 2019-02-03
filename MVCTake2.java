
/* I changed and simplified everything with the MVC I previously did
*/
 
 package mvc;

import java.awt.Graphics;
import java.awt.Shape;
import javax.swing.text.BadLocationException;
import javax.swing.text.Position;
import javax.swing.text.View;
import java.awt.event.ActionListener;

/**
 *
 * @author westo
 */
public class PizzaController {
    //create Model and View
    private MenuView theView;
    Private MenuModel theModel;
         
public PizzaController(ToppingView theView, ToppingModel theModel) {
  this.theView = theView;
  this.theModel = theModel;
  this.theView.addEnterListener(new EnterListener());
}    
class EnterListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
       try {
         if (theView.getPizzaTopping().isEmpty()) {
         theView.setPizzaName();
         theView.setCustomerName();
         }
         else { theModel.saveCustomerInfo(theView.getPizzaTopping(), theView.getCustomerName());
	       theView.setPizzaTopping();
	       theView.setCustomerName();
	      }
	catch(Exception ex){
         System.out.println(ex);
	       theView.displayErrorMessage("Pizza is fried... try again);}
      }
   }
}
