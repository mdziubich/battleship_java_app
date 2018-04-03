
import java.awt.*;

public class BattlefieldView extends Frame
{
    public BattlefieldView()
    {
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gb);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridheight = 2;
        gbc.weightx = 0.4;
        przycisk("1", gb, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 0.6;
        emptyLabel(gb, gbc);


        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbc.gridheight = 2;
        gbc.weighty = 0.4;
        emptyLabel(gb, gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 0.6;
        przycisk("6", gb, gbc);


//        gbc.gridwidth = 1;
//        gbc.gridheight = 2;
//        gbc.weighty = 0.4;
//        przycisk("8", gb, gbc);
//        gbc.weighty = 0.6;
//        emptyLabel(gb, gbc);
//
//        gbc.weighty = 0.4;
//        gbc.gridwidth = GridBagConstraints.REMAINDER;
//        gbc.gridheight = 1;
//        emptyLabel(gb, gbc);
//        gbc.weighty = 0.6;
//        przycisk("10", gb, gbc);

//        SingleBattlefieldView someLabel = new SingleBattlefieldView();
//        gb.setConstraints(someLabel, gbc);
//        add(someLabel);

        pack();
        setSize(600, 600);
        setVisible(true);

        Label etykieta = new Label();

//        SingleBattlefieldView userBattlefield = new SingleBattlefieldView();
//        SingleBattlefieldView opponent = new SingleBattlefieldView();
    }

    private void przycisk(String napis, GridBagLayout gb, GridBagConstraints gbc)
    {
        Button b = new Button(napis);
        gb.setConstraints(b, gbc);
        add(b);
    }

    private void emptyLabel(GridBagLayout gb, GridBagConstraints gbc)
    {
        Label someLabel = new Label();
        gb.setConstraints(someLabel, gbc);
        add(someLabel);
    }
}

class SingleBattlefieldView extends Frame
{
    private int numberOfRows = 11;
    private String[] columnLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

    public SingleBattlefieldView()
    {
        setLayout(new GridLayout(numberOfRows, numberOfRows)); //number of columns should be the same as the number of rows

        for(int column = 0; column < numberOfRows; column++)
        {
            for(int row = 0; row < numberOfRows; row++)
            {
                Button shipFiledButton = createField(row, column);
                add(shipFiledButton);
            }
        }

        pack();
        setVisible(true);
    }

    /*
    Declared method creates fields for battleship game.
    One filed represents one filed for single ship.
    Field in first row or in first column are not suppose to be user interaction enabled
    because they just represent information about row/column number
     */
    private Button createField(int row, int column)
    {
        Button shipFiledButton = new Button();

        if (column == 0 && row == 0)
        {
            shipFiledButton.setEnabled(false);
        }
        else if (column == 0)
        {
            String columnLetter = columnLetters[row - 1] + String.valueOf(row);
            shipFiledButton.setLabel(columnLetter);
            shipFiledButton.setEnabled(false);
        }
        else if (row == 0)
        {
            String columnNumber = String.valueOf(column);
            shipFiledButton.setLabel(columnNumber);
            shipFiledButton.setEnabled(false);
        }

        return shipFiledButton;
    }
}
