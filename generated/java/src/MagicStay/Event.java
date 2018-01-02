package MagicStay;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Event {
  private String name;
  private String country;
  private String city;
  private String category;
  private Date startDate;
  private Date endDate;

  public void cg_init_Event_1(
      final String n,
      final String c,
      final String ct,
      final String cat,
      final Date sd,
      final Date ed) {

    name = n;
    country = c;
    city = ct;
    category = cat;
    startDate = sd;
    endDate = ed;
    return;
  }

  public Event(
      final String n,
      final String c,
      final String ct,
      final String cat,
      final Date sd,
      final Date ed) {

    cg_init_Event_1(n, c, ct, cat, sd, ed);
  }

  public String getName() {

    return name;
  }

  public String getCountry() {

    return country;
  }

  public String getCity() {

    return city;
  }

  public String getCat() {

    return category;
  }

  public Date getStartDate() {

    return startDate;
  }

  public Date getEndDate() {

    return endDate;
  }

  public void setName(final String n) {

    name = n;
    return;
  }

  public void setCountry(final String c) {

    country = c;
    return;
  }

  public void setCity(final String c) {

    city = c;
    return;
  }

  public void setCategory(final String c) {

    category = c;
    return;
  }

  public void setStartDate(final Date d) {

    startDate = d;
    return;
  }

  public void setEndDate(final Date d) {

    endDate = d;
    return;
  }

  public Event() {}

  public String toString() {

    return "Event{"
        + "name := "
        + Utils.toString(name)
        + ", country := "
        + Utils.toString(country)
        + ", city := "
        + Utils.toString(city)
        + ", category := "
        + Utils.toString(category)
        + ", startDate := "
        + Utils.toString(startDate)
        + ", endDate := "
        + Utils.toString(endDate)
        + "}";
  }
}
