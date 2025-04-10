
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the exchange rate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateDetail1", propOrder = {
    "endPt",
    "othrEndPt",
    "cntrCcyCd",
    "baseCcyCd",
    "rate",
    "rateTp",
    "othrRateTp",
    "agrmtTp",
    "othrAgrmtTp"
})
public class ExchangeRateDetail1 {

    @XmlElement(name = "EndPt")
    @XmlSchemaType(name = "string")
    protected Endpoint1Code endPt;
    @XmlElement(name = "OthrEndPt")
    protected String othrEndPt;
    @XmlElement(name = "CntrCcyCd")
    protected String cntrCcyCd;
    @XmlElement(name = "BaseCcyCd")
    protected String baseCcyCd;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "RateTp")
    @XmlSchemaType(name = "string")
    protected ExchangeRateType2Code rateTp;
    @XmlElement(name = "OthrRateTp")
    protected String othrRateTp;
    @XmlElement(name = "AgrmtTp")
    @XmlSchemaType(name = "string")
    protected ExchangeRateAgreementType1Code agrmtTp;
    @XmlElement(name = "OthrAgrmtTp")
    protected String othrAgrmtTp;

    /**
     * Gets the value of the endPt property.
     * 
     * @return
     *     possible object is
     *     {@link Endpoint1Code }
     *     
     */
    public Endpoint1Code getEndPt() {
        return endPt;
    }

    /**
     * Sets the value of the endPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Endpoint1Code }
     *     
     */
    public ExchangeRateDetail1 setEndPt(Endpoint1Code value) {
        this.endPt = value;
        return this;
    }

    /**
     * Gets the value of the othrEndPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrEndPt() {
        return othrEndPt;
    }

    /**
     * Sets the value of the othrEndPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateDetail1 setOthrEndPt(String value) {
        this.othrEndPt = value;
        return this;
    }

    /**
     * Gets the value of the cntrCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrCcyCd() {
        return cntrCcyCd;
    }

    /**
     * Sets the value of the cntrCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateDetail1 setCntrCcyCd(String value) {
        this.cntrCcyCd = value;
        return this;
    }

    /**
     * Gets the value of the baseCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCcyCd() {
        return baseCcyCd;
    }

    /**
     * Sets the value of the baseCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateDetail1 setBaseCcyCd(String value) {
        this.baseCcyCd = value;
        return this;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ExchangeRateDetail1 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType2Code }
     *     
     */
    public ExchangeRateType2Code getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType2Code }
     *     
     */
    public ExchangeRateDetail1 setRateTp(ExchangeRateType2Code value) {
        this.rateTp = value;
        return this;
    }

    /**
     * Gets the value of the othrRateTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRateTp() {
        return othrRateTp;
    }

    /**
     * Sets the value of the othrRateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateDetail1 setOthrRateTp(String value) {
        this.othrRateTp = value;
        return this;
    }

    /**
     * Gets the value of the agrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateAgreementType1Code }
     *     
     */
    public ExchangeRateAgreementType1Code getAgrmtTp() {
        return agrmtTp;
    }

    /**
     * Sets the value of the agrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateAgreementType1Code }
     *     
     */
    public ExchangeRateDetail1 setAgrmtTp(ExchangeRateAgreementType1Code value) {
        this.agrmtTp = value;
        return this;
    }

    /**
     * Gets the value of the othrAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAgrmtTp() {
        return othrAgrmtTp;
    }

    /**
     * Sets the value of the othrAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateDetail1 setOthrAgrmtTp(String value) {
        this.othrAgrmtTp = value;
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
