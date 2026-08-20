# CSC360 — Class Reflection



**AU ID:** AU2520082  

**Date:** 13/08/2026  

---



## Topics Covered:



* JFrame & the paint() method
* drawRect() vs. manual drawLine() outline drawing
* Pixel coordinates & centering logic (start = center − length/2)
* Window setup methods (setSize, setDefaultCloseOperation, setLocationRelativeTo, setVisible)
* Maven project folder structure



## Reflections:



* JFrame/paint(): paint() isn't called manually — it fires whenever the window redraws, so custom graphics logic belongs there, always starting with super.paint(g).
* drawRect vs drawLine: drawRect(x,y,w,h) is a shortcut for four drawLine() calls; (x,y) is the top-left corner, not the center — easy to mix up.
* Centering logic: To center a shape, compute start = center − (length/2) first; the demo code skips this and hardcodes (200,150) instead.
* Window setup: setVisible(true) must come last, after size/close-operation/location are set, or the window can flash incompletely configured.
* Maven structure: src/main/java = code, src/main/resources = assets, src/test/java = tests, target/ = build output — never edit target/ by hand.



Key Terms: JFrame · Graphics · paint(Graphics g) · super.paint(g) · drawRect() · drawLine() · pom.xml · EXIT\_ON\_CLOSE



## Q&A Discussed:



### Q1: Why call super.paint(g) before custom drawing? 
**A:** It lets the parent class run its default painting first, avoiding rendering glitches like flicker or missing background.

### Q2: Does drawRect() fill the shape?
**A:** No — it only draws the outline. fillRect() is the filled equivalent.

### Q3: Why does (200,150,100,100) not perfectly center the square in a 550×400 window? 
**A:** Because the coordinates are hardcoded rather than computed via the center − length/2 formula, so there's no guarantee of true centering.

### Q4: What happens if setDefaultCloseOperation isn't set? 
**A:** The window closes visually, but the JVM process may keep running in the background since nothing tells it to exit.
### Q5. How can the square be made interactive?

**A:** Capture mouse events.
Obtain the mouse position.
Update the square's coordinates.
Repaint the graphics.
Mouse Event
    ↓
Get Position
    ↓
Update Coordinates
    ↓
Repaint

