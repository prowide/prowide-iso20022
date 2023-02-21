
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
 * Reporting per financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentDetails20", propOrder = {
    "finInstrmId",
    "pricDtls",
    "sfkpgPlc",
    "opngBal",
    "clsgBal",
    "tx"
})
public class FinancialInstrumentDetails20 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "PricDtls")
    protected PriceInformation13 pricDtls;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace1 sfkpgPlc;
    @XmlElement(name = "OpngBal")
    protected OpeningBalance3 opngBal;
    @XmlElement(name = "ClsgBal")
    protected ClosingBalance3 clsgBal;
    @XmlElement(name = "Tx", required = true)
    protected List<Transaction46> tx;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public FinancialInstrumentDetails20 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInformation13 }
     *     
     */
    public PriceInformation13 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInformation13 }
     *     
     */
    public FinancialInstrumentDetails20 setPricDtls(PriceInformation13 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace1 }
     *     
     */
    public SafeKeepingPlace1 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace1 }
     *     
     */
    public FinancialInstrumentDetails20 setSfkpgPlc(SafeKeepingPlace1 value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the opngBal property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningBalance3 }
     *     
     */
    public OpeningBalance3 getOpngBal() {
        return opngBal;
    }

    /**
     * Sets the value of the opngBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningBalance3 }
     *     
     */
    public FinancialInstrumentDetails20 setOpngBal(OpeningBalance3 value) {
        this.opngBal = value;
        return this;
    }

    /**
     * Gets the value of the clsgBal property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingBalance3 }
     *     
     */
    public ClosingBalance3 getClsgBal() {
        return clsgBal;
    }

    /**
     * Sets the value of the clsgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingBalance3 }
     *     
     */
    public FinancialInstrumentDetails20 setClsgBal(ClosingBalance3 value) {
        this.clsgBal = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaction46 }
     * 
     * 
     */
    public List<Transaction46> getTx() {
        if (tx == null) {
            tx = new ArrayList<Transaction46>();
        }
        return this.tx;
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
     * Adds a new item to the tx list.
     * @see #getTx()
     * 
     */
    public FinancialInstrumentDetails20 addTx(Transaction46 tx) {
        getTx().add(tx);
        return this;
    }

}
