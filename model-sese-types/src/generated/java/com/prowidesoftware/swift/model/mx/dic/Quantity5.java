
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
 * Details on the quantity, account and other related information involved in a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity5", propOrder = {
    "sttlmQty",
    "dnmtnChc",
    "certNb",
    "qtyBrkdwn"
})
public class Quantity5 {

    @XmlElement(name = "SttlmQty", required = true)
    protected FinancialInstrumentQuantity1Choice sttlmQty;
    @XmlElement(name = "DnmtnChc")
    protected String dnmtnChc;
    @XmlElement(name = "CertNb")
    protected List<SecuritiesCertificate1> certNb;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown3> qtyBrkdwn;

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public Quantity5 setSttlmQty(FinancialInstrumentQuantity1Choice value) {
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
    public Quantity5 setDnmtnChc(String value) {
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
     * {@link SecuritiesCertificate1 }
     * 
     * 
     */
    public List<SecuritiesCertificate1> getCertNb() {
        if (certNb == null) {
            certNb = new ArrayList<SecuritiesCertificate1>();
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
     * {@link QuantityBreakdown3 }
     * 
     * 
     */
    public List<QuantityBreakdown3> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<QuantityBreakdown3>();
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
    public Quantity5 addCertNb(SecuritiesCertificate1 certNb) {
        getCertNb().add(certNb);
        return this;
    }

    /**
     * Adds a new item to the qtyBrkdwn list.
     * @see #getQtyBrkdwn()
     * 
     */
    public Quantity5 addQtyBrkdwn(QuantityBreakdown3 qtyBrkdwn) {
        getQtyBrkdwn().add(qtyBrkdwn);
        return this;
    }

}
