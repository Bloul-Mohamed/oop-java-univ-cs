package labfourth;

import java.util.Map;
import java.util.HashMap;
import java.awt.Color;

public class ColorInfo {
  private static final Map<Color, String> COLOR_NAMES = new HashMap<>();

  static {
    COLOR_NAMES.put(Color.BLACK, "BLACK");
    COLOR_NAMES.put(Color.BLUE, "BLUE");
    COLOR_NAMES.put(Color.CYAN, "CYAN");
    COLOR_NAMES.put(Color.DARK_GRAY, "DARK_GRAY");
    COLOR_NAMES.put(Color.GRAY, "GRAY");
    COLOR_NAMES.put(Color.GREEN, "GREEN");
    COLOR_NAMES.put(Color.LIGHT_GRAY, "LIGHT_GRAY");
    COLOR_NAMES.put(Color.MAGENTA, "MAGENTA");
    COLOR_NAMES.put(Color.ORANGE, "ORANGE");
    COLOR_NAMES.put(Color.PINK, "PINK");
    COLOR_NAMES.put(Color.RED, "RED");
    COLOR_NAMES.put(Color.WHITE, "WHITE");
    COLOR_NAMES.put(Color.YELLOW, "YELLOW");
  }

  public static String getColorName(Color color) {
    if (color == null) {
      return "null";
    }

    for (Map.Entry<Color, String> entry : COLOR_NAMES.entrySet()) {
      if (color.equals(entry.getKey())) {
        return entry.getValue();
      }
    }

    return "Custom color (RGB: " + color.getRed() + ", " +
        color.getGreen() + ", " + color.getBlue() + ")";
  }
}
