/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package factories;



import button.Button;
import button.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;
//classe MacOSFactory com acesso aos métodos de GUIFactory
public class MacOSFactory implements GUIFactory {
    @Override
    //sobrescrita de método retornando um objeto da classe MacOSButton
    public Button createButton(){
        return new MacOSButton();
    }
    @Override
    //sobrescrita de método retornando um objeto da classe MacOSCheckBox
    public Checkbox createCheckbox(){
        return new MacOSCheckbox();
    }
}
