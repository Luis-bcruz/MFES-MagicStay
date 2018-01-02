package MagicStay;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class EventTest extends MyTestCase {
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

  private void testGetName() {

    assertEqual(event1.getName(), "AI in 2020");
    assertEqual(event2.getName(), "IT and security");
  }

  private void testGetCountry() {

    assertEqual(event1.getCountry(), "portugal");
    assertEqual(event2.getCountry(), "italy");
  }

  private void testGetCity() {

    assertEqual(event1.getCity(), "porto");
    assertEqual(event2.getCity(), "rome");
  }

  private void testGetCategory() {

    assertEqual(event1.getCat(), "IT");
    assertEqual(event2.getCat(), "IT");
  }

  private void testGetStartDate() {

    assertEqual(event1.getStartDate(), date1);
    assertEqual(event2.getStartDate(), date3);
  }

  private void testGetEndDate() {

    assertEqual(event1.getEndDate(), date2);
    assertEqual(event2.getEndDate(), date4);
  }

  private void testSetName() {

    event1.setName("Test Event name");
    event2.setName("Test2 Event name");
  }

  private void testSetCountry() {

    event1.setCountry("france");
    event2.setCountry("eua");
  }

  private void testSetCity() {

    event1.setCity("paris");
    event2.setCity("lisbon");
  }

  private void testSetCategory() {

    event1.setCategory("transport");
    event2.setCategory("media");
  }

  private void testSetStartDate() {

    event1.setStartDate(date3);
    event2.setStartDate(date1);
  }

  private void testSetEndDate() {

    event1.setEndDate(date4);
    event2.setEndDate(date2);
  }

  public static void main() {

    EventTest teste = new EventTest();
    teste.testGetName();
    teste.testGetCountry();
    teste.testGetCity();
    teste.testGetCategory();
    teste.testGetStartDate();
    teste.testGetEndDate();
    teste.testGetStartDate();
    teste.testSetName();
    teste.testSetCountry();
    teste.testSetCity();
    teste.testSetCategory();
    teste.testSetStartDate();
    teste.testSetEndDate();
    teste.testSetStartDate();
  }

  public EventTest() {}

  public String toString() {

    return "EventTest{"
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
