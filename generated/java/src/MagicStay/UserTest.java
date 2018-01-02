package MagicStay;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class UserTest extends MyTestCase {
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

  private void testGetTitle() {

    assertEqual(((Object) user1.getTitle()), MagicStay.quotes.MrQuote.getInstance());
    assertEqual(((Object) user2.getTitle()), MagicStay.quotes.MissQuote.getInstance());
  }

  private void testGetFirstName() {

    assertEqual(user1.getFirstName(), "luis");
    assertEqual(user2.getFirstName(), "maria");
  }

  private void testGetLastName() {

    assertEqual(user1.getLastName(), "cruz");
    assertEqual(user2.getLastName(), "alegre");
  }

  private void testGetEmail() {

    assertEqual(user1.getEmail(), "luis.aa@gmail.com");
    assertEqual(user2.getEmail(), "m.a@hormail.com");
  }

  private void testGetCountry() {

    assertEqual(user1.getCountry(), "portugal");
    assertEqual(user2.getCountry(), "portugal");
  }

  private void testGetCity() {

    assertEqual(user1.getCity(), "porto");
    assertEqual(user3.getCity(), "rome");
  }

  private void testGetPhoneNum() {

    assertEqual(user1.getPhoneNumber(), 912829288L);
    assertEqual(user2.getPhoneNumber(), 922832238L);
  }

  private void testGetPassword() {

    assertEqual(user1.getPassword(), "feup");
    assertEqual(user2.getPassword(), "alegre");
  }

  private void testSetTitle() {

    user1.setTitle(MagicStay.quotes.MrQuote.getInstance());
    user2.setTitle(MagicStay.quotes.MissQuote.getInstance());
  }

  private void testSetFirstName() {

    user1.setFirstName("joao");
    user2.setFirstName("joana");
  }

  private void testSetLastName() {

    user1.setLastName("batista");
    user2.setLastName("correia");
  }

  private void testSetEmail() {

    user1.setEmail("teste123@gmail.com");
    user2.setEmail("teste@gmail.com");
  }

  private void testSetCountry() {

    user1.setCountry("france");
    user2.setCountry("france");
  }

  private void testSetCity() {

    user1.setCity("paris");
    user2.setCity("cannes");
  }

  private void testSetPhoneNum() {

    user1.setPhoneNumber(912321456L);
    user2.setPhoneNumber(933890765L);
  }

  private void testSetPassword() {

    user1.setPassword("testPass");
    user2.setPassword("testPass");
  }

  public static void main() {

    UserTest teste = new UserTest();
    teste.testGetTitle();
    teste.testGetFirstName();
    teste.testGetLastName();
    teste.testGetEmail();
    teste.testGetCountry();
    teste.testGetCity();
    teste.testGetPhoneNum();
    teste.testGetPassword();
    teste.testSetTitle();
    teste.testSetFirstName();
    teste.testSetLastName();
    teste.testSetEmail();
    teste.testSetCountry();
    teste.testSetCity();
    teste.testSetPhoneNum();
    teste.testSetPassword();
  }

  public UserTest() {}

  public String toString() {

    return "UserTest{"
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
