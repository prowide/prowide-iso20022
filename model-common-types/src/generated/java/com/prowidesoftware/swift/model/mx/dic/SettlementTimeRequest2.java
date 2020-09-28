
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
 * Provides information on the requested settlement time(s) of the payment instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTimeRequest2", propOrder = {
    "clsTm",
    "tillTm",
    "frTm",
    "rjctTm"
})
public class SettlementTimeRequest2 {

    @XmlElement(name = "CLSTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar clsTm;
    @XmlElement(name = "TillTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tillTm;
    @XmlElement(name = "FrTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar frTm;
    @XmlElement(name = "RjctTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar rjctTm;

    /**
     * Gets the value of the clsTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLSTm() {
        return clsTm;
    }

    /**
     * Sets the value of the clsTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SettlementTimeRequest2 setCLSTm(XMLGregorianCalendar value) {
        this.clsTm = value;
        return this;
    }

    /**
     * Gets the value of the tillTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTillTm() {
        return tillTm;
    }

    /**
     * Sets the value of the tillTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SettlementTimeRequest2 setTillTm(XMLGregorianCalendar value) {
        this.tillTm = value;
        return this;
    }

    /**
     * Gets the value of the frTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrTm() {
        return frTm;
    }

    /**
     * Sets the value of the frTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SettlementTimeRequest2 setFrTm(XMLGregorianCalendar value) {
        this.frTm = value;
        return this;
    }

    /**
     * Gets the value of the rjctTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRjctTm() {
        return rjctTm;
    }

    /**
     * Sets the value of the rjctTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SettlementTimeRequest2 setRjctTm(XMLGregorianCalendar value) {
        this.rjctTm = value;
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
