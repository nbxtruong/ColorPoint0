import java.awt.Color;

public class ColorPoint extends Point {
	private Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
