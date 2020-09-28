
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
 * The FIToFIPaymentReversal.EPCCoreAOSV02 message provides the implementation of the Core+AOS Technical Validation Subset of the ISO 20022 message reflecting the EPC Implementation Guidelines v2.2, as approved on 13 December 2006 by the OITS Plenary.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacs.007.003.02", propOrder = {
    "grpHdr",
    "orgnlGrpInf",
    "txInf"
})
public class Pacs00700302 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader18 grpHdr;
    @XmlElement(name = "OrgnlGrpInf", required = true)
    protected OriginalGroupInformation16 orgnlGrpInf;
    @XmlElement(name = "TxInf", required = true)
    protected List<PaymentTransactionInformation17> txInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader18 }
     *     
     */
    public GroupHeader18 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader18 }
     *     
     */
    public Pacs00700302 setGrpHdr(GroupHeader18 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation16 }
     *     
     */
    public OriginalGroupInformation16 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation16 }
     *     
     */
    public Pacs00700302 setOrgnlGrpInf(OriginalGroupInformation16 value) {
        this.orgnlGrpInf = value;
        return this;
    }

    /**
     * Gets the value of the txInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransactionInformation17 }
     * 
     * 
     */
    public List<PaymentTransactionInformation17> getTxInf() {
        if (txInf == null) {
            txInf = new ArrayList<PaymentTransactionInformation17>();
        }
        return this.txInf;
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
     * Adds a new item to the txInf list.
     * @see #getTxInf()
     * 
     */
    public Pacs00700302 addTxInf(PaymentTransactionInformation17 txInf) {
        getTxInf().add(txInf);
        return this;
    }

}
