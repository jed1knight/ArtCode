package week3.homework3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.StringTokenizer;

/**
 * Created by Home on 11.09.2015.
 */
public class GuiCmd extends JFrame {
    private Cmd cmd = null;
    private JTextArea textArea;

    public GuiCmd() {
        cmd = new Cmd();
        initFrame();
    }

    private void initFrame() {
        setTitle("cmd");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650, 350);
        setResizable(true);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);

        initTextArea();
        JScrollPane scroller = new JScrollPane(textArea);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        getContentPane().add(scroller);

        setVisible(true);
    }

    private void initTextArea() {
        textArea = new JTextArea(">");


        textArea.setBackground(Color.BLACK);
        textArea.setEditable(true);
        Font font = new Font("Courier New", Font.BOLD, 16);
        textArea.setForeground(Color.white);
        textArea.setFont(font);
        textArea.setLineWrap(true);
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    doAction();
                    textArea.append(cmd.getHomeDir() + ">");
                }
            }

        });
    }

    private String getLastStringFromTextArea() {
        String lastString = null;
        StringTokenizer st = new StringTokenizer(textArea.getText(), "\n");
        while (st.hasMoreTokens()) {
            lastString = st.nextToken();
        }
        return lastString;
    }

    private void doAction() {
        String lastString = getLastStringFromTextArea();
        if (lastString.contains("ls")) {
            textArea.append("\n" + cmd.filesInDir());
        }
        else if (lastString.contains("cd")) {
            String[] split = lastString.split(" ");
                cmd.changeDir(split[1].trim());
        }
        else if (lastString.contains("mkdir")) {
            String[] split = lastString.split(" ");
            cmd.makeDir(split[1].trim());
        }
        else  if (lastString.contains("rm")) {
            String[] split = lastString.split(" ");
            cmd.remove(split[1].trim());
        }
        else if (lastString.contains("cat")) {
            String[] split = lastString.split(" ");
            textArea.append(cmd.showFile(split[1].trim()));

        }
        else if (lastString.contains("help")) {
            textArea.append("Commands:\n" +
                    "ls - show files in directory" +
                    "cd - change directory\n" +
                    "mkdir - make directory\n" +
                    "rm - remove\n" +
                    "cat - show file\n");
        }
        else {
            textArea.append("\n unregistered command\n");
        }
    }
}