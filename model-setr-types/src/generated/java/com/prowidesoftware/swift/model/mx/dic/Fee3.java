
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Amount of money associated with a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fee3", propOrder = {
    "tp",
    "rprdStdAmt",
    "rprdStdRate",
    "rprdDscntAmt",
    "rprdDscntRate",
    "rprdReqdAmt",
    "rprdReqdRate",
    "comrclAgrmtRef",
    "newComrclAgrmtRefInd"
})
public class Fee3 {

    @XmlElement(name = "Tp")
    protected ChargeType5Choice tp;
    @XmlElement(name = "RprdStdAmt")
    protected ActiveCurrencyAndAmount rprdStdAmt;
    @XmlElement(name = "RprdStdRate")
    protected BigDecimal rprdStdRate;
    @XmlElement(name = "RprdDscntAmt")
    protected ActiveCurrencyAndAmount rprdDscntAmt;
    @XmlElement(name = "RprdDscntRate")
    protected BigDecimal rprdDscntRate;
    @XmlElement(name = "RprdReqdAmt")
    protected ActiveCurrencyAndAmount rprdReqdAmt;
    @XmlElement(name = "RprdReqdRate")
    protected BigDecimal rprdReqdRate;
    @XmlElement(name = "ComrclAgrmtRef")
    protected String comrclAgrmtRef;
    @XmlElement(name = "NewComrclAgrmtRefInd")
    protected Boolean newComrclAgrmtRefInd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType5Choice }
     *     
     */
    public ChargeType5Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType5Choice }
     *     
     */
    public Fee3 setTp(ChargeType5Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the rprdStdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRprdStdAmt() {
        return rprdStdAmt;
    }

    /**
     * Sets the value of the rprdStdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Fee3 setRprdStdAmt(ActiveCurrencyAndAmount value) {
        this.rprdStdAmt = value;
        return this;
    }

    /**
     * Gets the value of the rprdStdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRprdStdRate() {
        return rprdStdRate;
    }

    /**
     * Sets the value of the rprdStdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Fee3 setRprdStdRate(BigDecimal value) {
        this.rprdStdRate = value;
        return this;
    }

    /**
     * Gets the value of the rprdDscntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRprdDscntAmt() {
        return rprdDscntAmt;
    }

    /**
     * Sets the value of the rprdDscntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Fee3 setRprdDscntAmt(ActiveCurrencyAndAmount value) {
        this.rprdDscntAmt = value;
        return this;
    }

    /**
     * Gets the value of the rprdDscntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRprdDscntRate() {
        return rprdDscntRate;
    }

    /**
     * Sets the value of the rprdDscntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Fee3 setRprdDscntRate(BigDecimal value) {
        this.rprdDscntRate = value;
        return this;
    }

    /**
     * Gets the value of the rprdReqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRprdReqdAmt() {
        return rprdReqdAmt;
    }

    /**
     * Sets the value of the rprdReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Fee3 setRprdReqdAmt(ActiveCurrencyAndAmount value) {
        this.rprdReqdAmt = value;
        return this;
    }

    /**
     * Gets the value of the rprdReqdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRprdReqdRate() {
        return rprdReqdRate;
    }

    /**
     * Sets the value of the rprdReqdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Fee3 setRprdReqdRate(BigDecimal value) {
        this.rprdReqdRate = value;
        return this;
    }

    /**
     * Gets the value of the comrclAgrmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComrclAgrmtRef() {
        return comrclAgrmtRef;
    }

    /**
     * Sets the value of the comrclAgrmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Fee3 setComrclAgrmtRef(String value) {
        this.comrclAgrmtRef = value;
        return this;
    }

    /**
     * Gets the value of the newComrclAgrmtRefInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewComrclAgrmtRefInd() {
        return newComrclAgrmtRefInd;
    }

    /**
     * Sets the value of the newComrclAgrmtRefInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Fee3 setNewComrclAgrmtRefInd(Boolean value) {
        this.newComrclAgrmtRefInd = value;
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
