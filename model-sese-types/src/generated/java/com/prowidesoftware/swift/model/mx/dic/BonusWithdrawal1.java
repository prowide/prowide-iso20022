
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about a bonus paid out or a withdrawal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BonusWithdrawal1", propOrder = {
    "tpOfAmt",
    "amt",
    "rsn",
    "uclmdAmt",
    "outsdng",
    "addtlInf"
})
public class BonusWithdrawal1 {

    @XmlElement(name = "TpOfAmt", required = true)
    protected TypeOfAmount1Choice tpOfAmt;
    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "Rsn")
    protected WithdrawalReason1Choice rsn;
    @XmlElement(name = "UclmdAmt")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount uclmdAmt;
    @XmlElement(name = "Outsdng")
    protected Boolean outsdng;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the tpOfAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount1Choice }
     *     
     */
    public TypeOfAmount1Choice getTpOfAmt() {
        return tpOfAmt;
    }

    /**
     * Sets the value of the tpOfAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount1Choice }
     *     
     */
    public BonusWithdrawal1 setTpOfAmt(TypeOfAmount1Choice value) {
        this.tpOfAmt = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public BonusWithdrawal1 setAmt(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link WithdrawalReason1Choice }
     *     
     */
    public WithdrawalReason1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithdrawalReason1Choice }
     *     
     */
    public BonusWithdrawal1 setRsn(WithdrawalReason1Choice value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the uclmdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getUclmdAmt() {
        return uclmdAmt;
    }

    /**
     * Sets the value of the uclmdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public BonusWithdrawal1 setUclmdAmt(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.uclmdAmt = value;
        return this;
    }

    /**
     * Gets the value of the outsdng property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutsdng() {
        return outsdng;
    }

    /**
     * Sets the value of the outsdng property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BonusWithdrawal1 setOutsdng(Boolean value) {
        this.outsdng = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public BonusWithdrawal1 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
