
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Information about the reconciliation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction25", propOrder = {
    "tpOfOpr",
    "txId",
    "rcncltnId",
    "atmTtls",
    "csstt",
    "txTtls",
    "rtndCard",
    "addtlTxInf"
})
public class ATMTransaction25 {

    @XmlElement(name = "TpOfOpr")
    @XmlSchemaType(name = "string")
    protected ATMOperation1Code tpOfOpr;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "RcncltnId", required = true)
    protected String rcncltnId;
    @XmlElement(name = "ATMTtls")
    protected List<ATMTotals1> atmTtls;
    @XmlElement(name = "Csstt")
    protected List<ATMCassette2> csstt;
    @XmlElement(name = "TxTtls")
    protected List<ATMTotals3> txTtls;
    @XmlElement(name = "RtndCard")
    protected BigDecimal rtndCard;
    @XmlElement(name = "AddtlTxInf")
    protected String addtlTxInf;

    /**
     * Gets the value of the tpOfOpr property.
     * 
     * @return
     *     possible object is
     *     {@link ATMOperation1Code }
     *     
     */
    public ATMOperation1Code getTpOfOpr() {
        return tpOfOpr;
    }

    /**
     * Sets the value of the tpOfOpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMOperation1Code }
     *     
     */
    public ATMTransaction25 setTpOfOpr(ATMOperation1Code value) {
        this.tpOfOpr = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public ATMTransaction25 setTxId(TransactionIdentifier1 value) {
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
    public ATMTransaction25 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the atmTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atmTtls property.
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
     * {@link ATMTotals1 }
     * 
     * 
     */
    public List<ATMTotals1> getATMTtls() {
        if (atmTtls == null) {
            atmTtls = new ArrayList<ATMTotals1>();
        }
        return this.atmTtls;
    }

    /**
     * Gets the value of the csstt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csstt property.
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
     * {@link ATMCassette2 }
     * 
     * 
     */
    public List<ATMCassette2> getCsstt() {
        if (csstt == null) {
            csstt = new ArrayList<ATMCassette2>();
        }
        return this.csstt;
    }

    /**
     * Gets the value of the txTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txTtls property.
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
     */
    public List<ATMTotals3> getTxTtls() {
        if (txTtls == null) {
            txTtls = new ArrayList<ATMTotals3>();
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
    public ATMTransaction25 setRtndCard(BigDecimal value) {
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
    public ATMTransaction25 setAddtlTxInf(String value) {
        this.addtlTxInf = value;
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
     * Adds a new item to the aTMTtls list.
     * @see #getATMTtls()
     * 
     */
    public ATMTransaction25 addATMTtls(ATMTotals1 aTMTtls) {
        getATMTtls().add(aTMTtls);
        return this;
    }

    /**
     * Adds a new item to the csstt list.
     * @see #getCsstt()
     * 
     */
    public ATMTransaction25 addCsstt(ATMCassette2 csstt) {
        getCsstt().add(csstt);
        return this;
    }

    /**
     * Adds a new item to the txTtls list.
     * @see #getTxTtls()
     * 
     */
    public ATMTransaction25 addTxTtls(ATMTotals3 txTtls) {
        getTxTtls().add(txTtls);
        return this;
    }

}
