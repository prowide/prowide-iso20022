
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
 * The InterestPaymentResponse message is sent by either;
 * - the collateral taker or its collateral manager to the collateral giver or its collateral manager, or
 * - the collateral giver or its collateral manager to the collateral taker or its collateral manager
 * This is a response to the InterestPaymentRequest message and the amount of interest requested or advised can be accepted or rejected.
 * 
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * 
 * Usage
 * The InterestPaymentResponse message is sent in response to the InterestPaymentRequest in order to accept or reject the amount of interest requested or advised. A rejection reason and information can be provide if the InterestPaymentRequest is being rejected.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestPaymentResponseV04", propOrder = {
    "txId",
    "oblgtn",
    "agrmt",
    "intrstDueToA",
    "intrstDueToB",
    "intrstRspn",
    "splmtryData"
})
public class InterestPaymentResponseV04 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation4 oblgtn;
    @XmlElement(name = "Agrmt", required = true)
    protected Agreement4 agrmt;
    @XmlElement(name = "IntrstDueToA")
    protected InterestAmount2 intrstDueToA;
    @XmlElement(name = "IntrstDueToB")
    protected InterestAmount2 intrstDueToB;
    @XmlElement(name = "IntrstRspn", required = true)
    protected InterestResponse1 intrstRspn;
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
    public InterestPaymentResponseV04 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the oblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Obligation4 }
     *     
     */
    public Obligation4 getOblgtn() {
        return oblgtn;
    }

    /**
     * Sets the value of the oblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligation4 }
     *     
     */
    public InterestPaymentResponseV04 setOblgtn(Obligation4 value) {
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
    public InterestPaymentResponseV04 setAgrmt(Agreement4 value) {
        this.agrmt = value;
        return this;
    }

    /**
     * Gets the value of the intrstDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link InterestAmount2 }
     *     
     */
    public InterestAmount2 getIntrstDueToA() {
        return intrstDueToA;
    }

    /**
     * Sets the value of the intrstDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestAmount2 }
     *     
     */
    public InterestPaymentResponseV04 setIntrstDueToA(InterestAmount2 value) {
        this.intrstDueToA = value;
        return this;
    }

    /**
     * Gets the value of the intrstDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link InterestAmount2 }
     *     
     */
    public InterestAmount2 getIntrstDueToB() {
        return intrstDueToB;
    }

    /**
     * Sets the value of the intrstDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestAmount2 }
     *     
     */
    public InterestPaymentResponseV04 setIntrstDueToB(InterestAmount2 value) {
        this.intrstDueToB = value;
        return this;
    }

    /**
     * Gets the value of the intrstRspn property.
     * 
     * @return
     *     possible object is
     *     {@link InterestResponse1 }
     *     
     */
    public InterestResponse1 getIntrstRspn() {
        return intrstRspn;
    }

    /**
     * Sets the value of the intrstRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestResponse1 }
     *     
     */
    public InterestPaymentResponseV04 setIntrstRspn(InterestResponse1 value) {
        this.intrstRspn = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public InterestPaymentResponseV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
