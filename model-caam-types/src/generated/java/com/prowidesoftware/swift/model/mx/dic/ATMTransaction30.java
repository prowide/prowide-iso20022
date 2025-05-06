
package com.prowidesoftware.swift.model.mx.dic;

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
 * Information about reconciliation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction30", propOrder = {
    "tpOfOpr",
    "txId",
    "rcncltnId",
    "csstt"
})
public class ATMTransaction30 {

    @XmlElement(name = "TpOfOpr", required = true)
    @XmlSchemaType(name = "string")
    protected ATMOperation2Code tpOfOpr;
    @XmlElement(name = "TxId")
    protected TransactionIdentifier3 txId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "Csstt")
    protected List<ATMCassette3> csstt;

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
    public ATMTransaction30 setTpOfOpr(ATMOperation2Code value) {
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
    public ATMTransaction30 setTxId(TransactionIdentifier3 value) {
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
    public ATMTransaction30 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
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
     * Adds a new item to the csstt list.
     * @see #getCsstt()
     * 
     */
    public ATMTransaction30 addCsstt(ATMCassette3 csstt) {
        getCsstt().add(csstt);
        return this;
    }

}
