package shape;

import javax.swing.JOptionPane;
import javax.swing.border.Border;
import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;

public class MainWindow extends javax.swing.JFrame {

    private Color color = null;
    private Point point = null;

    public MainWindow() {
        initComponents();

        Border greyLine = BorderFactory.createLineBorder(Color.DARK_GRAY);
        canvasPanel.setBorder(greyLine);
        canvasPanel.setBackground(new Color(250, 250, 240));
        controlPanel.setBackground(new Color(245, 245, 250));
        buttonColor.setText("Choose color");
        buttonAdd.setText("Add shape");
        buttonClear.setText("Clear");
        buttonShapes.setText("List of shapes");
        buttonCredits.setText("Credits");
        buttonClose.setText("Close");
        drawInitialShapes();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPasswordField1 = new javax.swing.JPasswordField();
        canvasPanel = new javax.swing.JPanel();
        drawingCanvas1 = new shape.DrawingCanvas();
        controlPanel = new javax.swing.JPanel();
        buttonColor = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonShapes = new javax.swing.JButton();
        buttonCredits = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        pointLabel = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        canvasPanel.setBackground(new java.awt.Color(255, 255, 153));
        canvasPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canvasPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout canvasPanelLayout = new javax.swing.GroupLayout(canvasPanel);
        canvasPanel.setLayout(canvasPanelLayout);
        canvasPanelLayout.setHorizontalGroup(
            canvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drawingCanvas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        canvasPanelLayout.setVerticalGroup(
            canvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drawingCanvas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );

        controlPanel.setBackground(new java.awt.Color(204, 255, 204));

        buttonColor.setText("Choose color");
        buttonColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColorActionPerformed(evt);
            }
        });

        buttonAdd.setText("Add shape");
        buttonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAddMouseClicked(evt);
            }
        });
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonClear.setText("Clear");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonShapes.setText("List of shapes");
        buttonShapes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShapesActionPerformed(evt);
            }
        });

        buttonCredits.setText("Credits");
        buttonCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreditsActionPerformed(evt);
            }
        });

        buttonClose.setText("Close");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        pointLabel.setText("Center: ---");

        colorLabel.setText("Color: ---");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonColor, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(pointLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCredits, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonShapes, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(buttonClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonColor)
                    .addComponent(buttonAdd)
                    .addComponent(buttonClear)
                    .addComponent(buttonShapes))
                .addGap(19, 19, 19)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pointLabel)
                    .addComponent(colorLabel)
                    .addComponent(buttonCredits)
                    .addComponent(buttonClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(canvasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(canvasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreditsActionPerformed
        JOptionPane.showMessageDialog(this, "Developed by MG", "Credits",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonCreditsActionPerformed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void buttonShapesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShapesActionPerformed
        String str = "";
        for (Shape sh : drawingCanvas1.shapes) {
            str += sh.toString() + "\n";
        }
        JOptionPane.showMessageDialog(this, str, "List of shapes",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonShapesActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        drawingCanvas1.shapes.clear();
        drawingCanvas1.rePaint();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddMouseClicked

    }//GEN-LAST:event_buttonAddMouseClicked

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        if (color == null || point == null) {
            JOptionPane.showMessageDialog(this, "Please choose both color and center point before adding a shape.", "Error", JOptionPane.ERROR_MESSAGE);

        } else {

            Object[] options = {new Rectangle(), new Circle(), new Ellipse(), new Square()};
            JComboBox combo = new JComboBox(options);
            Object[] buttons = {"Draw", "Cancel"};
            JOptionPane.showOptionDialog(
                    null,
                    combo,
                    "Please select shape",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    buttons,
                    buttons[0]
            );
            Shape selectedShape = (Shape) combo.getSelectedItem();
            selectedShape.getExtraData(this);
            selectedShape.color = color;
            selectedShape.center = point;
            selectedShape.isEmpty = false;
            drawingCanvas1.shapes.add(selectedShape);
            drawingCanvas1.rePaint();

        }

    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColorActionPerformed

        try {
            String userInput = JOptionPane.showInputDialog(this, "Please input color components: r:g:b "
                    + "or leave empty for random color", "111:222:111");

            if (!userInput.isEmpty()) {
                String[] components = userInput.split(":");
                if (components.length != 3) {
                    throw new IllegalArgumentException("Invalid input format. Use r:g:b");
                }
                int red = Integer.parseInt(components[0]);
                int green = Integer.parseInt(components[1]);
                int blue = Integer.parseInt(components[2]);

                if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
                    throw new IllegalArgumentException("RGB values must be between 0 and 255");
                }

                color = new Color(red, green, blue, 128);
            } else {
                // Generate random RGB values
                Random random = new Random();
                int red = random.nextInt(256);
                int green = random.nextInt(256);
                int blue = random.nextInt(256);

                color = new Color(red, green, blue, 128);
            }

            colorLabel.setText(String.format("Color rgb: %d:%d:%d", color.getRed(), color.getGreen(), color.getBlue()));

            colorLabel.setOpaque(true);
            colorLabel.setForeground(color);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonColorActionPerformed

    private void canvasPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasPanelMouseClicked
        Point chosenPoint = new Point(evt.getX(), evt.getY());
        point = chosenPoint;
        pointLabel.setText("Center: [" + point.x + ", " + point.y + "]");
    }//GEN-LAST:event_canvasPanelMouseClicked

    private void drawInitialShapes() {
        Color color1 = new Color(0x84, 0xb4, 0xc8, 0xd0);
        Color color2 = new Color(0x8e, 0xc9, 0xbb, 0xd0);
        Color color3 = new Color(0xf4, 0xdc, 0xd6, 0xd0);
        Circle c = new Circle(color1, new Point(200, 200), 70);
        drawingCanvas1.shapes.add(c.getCircumscribedSquare(color3));
        drawingCanvas1.shapes.add(c);
        Rectangle r = new Rectangle(color1, new Point(520, 350), 130, 90);
        drawingCanvas1.shapes.add(r.getCircumscribedCircle(color3));
        drawingCanvas1.shapes.add(r);
        Ellipse e = new Ellipse(color2, new Point(410, 250), 90, 150);
        drawingCanvas1.shapes.add(e);
        drawingCanvas1.shapes.add(e.getInscribedCircle(color3));
        Square s = new Square(color1, new Point(600, 80), 90);
        drawingCanvas1.shapes.add(s);
        drawingCanvas1.shapes.add(s.getInscribedCircle(color3));
        drawingCanvas1.rePaint();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonColor;
    private javax.swing.JButton buttonCredits;
    private javax.swing.JButton buttonShapes;
    private javax.swing.JPanel canvasPanel;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JPanel controlPanel;
    private shape.DrawingCanvas drawingCanvas1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel pointLabel;
    // End of variables declaration//GEN-END:variables
}
