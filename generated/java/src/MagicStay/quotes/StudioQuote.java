package MagicStay.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class StudioQuote {
  private static int hc = 0;
  private static StudioQuote instance = null;

  public StudioQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static StudioQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new StudioQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof StudioQuote;
  }

  public String toString() {

    return "<Studio>";
  }
}
