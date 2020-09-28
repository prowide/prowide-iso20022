
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Parameters defining the timing conditions to process an action.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessTiming3", propOrder = {
    "wtgTm",
    "startTm",
    "endTm",
    "prd",
    "maxNb"
})
public class ProcessTiming3 {

    @XmlElement(name = "WtgTm")
    protected String wtgTm;
    @XmlElement(name = "StartTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTm;
    @XmlElement(name = "EndTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTm;
    @XmlElement(name = "Prd")
    protected String prd;
    @XmlElement(name = "MaxNb")
    protected BigDecimal maxNb;

    /**
     * Gets the value of the wtgTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWtgTm() {
        return wtgTm;
    }

    /**
     * Sets the value of the wtgTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProcessTiming3 setWtgTm(String value) {
        this.wtgTm = value;
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
    public ProcessTiming3 setStartTm(XMLGregorianCalendar value) {
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
    public ProcessTiming3 setEndTm(XMLGregorianCalendar value) {
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
    public ProcessTiming3 setPrd(String value) {
        this.prd = value;
        return this;
    }

    /**
     * Gets the value of the maxNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxNb() {
        return maxNb;
    }

    /**
     * Sets the value of the maxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ProcessTiming3 setMaxNb(BigDecimal value) {
        this.maxNb = value;
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
