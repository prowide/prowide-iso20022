
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
@XmlType(name = "FinancialInstrumentDetails33", propOrder = {
    "finInstrmId",
    "invstmtFndsFinInstrmAttrbts",
    "pricDtls",
    "sfkpgPlc",
    "opngBal",
    "clsgBal",
    "tx"
})
public class FinancialInstrumentDetails33 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "InvstmtFndsFinInstrmAttrbts")
    protected FinancialInstrument76 invstmtFndsFinInstrmAttrbts;
    @XmlElement(name = "PricDtls")
    protected PriceInformation24 pricDtls;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace4 sfkpgPlc;
    @XmlElement(name = "OpngBal")
    protected OpeningBalance4 opngBal;
    @XmlElement(name = "ClsgBal")
    protected ClosingBalance4 clsgBal;
    @XmlElement(name = "Tx", required = true)
    protected List<Transaction72> tx;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public FinancialInstrumentDetails33 setFinInstrmId(SecurityIdentification20 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the invstmtFndsFinInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument76 }
     *     
     */
    public FinancialInstrument76 getInvstmtFndsFinInstrmAttrbts() {
        return invstmtFndsFinInstrmAttrbts;
    }

    /**
     * Sets the value of the invstmtFndsFinInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument76 }
     *     
     */
    public FinancialInstrumentDetails33 setInvstmtFndsFinInstrmAttrbts(FinancialInstrument76 value) {
        this.invstmtFndsFinInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInformation24 }
     *     
     */
    public PriceInformation24 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInformation24 }
     *     
     */
    public FinancialInstrumentDetails33 setPricDtls(PriceInformation24 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace4 }
     *     
     */
    public SafeKeepingPlace4 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace4 }
     *     
     */
    public FinancialInstrumentDetails33 setSfkpgPlc(SafeKeepingPlace4 value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the opngBal property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningBalance4 }
     *     
     */
    public OpeningBalance4 getOpngBal() {
        return opngBal;
    }

    /**
     * Sets the value of the opngBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningBalance4 }
     *     
     */
    public FinancialInstrumentDetails33 setOpngBal(OpeningBalance4 value) {
        this.opngBal = value;
        return this;
    }

    /**
     * Gets the value of the clsgBal property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingBalance4 }
     *     
     */
    public ClosingBalance4 getClsgBal() {
        return clsgBal;
    }

    /**
     * Sets the value of the clsgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingBalance4 }
     *     
     */
    public FinancialInstrumentDetails33 setClsgBal(ClosingBalance4 value) {
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
     * {@link Transaction72 }
     * 
     * 
     */
    public List<Transaction72> getTx() {
        if (tx == null) {
            tx = new ArrayList<Transaction72>();
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
    public FinancialInstrumentDetails33 addTx(Transaction72 tx) {
        getTx().add(tx);
        return this;
    }

}
