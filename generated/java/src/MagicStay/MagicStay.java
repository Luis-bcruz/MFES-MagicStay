package MagicStay;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class MagicStay {
  private VDMSet users = SetUtil.set();
  private VDMSet properties = SetUtil.set();
  private VDMSet events = SetUtil.set();

  public void cg_init_MagicStay_1() {

    return;
  }

  public MagicStay() {

    cg_init_MagicStay_1();
  }

  public void registerUser(final User user) {

    users = SetUtil.union(Utils.copy(users), SetUtil.set(user));
  }

  public void removeUser(final User user) {

    users = SetUtil.diff(Utils.copy(users), SetUtil.set(user));
  }

  public VDMSet getUsers() {

    return Utils.copy(users);
  }

  public void addProperty(final Property property) {

    properties = SetUtil.union(Utils.copy(properties), SetUtil.set(property));
  }

  public void removeProperty(final Property property) {

    properties = SetUtil.diff(Utils.copy(properties), SetUtil.set(property));
  }

  public VDMSet getProperties() {

    return Utils.copy(properties);
  }

  public void addEvent(final Event event) {

    events = SetUtil.union(Utils.copy(events), SetUtil.set(event));
  }

  public void removeEvent(final Event event) {

    events = SetUtil.diff(Utils.copy(events), SetUtil.set(event));
  }

  public VDMSet getEvents() {

    return Utils.copy(events);
  }

  public VDMSet searchPropertyByCity(final String c) {

    VDMSet res = SetUtil.set();
    for (Iterator iterator_1 = properties.iterator(); iterator_1.hasNext(); ) {
      Property p = (Property) iterator_1.next();
      if (Utils.equals(p.getCity(), c)) {
        res = SetUtil.union(SetUtil.set(p), Utils.copy(res));
      }
    }
    return Utils.copy(res);
  }

  public VDMSet searchPropertyByEvent(final String n) {

    VDMSet res = SetUtil.set();
    for (Iterator iterator_2 = events.iterator(); iterator_2.hasNext(); ) {
      Event e = (Event) iterator_2.next();
      if (Utils.equals(e.getName(), n)) {
        String ct = e.getCity();
        for (Iterator iterator_3 = properties.iterator(); iterator_3.hasNext(); ) {
          Property p = (Property) iterator_3.next();
          if (Utils.equals(p.getCity(), ct)) {
            res = SetUtil.union(SetUtil.set(p), Utils.copy(res));
          }
        }
      }
    }
    return Utils.copy(res);
  }

  public VDMSet seachEventByCat(final String c) {

    VDMSet res = SetUtil.set();
    for (Iterator iterator_4 = events.iterator(); iterator_4.hasNext(); ) {
      Event e = (Event) iterator_4.next();
      if (Utils.equals(e.getCat(), c)) {
        res = SetUtil.union(SetUtil.set(e), Utils.copy(res));
      }
    }
    return Utils.copy(res);
  }

  public Property getBestProperty(final String c) {

    Property best = null;
    for (Iterator iterator_5 = properties.iterator(); iterator_5.hasNext(); ) {
      Property p = (Property) iterator_5.next();
      Boolean orResult_1 = false;

      if (Utils.equals(best, null)) {
        orResult_1 = true;
      } else {
        Boolean andResult_5 = false;

        if (p.getNumStars().longValue() > best.getNumStars().longValue()) {
          if (Utils.equals(p.getCity(), c)) {
            andResult_5 = true;
          }
        }

        orResult_1 = andResult_5;
      }

      if (orResult_1) {
        best = p;
      }
    }
    return best;
  }

  public String toString() {

    return "MagicStay{"
        + "users := "
        + Utils.toString(users)
        + ", properties := "
        + Utils.toString(properties)
        + ", events := "
        + Utils.toString(events)
        + "}";
  }
}
