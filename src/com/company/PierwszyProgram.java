package com.company;

public class PierwszyProgram {

    private final String str1 = "Aaaaaa juz jest wiosna,\n";
    private final String str2 = " aaaaaa dluzsze dnie,\n";
    private final String str3 = " aaaaaa kwiatki rosna,\n";
    private final String str4 = " aaaaaa - glupie, nie?";
    private final String piosnka = str1 + str2 + str3 +str4;
    private final String autor = "Kabaret POTEM";

    public void wypiszTekst()
    {
        System.out.println('\u0022' + piosnka + '\u0022');
        System.out.println("\t\t" + autor);
    }
}
