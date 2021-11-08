package 第八章.第二题;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalTest extends JFrame {

    private JTextField firText, secText, reText;
    private JLabel eqLabel;
    private JComboBox jbox;
    private String[] str;
    private JButton calb, clearb, exitb;
    private JPanel p, p2;

    public static void main(String[] args) {
        new CalTest("计算器");
    }

    public CalTest() {
    }

    public CalTest(String title) {
        setTitle(title);
        setLocation(500, 200);
        setDefaultCloseOperation(3);
        setResizable(false);
        setLayout(new FlowLayout());
        init();
        pack();
        setVisible(true);
    }

    public void init() {

        p = new JPanel();
        p.setSize(300, 300);
        firText = new JTextField(5);
        secText = new JTextField(5);
        reText = new JTextField(5);
        reText.setEditable(false);
        eqLabel = new JLabel("=");

        str = new String[]{"+", "-", "*", "/"};
        jbox = new JComboBox(str);

        p.add(firText);
        p.add(jbox);
        p.add(secText);
        p.add(eqLabel);
        p.add(reText);
        add(p);

        p2 = new JPanel();
        calb = new JButton("计算");

        calb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //getSelectedItem()返回JComboBox所选项，返回Objection类型
                String sign = (String) jbox.getSelectedItem();

                if (sign.equals("+")) {
                    int num = Integer.parseInt(firText.getText());
                    int num2 = Integer.parseInt(secText.getText());
                    int add = num + num2;
                    reText.setText(add + "");
                } else if (sign.equals("-")) {
                    int num = Integer.parseInt(firText.getText());
                    int num2 = Integer.parseInt(secText.getText());
                    int sup = num - num2;
                    reText.setText(sup + "");
                } else if (sign.equals("*")) {
                    int num = Integer.parseInt(firText.getText());
                    int num2 = Integer.parseInt(secText.getText());
                    int sel = num * num2;
                    reText.setText(sel + "");
                } else {
                    int num = Integer.parseInt(firText.getText());
                    int num2 = Integer.parseInt(secText.getText());
                    int sele = num / num2;
                    reText.setText(sele + "");
                }
            }
        });
        clearb = new JButton("复位");
        clearb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                firText.setText(null);
                secText.setText(null);
                reText.setText(null);
            }
        });

        exitb = new JButton("退出");
        exitb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });

        p2.add(calb);
        p2.add(clearb);
        p2.add(exitb);
        add(p2, BorderLayout.SOUTH);
    }
}
