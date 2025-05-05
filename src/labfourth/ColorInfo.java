package labfourth;

import java.util.Map;
import java.util.HashMap;
import java.awt.Color;

public class ColorInfo {
  // Map to store standard Color objects and their names
  private static final Map<Color, String> COLOR_NAMES = new HashMap<>();

  // Initialize the map with standard colors
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

  /**
   * Converts a Color object to its string name representation
   * 
   * @param color The Color object to convert
   * @return The name of the color if it's a standard color, or its RGB
   *         representation otherwise
   */
  public static String getColorName(Color color) {
    if (color == null) {
      return "null";
    }

    // Check if it's a standard color
    for (Map.Entry<Color, String> entry : COLOR_NAMES.entrySet()) {
      if (color.equals(entry.getKey())) {
        return entry.getValue();
      }
    }

    // If not a standard color, return the RGB values
    return "Custom color (RGB: " + color.getRed() + ", " +
        color.getGreen() + ", " + color.getBlue() + ")";
  }
}
