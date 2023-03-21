
package factories;
import button.Button;
import checkbox.Checkbox;
        
//criando interface GUIFactory
public interface GUIFactory {
    //método createButton importado da interface Button
    Button createButton();
    //método createCheckbox importado da interface Checkbox
    Checkbox createCheckbox();
}
