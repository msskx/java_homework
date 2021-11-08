package 第八章.第一题;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Crud extends JFrame implements ActionListener {
    // 定义组件
    JPanel jp1, jp2;
    JButton jbNew, jbDelete, jbSearch, jbSave, jbLast, jbNext;
    JTextArea ta;

    private JTextField tfSearch;

    public static void main(String[] args) {
        Crud demo = new Crud();
        demo.setTitle("备忘录");
    }

    // 构造函数
    public Crud() {
        // 创建组件
        jp1 = new JPanel();
        jp2 = new JPanel();

        jbNew = new JButton("新建");
        jbDelete = new JButton("删除");
        jbSearch = new JButton("查询");
        jbSave = new JButton("保存");
        jbLast = new JButton("上一条");
        jbNext = new JButton("下一条");

        jbNew.addActionListener(this);
        jbDelete.addActionListener(this);
        jbSearch.addActionListener(this);
        jbSave.addActionListener(this);
        jbLast.addActionListener(this);
        jbNext.addActionListener(this);

        ta = new JTextArea("此处为文本区");

        // 设置布局管理器，
        //JPanel布局默认是BorderLoyout// 添加JPanel
        //JPanel属于容器类组件，可以加入别的组件
        jp1.add(new JLabel("关键字"));
        tfSearch = new JTextField(8);
        jp1.add(tfSearch);
        jp1.add(jbSearch);
        jp1.add(jbNew);
        jp1.add(jbDelete);

        jp2.add(jbLast);
        jp2.add(jbNext);
        jp2.add(jbSave);
        //江南烟雨，我自是愿为你风露宵立，皆因你，梦里相依。
        // 把jpanel 加入JFrame
        this.add(jp1, BorderLayout.NORTH);
        this.add(ta, BorderLayout.CENTER);
        this.add(jp2, BorderLayout.SOUTH);

        this.setSize(400, 200);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbSearch) {
            ta.setText("查询");
        } else if (e.getSource() == jbNew) {
            ta.setText("新建");
        } else if (e.getSource() == jbDelete) {
            ta.setText("删除");
        } else if (e.getSource() == jbSave) {
            ta.setText("保存");
        } else if (e.getSource() == jbLast) {
            ta.setText("上一条");
        } else if (e.getSource() == jbNext) {
            ta.setText("下一条");
        }
    }
}
