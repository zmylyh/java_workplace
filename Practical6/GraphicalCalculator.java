package Practical6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalCalculator {
    GraphicalCalculator() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException |
                 IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);


        JLabel label1 = new JLabel("Num 1:");
        JLabel label2 = new JLabel("Num 2:");

        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();

        String[] operations = {"+", "-", "*", "/"};
        JComboBox<String> operationSelector = new JComboBox<>(operations);
        JButton calculateButton = new JButton("Calculate");
        JButton clearButton = new JButton("Clear");
        JLabel resultLabel = new JLabel("Result: ");

        Font font = new Font("consolas", Font.BOLD, 30);
        label1.setFont(font);
        label2.setFont(font);
        resultLabel.setFont(font);
        operationSelector.setFont(font);
        calculateButton.setFont(font);
        clearButton.setFont(font);
        textField1.setFont(font);
        textField2.setFont(font);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Display mode");
        JMenuItem decimalMenuItem = new JMenuItem("Decimal");
        JMenuItem integerMenuItem = new JMenuItem("Integer");
        menu.add(decimalMenuItem);
        menu.add(integerMenuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        boolean[] isInteger = {false};

        calculateButton.addActionListener(e -> {
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            String operation = (String) operationSelector.getSelectedItem();
            double result = 0;
            if (operation != null) {
                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            JOptionPane.showMessageDialog(frame, "Cannot divide by zero");
                            return;
                        }
                        break;
                }
            }
            if (isInteger[0]) {
                resultLabel.setText("Result: " + (int) result);
            } else {
                resultLabel.setText("Result: " + result);
            }
        });

        clearButton.addActionListener(e -> {
            textField1.setText("");
            textField2.setText("");
            resultLabel.setText("Result: ");
        });

        decimalMenuItem.addActionListener(e -> isInteger[0] = false);

        integerMenuItem.addActionListener(e -> isInteger[0] = true);

        frame.setLayout(new GridLayout(4, 2));
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(operationSelector);
        frame.add(calculateButton);
        frame.add(resultLabel);
        frame.add(clearButton);
        frame_center(frame);
        frame.setVisible(true);
    }

    public static JFrame frame_center(JFrame jFrame) {
        int widthFrame = jFrame.getWidth();
        int heightFrame = jFrame.getHeight();
        Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = defaultToolkit.getScreenSize();
        double widthScreen = screenSize.getWidth();
        double heightScreen = screenSize.getHeight();
        if (widthFrame > widthScreen) {
            widthFrame = (int) widthScreen;
        }
        if (heightFrame > heightScreen) {
            heightFrame = (int) heightScreen;
        }
        int positionX = (int) ((widthScreen - widthFrame) / 2);
        int positionY = (int) ((heightScreen - heightFrame) / 2);

        jFrame.setSize(new Dimension(widthFrame, heightFrame));
        jFrame.setLocation(new Point(positionX, positionY));

        return jFrame;
    }


    public static void main(String[] args) {
        new GraphicalCalculator();
    }
}