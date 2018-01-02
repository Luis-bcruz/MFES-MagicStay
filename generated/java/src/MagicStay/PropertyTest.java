package MagicStay;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class PropertyTest extends MyTestCase {
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
          "cambeidge", MagicStay.quotes.ApartmentQuote.getInstance(), 3L, 730L, 5L, user4, event3);

  private void testGetCity() {

    assertEqual(prop1.getCity(), "porto");
    assertEqual(prop3.getCity(), "rome");
  }

  private void testGetType() {

    assertEqual(((Object) prop1.getType()), MagicStay.quotes.StudioQuote.getInstance());
    assertEqual(((Object) prop2.getType()), MagicStay.quotes.ApartmentQuote.getInstance());
  }

  private void testGetNumRooms() {

    assertEqual(prop1.getNumRooms(), 1L);
    assertEqual(prop2.getNumRooms(), 2L);
  }

  private void testGetDeposit() {

    assertEqual(prop1.getDeposit(), 150L);
    assertEqual(prop2.getDeposit(), 300L);
  }

  private void testGetNumStars() {

    assertEqual(prop1.getNumStars(), 3L);
    assertEqual(prop2.getNumStars(), 4L);
  }

  private void testGetHost() {

    assertEqual(prop1.getHost(), user1);
    assertEqual(prop2.getHost(), user2);
  }

  private void testGetEvent() {

    assertEqual(prop1.getEvent(), event1);
    assertEqual(prop2.getEvent(), event1);
  }

  private void testSetCity() {

    prop1.setCity("paris");
    prop2.setCity("lisbon");
  }

  private void testSetType() {

    prop1.setType(MagicStay.quotes.privateRoomQuote.getInstance());
    prop2.setType(MagicStay.quotes.privateRoomQuote.getInstance());
  }

  private void testSetNumRooms() {

    prop1.setNumRooms(2L);
    prop2.setNumRooms(3L);
  }

  private void testSetDeposit() {

    prop1.setDeposit(400L);
    prop2.setDeposit(500L);
  }

  private void testSetNumStars() {

    prop1.setNumStars(1L);
    prop2.setNumStars(1L);
  }

  private void testSetHost() {

    prop1.setHost(user2);
    prop2.setHost(user1);
  }

  private void testSetEvent() {

    prop1.setEvent(event4);
    prop2.setEvent(event4);
  }

  private void testAddAvalilability() {

    prop1.addAvalabilty(date1, date2);
    prop2.addAvalabilty(date1, date2);
    assertEqual(prop1.getAvailabilities(), SetUtil.set(date1, date2));
    assertEqual(prop2.getAvailabilities(), SetUtil.set(date1, date2));
  }

  private void testRemoveAvalilability() {

    prop1.removeAvalabilty(date1, date2);
    prop2.removeAvalabilty(date1, date2);
    assertEqual(prop1.getAvailabilities(), SetUtil.set());
    assertEqual(prop2.getAvailabilities(), SetUtil.set());
  }

  public static void main() {

    PropertyTest teste = new PropertyTest();
    teste.testGetCity();
    teste.testGetType();
    teste.testGetNumRooms();
    teste.testGetDeposit();
    teste.testGetNumStars();
    teste.testGetHost();
    teste.testGetEvent();
    teste.testSetCity();
    teste.testSetType();
    teste.testSetNumRooms();
    teste.testSetDeposit();
    teste.testSetNumStars();
    teste.testSetHost();
    teste.testSetEvent();
    teste.testAddAvalilability();
    teste.testRemoveAvalilability();
  }

  public PropertyTest() {}

  public String toString() {

    return "PropertyTest{"
        + "user1 := "
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
