import java.awt.*;
import javax.swing.*;

public class MenuExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Menu Example");

    JMenuBar menuBar = new JMenuBar();

    JMenu fileMenu = new JMenu("File");
    JMenuItem newItem = new JMenuItem("New");
    JMenuItem openItem = new JMenuItem("Open");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem saveAsItem = new JMenuItem("Save As");
    JMenuItem exitItem = new JMenuItem("Exit");

    fileMenu.add(newItem);
    fileMenu.add(openItem);
    fileMenu.addSeparator();
    fileMenu.add(saveItem);
    fileMenu.add(saveAsItem);
    fileMenu.addSeparator();
    fileMenu.add(exitItem);

    JMenu editMenu = new JMenu("Edit");
    JMenuItem cutItem = new JMenuItem("Cut");
    JMenuItem copyItem = new JMenuItem("Copy");
    JMenuItem pasteItem = new JMenuItem("Paste");

    editMenu.add(cutItem);
    editMenu.add(copyItem);
    editMenu.add(pasteItem);

    JMenu viewMenu = new JMenu("View");
    JCheckBoxMenuItem showToolbarItem = new JCheckBoxMenuItem("Show Toolbar");
    JCheckBoxMenuItem showStatusBarItem = new JCheckBoxMenuItem("Show Status Bar");

    viewMenu.add(showToolbarItem);
    viewMenu.add(showStatusBarItem);

    JMenu helpMenu = new JMenu("Help");
    JMenuItem aboutItem = new JMenuItem("About");

    helpMenu.add(aboutItem);

    menuBar.add(fileMenu);
    menuBar.add(editMenu);
    menuBar.add(viewMenu);
    menuBar.add(helpMenu);

    frame.setJMenuBar(menuBar);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
