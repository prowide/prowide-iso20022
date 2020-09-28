
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
 * Information about a high frequency trading profile.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HighFrequencyTradingProfile1", propOrder = {
    "dt",
    "sttlmFrqcy",
    "cnsldtnTp"
})
public class HighFrequencyTradingProfile1 {

    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "SttlmFrqcy")
    protected SettlementFrequency1Choice sttlmFrqcy;
    @XmlElement(name = "CnsldtnTp")
    protected ConsolidationType1Choice cnsldtnTp;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public HighFrequencyTradingProfile1 setDt(XMLGregorianCalendar value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFrequency1Choice }
     *     
     */
    public SettlementFrequency1Choice getSttlmFrqcy() {
        return sttlmFrqcy;
    }

    /**
     * Sets the value of the sttlmFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFrequency1Choice }
     *     
     */
    public HighFrequencyTradingProfile1 setSttlmFrqcy(SettlementFrequency1Choice value) {
        this.sttlmFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the cnsldtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationType1Choice }
     *     
     */
    public ConsolidationType1Choice getCnsldtnTp() {
        return cnsldtnTp;
    }

    /**
     * Sets the value of the cnsldtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationType1Choice }
     *     
     */
    public HighFrequencyTradingProfile1 setCnsldtnTp(ConsolidationType1Choice value) {
        this.cnsldtnTp = value;
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
