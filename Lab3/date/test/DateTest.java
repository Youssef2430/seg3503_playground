import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_tc01() {
    Date today = new Date(1700, 6, 20);
    Date expectedTomorrow = new Date(1700, 6, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc02() {
    Date today = new Date(2005, 4, 15);
    Date expectedTomorrow = new Date(2005, 4, 16);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc03() {
    Date today = new Date(1901, 7, 20);
    Date expectedTomorrow = new Date(1901, 7, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc04() {
    Date today = new Date(3456, 3, 27);
    Date expectedTomorrow = new Date(3456, 3, 28);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc05() {
    Date today = new Date(1500, 2, 17);
    Date expectedTomorrow = new Date(1500, 2, 18);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc06() {
    Date today = new Date(1700, 6, 29);
    Date expectedTomorrow = new Date(1700, 6, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc07() {
    Date today = new Date(1800, 11, 29);
    Date expectedTomorrow = new Date(1800, 11, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc08() {
    Date today = new Date(3453, 1, 29);
    Date expectedTomorrow = new Date(3453, 1, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc09() {
    Date today = new Date(444, 2, 29);
    Date expectedTomorrow = new Date(444, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc10() {
    Date today = new Date(2005, 4, 30);
    Date expectedTomorrow = new Date(2005, 5, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc11() {
    Date today = new Date(3453, 1, 30);
    Date expectedTomorrow = new Date(3453, 1, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc12() {
    Date today = new Date(3456, 3, 30);
    Date expectedTomorrow = new Date(3456, 3, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc13() {
    Date today = new Date(1901, 7, 31);
    Date expectedTomorrow = new Date(1901, 8, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc14() {
    Date today = new Date(3453, 1, 31);
    Date expectedTomorrow = new Date(3453, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc15() {
    Date today = new Date(3456, 12, 31);
    Date expectedTomorrow = new Date(3457, 1, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_invalid_tc16() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 31)
    );
  }

  @Test
  void nextDate_invalid_tc17() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 29)
    );
  }

  @Test
  void nextDate_invalid_tc18() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(-1, 10, 20)
    );
  }

  @Test
  void nextDate_invalid_tc19() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1458, 15, 12)
    );
  }

  @Test
  void nextDate_invalid_tc20() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 6, -50)
    );
  }

  @Test
  void setDate_invalid1() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 6, 100)
    );
  }

  @Test
  void setDate_invalid2() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 4, 31)
    );
  }

  @Test
  void setDate_invalid3() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2024, 2, 30)
    );
  }

  @Test
  void setDate_invalid4() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2024, 15, 30)
    );
  }

  @Test
  void toString_invalid() {
    Date today = new Date(2024, 1, 30);
    assertEquals("2024/January/30", today.toString());
  }

  @Test
  void month_invalid() {
    Date today = new Date(2024, 1, 30);
    assertEquals(today.getMonth(), 1);
  }

  @Test
  void testLeap() {
    Date today = new Date(2000, 1, 30);
    assertTrue(today.isLeapYear());
  }

  @Test
  void testequals() {
    Date today = new Date(2000, 1, 30);
    assertTrue(!(today.equals("Yes")));
  }

  @Test
  void testequals2() {
    Date today = new Date(2000, 1, 30);
    assertTrue((today.equals(new Date(2000, 1, 30))));
  }

  @Test
  void testequals3() {
    Date today = new Date(2000, 1, 30);
    assertTrue(!(today.equals(new Date(2000, 1, 29))));
  }
  @Test
  void testequals6() {
    Date today = new Date(2000, 1, 30);
    assertTrue(!(today.equals(new Date(2000, 2, 29))));
  }

  @Test
  void testequals7() {
    Date today = new Date(2000, 1, 30);
    assertThrows(
      IllegalArgumentException.class,
      () -> assertTrue(!(today.equals(new Date(2001, 2, 29))))
    );
    
  }

  @Test
  void testequals4() {
    Date today = new Date(2000, 1, 30);
    assertThrows(
      IllegalArgumentException.class,
      () -> assertTrue(!(today.equals(new Date(2000, 2, 30))))
    );
  }

  @Test
  void testequals8() {
    Date today = new Date(2000, 1, 30);
    assertTrue(!(today.equals(new Date(2001, 1, 29))));
  }

  @Test
  void testequals9() {
    Date today = new Date(2000, 1, 30);
    assertThrows(
      IllegalArgumentException.class,
      () -> assertTrue(!(today.equals(new Date(2001, 2, 30))))
    );
  }

  @Test
  void testequals5() {
    Date today = new Date(2000, 1, 30);
    assertTrue(!(today.equals(new Date(2001, 1, 30))));
  }

  @Test
  void month_test() {
    Date today = new Date(2024, 4, 30);
    assertEquals(today.nextDate(), new Date(2024, 5, 1));
  }

  @Test
  void month_test4() {
    Date today = new Date(2024, 1, 30);
    assertEquals(today.nextDate(), new Date(2024, 1, 31));
  }

  @Test
  void month_test6() {
    Date today = new Date(2024, 1, 29);
    assertEquals(today.nextDate(), new Date(2024, 1, 30));
  }

  @Test
  void month_test5() {
    Date today = new Date(2024, 4, 29);
    assertEquals(today.nextDate(), new Date(2024, 4, 30));
  }

  @Test
  void month_test2() {
    Date today = new Date(2024, 1, 31);
    assertEquals(today.nextDate(), new Date(2024, 2, 1));
  }

  @Test
  void month_test3() {
    Date today = new Date(2024, 1, 15);
    assertEquals(today.nextDate(), new Date(2024, 1, 16));
  }

  @Test
  void month_test7() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2024, -20, 30)
    );
  }

  @Test
  void month_test8() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2024, 20, 30)
    );
  }

  @Test
  void month_test9() {
    Date today = new Date(2024, 9, 15);
    assertEquals(today.nextDate(), new Date(2024, 9, 16));
  }

  @Test
  void month_test10() {
    Date today = new Date(2024, 11, 15);
    assertEquals(today.nextDate(), new Date(2024, 11, 16));
  }


  @Test
  void end_test() {
    Date today = new Date(2024, 3, 31);
    assertEquals(today.nextDate(), new Date(2024, 4, 1));
  }

  

  @Test
  void end_test2() {
    Date today = new Date(2024, 9, 29);
    assertEquals(today.nextDate(), new Date(2024, 9, 30));
  }

  @Test
  void end_test3() {
    Date today = new Date(2024, 8, 30);
    assertEquals(today.nextDate(), new Date(2024, 8, 31));
  }

  @Test
  void end_test4() {
    Date today = new Date(2024, 8, 29);
    assertEquals(today.nextDate(), new Date(2024, 8, 30));
  }

  @Test
  void end_test5() {
    Date today = new Date(2024, 9, 30);
    assertEquals(today.nextDate(), new Date(2024, 10, 1));
  }

  @Test
  void end_test6() {
    Date today = new Date(2024, 2, 29);
    assertEquals(today.nextDate(), new Date(2024, 3, 1));
  }

  @Test
  void end_test7() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(2023, 2, 29)
    );
  }

  @Test
  void end_test8() {
    Date today = new Date(2024, 2, 28);
    assertEquals(today.nextDate(), new Date(2024, 2, 29));
  }

  @Test
  void end_test9() {
    Date today = new Date(2023, 2, 28);
    assertEquals(today.nextDate(), new Date(2023, 3, 1));
    
  }

  @Test
  void end_test10() {
    Date today = new Date(2024, 3, 29);
    assertEquals(today.nextDate(), new Date(2024, 3, 30));
  }

  @Test
  void end_test11() {
    Date today = new Date(2023, 3, 29);
    assertEquals(today.nextDate(), new Date(2023, 3, 30));
  }

  @Test
  void end_test12() {
    Date today = new Date(2024, 3, 28);
    assertEquals(today.nextDate(), new Date(2024, 3, 29));
  }

  @Test
  void end_test13() {
    Date today = new Date(2023, 3, 28);
    assertEquals(today.nextDate(), new Date(2023, 3, 29));
  }




  

  


}