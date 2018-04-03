//package com.company;

import java.awt.*;

public class MainView extends Frame
{

    public MainView()
    {
        //ustalenie innego niż domyślny zarządcy rozkładu
        setLayout(new GridLayout(3, 2));
        Button b1 = new Button("Pole: A1");
        add(b1);
        Button b2 = new Button("Pole: A2");
        add(b2);
        Button b3 = new Button("Pole: B1");
        add(b3);
        Button b4 = new Button("Pole: B2");
        add(b4);
        Button b5 = new Button("Pole: C1");
        add(b5);
        Button b6 = new Button("Pole: C2");
        add(b6);
        pack();
        setVisible(true);

//        setLayout(new BorderLayout(5, 5));
//        add(new Button("Strona lewa"), "West");
//        add(new Button("Strona prawa"), "East");
//        add(new Button("Pole g\u00f3rne"), "North");
//        add(new Button("Pole dolne"), "South");
//        add(new Button("Centrum"), "Center");
//        pack();
//        setVisible(true);

//        Button b1 = new Button("Strona lewa"); add(b1, "West");
//        Button b2 = new Button("Strona prawa"); add(b2, "East");
//        Button b3 = new Button("Pole g\u00f3rne"); add(b3, "North");
//        Button b4 = new Button("Pole dolne"); add(b4, "South");
//        Button b5 = new Button("Centrum"); add(b5, "Center");
//        pack();
//        setVisible(true);

//        //tutaj następuje wyłączenie zarządców rozkładu setLayout(null);
//        Button przycisk = new Button("OK");
////tutaj następuje ustawienie położenia i rozmiaru przycisku przycisk.setBounds(70,42,60,30);
//        add(przycisk);
//        setSize(200,100);
//        setVisible(true);

//        Panel panel = new Panel();
//        panel.add(new Button("Przycisk 1"));
//        panel.add(new Button("Przycisk 2"));
//        panel.add(new Button("Przycisk 3"));
//        panel.add(new Checkbox("Pole wyboru 1", true));
//        panel.add(new Checkbox("Pole wyboru 2", true));
//        panel.add(new Checkbox("Pole wyboru 3", true));
//
//        Checkbox some = new Checkbox("Pole wyboru 4", true);
//        some.setEnabled(false);
//        panel.add(some);
//
//        add(panel);
//        pack();
//        setSize(400,100);
//        setVisible(true);
    }
}

/*
class PoleWyboru extends Frame
{
    public PoleWyboru()
    {
        Panel panel = new Panel();
        panel.add(new Checkbox("Pole wyboru 1", true));
        panel.add(new Checkbox("Pole wyboru 2", true));
        panel.add(new Checkbox("Pole wyboru 3", true));


        add(panel);
        pack();
//        setSize(400,100);
        setVisible(true);
    }
}

class Etykieta1 extends Frame
{
    public Etykieta1() {
        Label etykieta = new Label("Napis z lewej", Label.LEFT);
        add(etykieta);

        pack();
        setSize(400,100);
        setVisible(true);

        add(new Button("Napis na przycisku"));

        pack();
        setSize(100,50);
        setVisible(true);
    }
}


//Okno.java
import java.awt.*;

class Okno extends Frame {

    public Okno() {
        String str1 = "Aaaaaa ju\u017c jest wiosna,\n"; String str2 = " aaaaaa d\u0142u\u017csze dnie,\n"; String str3 = " aaaaaa kwiatki rosn\u0105,\n"; String str4 = " aaaaaa - g\u0142upie, nie?"; String piosnka = str1 + str2 + str3 +str4;
        String Autor = "Kabaret POTEM";
        TextArea poleTekstu = new TextArea();
        poleTekstu.setEditable(false); add(poleTekstu, "Center");
        poleTekstu.append('\u0022' + piosnka + '\u0022' + "\n"); poleTekstu.append("\t\t" + Autor);
        pack(); setSize(420,200); setVisible(true);
    }
}



*/