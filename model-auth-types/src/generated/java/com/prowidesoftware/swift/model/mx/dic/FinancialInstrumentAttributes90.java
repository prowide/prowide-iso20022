
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
 * Elements characterising a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes90", propOrder = {
    "ntnl",
    "unitVal",
    "indxId",
    "indxUnit",
    "intrstRateTerms"
})
public class FinancialInstrumentAttributes90 {

    @XmlElement(name = "Ntnl")
    protected ActiveCurrencyAndAmount ntnl;
    @XmlElement(name = "UnitVal", required = true)
    protected ActiveCurrencyAndAmount unitVal;
    @XmlElement(name = "IndxId", required = true)
    protected GenericIdentification168 indxId;
    @XmlElement(name = "IndxUnit", required = true)
    protected String indxUnit;
    @XmlElement(name = "IntrstRateTerms")
    @XmlSchemaType(name = "string")
    protected InterestComputationMethod2Code intrstRateTerms;

    /**
     * Gets the value of the ntnl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNtnl() {
        return ntnl;
    }

    /**
     * Sets the value of the ntnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public FinancialInstrumentAttributes90 setNtnl(ActiveCurrencyAndAmount value) {
        this.ntnl = value;
        return this;
    }

    /**
     * Gets the value of the unitVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getUnitVal() {
        return unitVal;
    }

    /**
     * Sets the value of the unitVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public FinancialInstrumentAttributes90 setUnitVal(ActiveCurrencyAndAmount value) {
        this.unitVal = value;
        return this;
    }

    /**
     * Gets the value of the indxId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification168 }
     *     
     */
    public GenericIdentification168 getIndxId() {
        return indxId;
    }

    /**
     * Sets the value of the indxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification168 }
     *     
     */
    public FinancialInstrumentAttributes90 setIndxId(GenericIdentification168 value) {
        this.indxId = value;
        return this;
    }

    /**
     * Gets the value of the indxUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndxUnit() {
        return indxUnit;
    }

    /**
     * Sets the value of the indxUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes90 setIndxUnit(String value) {
        this.indxUnit = value;
        return this;
    }

    /**
     * Gets the value of the intrstRateTerms property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethod2Code }
     *     
     */
    public InterestComputationMethod2Code getIntrstRateTerms() {
        return intrstRateTerms;
    }

    /**
     * Sets the value of the intrstRateTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethod2Code }
     *     
     */
    public FinancialInstrumentAttributes90 setIntrstRateTerms(InterestComputationMethod2Code value) {
        this.intrstRateTerms = value;
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
