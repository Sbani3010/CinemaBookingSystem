package za.ac.cput.views.gui;

import za.ac.cput.domain.Movie;
import za.ac.cput.domain.MovieRoom;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame implements ActionListener {
    private JComboBox<String> movieJComboBox;
    private JComboBox<String> roomJComboBox;
    private JTextField date;
    private JTextField time;

    public MainGUI(){
        String[] options2 = {"Choice A", "Choice B", "Choice C"};

        roomJComboBox=new JComboBox<>(options2);
        movieJComboBox=new JComboBox<>(options2);
        date=new JTextField(9);
        time=new JTextField(3);
    }
    public void setGUI(){
        this.setLayout(new FlowLayout());
        this.add(movieJComboBox);
        this.add(roomJComboBox);
        this.add(date);
        this.add(time);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(600,499);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
