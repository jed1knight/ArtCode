package week2.homework.coffeeHouse;

import week2.homework.coffeeHouse.beverages.*;
import week2.homework.coffeeHouse.toppings.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Home on 05.09.2015.
 */
public class CoffeeHouseGUI extends JFrame{
    private static final String TITLE = "Coffee House";

    JPanel mainPanel;
    JPanel bevButtonsPanel;
    JTextArea textArea;
    JButton latteButton;
    JButton americanoButton;
    JButton espressoButton;
    JButton blackTeaButton;
    JButton greenTeaButton;
    JButton cocoaButton;
    JDialog dialog;


    Beverage beverage;

    CoffeeHouseGUI() {
        super(TITLE);
        setup();

    }

    private void setup() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setResizable(false);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

        mainPanel = new JPanel(new BorderLayout());
        initMainPanel();
        getContentPane().add(mainPanel);
        setupBeverageButtons();

        setVisible(true);
    }

    private void initMainPanel() {
        initTextArea();
        mainPanel.add(textArea, "Center");

    }

    private void initTextArea() {
        textArea = new JTextArea("Welcome!");
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        textArea.setBackground(Color.cyan);
        Font font = new Font("Courier New", Font.BOLD, 16);
        textArea.setFont(font);
    }

    private void initLatteButton() {
        latteButton = new JButton("Latte");
        latteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                beverage = new Latte();
                initDialog();

            }
        });
    }
    private void initAmericanoButton() {
        americanoButton = new JButton("Americano");
        americanoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                beverage = new Americano();
                initDialog();
            }
        });
    }
    private void initEspressoButton() {
        espressoButton = new JButton("Espresso");
        espressoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                beverage = new Espresso();
                initDialog();
            }
        });
    }
    private void initBlackTeaButton() {
        blackTeaButton = new JButton("Black Tea");
        blackTeaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                beverage = new BlackTea();
                initDialog();
            }
        });
    }
    private void initGreenTeaButton() {
        greenTeaButton = new JButton("Green Tea");
        greenTeaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                beverage = new GreenTea();
                initDialog();
            }
        });
    }
    private void initCocoaButton() {
        cocoaButton = new JButton("Cocoa");
        cocoaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                beverage = new Cocoa();
                initDialog();
            }
        });
    }

    private void setupBeverageButtons() {
        bevButtonsPanel = new JPanel(new GridLayout(6, 1));

        initLatteButton();
        bevButtonsPanel.add(latteButton);
        initAmericanoButton();
        bevButtonsPanel.add(americanoButton);
        initEspressoButton();
        bevButtonsPanel.add(espressoButton);
        initBlackTeaButton();
        bevButtonsPanel.add(blackTeaButton);
        initGreenTeaButton();
        bevButtonsPanel.add(greenTeaButton);
        initCocoaButton();
        bevButtonsPanel.add(cocoaButton);

        getContentPane().add(bevButtonsPanel, "West");
    }

    private void initDialog() {
        dialog = new JDialog();
        dialog.setTitle("Chose topping");
        dialog.setSize(100, 300);
        dialog.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dialogSize = dialog.getSize();
        if (dialogSize.width > screenSize.width) {
            dialogSize.width = screenSize.width;
        }
        if (dialogSize.height > screenSize.height) {
            dialogSize.height = screenSize.height;
        }
        dialog.setLocation((screenSize.width - dialogSize.width) / 2,
                (screenSize.height - dialogSize.height) / 2);
        JPanel dialogPanel = new JPanel(new GridLayout(6, 1));


        final JRadioButton caramelRadioB = new JRadioButton("Caramel", false);
        dialogPanel.add(caramelRadioB);
        final JRadioButton chocolateRadioB = new JRadioButton("Chocolate", false);
        dialogPanel.add(chocolateRadioB);
        final JRadioButton cinnamonRadioB = new JRadioButton("Cinnamon", false);
        dialogPanel.add(cinnamonRadioB);
        final JRadioButton lemonRadioB = new JRadioButton("Lemon", false);
        dialogPanel.add(lemonRadioB);
        final JRadioButton milkRadioB = new JRadioButton("Milk", false);
        dialogPanel.add(milkRadioB);

        JButton ok = new JButton("OK");
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (caramelRadioB.isSelected()) {
                    beverage.addTopping(new Caramel());
                }
                if (chocolateRadioB.isSelected()) {
                    beverage.addTopping(new Chocolate());
                }
                if (cinnamonRadioB.isSelected()) {
                    beverage.addTopping(new Cinnamon());
                }
                if (lemonRadioB.isSelected()) {
                    beverage.addTopping(new Lemon());
                }
                if (milkRadioB.isSelected()) {
                    beverage.addTopping(new Milk());
                }
                dialog.dispose();
                textArea.setText(billAsString());
            }
        });
        JPanel okPanel = new JPanel();
        okPanel.add(ok);
        dialogPanel.add(okPanel);


        dialog.getContentPane().add(dialogPanel);
        dialog.setVisible(true);
    }

    private String billAsString() {
        return "RECEIPT \n" + beverage.totalDescription() + "\n"
                + "PRICE = " + beverage.totalCost() + " grn";
    }

}
