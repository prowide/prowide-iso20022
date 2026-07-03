
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "AmountAndCurrencyExchange4", propOrder = {
    "instdAmt",
    "txAmt",
    "cntrValAmt",
    "anncdPstngAmt",
    "prtryAmt"
})
public class AmountAndCurrencyExchange4 {

    @XmlElement(name = "InstdAmt")
    protected AmountAndCurrencyExchangeDetails5 instdAmt;
    @XmlElement(name = "TxAmt")
    protected AmountAndCurrencyExchangeDetails5 txAmt;
    @XmlElement(name = "CntrValAmt")
    protected AmountAndCurrencyExchangeDetails5 cntrValAmt;
    @XmlElement(name = "AnncdPstngAmt")
    protected AmountAndCurrencyExchangeDetails5 anncdPstngAmt;
    @XmlElement(name = "PrtryAmt")
    protected List<AmountAndCurrencyExchangeDetails6> prtryAmt;

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchangeDetails5 getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchange4 setInstdAmt(AmountAndCurrencyExchangeDetails5 value) {
        this.instdAmt = value;
        return this;
    }

    /**
     * Gets the value of the txAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchangeDetails5 getTxAmt() {
        return txAmt;
    }

    /**
     * Sets the value of the txAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchange4 setTxAmt(AmountAndCurrencyExchangeDetails5 value) {
        this.txAmt = value;
        return this;
    }

    /**
     * Gets the value of the cntrValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchangeDetails5 getCntrValAmt() {
        return cntrValAmt;
    }

    /**
     * Sets the value of the cntrValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchange4 setCntrValAmt(AmountAndCurrencyExchangeDetails5 value) {
        this.cntrValAmt = value;
        return this;
    }

    /**
     * Gets the value of the anncdPstngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchangeDetails5 getAnncdPstngAmt() {
        return anncdPstngAmt;
    }

    /**
     * Sets the value of the anncdPstngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchangeDetails5 }
     *     
     */
    public AmountAndCurrencyExchange4 setAnncdPstngAmt(AmountAndCurrencyExchangeDetails5 value) {
        this.anncdPstngAmt = value;
        return this;
    }

    /**
     * Gets the value of the prtryAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtryAmt property.
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
     * {@link AmountAndCurrencyExchangeDetails6 }
     * 
     * 
     */
    public List<AmountAndCurrencyExchangeDetails6> getPrtryAmt() {
        if (prtryAmt == null) {
            prtryAmt = new ArrayList<AmountAndCurrencyExchangeDetails6>();
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
    public AmountAndCurrencyExchange4 addPrtryAmt(AmountAndCurrencyExchangeDetails6 prtryAmt) {
        getPrtryAmt().add(prtryAmt);
        return this;
    }

}
