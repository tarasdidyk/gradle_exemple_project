package utils.enums;

public enum AboutPolytechnics {
  PORTAL("Opportunity portal"),
  EVENTS_CALENDAR("Events Calendar");

  private String item;

  AboutPolytechnics(String item) {
    this.item = item;
  }

  @Override
  public String toString() {
    return this.item;
  }
}
