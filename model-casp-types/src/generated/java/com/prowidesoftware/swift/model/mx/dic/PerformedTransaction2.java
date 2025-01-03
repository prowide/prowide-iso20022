
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Result of performed transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformedTransaction2", propOrder = {
    "rspn",
    "saleTxId",
    "poiTxId",
    "poiRcncltnId",
    "pmtRslt",
    "lltyRslt",
    "rvsdAmt"
})
public class PerformedTransaction2 {

    @XmlElement(name = "Rspn", required = true)
    protected ResponseType9 rspn;
    @XmlElement(name = "SaleTxId")
    protected TransactionIdentifier1 saleTxId;
    @XmlElement(name = "POITxId")
    protected TransactionIdentifier1 poiTxId;
    @XmlElement(name = "POIRcncltnId")
    protected String poiRcncltnId;
    @XmlElement(name = "PmtRslt")
    protected RetailerPaymentResult2 pmtRslt;
    @XmlElement(name = "LltyRslt")
    protected List<LoyaltyResult2> lltyRslt;
    @XmlElement(name = "RvsdAmt")
    protected BigDecimal rvsdAmt;

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType9 }
     *     
     */
    public ResponseType9 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType9 }
     *     
     */
    public PerformedTransaction2 setRspn(ResponseType9 value) {
        this.rspn = value;
        return this;
    }

    /**
     * Gets the value of the saleTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getSaleTxId() {
        return saleTxId;
    }

    /**
     * Sets the value of the saleTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public PerformedTransaction2 setSaleTxId(TransactionIdentifier1 value) {
        this.saleTxId = value;
        return this;
    }

    /**
     * Gets the value of the poiTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getPOITxId() {
        return poiTxId;
    }

    /**
     * Sets the value of the poiTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public PerformedTransaction2 setPOITxId(TransactionIdentifier1 value) {
        this.poiTxId = value;
        return this;
    }

    /**
     * Gets the value of the poiRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIRcncltnId() {
        return poiRcncltnId;
    }

    /**
     * Sets the value of the poiRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PerformedTransaction2 setPOIRcncltnId(String value) {
        this.poiRcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the pmtRslt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerPaymentResult2 }
     *     
     */
    public RetailerPaymentResult2 getPmtRslt() {
        return pmtRslt;
    }

    /**
     * Sets the value of the pmtRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerPaymentResult2 }
     *     
     */
    public PerformedTransaction2 setPmtRslt(RetailerPaymentResult2 value) {
        this.pmtRslt = value;
        return this;
    }

    /**
     * Gets the value of the lltyRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyResult2 }
     * 
     * 
     * @return
     *     The value of the lltyRslt property.
     */
    public List<LoyaltyResult2> getLltyRslt() {
        if (lltyRslt == null) {
            lltyRslt = new ArrayList<>();
        }
        return this.lltyRslt;
    }

    /**
     * Gets the value of the rvsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRvsdAmt() {
        return rvsdAmt;
    }

    /**
     * Sets the value of the rvsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PerformedTransaction2 setRvsdAmt(BigDecimal value) {
        this.rvsdAmt = value;
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
     * Adds a new item to the lltyRslt list.
     * @see #getLltyRslt()
     * 
     */
    public PerformedTransaction2 addLltyRslt(LoyaltyResult2 lltyRslt) {
        getLltyRslt().add(lltyRslt);
        return this;
    }

}
