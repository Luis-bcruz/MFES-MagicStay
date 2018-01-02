package MagicStay.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class privateRoomQuote {
  private static int hc = 0;
  private static privateRoomQuote instance = null;

  public privateRoomQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static privateRoomQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new privateRoomQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof privateRoomQuote;
  }

  public String toString() {

    return "<privateRoom>";
  }
}
