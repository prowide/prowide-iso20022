
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
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
 * Specifies the debit instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtInstrument2", propOrder = {
    "ttlIssdNmnlAmt",
    "mtrtyDt",
    "nmnlValPerUnit",
    "intrstRate",
    "debtSnrty"
})
public class DebtInstrument2 {

    @XmlElement(name = "TtlIssdNmnlAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount ttlIssdNmnlAmt;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate mtrtyDt;
    @XmlElement(name = "NmnlValPerUnit", required = true)
    protected ActiveOrHistoricCurrencyAndAmount nmnlValPerUnit;
    @XmlElement(name = "IntrstRate", required = true)
    protected InterestRate6Choice intrstRate;
    @XmlElement(name = "DebtSnrty")
    @XmlSchemaType(name = "string")
    protected DebtInstrumentSeniorityType1Code debtSnrty;

    /**
     * Gets the value of the ttlIssdNmnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlIssdNmnlAmt() {
        return ttlIssdNmnlAmt;
    }

    /**
     * Sets the value of the ttlIssdNmnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public DebtInstrument2 setTtlIssdNmnlAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlIssdNmnlAmt = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DebtInstrument2 setMtrtyDt(LocalDate value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the nmnlValPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getNmnlValPerUnit() {
        return nmnlValPerUnit;
    }

    /**
     * Sets the value of the nmnlValPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public DebtInstrument2 setNmnlValPerUnit(ActiveOrHistoricCurrencyAndAmount value) {
        this.nmnlValPerUnit = value;
        return this;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate6Choice }
     *     
     */
    public InterestRate6Choice getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate6Choice }
     *     
     */
    public DebtInstrument2 setIntrstRate(InterestRate6Choice value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the debtSnrty property.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrumentSeniorityType1Code }
     *     
     */
    public DebtInstrumentSeniorityType1Code getDebtSnrty() {
        return debtSnrty;
    }

    /**
     * Sets the value of the debtSnrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrumentSeniorityType1Code }
     *     
     */
    public DebtInstrument2 setDebtSnrty(DebtInstrumentSeniorityType1Code value) {
        this.debtSnrty = value;
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
