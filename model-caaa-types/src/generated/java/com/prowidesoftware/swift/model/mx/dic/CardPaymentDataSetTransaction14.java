
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
 * Completed card payment transaction to be captured in batch.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentDataSetTransaction14", propOrder = {
    "txSeqCntr",
    "tracblt",
    "envt",
    "cntxt",
    "tx"
})
public class CardPaymentDataSetTransaction14 {

    @XmlElement(name = "TxSeqCntr", required = true)
    protected String txSeqCntr;
    @XmlElement(name = "Tracblt")
    protected List<Traceability5> tracblt;
    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment52 envt;
    @XmlElement(name = "Cntxt")
    protected CardPaymentContext18 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction60 tx;

    /**
     * Gets the value of the txSeqCntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSeqCntr() {
        return txSeqCntr;
    }

    /**
     * Sets the value of the txSeqCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentDataSetTransaction14 setTxSeqCntr(String value) {
        this.txSeqCntr = value;
        return this;
    }

    /**
     * Gets the value of the tracblt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tracblt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracblt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Traceability5 }
     * 
     * 
     */
    public List<Traceability5> getTracblt() {
        if (tracblt == null) {
            tracblt = new ArrayList<Traceability5>();
        }
        return this.tracblt;
    }

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment52 }
     *     
     */
    public CardPaymentEnvironment52 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment52 }
     *     
     */
    public CardPaymentDataSetTransaction14 setEnvt(CardPaymentEnvironment52 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext18 }
     *     
     */
    public CardPaymentContext18 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext18 }
     *     
     */
    public CardPaymentDataSetTransaction14 setCntxt(CardPaymentContext18 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction60 }
     *     
     */
    public CardPaymentTransaction60 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction60 }
     *     
     */
    public CardPaymentDataSetTransaction14 setTx(CardPaymentTransaction60 value) {
        this.tx = value;
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
     * Adds a new item to the tracblt list.
     * @see #getTracblt()
     * 
     */
    public CardPaymentDataSetTransaction14 addTracblt(Traceability5 tracblt) {
        getTracblt().add(tracblt);
        return this;
    }

}
