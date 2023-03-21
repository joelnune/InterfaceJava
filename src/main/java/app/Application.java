package app;
package factories;

import button.Button;
import checkbox.Checkbox;
import factories.GUIFactory;

public class Application {
    //declarando atributos
    
    //atributo do tipo button
    private Button button;
    // atributo do tipo checkbox
    private Checkbox checkbox;
    
    //método com um objeto GUIFactory como parametro
    public Application(GUIFactory factory){
        //button recebe a assinatura do método createButton
        button = factory.createButton();
        //checkbox recebe a assinatura do método createCheckbox
        checkbox = factory.createCheckbox();
    }
   //método executa os métodos paint das classes button e checkbox
    public void paint(){
    button.paint();
    checkbox.paint();
    }
}
