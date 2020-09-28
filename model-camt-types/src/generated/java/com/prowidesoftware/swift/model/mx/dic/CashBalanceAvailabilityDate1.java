
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
 * Indicates when the amount of money will become available.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashBalanceAvailabilityDate1", propOrder = {
    "nbOfDays",
    "actlDt"
})
public class CashBalanceAvailabilityDate1 {

    @XmlElement(name = "NbOfDays")
    protected String nbOfDays;
    @XmlElement(name = "ActlDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actlDt;

    /**
     * Gets the value of the nbOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfDays() {
        return nbOfDays;
    }

    /**
     * Sets the value of the nbOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashBalanceAvailabilityDate1 setNbOfDays(String value) {
        this.nbOfDays = value;
        return this;
    }

    /**
     * Gets the value of the actlDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActlDt() {
        return actlDt;
    }

    /**
     * Sets the value of the actlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CashBalanceAvailabilityDate1 setActlDt(XMLGregorianCalendar value) {
        this.actlDt = value;
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
