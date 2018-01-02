package MagicStay.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class MrQuote {
  private static int hc = 0;
  private static MrQuote instance = null;

  public MrQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static MrQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new MrQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof MrQuote;
  }

  public String toString() {

    return "<Mr>";
  }
}
