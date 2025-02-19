package factories;

import buttons.Button;
import buttons.MacOSButton;
import checkboxes.Checkbox;
import checkboxes.MaxOSCheckbox;

public class MacOSFactory implements GUIFactory{
    
    @Override
    public Button createButton(){
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new MaxOSCheckbox();
    }
}
