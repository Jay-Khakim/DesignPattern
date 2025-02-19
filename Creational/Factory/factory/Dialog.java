package Creational.Factory.factory;

import Creational.Factory.buttons.Button;

public abstract class Dialog {
    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
