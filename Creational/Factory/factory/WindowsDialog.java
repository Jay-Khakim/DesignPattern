package Creational.Factory.factory;

import Creational.Factory.buttons.Button;
import Creational.Factory.buttons.WindowsButton;

public class WindowsDialog  extends Dialog{
    
    @Override
    public Button createButton(){
        return new WindowsButton();
    }
}
