
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details on an event occurring in a system, whether planned or unplanned as stipulated in the specifications of the system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEvent2", propOrder = {
    "tp",
    "schdldTm",
    "fctvTm",
    "startTm",
    "endTm"
})
public class SystemEvent2 {

    @XmlElement(name = "Tp", required = true)
    protected SystemEventType2Choice tp;
    @XmlElement(name = "SchdldTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar schdldTm;
    @XmlElement(name = "FctvTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fctvTm;
    @XmlElement(name = "StartTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTm;
    @XmlElement(name = "EndTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTm;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventType2Choice }
     *     
     */
    public SystemEventType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventType2Choice }
     *     
     */
    public SystemEvent2 setTp(SystemEventType2Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the schdldTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSchdldTm() {
        return schdldTm;
    }

    /**
     * Sets the value of the schdldTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SystemEvent2 setSchdldTm(XMLGregorianCalendar value) {
        this.schdldTm = value;
        return this;
    }

    /**
     * Gets the value of the fctvTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFctvTm() {
        return fctvTm;
    }

    /**
     * Sets the value of the fctvTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SystemEvent2 setFctvTm(XMLGregorianCalendar value) {
        this.fctvTm = value;
        return this;
    }

    /**
     * Gets the value of the startTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTm() {
        return startTm;
    }

    /**
     * Sets the value of the startTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SystemEvent2 setStartTm(XMLGregorianCalendar value) {
        this.startTm = value;
        return this;
    }

    /**
     * Gets the value of the endTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTm() {
        return endTm;
    }

    /**
     * Sets the value of the endTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SystemEvent2 setEndTm(XMLGregorianCalendar value) {
        this.endTm = value;
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
