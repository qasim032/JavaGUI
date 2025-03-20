import javax.swing.JOptionPane;

class SumTwoNumbersGUI {
    public static void main(String[] args) {
        String inp1 = JOptionPane.showInputDialog("Enter first number:");
        String inp2 = JOptionPane.showInputDialog("Enter second number:");


        int num1 = Integer.parseInt(inp1);
        int num2 = Integer.parseInt(inp2);


        int sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is: " + sum, "Result", JOptionPane.INFORMATION_MESSAGE);


    }
}

