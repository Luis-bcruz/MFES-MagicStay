package MagicStay;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class User {
  private Object userTitle;
  private String firstName;
  private String lastName;
  private String email;
  private String country;
  private String city;
  private Number phoneNumber;
  private String password;

  public void cg_init_User_1(
      final Object t,
      final String fn,
      final String ln,
      final String e,
      final String ct,
      final String c,
      final Number ph,
      final String pass) {

    userTitle = t;
    firstName = fn;
    lastName = ln;
    email = e;
    country = ct;
    city = c;
    phoneNumber = ph;
    password = pass;
    return;
  }

  public User(
      final Object t,
      final String fn,
      final String ln,
      final String e,
      final String ct,
      final String c,
      final Number ph,
      final String pass) {

    cg_init_User_1(t, fn, ln, e, ct, c, ph, pass);
  }

  public Object getTitle() {

    return userTitle;
  }

  public String getFirstName() {

    return firstName;
  }

  public String getLastName() {

    return lastName;
  }

  public String getEmail() {

    return email;
  }

  public String getCountry() {

    return country;
  }

  public String getCity() {

    return city;
  }

  public Number getPhoneNumber() {

    return phoneNumber;
  }

  public String getPassword() {

    return password;
  }

  public void setTitle(final Object t) {

    userTitle = t;
    return;
  }

  public void setFirstName(final String fn) {

    firstName = fn;
    return;
  }

  public void setLastName(final String ln) {

    lastName = ln;
    return;
  }

  public void setEmail(final String e) {

    email = e;
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

  public void setPhoneNumber(final Number n) {

    phoneNumber = n;
    return;
  }

  public void setPassword(final String p) {

    password = p;
    return;
  }

  public User() {}

  public String toString() {

    return "User{"
        + "userTitle := "
        + Utils.toString(userTitle)
        + ", firstName := "
        + Utils.toString(firstName)
        + ", lastName := "
        + Utils.toString(lastName)
        + ", email := "
        + Utils.toString(email)
        + ", country := "
        + Utils.toString(country)
        + ", city := "
        + Utils.toString(city)
        + ", phoneNumber := "
        + Utils.toString(phoneNumber)
        + ", password := "
        + Utils.toString(password)
        + "}";
  }
}
