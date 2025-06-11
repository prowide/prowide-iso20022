
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Transaction for which the exception is sent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction40", propOrder = {
    "txId",
    "rcncltnId",
    "xcptn",
    "xcptnDtl",
    "elctrncPrsBal"
})
public class ATMTransaction40 {

    @XmlElement(name = "TxId")
    protected TransactionIdentifier3 txId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "Xcptn", required = true)
    @XmlSchemaType(name = "string")
    protected List<FailureReason8Code> xcptn;
    @XmlElement(name = "XcptnDtl")
    protected List<String> xcptnDtl;
    @XmlElement(name = "ElctrncPrsBal")
    protected CurrencyAndAmount elctrncPrsBal;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier3 }
     *     
     */
    public TransactionIdentifier3 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier3 }
     *     
     */
    public ATMTransaction40 setTxId(TransactionIdentifier3 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Sets the value of the rcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMTransaction40 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the xcptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xcptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXcptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailureReason8Code }
     * 
     * 
     */
    public List<FailureReason8Code> getXcptn() {
        if (xcptn == null) {
            xcptn = new ArrayList<FailureReason8Code>();
        }
        return this.xcptn;
    }

    /**
     * Gets the value of the xcptnDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xcptnDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXcptnDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getXcptnDtl() {
        if (xcptnDtl == null) {
            xcptnDtl = new ArrayList<String>();
        }
        return this.xcptnDtl;
    }

    /**
     * Gets the value of the elctrncPrsBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getElctrncPrsBal() {
        return elctrncPrsBal;
    }

    /**
     * Sets the value of the elctrncPrsBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public ATMTransaction40 setElctrncPrsBal(CurrencyAndAmount value) {
        this.elctrncPrsBal = value;
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

    /**
     * Adds a new item to the xcptn list.
     * @see #getXcptn()
     * 
     */
    public ATMTransaction40 addXcptn(FailureReason8Code xcptn) {
        getXcptn().add(xcptn);
        return this;
    }

    /**
     * Adds a new item to the xcptnDtl list.
     * @see #getXcptnDtl()
     * 
     */
    public ATMTransaction40 addXcptnDtl(String xcptnDtl) {
        getXcptnDtl().add(xcptnDtl);
        return this;
    }

}
