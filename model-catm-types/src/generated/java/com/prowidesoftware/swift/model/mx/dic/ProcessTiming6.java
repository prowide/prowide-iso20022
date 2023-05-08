
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Parameters defining the timing conditions to process an action.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessTiming6", propOrder = {
    "startTm",
    "endTm",
    "prd",
    "unitOfTm"
})
public class ProcessTiming6 {

    @XmlElement(name = "StartTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startTm;
    @XmlElement(name = "EndTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endTm;
    @XmlElement(name = "Prd")
    protected String prd;
    @XmlElement(name = "UnitOfTm")
    @XmlSchemaType(name = "string")
    protected TimeUnit1Code unitOfTm;

    /**
     * Gets the value of the startTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartTm() {
        return startTm;
    }

    /**
     * Sets the value of the startTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessTiming6 setStartTm(Calendar value) {
        this.startTm = value;
        return this;
    }

    /**
     * Gets the value of the endTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndTm() {
        return endTm;
    }

    /**
     * Sets the value of the endTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessTiming6 setEndTm(Calendar value) {
        this.endTm = value;
        return this;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessTiming6 setPrd(String value) {
        this.prd = value;
        return this;
    }

    /**
     * Gets the value of the unitOfTm property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnit1Code }
     *     
     */
    public TimeUnit1Code getUnitOfTm() {
        return unitOfTm;
    }

    /**
     * Sets the value of the unitOfTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnit1Code }
     *     
     */
    public ProcessTiming6 setUnitOfTm(TimeUnit1Code value) {
        this.unitOfTm = value;
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
