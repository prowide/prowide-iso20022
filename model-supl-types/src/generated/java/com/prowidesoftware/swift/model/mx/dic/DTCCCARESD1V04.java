
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The DTCCCARESD1 message extends ISO corporate action movement reversal advice message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCARESD1V04", propOrder = {
    "corpActnGnlInf",
    "undrlygScty"
})
public class DTCCCARESD1V04 {

    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD53 corpActnGnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD20 undrlygScty;

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD53 }
     *     
     */
    public CorporateActionGeneralInformationSD53 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD53 }
     *     
     */
    public DTCCCARESD1V04 setCorpActnGnlInf(CorporateActionGeneralInformationSD53 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributesSD20 }
     *     
     */
    public FinancialInstrumentAttributesSD20 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributesSD20 }
     *     
     */
    public DTCCCARESD1V04 setUndrlygScty(FinancialInstrumentAttributesSD20 value) {
        this.undrlygScty = value;
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
