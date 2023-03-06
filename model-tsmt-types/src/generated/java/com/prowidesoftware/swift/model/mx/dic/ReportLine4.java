
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
 * Information about a payment against a commercial invoice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportLine4", propOrder = {
    "comrclDocRef",
    "adjstmnt",
    "netAmt",
    "brkdwnByPurchsOrdr"
})
public class ReportLine4 {

    @XmlElement(name = "ComrclDocRef", required = true)
    protected InvoiceIdentification1 comrclDocRef;
    @XmlElement(name = "Adjstmnt")
    protected List<Adjustment4> adjstmnt;
    @XmlElement(name = "NetAmt", required = true)
    protected CurrencyAndAmount netAmt;
    @XmlElement(name = "BrkdwnByPurchsOrdr", required = true)
    protected List<ReportLine2> brkdwnByPurchsOrdr;

    /**
     * Gets the value of the comrclDocRef property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceIdentification1 }
     *     
     */
    public InvoiceIdentification1 getComrclDocRef() {
        return comrclDocRef;
    }

    /**
     * Sets the value of the comrclDocRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceIdentification1 }
     *     
     */
    public ReportLine4 setComrclDocRef(InvoiceIdentification1 value) {
        this.comrclDocRef = value;
        return this;
    }

    /**
     * Gets the value of the adjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adjustment4 }
     * 
     * 
     */
    public List<Adjustment4> getAdjstmnt() {
        if (adjstmnt == null) {
            adjstmnt = new ArrayList<Adjustment4>();
        }
        return this.adjstmnt;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public ReportLine4 setNetAmt(CurrencyAndAmount value) {
        this.netAmt = value;
        return this;
    }

    /**
     * Gets the value of the brkdwnByPurchsOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brkdwnByPurchsOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrkdwnByPurchsOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportLine2 }
     * 
     * 
     */
    public List<ReportLine2> getBrkdwnByPurchsOrdr() {
        if (brkdwnByPurchsOrdr == null) {
            brkdwnByPurchsOrdr = new ArrayList<ReportLine2>();
        }
        return this.brkdwnByPurchsOrdr;
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
     * Adds a new item to the adjstmnt list.
     * @see #getAdjstmnt()
     * 
     */
    public ReportLine4 addAdjstmnt(Adjustment4 adjstmnt) {
        getAdjstmnt().add(adjstmnt);
        return this;
    }

    /**
     * Adds a new item to the brkdwnByPurchsOrdr list.
     * @see #getBrkdwnByPurchsOrdr()
     * 
     */
    public ReportLine4 addBrkdwnByPurchsOrdr(ReportLine2 brkdwnByPurchsOrdr) {
        getBrkdwnByPurchsOrdr().add(brkdwnByPurchsOrdr);
        return this;
    }

}
