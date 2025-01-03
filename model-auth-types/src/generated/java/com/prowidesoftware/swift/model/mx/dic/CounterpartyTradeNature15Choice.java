
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Nature of the counterparty's company activities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyTradeNature15Choice", propOrder = {
    "fi",
    "nfi",
    "cntrlCntrPty",
    "othr"
})
public class CounterpartyTradeNature15Choice {

    @XmlElement(name = "FI")
    protected FinancialInstitutionSector1 fi;
    @XmlElement(name = "NFI")
    protected NonFinancialInstitutionSector10 nfi;
    @XmlElement(name = "CntrlCntrPty")
    @XmlSchemaType(name = "string")
    protected NoReasonCode cntrlCntrPty;
    @XmlElement(name = "Othr")
    @XmlSchemaType(name = "string")
    protected NoReasonCode othr;

    /**
     * Gets the value of the fi property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionSector1 }
     *     
     */
    public FinancialInstitutionSector1 getFI() {
        return fi;
    }

    /**
     * Sets the value of the fi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionSector1 }
     *     
     */
    public CounterpartyTradeNature15Choice setFI(FinancialInstitutionSector1 value) {
        this.fi = value;
        return this;
    }

    /**
     * Gets the value of the nfi property.
     * 
     * @return
     *     possible object is
     *     {@link NonFinancialInstitutionSector10 }
     *     
     */
    public NonFinancialInstitutionSector10 getNFI() {
        return nfi;
    }

    /**
     * Sets the value of the nfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFinancialInstitutionSector10 }
     *     
     */
    public CounterpartyTradeNature15Choice setNFI(NonFinancialInstitutionSector10 value) {
        this.nfi = value;
        return this;
    }

    /**
     * Gets the value of the cntrlCntrPty property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getCntrlCntrPty() {
        return cntrlCntrPty;
    }

    /**
     * Sets the value of the cntrlCntrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public CounterpartyTradeNature15Choice setCntrlCntrPty(NoReasonCode value) {
        this.cntrlCntrPty = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public CounterpartyTradeNature15Choice setOthr(NoReasonCode value) {
        this.othr = value;
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
