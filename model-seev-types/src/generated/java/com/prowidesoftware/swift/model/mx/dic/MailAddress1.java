
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Electronic and physical mail address.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailAddress1", propOrder = {
    "crspdc",
    "emailAdr"
})
public class MailAddress1 {

    @XmlElement(name = "Crspdc")
    protected List<PostalAddress1> crspdc;
    @XmlElement(name = "EmailAdr")
    protected List<String> emailAdr;

    /**
     * Gets the value of the crspdc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crspdc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrspdc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddress1 }
     * 
     * 
     */
    public List<PostalAddress1> getCrspdc() {
        if (crspdc == null) {
            crspdc = new ArrayList<PostalAddress1>();
        }
        return this.crspdc;
    }

    /**
     * Gets the value of the emailAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailAdr() {
        if (emailAdr == null) {
            emailAdr = new ArrayList<String>();
        }
        return this.emailAdr;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the crspdc list.
     * @see #getCrspdc()
     * 
     */
    public MailAddress1 addCrspdc(PostalAddress1 crspdc) {
        getCrspdc().add(crspdc);
        return this;
    }

    /**
     * Adds a new item to the emailAdr list.
     * @see #getEmailAdr()
     * 
     */
    public MailAddress1 addEmailAdr(String emailAdr) {
        getEmailAdr().add(emailAdr);
        return this;
    }

}
