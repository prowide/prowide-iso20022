
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
 * Details on the quantity, account and other related information involved in a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity8", propOrder = {
    "sttlmQty",
    "dnmtnChc",
    "certNb",
    "qtyBrkdwn"
})
public class Quantity8 {

    @XmlElement(name = "SttlmQty", required = true)
    protected FinancialInstrumentQuantity15Choice sttlmQty;
    @XmlElement(name = "DnmtnChc")
    protected String dnmtnChc;
    @XmlElement(name = "CertNb")
    protected List<SecuritiesCertificate2> certNb;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown18> qtyBrkdwn;

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public Quantity8 setSttlmQty(FinancialInstrumentQuantity15Choice value) {
        this.sttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the dnmtnChc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnmtnChc() {
        return dnmtnChc;
    }

    /**
     * Sets the value of the dnmtnChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Quantity8 setDnmtnChc(String value) {
        this.dnmtnChc = value;
        return this;
    }

    /**
     * Gets the value of the certNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesCertificate2 }
     * 
     * 
     */
    public List<SecuritiesCertificate2> getCertNb() {
        if (certNb == null) {
            certNb = new ArrayList<SecuritiesCertificate2>();
        }
        return this.certNb;
    }

    /**
     * Gets the value of the qtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qtyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityBreakdown18 }
     * 
     * 
     */
    public List<QuantityBreakdown18> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<QuantityBreakdown18>();
        }
        return this.qtyBrkdwn;
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
     * Adds a new item to the certNb list.
     * @see #getCertNb()
     * 
     */
    public Quantity8 addCertNb(SecuritiesCertificate2 certNb) {
        getCertNb().add(certNb);
        return this;
    }

    /**
     * Adds a new item to the qtyBrkdwn list.
     * @see #getQtyBrkdwn()
     * 
     */
    public Quantity8 addQtyBrkdwn(QuantityBreakdown18 qtyBrkdwn) {
        getQtyBrkdwn().add(qtyBrkdwn);
        return this;
    }

}