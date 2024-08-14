
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
 * The DTCCCAPSSD1 message extends ISO corporate action event processing status advice message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCAPSSD1V04", propOrder = {
    "corpActnGnlInf",
    "corpActnDtls"
})
public class DTCCCAPSSD1V04 {

    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD20 corpActnGnlInf;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateActionSD9 corpActnDtls;

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD20 }
     *     
     */
    public CorporateActionGeneralInformationSD20 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD20 }
     *     
     */
    public DTCCCAPSSD1V04 setCorpActnGnlInf(CorporateActionGeneralInformationSD20 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionSD9 }
     *     
     */
    public CorporateActionSD9 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionSD9 }
     *     
     */
    public DTCCCAPSSD1V04 setCorpActnDtls(CorporateActionSD9 value) {
        this.corpActnDtls = value;
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
