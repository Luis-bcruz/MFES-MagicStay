package MagicStay;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class MagicStayTest extends MyTestCase {
  private MagicStay m = new MagicStay();
  private User user1 =
      new User(
          MagicStay.quotes.MrQuote.getInstance(),
          "luis",
          "cruz",
          "luis.aa@gmail.com",
          "portugal",
          "porto",
          912829288L,
          "feup");
  private User user2 =
      new User(
          MagicStay.quotes.MissQuote.getInstance(),
          "maria",
          "alegre",
          "m.a@hormail.com",
          "portugal",
          "porto",
          922832238L,
          "alegre");
  private User user3 =
      new User(
          MagicStay.quotes.MrQuote.getInstance(),
          "vito",
          "corleone",
          "v.godphaderPM@gmail.com",
          "italia",
          "rome",
          987654321L,
          "admin");
  private User user4 =
      new User(
          MagicStay.quotes.MrQuote.getInstance(),
          "Tim",
          "Berners-Lee",
          "timWWW@gmail.com",
          "eua",
          "cambridge",
          123456789L,
          "1234");
  private Date date1 = new Date(2017L, 2L, 2L);
  private Date date2 = new Date(2017L, 2L, 3L);
  private Date date3 = new Date(2017L, 3L, 22L);
  private Date date4 = new Date(2017L, 3L, 24L);
  private Date date5 = new Date(2017L, 12L, 30L);
  private Event event1 = new Event("AI in 2020", "portugal", "porto", "IT", date1, date2);
  private Event event2 = new Event("IT and security", "italy", "rome", "IT", date3, date4);
  private Event event3 = new Event("W3C consvention", "eua", "cambridge", "IT", date1, date2);
  private Event event4 = new Event("Talk a Bit", "portugal", "porto", "IT", date1, date2);
  private Property prop1 =
      new Property(
          "porto", MagicStay.quotes.StudioQuote.getInstance(), 1L, 150L, 3L, user1, event1);
  private Property prop2 =
      new Property(
          "porto", MagicStay.quotes.ApartmentQuote.getInstance(), 2L, 300L, 4L, user2, event1);
  private Property prop3 =
      new Property("rome", MagicStay.quotes.StudioQuote.getInstance(), 1L, 450L, 4L, user3, event2);
  private Property prop5 =
      new Property(
          "rome", MagicStay.quotes.privateRoomQuote.getInstance(), 1L, 100L, 2L, user3, event2);
  private Property prop4 =
      new Property(
          "cambridge", MagicStay.quotes.ApartmentQuote.getInstance(), 3L, 730L, 5L, user4, event3);

  private void testRegisterUser() {

    VDMSet u = SetUtil.set();
    u = SetUtil.union(Utils.copy(u), SetUtil.set(user1));
    u = SetUtil.union(Utils.copy(u), SetUtil.set(user2));
    u = SetUtil.union(Utils.copy(u), SetUtil.set(user3));
    u = SetUtil.union(Utils.copy(u), SetUtil.set(user4));
    m.registerUser(user1);
    m.registerUser(user2);
    m.registerUser(user3);
    m.registerUser(user4);
    assertEqual(m.getUsers(), Utils.copy(u));
    m.removeUser(user1);
    m.removeUser(user2);
    m.removeUser(user3);
    m.removeUser(user4);
  }

  private void testRemoveUser() {

    VDMSet ur = SetUtil.set(user3, user4);
    m.registerUser(user1);
    m.registerUser(user2);
    m.registerUser(user3);
    m.registerUser(user4);
    m.removeUser(user1);
    m.removeUser(user2);
    assertEqual(m.getUsers(), Utils.copy(ur));
    m.removeUser(user3);
    m.removeUser(user4);
  }

  private void testGetUsers() {

    VDMSet u = SetUtil.set(user1, user2, user3, user4);
    m.registerUser(user1);
    m.registerUser(user2);
    m.registerUser(user3);
    m.registerUser(user4);
    assertEqual(m.getUsers(), Utils.copy(u));
  }

  private void testAddProperty() {

    VDMSet p = SetUtil.set(prop1, prop2, prop3, prop4, prop5);
    m.addProperty(prop1);
    m.addProperty(prop2);
    m.addProperty(prop3);
    m.addProperty(prop4);
    m.addProperty(prop5);
    assertEqual(m.getProperties(), Utils.copy(p));
  }

  private void testRemoveProperty() {

    VDMSet p = SetUtil.set();
    p = SetUtil.union(Utils.copy(p), SetUtil.set(prop5));
    m.removeProperty(prop1);
    m.removeProperty(prop2);
    m.removeProperty(prop3);
    m.removeProperty(prop4);
    assertEqual(m.getProperties(), Utils.copy(p));
    m.addProperty(prop1);
    m.addProperty(prop2);
    m.addProperty(prop3);
    m.addProperty(prop4);
  }

  private void testGetProperties() {

    VDMSet p = SetUtil.set();
    p = SetUtil.union(Utils.copy(p), SetUtil.set(prop1));
    p = SetUtil.union(Utils.copy(p), SetUtil.set(prop2));
    p = SetUtil.union(Utils.copy(p), SetUtil.set(prop3));
    p = SetUtil.union(Utils.copy(p), SetUtil.set(prop4));
    p = SetUtil.union(Utils.copy(p), SetUtil.set(prop5));
    assertEqual(m.getProperties(), Utils.copy(p));
  }

  private void testAddEvent() {

    VDMSet e = SetUtil.set();
    e = SetUtil.union(Utils.copy(e), SetUtil.set(event1));
    e = SetUtil.union(Utils.copy(e), SetUtil.set(event2));
    e = SetUtil.union(Utils.copy(e), SetUtil.set(event3));
    e = SetUtil.union(Utils.copy(e), SetUtil.set(event4));
    m.addEvent(event1);
    m.addEvent(event2);
    m.addEvent(event3);
    m.addEvent(event4);
    assertEqual(m.getEvents(), Utils.copy(e));
  }

  private void testRemoveEvent() {

    VDMSet e = SetUtil.set();
    e = SetUtil.union(Utils.copy(e), SetUtil.set(event2));
    e = SetUtil.union(Utils.copy(e), SetUtil.set(event3));
    m.removeEvent(event1);
    m.removeEvent(event4);
    assertEqual(m.getEvents(), Utils.copy(e));
  }

  private void testGetEvents() {

    VDMSet e = SetUtil.set();
    e = SetUtil.union(Utils.copy(e), SetUtil.set(event2));
    e = SetUtil.union(Utils.copy(e), SetUtil.set(event3));
    assertEqual(m.getEvents(), Utils.copy(e));
    m.addEvent(event1);
    m.addEvent(event4);
  }

  private void testSeachPropertyByCity() {

    assertEqual(m.searchPropertyByCity("porto"), SetUtil.set(prop1, prop2));
    assertEqual(m.searchPropertyByCity("rome"), SetUtil.set(prop3, prop5));
    assertEqual(m.searchPropertyByCity("cambridge"), SetUtil.set(prop4));
  }

  private void testSeachPropertyByEvent() {

    assertEqual(m.searchPropertyByEvent("IT and security"), SetUtil.set(prop3, prop5));
    assertEqual(m.searchPropertyByEvent("Talk a Bit"), SetUtil.set(prop1, prop2));
  }

  private void testSeachEventByCat() {

    VDMSet e = SetUtil.set();
    e = SetUtil.union(Utils.copy(e), SetUtil.set(event1));
    e = SetUtil.union(Utils.copy(e), SetUtil.set(event2));
    e = SetUtil.union(Utils.copy(e), SetUtil.set(event3));
    e = SetUtil.union(Utils.copy(e), SetUtil.set(event4));
    assertEqual(m.seachEventByCat("IT"), Utils.copy(e));
  }

  private void testBestProperty() {

    assertEqual(m.getBestProperty("porto"), prop2);
    assertEqual(m.getBestProperty("cambridge"), prop4);
  }

  private void testRegisterPreCondition() {

    m.registerUser(user1);
    m.registerUser(user1);
  }

  private void testRemoveUserPreCondition() {

    m.removeUser(user1);
    m.removeUser(user1);
  }

  private void testSeachPropByCityPreCondition() {

    assertEqual(m.searchPropertyByCity(""), SetUtil.set());
  }

  private void testBestPropPreCondition() {

    m.addProperty(prop1);
    m.addProperty(prop2);
    m.addProperty(prop3);
    m.addProperty(prop4);
    m.addProperty(prop5);
    m.removeProperty(prop1);
    m.removeProperty(prop2);
    m.removeProperty(prop3);
    m.removeProperty(prop4);
    m.removeProperty(prop5);
    assertEqual(m.getBestProperty("porto"), prop2);
    assertEqual(m.getBestProperty("cambridge"), prop4);
  }

  public static void main() {

    MagicStayTest teste = new MagicStayTest();
    teste.testRegisterUser();
    teste.testRemoveUser();
    teste.testGetUsers();
    teste.testAddProperty();
    teste.testRemoveProperty();
    teste.testGetProperties();
    teste.testAddEvent();
    teste.testRemoveEvent();
    teste.testGetEvents();
    teste.testSeachPropertyByCity();
    teste.testSeachPropertyByEvent();
    teste.testSeachEventByCat();
    teste.testBestProperty();
  }

  public MagicStayTest() {}

  public String toString() {

    return "MagicStayTest{"
        + "m := "
        + Utils.toString(m)
        + ", user1 := "
        + Utils.toString(user1)
        + ", user2 := "
        + Utils.toString(user2)
        + ", user3 := "
        + Utils.toString(user3)
        + ", user4 := "
        + Utils.toString(user4)
        + ", date1 := "
        + Utils.toString(date1)
        + ", date2 := "
        + Utils.toString(date2)
        + ", date3 := "
        + Utils.toString(date3)
        + ", date4 := "
        + Utils.toString(date4)
        + ", date5 := "
        + Utils.toString(date5)
        + ", event1 := "
        + Utils.toString(event1)
        + ", event2 := "
        + Utils.toString(event2)
        + ", event3 := "
        + Utils.toString(event3)
        + ", event4 := "
        + Utils.toString(event4)
        + ", prop1 := "
        + Utils.toString(prop1)
        + ", prop2 := "
        + Utils.toString(prop2)
        + ", prop3 := "
        + Utils.toString(prop3)
        + ", prop5 := "
        + Utils.toString(prop5)
        + ", prop4 := "
        + Utils.toString(prop4)
        + "}";
  }
}
