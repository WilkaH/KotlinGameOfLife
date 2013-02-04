import javax.swing.*;
import java.awt.event.*;
import java.util.Observable;

public class MainDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonCancel;
    private JTextPane textPane1;

    public MainDialog() {
        setContentPane(contentPane);
        setModal(true);

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });


        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onCancel() {
        dispose();
    }

    public void setText(String text) {

        final String theText = text;
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainDialog.this.textPane1.setText(theText);
            }
        });
    }
}
