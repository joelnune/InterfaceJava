
package button;

//Classe MacOSButton tem acesso aos métodos de Button
public class MacOSButton implements Button {
    //método sobreescreve funcionalidade e printa MacOSButton
    public void paint(){
        System.out.println("You have created MacOSButton");
    }
}

