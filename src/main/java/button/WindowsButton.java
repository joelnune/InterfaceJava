
package button;

//Classe WindowsButton tem acesso aos métodos de Button
public class WindowsButton implements Button{
    //método sobreescreve funcionalidade e printa WindowsButton
      public void paint(){
        System.out.println("You have created WindowsButton");
    }
}
