package main.java.memoranda;

import main.java.memoranda.date.CalendarDate;
import nu.xom.Attribute;
import nu.xom.Element;

//TASK 2-2 SMELL BETWEEN CLASSES -- incomplete library
public class StartDate {
    public static CalendarDate getStartDate(Element _element) {
        Attribute x = _element.getAttribute("startDate");
        if(x != null)
            return new CalendarDate(x.getValue());
        return null;
    }
}
