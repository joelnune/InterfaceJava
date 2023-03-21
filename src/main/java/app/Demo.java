
package app;

import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;
public class Demo {

    //método do tipo Application
    private static Application configureApplication() {
        //instancia da classe application
        Application app;
        //instancia do tipo  GUIFactory
        GUIFactory factory;
        //variavel String recebe o texto 'os.name' em minusculo
        String osName = System.getProperty("os.name").toLowerCase();
        //condicional para verificar se a variavel osName possui o valor 'mac'
        //se sim, cria um objeto da classe MacOSFactory
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else
        //se não, cria um objeto do tipo factory
        {
            factory = new WindowsFactory();
        }
        //criando objeto application recebendo o objeto factory como parametro
        app = new Application(factory);
        //retornando app
        return app;
    }
    
    public static void main(String[] args) {
        //objeto app recebe método MacOSFactory
        Application app = configureApplication();
        //executa método criado anteriormente
        app.paint();
    }
}
