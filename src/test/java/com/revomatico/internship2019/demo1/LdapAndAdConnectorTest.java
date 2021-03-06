package com.revomatico.internship2019.demo1;

import static org.junit.jupiter.api.Assertions.*;

import com.revomatico.internship2019.demo1.readers.EventsConnector;
import com.revomatico.internship2019.demo1.readers.ad.AdConnector;
import com.revomatico.internship2019.demo1.readers.ad.LdapConnector;
import io.vavr.collection.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LdapAndAdConnectorTest {
  @Test
  @Disabled
  @Tag("integration")
  void adConnectorTest() {
    EventsConnector connector = new AdConnector();
    final List<List<String>> events = connector.readEvents();
    System.out.println(events.map(x->x.mkString("\n  - ")).mkString("\n"));
    assertEquals(176,events.size());
  }
  @Test
  @Disabled
  @Tag("integration")
  void ldapConnectorTest() {
    EventsConnector connector = new LdapConnector();
    final List<List<String>> events = connector.readEvents();
    System.out.println(events.map(x->x.mkString("\n  - ")).mkString("\n"));
    assertEquals(1,events.size());
  }
}
