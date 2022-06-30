public class StudentDeserialiser {
  public Student parse(String lineFeed) {
    Student record = new Student();
    record.firstName = lineFeed.substring(0,20).trim();
    record.lastName = lineFeed.substring(21,40).trim();
    record.level = lineFeed.substring(41,50).trim();
    record.studentClass = lineFeed.substring(51,60).trim();
    return record;
  }
}