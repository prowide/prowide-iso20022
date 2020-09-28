
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
 * Choice between a fixed date and a recurring date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedOrRecurrentDate1Choice", propOrder = {
    "fxdDt",
    "rcrntDt"
})
public class FixedOrRecurrentDate1Choice {

    @XmlElement(name = "FxdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fxdDt;
    @XmlElement(name = "RcrntDt")
    protected DateInformation1 rcrntDt;

    /**
     * Gets the value of the fxdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFxdDt() {
        return fxdDt;
    }

    /**
     * Sets the value of the fxdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FixedOrRecurrentDate1Choice setFxdDt(XMLGregorianCalendar value) {
        this.fxdDt = value;
        return this;
    }

    /**
     * Gets the value of the rcrntDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateInformation1 }
     *     
     */
    public DateInformation1 getRcrntDt() {
        return rcrntDt;
    }

    /**
     * Sets the value of the rcrntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInformation1 }
     *     
     */
    public FixedOrRecurrentDate1Choice setRcrntDt(DateInformation1 value) {
        this.rcrntDt = value;
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
