
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Amounts of the deposit transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedAmount16", propOrder = {
    "acctSeqNb",
    "amtToDpst",
    "ccy",
    "cshBckAmt",
    "fees",
    "dontn"
})
public class DetailedAmount16 {

    @XmlElement(name = "AcctSeqNb")
    protected BigDecimal acctSeqNb;
    @XmlElement(name = "AmtToDpst")
    protected BigDecimal amtToDpst;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "CshBckAmt")
    protected BigDecimal cshBckAmt;
    @XmlElement(name = "Fees")
    protected List<DetailedAmount13> fees;
    @XmlElement(name = "Dontn")
    protected List<DetailedAmount13> dontn;

    /**
     * Gets the value of the acctSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcctSeqNb() {
        return acctSeqNb;
    }

    /**
     * Sets the value of the acctSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedAmount16 setAcctSeqNb(BigDecimal value) {
        this.acctSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the amtToDpst property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtToDpst() {
        return amtToDpst;
    }

    /**
     * Sets the value of the amtToDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedAmount16 setAmtToDpst(BigDecimal value) {
        this.amtToDpst = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DetailedAmount16 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the cshBckAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCshBckAmt() {
        return cshBckAmt;
    }

    /**
     * Sets the value of the cshBckAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedAmount16 setCshBckAmt(BigDecimal value) {
        this.cshBckAmt = value;
        return this;
    }

    /**
     * Gets the value of the fees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount13 }
     * 
     * 
     * @return
     *     The value of the fees property.
     */
    public List<DetailedAmount13> getFees() {
        if (fees == null) {
            fees = new ArrayList<>();
        }
        return this.fees;
    }

    /**
     * Gets the value of the dontn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dontn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDontn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount13 }
     * 
     * 
     * @return
     *     The value of the dontn property.
     */
    public List<DetailedAmount13> getDontn() {
        if (dontn == null) {
            dontn = new ArrayList<>();
        }
        return this.dontn;
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
     * Adds a new item to the fees list.
     * @see #getFees()
     * 
     */
    public DetailedAmount16 addFees(DetailedAmount13 fees) {
        getFees().add(fees);
        return this;
    }

    /**
     * Adds a new item to the dontn list.
     * @see #getDontn()
     * 
     */
    public DetailedAmount16 addDontn(DetailedAmount13 dontn) {
        getDontn().add(dontn);
        return this;
    }

}
