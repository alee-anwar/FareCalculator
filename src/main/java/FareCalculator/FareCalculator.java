//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package FareCalculator;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FareCalculator {
    private JFrame frame = new JFrame("Fare Calculator");
    private JPanel panel;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem red;
    private JMenuItem green;
    private JMenuItem yellow;
    private JLabel departLabel;
    private JLabel StateLabel;
    private JComboBox departCombo;
    private JComboBox StateCombo;
    private JLabel Class;
    private JCheckBox economy;
    private JCheckBox AC;
    private ButtonGroup bGroup;
    private JLabel arrLabel;
    private JComboBox arrCombo;
    private JLabel seatLabel;
    private JTextField seatText;
    private JButton computeFare;
    private JLabel totalFare;
    private JTextField totalFareText;

    public static void main(String[] args) {
        new FareCalculator();
    }

    public FareCalculator() {
        this.frame.setLayout(new GridLayout(0, 1));
        this.panel = new JPanel();
        final JPanel panel1 = new JPanel();
        final JPanel panel2 = new JPanel();
        final JPanel panel3 = new JPanel();
        this.menuBar = new JMenuBar();
        this.menu = new JMenu("Background");
        this.red = new JMenuItem("RED");
        this.green = new JMenuItem("Green");
        this.yellow = new JMenuItem("Yellow");
        this.menu.add(this.red);
        this.menu.add(this.green);
        this.menu.add(this.yellow);
        this.menuBar.add(this.menu);
        GridLayout grdLayout = new GridLayout(0, 2);
        this.red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FareCalculator.this.panel.setBackground(Color.red);
                panel1.setBackground(Color.red);
                panel2.setBackground(Color.red);
                panel3.setBackground(Color.red);
            }
        });
        this.green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FareCalculator.this.panel.setBackground(Color.green);
                panel1.setBackground(Color.green);
                panel2.setBackground(Color.green);
                panel3.setBackground(Color.green);
            }
        });
        this.yellow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FareCalculator.this.panel.setBackground(Color.yellow);
                panel1.setBackground(Color.yellow);
                panel2.setBackground(Color.yellow);
                panel3.setBackground(Color.yellow);
            }
        });
        this.departLabel = new JLabel("Departure city: ");
        this.StateLabel = new JLabel("State: ");
        this.StateCombo = new JComboBox();
//        this.StateCombo.addItem((Object)null);
        this.StateCombo.addItem("Sindh");
        this.StateCombo.addItem("Punjab");
        this.departCombo = new JComboBox();
        this.Class = new JLabel("Class");
        this.economy = new JCheckBox("Economy");
        this.AC = new JCheckBox("AC");
        this.bGroup = new ButtonGroup();
        this.bGroup.add(this.economy);
        this.bGroup.add(this.AC);
        this.StateCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (FareCalculator.this.StateCombo.getSelectedItem() == "Punjab") {
                    FareCalculator.this.departCombo.removeAllItems();
                    FareCalculator.this.departCombo.addItem("Lahore");
                } else {
                    FareCalculator.this.departCombo.removeAllItems();
                    FareCalculator.this.departCombo.addItem("Karachi");
                }

            }
        });
        this.arrLabel = new JLabel("Arrival City: ");
        this.arrCombo = new JComboBox();
        this.arrCombo.addItem("Islamabad");
        this.arrCombo.addItem("Gujranwala");
        this.arrCombo.addItem("Faisalabad");
        this.seatLabel = new JLabel("Total Seats");
        this.seatText = new JTextField("");
        this.computeFare = new JButton("Compute Fare");
        this.computeFare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                int ecox = false;
