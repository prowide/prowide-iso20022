
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
 * The PaymentStatusReport.EPCCoreV02 message provides the implementation of the Core Technical Validation Subset of the ISO 20022 message reflecting the EPC Implementation Guidelines v2.2, as approved on 13 December 2006 by the OITS Plenary.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacs.002.002.02", propOrder = {
    "grpHdr",
    "orgnlGrpInfAndSts",
    "txInfAndSts"
})
public class Pacs00200202 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader12 grpHdr;
    @XmlElement(name = "OrgnlGrpInfAndSts", required = true)
    protected OriginalGroupInformation13 orgnlGrpInfAndSts;
    @XmlElement(name = "TxInfAndSts")
    protected List<PaymentTransactionInformation12> txInfAndSts;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader12 }
     *     
     */
    public GroupHeader12 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader12 }
     *     
     */
    public Pacs00200202 setGrpHdr(GroupHeader12 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlGrpInfAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation13 }
     *     
     */
    public OriginalGroupInformation13 getOrgnlGrpInfAndSts() {
        return orgnlGrpInfAndSts;
    }

    /**
     * Sets the value of the orgnlGrpInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation13 }
     *     
     */
    public Pacs00200202 setOrgnlGrpInfAndSts(OriginalGroupInformation13 value) {
        this.orgnlGrpInfAndSts = value;
        return this;
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
     * {@link PaymentTransactionInformation12 }
     * 
     * 
     */
    public List<PaymentTransactionInformation12> getTxInfAndSts() {
        if (txInfAndSts == null) {
            txInfAndSts = new ArrayList<PaymentTransactionInformation12>();
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
     * Adds a new item to the txInfAndSts list.
     * @see #getTxInfAndSts()
     * 
     */
    public Pacs00200202 addTxInfAndSts(PaymentTransactionInformation12 txInfAndSts) {
        getTxInfAndSts().add(txInfAndSts);
        return this;
    }

}
