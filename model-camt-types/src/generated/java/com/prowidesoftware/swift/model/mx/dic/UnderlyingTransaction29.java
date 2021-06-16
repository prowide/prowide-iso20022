
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
 * Identifies the underlying (group of) transaction(s) to which the resolution of investigation applies.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingTransaction29", propOrder = {
    "orgnlGrpInfAndSts",
    "orgnlPmtInfAndSts",
    "txInfAndSts"
})
public class UnderlyingTransaction29 {

    @XmlElement(name = "OrgnlGrpInfAndSts")
    protected OriginalGroupHeader14 orgnlGrpInfAndSts;
    @XmlElement(name = "OrgnlPmtInfAndSts")
    protected List<OriginalPaymentInstruction43> orgnlPmtInfAndSts;
    @XmlElement(name = "TxInfAndSts")
    protected List<PaymentTransaction138> txInfAndSts;

    /**
     * Gets the value of the orgnlGrpInfAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupHeader14 }
     *     
     */
    public OriginalGroupHeader14 getOrgnlGrpInfAndSts() {
        return orgnlGrpInfAndSts;
    }

    /**
     * Sets the value of the orgnlGrpInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupHeader14 }
     *     
     */
    public UnderlyingTransaction29 setOrgnlGrpInfAndSts(OriginalGroupHeader14 value) {
        this.orgnlGrpInfAndSts = value;
        return this;
    }

    /**
     * Gets the value of the orgnlPmtInfAndSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgnlPmtInfAndSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlPmtInfAndSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalPaymentInstruction43 }
     * 
     * 
     */
    public List<OriginalPaymentInstruction43> getOrgnlPmtInfAndSts() {
        if (orgnlPmtInfAndSts == null) {
            orgnlPmtInfAndSts = new ArrayList<OriginalPaymentInstruction43>();
        }
        return this.orgnlPmtInfAndSts;
    }

    /**
     * Gets the value of the txInfAndSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txInfAndSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxInfAndSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransaction138 }
     * 
     * 
     */
    public List<PaymentTransaction138> getTxInfAndSts() {
        if (txInfAndSts == null) {
            txInfAndSts = new ArrayList<PaymentTransaction138>();
        }
        return this.txInfAndSts;
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
     * Adds a new item to the orgnlPmtInfAndSts list.
     * @see #getOrgnlPmtInfAndSts()
     * 
     */
    public UnderlyingTransaction29 addOrgnlPmtInfAndSts(OriginalPaymentInstruction43 orgnlPmtInfAndSts) {
        getOrgnlPmtInfAndSts().add(orgnlPmtInfAndSts);
        return this;
    }

    /**
     * Adds a new item to the txInfAndSts list.
     * @see #getTxInfAndSts()
     * 
     */
    public UnderlyingTransaction29 addTxInfAndSts(PaymentTransaction138 txInfAndSts) {
        getTxInfAndSts().add(txInfAndSts);
        return this;
    }

}
