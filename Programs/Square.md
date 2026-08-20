\# Square Drawing Program



\## Objective



To draw a square using Java programming and four straight lines.



\## Program



The program uses Java Swing and the Graphics class to create a window and draw a square.



\## Java Code



```java

import javax.swing.\*;

import java.awt.\*;



public class Square extends JPanel {



&#x20;   @Override

&#x20;   protected void paintComponent(Graphics g) {

&#x20;       super.paintComponent(g);



&#x20;       g.drawLine(100, 100, 300, 100);

&#x20;       g.drawLine(300, 100, 300, 300);

&#x20;       g.drawLine(300, 300, 100, 300);

&#x20;       g.drawLine(100, 300, 100, 100);

&#x20;   }



&#x20;   public static void main(String\[] args) {

&#x20;       JFrame frame = new JFrame("My Square");



&#x20;       frame.add(new Square());

&#x20;       frame.setSize(400, 400);

&#x20;       frame.setDefaultCloseOperation(JFrame.EXIT\_ON\_CLOSE);

&#x20;       frame.setVisible(true);

&#x20;   }

}

```



\## Execution



The program was compiled and executed using Command Prompt.



```text

javac Square.java

java Square

```



The program opens a window and displays a square using four straight lines.

