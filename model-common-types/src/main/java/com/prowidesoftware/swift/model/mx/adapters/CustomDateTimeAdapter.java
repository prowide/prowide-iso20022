package com.prowidesoftware.swift.model.mx.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Default adapter, same as jaxb default behaviour.
 *
 * This class is provided as a hook to inject your own instance via the {@link MxWriteConfiguration} if you need the
 * datetime elements formatted with a special format. For further customization you can also extend this class and
 * inject an instance of your own adapter implementation.
 *
 * @since 9.2.6
 */
public class CustomDateTimeAdapter extends XmlAdapter<String, XMLGregorianCalendar> {

    private final SimpleDateFormat dateFormat;

    public CustomDateTimeAdapter() {
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
    }

    public CustomDateTimeAdapter(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Override
    public XMLGregorianCalendar unmarshal(String value) throws Exception {
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(value);
    }

    @Override
    public String marshal(XMLGregorianCalendar cal) throws Exception {
        synchronized (dateFormat) {
            return format(cal);
        }
    }

    private String format(XMLGregorianCalendar calendar) {
        GregorianCalendar gCalender = calendar.toGregorianCalendar();
        java.util.Date date = gCalender.getTime();
        dateFormat.setCalendar(gCalender);
        return dateFormat.format(date);
    }

}
