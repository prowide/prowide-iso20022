package com.prowidesoftware.swift.model.mx;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Helper API to create MX messages
 *
 * @since 9.0.1
 */
class MxUtils {
    private static final transient Logger log = Logger.getLogger(MxUtils.class.getName());

    /**
     * Returns a gregorian calendar for current moment in UTC time zone
     * @return created calendar or null if DatatypeFactory fails to create the calendar instance
     */
    static XMLGregorianCalendar now() {
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime());
        XMLGregorianCalendar creationDate = null;
        try {
            /*
             * important: cannot create XMLGregorianCalendar directly from Calendar object,
             * specific format must be used for the unmarshalled XML to pass XSD validation.
             */
            creationDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(c.getTime()));
        } catch (DatatypeConfigurationException e) {
            log.log(Level.WARNING, "error initializing header creation date", e);
        }
        return creationDate;
    }

}
