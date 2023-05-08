
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
    protected Calendar rcrdDt;
    @XmlElement(name = "SctiesRegnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar sctiesRegnDt;
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
    public Calendar getRcrdDt() {
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
    public EligibilityDates setRcrdDt(Calendar value) {
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
    public Calendar getSctiesRegnDt() {
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
    public EligibilityDates setSctiesRegnDt(Calendar value) {
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
