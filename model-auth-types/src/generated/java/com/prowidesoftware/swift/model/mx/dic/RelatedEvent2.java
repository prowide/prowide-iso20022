
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
 * The dates in relation with the money market fund life cycle.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedEvent2", propOrder = {
    "incptnDt",
    "mrgrDt",
    "lqdtnDt",
    "lastRptSnt"
})
public class RelatedEvent2 {

    @XmlElement(name = "IncptnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar incptnDt;
    @XmlElement(name = "MrgrDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mrgrDt;
    @XmlElement(name = "LqdtnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lqdtnDt;
    @XmlElement(name = "LastRptSnt")
    protected boolean lastRptSnt;

    /**
     * Gets the value of the incptnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIncptnDt() {
        return incptnDt;
    }

    /**
     * Sets the value of the incptnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public RelatedEvent2 setIncptnDt(XMLGregorianCalendar value) {
        this.incptnDt = value;
        return this;
    }

    /**
     * Gets the value of the mrgrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMrgrDt() {
        return mrgrDt;
    }

    /**
     * Sets the value of the mrgrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public RelatedEvent2 setMrgrDt(XMLGregorianCalendar value) {
        this.mrgrDt = value;
        return this;
    }

    /**
     * Gets the value of the lqdtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLqdtnDt() {
        return lqdtnDt;
    }

    /**
     * Sets the value of the lqdtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public RelatedEvent2 setLqdtnDt(XMLGregorianCalendar value) {
        this.lqdtnDt = value;
        return this;
    }

    /**
     * Gets the value of the lastRptSnt property.
     * 
     */
    public boolean isLastRptSnt() {
        return lastRptSnt;
    }

    /**
     * Sets the value of the lastRptSnt property.
     * 
     */
    public RelatedEvent2 setLastRptSnt(boolean value) {
        this.lastRptSnt = value;
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
