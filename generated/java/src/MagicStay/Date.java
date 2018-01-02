package MagicStay;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Date {
  private Number year;
  private Number month;
  private Number day;

  public void cg_init_Date_1(final Number y, final Number m, final Number d) {

    year = y;
    month = m;
    day = d;
    return;
  }

  public Date(final Number y, final Number m, final Number d) {

    cg_init_Date_1(y, m, d);
  }

  public Number getYear() {

    return year;
  }

  public Number getMonth() {

    return month;
  }

  public Number getDay() {

    return day;
  }

  public Boolean compareDate(final Date d) {

    return d.getYear().longValue() * d.getMonth().longValue() * d.getDay().longValue()
        < year.longValue() * month.longValue() * day.longValue();
  }

  public Date() {}

  public String toString() {

    return "Date{"
        + "year := "
        + Utils.toString(year)
        + ", month := "
        + Utils.toString(month)
        + ", day := "
        + Utils.toString(day)
        + "}";
  }
}
