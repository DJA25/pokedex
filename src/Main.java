import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        JFrame mf = new JFrame("Pokedex");
        mf.setSize(1000, 800);
        mf.setLayout(new BorderLayout());
        JPanel search = new JPanel(new BorderLayout());
        search.add(new JLabel(" Search For Pokemon: "), BorderLayout.WEST);
        JTextField searchField = new JTextField();
        search.add(searchField, BorderLayout.CENTER);
        mf.add(search, BorderLayout.NORTH);
        JPanel splitter = new JPanel(new GridLayout(2, 1));
        JPanel grid = new JPanel(new GridLayout(16, 5));
        int count = 0;
        for(int i = 0; i<16; i++) {
            for(int j = 0; j<5; j++) {
                count++;
                grid.add(new JButton("NAME HERE"));
            }
        }
        JScrollPane gg = new JScrollPane(grid);
//        gg.add(grid);
        splitter.add(gg);
        JPanel bottom = new JPanel(new BorderLayout());
        JLabel pokename = new JLabel("ADD SELECTED POKEMON NAME HERE", SwingConstants.CENTER);
        bottom.add(pokename, BorderLayout.NORTH);
        JPanel lastSplit = new JPanel(new GridLayout(1, 2));
        lastSplit.add(new JLabel("PHOTO HERE", SwingConstants.CENTER));
        lastSplit.add(new JLabel("DATA HERE", SwingConstants.CENTER));
        bottom.add(lastSplit);
        splitter.add(bottom);
        mf.add(splitter, BorderLayout.CENTER);


        mf.setVisible(true);

    }
}