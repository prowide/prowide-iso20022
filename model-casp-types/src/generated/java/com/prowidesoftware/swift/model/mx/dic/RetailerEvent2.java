
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Content of the Retailer Event message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerEvent2", propOrder = {
    "evtTmStmp",
    "evtToNtfy",
    "evtCntxt",
    "addtlEvtInf"
})
public class RetailerEvent2 {

    @XmlElement(name = "EvtTmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar evtTmStmp;
    @XmlElement(name = "EvtToNtfy", required = true)
    @XmlSchemaType(name = "string")
    protected EventToNotify2Code evtToNtfy;
    @XmlElement(name = "EvtCntxt")
    protected EventContext2 evtCntxt;
    @XmlElement(name = "AddtlEvtInf")
    protected String addtlEvtInf;

    /**
     * Gets the value of the evtTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getEvtTmStmp() {
        return evtTmStmp;
    }

    /**
     * Sets the value of the evtTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetailerEvent2 setEvtTmStmp(XMLGregorianCalendar value) {
        this.evtTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the evtToNtfy property.
     * 
     * @return
     *     possible object is
     *     {@link EventToNotify2Code }
     *     
     */
    public EventToNotify2Code getEvtToNtfy() {
        return evtToNtfy;
    }

    /**
     * Sets the value of the evtToNtfy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventToNotify2Code }
     *     
     */
    public RetailerEvent2 setEvtToNtfy(EventToNotify2Code value) {
        this.evtToNtfy = value;
        return this;
    }

    /**
     * Gets the value of the evtCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link EventContext2 }
     *     
     */
    public EventContext2 getEvtCntxt() {
        return evtCntxt;
    }

    /**
     * Sets the value of the evtCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventContext2 }
     *     
     */
    public RetailerEvent2 setEvtCntxt(EventContext2 value) {
        this.evtCntxt = value;
        return this;
    }

    /**
     * Gets the value of the addtlEvtInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlEvtInf() {
        return addtlEvtInf;
    }

    /**
     * Sets the value of the addtlEvtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetailerEvent2 setAddtlEvtInf(String value) {
        this.addtlEvtInf = value;
        return this;
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

}
