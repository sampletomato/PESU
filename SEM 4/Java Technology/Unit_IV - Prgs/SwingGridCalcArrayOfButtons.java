import javax.swing.*; import java.awt.*;
import javax.script.*;
public class SwingGridCalcArrayOfButtons {
    public static Number evaluate(String expr) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            return ((Number) engine.eval(expr)).intValue();
        }
        catch (ScriptException e) {return (Number) 0;}
    }
    static String expr = "";
    public static void main(String[] args) {
        for(int i = 0; i < 50; i++) System.out.println();
        JFrame f = new JFrame("Calculator (GridLayout) + Array");
        JButton[] buttons = new JButton[16];
        String buttonString = "123+456-789*C0=/";
        for(int i = 0; i < buttons.length; i++)
            buttons[i] = new JButton(String.valueOf(buttonString.charAt(i)));
        // Action Listeners
        for(JButton b: buttons) {
            b.addActionListener(e -> {
                String t = b.getText();
                if(t.equals("=")) {
                    System.out.println("Evaluating expression: " + expr);
                    System.out.println("Result: " + evaluate(expr));
                    expr = "";
                }
                else if(t.equals("C")) {
                    System.out.println("Cleared");
                    expr = "";
                }
                else expr += t;
            });
        }
        f.setLayout(new GridLayout(4, 4));
        f.setSize(400, 400);
        for(JButton b: buttons)
            f.add(b);
        f.setVisible(true);
    }
}