//                int acClassx = false;
//                int seatNumx = false;

                try {
                    if (FareCalculator.this.seatText.getText().equals("")) {
                        FareCalculator.this.totalFareText.setText("missing input. Try Again");
                    } else {
                        int seatNum = Integer.parseInt(FareCalculator.this.seatText.getText().trim());
                        FileWriter file;
                        short eco;
                        short acClass;
                        if (FareCalculator.this.departCombo.getSelectedItem() == "Lahore") {
                            if (FareCalculator.this.arrCombo.getSelectedItem() == "Islamabad") {
                                eco = 500;
                                acClass = 1000;
                                if (FareCalculator.this.economy.isSelected()) {
                                    FareCalculator.this.totalFareText.setText(String.format("%d", eco * seatNum));
                                } else if (FareCalculator.this.AC.isSelected()) {
                                    FareCalculator.this.totalFareText.setText(String.format("%d", acClass * seatNum));
                                } else {
                                    FareCalculator.this.totalFareText.setText("missing input. Try Again");
                                }
                            } else if (FareCalculator.this.arrCombo.getSelectedItem() == "Gujranwala") {
                                eco = 600;
                                acClass = 1500;
                                if (FareCalculator.this.economy.isSelected()) {
                                    FareCalculator.this.totalFareText.setText(String.format("%d", eco * seatNum));
                                } else if (FareCalculator.this.AC.isSelected()) {
                                    FareCalculator.this.totalFareText.setText(String.format("%d", acClass * seatNum));
                                } else {
                                    FareCalculator.this.totalFareText.setText("missing input. Try Again");
                                }
                            } else if (FareCalculator.this.arrCombo.getSelectedItem() == "Faisalabad") {
                                eco = 700;
                                acClass = 200;
                                if (FareCalculator.this.economy.isSelected()) {
                                    FareCalculator.this.totalFareText.setText(String.format("%d", eco * seatNum));
                                } else if (FareCalculator.this.AC.isSelected()) {
                                    FareCalculator.this.totalFareText.setText(String.format("%d", acClass * seatNum));
                                } else {
                                    FareCalculator.this.totalFareText.setText("missing input. Try Again");
                                }
                            }

                            file = new FileWriter("output.txt");
                            file.write(FareCalculator.this.totalFareText.getText());
                            file.close();
                        } else if (FareCalculator.this.departCombo.getSelectedItem() == "Peshawar") {
                            if (FareCalculator.this.arrCombo.getSelectedItem() == "Islamabad") {
                                eco = 500;
                                acClass = 1000;
                                if (FareCalculator.this.economy.isSelected()) {
                                    FareCalculator.this.totalFareText.setText(String.format("%d", eco * seatNum));
                                } else if (FareCalculator.this.AC.isSelected()) {
                                    FareCalculator.this.totalFareText.setText(String.format("%d", acClass * seatNum));
                                } else {
                                    FareCalculator.this.totalFareText.setText("missing input. Try Again");
                                }
                            } else if (FareCalculator.this.arrCombo.getSelectedItem() == "Gujranwala") {
                                eco = 600;
                                acClass = 1500;
                                if (FareCalculator.this.economy.isSelected()) {
                                    FareCalculator.this.totalFareText.setText(String.format("%d", eco * seatNum));
                                } else if (FareCalculator.this.AC.isSelected()) {
                                    FareCalculator.this.totalFareText.setText(String.format("%d", acClass * seatNum));
                                } else {
                                    FareCalculator.this.totalFareText.setText("missing input. Try Again");
                                }
                            } else if (FareCalculator.this.arrCombo.getSelectedItem() == "Faisalabad") {
                                eco = 700;
                                acClass = 200;
                                if (FareCalculator.this.economy.isSelected()) {
                                    FareCalculator.this.totalFareText.setText(String.format("%d", eco * seatNum));
                                } else if (FareCalculator.this.AC.isSelected()) {
                                    FareCalculator.this.totalFareText.setText(String.format("%d", acClass * seatNum));
                                } else {
                                    FareCalculator.this.totalFareText.setText("missing input. Try Again");
                                }
                            }

                            file = new FileWriter("output.txt");
                            file.write(FareCalculator.this.totalFareText.getText());
                            file.close();
                        }
                    }
                } catch (Exception var6) {
                    System.out.println(var6);
                }

            }
        });
        this.totalFare = new JLabel("Total Fare");
        this.totalFareText = new JTextField("");
        this.frame.add(this.panel);
        this.frame.add(panel1);
        this.frame.add(panel3);
        this.frame.add(panel2);
        this.panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 0, 50));
        panel3.setBorder(BorderFactory.createEmptyBorder(50, 50, 0, 50));
        this.panel.setLayout(grdLayout);
        this.panel.add(this.StateLabel);
        this.panel.add(this.StateCombo);
        this.panel.add(this.departLabel);
        this.panel.add(this.departCombo);
        panel1.add(this.Class);
        panel1.add(this.economy);
        panel1.add(this.AC);
        this.panel.add(this.arrLabel);
        this.panel.add(this.arrCombo);
        this.panel.add(this.seatLabel);
        this.panel.add(this.seatText);
        panel2.setLayout(new FlowLayout());
        panel2.add(this.computeFare);
        panel3.add(this.totalFare);
        panel3.add(this.totalFareText);
        panel3.setLayout(new GridLayout(0, 2));
        this.frame.setBounds(0, 0, 800, 550);
        this.frame.setJMenuBar(this.menuBar);
        this.frame.setDefaultCloseOperation(3);
        this.frame.setVisible(true);
    }
}
