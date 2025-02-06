package buttons;

public class HtmlButton implements Button {
    public void render(){
        System.out.println(("<button> Text </button>"));
        onClick();
    }

    public void onClick(){
        System.out.println("Click! Button says -'Hello World!");
    }
}
