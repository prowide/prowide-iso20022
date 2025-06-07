
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Dates determining the entitlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligibilityDates", propOrder = {
    "rcrdDt",
    "sctiesRegnDt",
    "blckgPrd"
})
public class EligibilityDates {

    @XmlElement(name = "RcrdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rcrdDt;
    @XmlElement(name = "SctiesRegnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sctiesRegnDt;
    @XmlElement(name = "BlckgPrd")
    protected DateTimePeriodDetails1 blckgPrd;

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EligibilityDates setRcrdDt(XMLGregorianCalendar value) {
        this.rcrdDt = value;
        return this;
    }

    /**
     * Gets the value of the sctiesRegnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getSctiesRegnDt() {
        return sctiesRegnDt;
    }

    /**
     * Sets the value of the sctiesRegnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EligibilityDates setSctiesRegnDt(XMLGregorianCalendar value) {
        this.sctiesRegnDt = value;
        return this;
    }

    /**
     * Gets the value of the blckgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails1 }
     *     
     */
    public DateTimePeriodDetails1 getBlckgPrd() {
        return blckgPrd;
    }

    /**
     * Sets the value of the blckgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails1 }
     *     
     */
    public EligibilityDates setBlckgPrd(DateTimePeriodDetails1 value) {
        this.blckgPrd = value;
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
