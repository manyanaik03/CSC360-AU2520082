\# CSC360 — Class Notes















\*\*AU ID:\*\* AU2520082  







\*\*Date:\*\* 13/08/2026  







\---

\# Class Notes — Square Drawing — Centre \& Vertex Method



\---





\### 1: Vertex Formula (Centre → Corners)



\- Given: centre C = (x, y) and side length l — nothing else.

\- Drawing functions need actual corner coordinates, not a centre — so corners must be derived first.

\- Half-distance from centre to any side: half = l / 2

\- Four vertices = all sign combinations of ±half on x and y:

&#x20; - P1 (top-left) = (x-half, y-half)

&#x20; - P2 (top-right) = (x+half, y-half)

&#x20; - P3 (bottom-right) = (x+half, y+half)

&#x20; - P4 (bottom-left) = (x-half, y+half)



&#x20;       P1 ---- P2

&#x20;       |        |

&#x20;       |   C    |

&#x20;       |        |

&#x20;       P4 ---- P3



\### 2: Proof of Equal Sides



\- Horizontal gap: (x+half) - (x-half) = l

\- Vertical gap: same result, l

\- Both directions reduce to exactly l → confirms a true square, not just a visually close shape.

\- This is an algebraic guarantee, not a drawing coincidence.



\### 3: Joining Points Into a Shape



\- Draw lines only between adjacent vertices, in order:

&#x20; P1 → P2 → P3 → P4 → P1

\- Final segment (P4 → P1) is what closes the shape.

\- Skip the closing line → shape stays open (3 sides only).



\### 4: How Swing Actually Gets the Shape on Screen



\- Calling drawRect()/drawLine() doesn't paint instantly — it queues a request that Swing's Event Dispatch Thread (EDT) handles.

\- The EDT is a single background thread responsible for all rendering and UI-event handling, so custom drawing code always runs inside a callback (like paint()), never called directly by main().

\- Before any new shape is drawn, the existing canvas is cleared first — this is why overriding paint() (or paintComponent() on a JPanel) should always start by calling the superclass version, so leftover pixels from the previous frame don't linger.

\- Practical effect: the vertex math from Topics 1–3 only decides where to draw — the EDT and the paint callback decide when and how that drawing actually reaches the screen.



\### 5: Where This Sits in Java's GUI Options



\- JFrame belongs to Swing, one of a few GUI toolkits Java offers — worth knowing the landscape:

&#x20; - AWT — Java's original toolkit; draws using the OS's own native window controls, so look and behavior can shift between operating systems.

&#x20; - Swing — draws its own components entirely in Java instead of relying on the OS, which is why the same window looks identical on any platform and why raw pixel-level drawing (drawRect, drawLine) is possible at all.

&#x20; - JavaFX — a newer, more powerful toolkit built for richer graphics and styling, generally used for larger modern applications rather than small teaching examples like this one.

\- The square program uses Swing specifically because it needs direct, low-level access to a Graphics object — something AWT's native components don't expose as cleanly.



\### 6: Connecting Geometry Back to the Real Code



\- square.java draws via g.drawRect(200, 150, 100, 100) — a fixed corner + width/height, no centre, no l/2 math involved.

\- The centre/vertex method from this class is the "derive it yourself" version — only necessary if building the square manually from drawLine() calls instead of using the drawRect() shortcut.

\- Same visual result either way — a square outline — just two different starting inputs: corner-based vs. centre-based.

