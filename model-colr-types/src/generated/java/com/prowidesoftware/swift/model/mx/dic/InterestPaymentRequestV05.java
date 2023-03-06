
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
 * Scope
 * The InterestPaymentRequest message is sent by either;
 * - the collateral taker or its collateral manager to the collateral giver or its collateral manager, or
 * - the collateral giver or its collateral manager to the collateral taker or its collateral manager
 * It is used to request payment or advise the amount due for interest calculated for a specified period. The interest is based on the amount of collateral that has been held during the calculation period. It is possible to send these messages on a bi-lateral basis for matching.
 * 
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * 
 * Usage
 * The InterestPaymentRequest message is used to advise the interest amount calculated for a specific period or request payment for an interest amount for a specific period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestPaymentRequestV05", propOrder = {
    "txId",
    "oblgtn",
    "agrmt",
    "intrstDueToA",
    "intrstDueToB",
    "netAmtDtls",
    "splmtryData"
})
public class InterestPaymentRequestV05 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation9 oblgtn;
    @XmlElement(name = "Agrmt", required = true)
    protected Agreement4 agrmt;
    @XmlElement(name = "IntrstDueToA")
    protected InterestAmount4 intrstDueToA;
    @XmlElement(name = "IntrstDueToB")
    protected InterestAmount4 intrstDueToB;
    @XmlElement(name = "NetAmtDtls")
    protected InterestResult1 netAmtDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestPaymentRequestV05 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the oblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Obligation9 }
     *     
     */
    public Obligation9 getOblgtn() {
        return oblgtn;
    }

    /**
     * Sets the value of the oblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligation9 }
     *     
     */
    public InterestPaymentRequestV05 setOblgtn(Obligation9 value) {
        this.oblgtn = value;
        return this;
    }

    /**
     * Gets the value of the agrmt property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement4 }
     *     
     */
    public Agreement4 getAgrmt() {
        return agrmt;
    }

    /**
     * Sets the value of the agrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement4 }
     *     
     */
    public InterestPaymentRequestV05 setAgrmt(Agreement4 value) {
        this.agrmt = value;
        return this;
    }

    /**
     * Gets the value of the intrstDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link InterestAmount4 }
     *     
     */
    public InterestAmount4 getIntrstDueToA() {
        return intrstDueToA;
    }

    /**
     * Sets the value of the intrstDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestAmount4 }
     *     
     */
    public InterestPaymentRequestV05 setIntrstDueToA(InterestAmount4 value) {
        this.intrstDueToA = value;
        return this;
    }

    /**
     * Gets the value of the intrstDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link InterestAmount4 }
     *     
     */
    public InterestAmount4 getIntrstDueToB() {
        return intrstDueToB;
    }

    /**
     * Sets the value of the intrstDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestAmount4 }
     *     
     */
    public InterestPaymentRequestV05 setIntrstDueToB(InterestAmount4 value) {
        this.intrstDueToB = value;
        return this;
    }

    /**
     * Gets the value of the netAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InterestResult1 }
     *     
     */
    public InterestResult1 getNetAmtDtls() {
        return netAmtDtls;
    }

    /**
     * Sets the value of the netAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestResult1 }
     *     
     */
    public InterestPaymentRequestV05 setNetAmtDtls(InterestResult1 value) {
        this.netAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public InterestPaymentRequestV05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
