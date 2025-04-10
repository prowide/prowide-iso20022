
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
 * Set of elements used to provide information on the original amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndCurrencyExchange3", propOrder = {
    "instdAmt",
    "txAmt",
    "cntrValAmt",
    "anncdPstngAmt",
    "prtryAmt"
})
public class AmountAndCurrencyExchange3 {

    @XmlElement(name = "InstdAmt")
    protected AmountAndCurrencyExchangeDetails3 instdAmt;
    @XmlElement(name = "TxAmt")
    protected AmountAndCurrencyExchangeDetails3 txAmt;
    @XmlElement(name = "CntrValAmt")
    protected AmountAndCurrencyExchangeDetails3 cntrValAmt;
    @XmlElement(name = "AnncdPstngAmt")
    protected AmountAndCurrencyExchangeDetails3 anncdPstngAmt;
    @XmlElement(name = "PrtryAmt")
    protected List<AmountAndCurrencyExchangeDetails4> prtryAmt;

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchangeDetails3 getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchange3 setInstdAmt(AmountAndCurrencyExchangeDetails3 value) {
        this.instdAmt = value;
        return this;
    }

    /**
     * Gets the value of the txAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchangeDetails3 getTxAmt() {
        return txAmt;
    }

    /**
     * Sets the value of the txAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchange3 setTxAmt(AmountAndCurrencyExchangeDetails3 value) {
        this.txAmt = value;
        return this;
    }

    /**
     * Gets the value of the cntrValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchangeDetails3 getCntrValAmt() {
        return cntrValAmt;
    }

    /**
     * Sets the value of the cntrValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchange3 setCntrValAmt(AmountAndCurrencyExchangeDetails3 value) {
        this.cntrValAmt = value;
        return this;
    }

    /**
     * Gets the value of the anncdPstngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchangeDetails3 getAnncdPstngAmt() {
        return anncdPstngAmt;
    }

    /**
     * Sets the value of the anncdPstngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails3 }
     *     
     */
    public AmountAndCurrencyExchange3 setAnncdPstngAmt(AmountAndCurrencyExchangeDetails3 value) {
        this.anncdPstngAmt = value;
        return this;
    }

    /**
     * Gets the value of the prtryAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtryAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtryAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountAndCurrencyExchangeDetails4 }
     * 
     * 
     * @return
     *     The value of the prtryAmt property.
     */
    public List<AmountAndCurrencyExchangeDetails4> getPrtryAmt() {
        if (prtryAmt == null) {
            prtryAmt = new ArrayList<>();
        }
        return this.prtryAmt;
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
     * Adds a new item to the prtryAmt list.
     * @see #getPrtryAmt()
     * 
     */
    public AmountAndCurrencyExchange3 addPrtryAmt(AmountAndCurrencyExchangeDetails4 prtryAmt) {
        getPrtryAmt().add(prtryAmt);
        return this;
    }

}
