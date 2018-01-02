package MagicStay;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Property {
  private String city;
  private Object type;
  private Number numRooms;
  private Number deposit;
  private Number numStars;
  private User host;
  private Event event;
  private VDMSet availability = SetUtil.set();

  public void cg_init_Property_1(
      final String c,
      final Object t,
      final Number nr,
      final Number d,
      final Number ns,
      final User h,
      final Event e) {

    city = c;
    type = t;
    numRooms = nr;
    deposit = d;
    numStars = ns;
    host = h;
    event = e;
    availability = SetUtil.set();
    return;
  }

  public Property(
      final String c,
      final Object t,
      final Number nr,
      final Number d,
      final Number ns,
      final User h,
      final Event e) {

    cg_init_Property_1(c, t, nr, d, ns, h, e);
  }

  public String getCity() {

    return city;
  }

  public Object getType() {

    return type;
  }

  public Number getNumRooms() {

    return numRooms;
  }

  public Number getDeposit() {

    return deposit;
  }

  public Number getNumStars() {

    return numStars;
  }

  public User getHost() {

    return host;
  }

  public Event getEvent() {

    return event;
  }

  public VDMSet getAvailabilities() {

    return Utils.copy(availability);
  }

  public void setCity(final String c) {

    city = c;
    return;
  }

  public void setType(final Object t) {

    type = t;
    return;
  }

  public void setNumRooms(final Number n) {

    numRooms = n;
    return;
  }

  public void setDeposit(final Number n) {

    deposit = n;
    return;
  }

  public void setNumStars(final Number n) {

    numStars = n;
    return;
  }

  public void setHost(final User u) {

    host = u;
    return;
  }

  public void setEvent(final Event e) {

    event = e;
    return;
  }

  public void addAvalabilty(final Date sd, final Date ed) {

    availability = SetUtil.union(Utils.copy(availability), SetUtil.set(sd, ed));
  }

  public void removeAvalabilty(final Date sd, final Date ed) {

    availability = SetUtil.diff(Utils.copy(availability), SetUtil.set(sd, ed));
  }

  public Property() {}

  public String toString() {

    return "Property{"
        + "city := "
        + Utils.toString(city)
        + ", type := "
        + Utils.toString(type)
        + ", numRooms := "
        + Utils.toString(numRooms)
        + ", deposit := "
        + Utils.toString(deposit)
        + ", numStars := "
        + Utils.toString(numStars)
        + ", host := "
        + Utils.toString(host)
        + ", event := "
        + Utils.toString(event)
        + ", availability := "
        + Utils.toString(availability)
        + "}";
  }
}
