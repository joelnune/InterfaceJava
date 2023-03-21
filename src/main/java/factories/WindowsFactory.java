/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package factories;



import button.Button;
import button.WindowsButton;
import checkbox.Checkbox;
import checkbox.WindowsCheckbox;

//classe WindowsFactory com acesso aos métodos de GUIFactory
public class WindowsFactory implements GUIFactory {
    @Override
    //sobrescrita de método retornando um objeto da classe WindowsButton
    public Button createButton(){
        return new WindowsButton();
    }
    @Override
    //sobrescrita de método retornando um objeto da classe WindowsCheckbox
    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }
}
