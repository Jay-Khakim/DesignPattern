package Creational.Factory.factory;

import Creational.Factory.buttons.Button;
import Creational.Factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    
    @Override
    public Button createButton(){
        return new HtmlButton();
    }
}
