
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Information related to a reconciliation between an ATM device and a maintenance host.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMReconciliationOperation1", propOrder = {
    "tpOfOpr",
    "txId",
    "rcncltnId",
    "atmTtls",
    "csstt",
    "txTtls",
    "rtndCard",
    "addtlTxInf",
    "incdnt"
})
public class ATMReconciliationOperation1 {

    @XmlElement(name = "TpOfOpr")
    @XmlSchemaType(name = "string")
    protected ATMOperation2Code tpOfOpr;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier3 txId;
    @XmlElement(name = "RcncltnId", required = true)
    protected String rcncltnId;
    @XmlElement(name = "ATMTtls")
    protected List<ATMTotals4> atmTtls;
    @XmlElement(name = "Csstt")
    protected List<ATMCassette3> csstt;
    @XmlElement(name = "TxTtls")
    protected List<ATMTotals3> txTtls;
    @XmlElement(name = "RtndCard")
    protected BigDecimal rtndCard;
    @XmlElement(name = "AddtlTxInf")
    protected String addtlTxInf;
    @XmlElement(name = "Incdnt")
    @XmlSchemaType(name = "string")
    protected List<FailureReason9Code> incdnt;

    /**
     * Gets the value of the tpOfOpr property.
     * 
     * @return
     *     possible object is
     *     {@link ATMOperation2Code }
     *     
     */
    public ATMOperation2Code getTpOfOpr() {
        return tpOfOpr;
    }

    /**
     * Sets the value of the tpOfOpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMOperation2Code }
     *     
     */
    public ATMReconciliationOperation1 setTpOfOpr(ATMOperation2Code value) {
        this.tpOfOpr = value;
        return this;
    }

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
    public ATMReconciliationOperation1 setTxId(TransactionIdentifier3 value) {
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
    public ATMReconciliationOperation1 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the atmTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the atmTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATMTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMTotals4 }
     * 
     * 
     * @return
     *     The value of the atmTtls property.
     */
    public List<ATMTotals4> getATMTtls() {
        if (atmTtls == null) {
            atmTtls = new ArrayList<>();
        }
        return this.atmTtls;
    }

    /**
     * Gets the value of the csstt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the csstt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCsstt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCassette3 }
     * 
     * 
     * @return
     *     The value of the csstt property.
     */
    public List<ATMCassette3> getCsstt() {
        if (csstt == null) {
            csstt = new ArrayList<>();
        }
        return this.csstt;
    }

    /**
     * Gets the value of the txTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMTotals3 }
     * 
     * 
     * @return
     *     The value of the txTtls property.
     */
    public List<ATMTotals3> getTxTtls() {
        if (txTtls == null) {
            txTtls = new ArrayList<>();
        }
        return this.txTtls;
    }

    /**
     * Gets the value of the rtndCard property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRtndCard() {
        return rtndCard;
    }

    /**
     * Sets the value of the rtndCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMReconciliationOperation1 setRtndCard(BigDecimal value) {
        this.rtndCard = value;
        return this;
    }

    /**
     * Gets the value of the addtlTxInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTxInf() {
        return addtlTxInf;
    }

    /**
     * Sets the value of the addtlTxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMReconciliationOperation1 setAddtlTxInf(String value) {
        this.addtlTxInf = value;
        return this;
    }

    /**
     * Gets the value of the incdnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the incdnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncdnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailureReason9Code }
     * 
     * 
     * @return
     *     The value of the incdnt property.
     */
    public List<FailureReason9Code> getIncdnt() {
        if (incdnt == null) {
            incdnt = new ArrayList<>();
        }
        return this.incdnt;
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
     * Adds a new item to the aTMTtls list.
     * @see #getATMTtls()
     * 
     */
    public ATMReconciliationOperation1 addATMTtls(ATMTotals4 aTMTtls) {
        getATMTtls().add(aTMTtls);
        return this;
    }

    /**
     * Adds a new item to the csstt list.
     * @see #getCsstt()
     * 
     */
    public ATMReconciliationOperation1 addCsstt(ATMCassette3 csstt) {
        getCsstt().add(csstt);
        return this;
    }

    /**
     * Adds a new item to the txTtls list.
     * @see #getTxTtls()
     * 
     */
    public ATMReconciliationOperation1 addTxTtls(ATMTotals3 txTtls) {
        getTxTtls().add(txTtls);
        return this;
    }

    /**
     * Adds a new item to the incdnt list.
     * @see #getIncdnt()
     * 
     */
    public ATMReconciliationOperation1 addIncdnt(FailureReason9Code incdnt) {
        getIncdnt().add(incdnt);
        return this;
    }

}
