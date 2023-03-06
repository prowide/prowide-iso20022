
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
 * Content of the Balance Inquiry Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceInquiryResponse1", propOrder = {
    "pmtAcct",
    "lltyAcct",
    "stordValAcct",
    "rct"
})
public class BalanceInquiryResponse1 {

    @XmlElement(name = "PmtAcct")
    protected PaymentAccount2 pmtAcct;
    @XmlElement(name = "LltyAcct")
    protected LoyaltyAccount1 lltyAcct;
    @XmlElement(name = "StordValAcct")
    protected List<StoredValueAccount1> stordValAcct;
    @XmlElement(name = "Rct")
    protected List<PaymentReceipt1> rct;

    /**
     * Gets the value of the pmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAccount2 }
     *     
     */
    public PaymentAccount2 getPmtAcct() {
        return pmtAcct;
    }

    /**
     * Sets the value of the pmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAccount2 }
     *     
     */
    public BalanceInquiryResponse1 setPmtAcct(PaymentAccount2 value) {
        this.pmtAcct = value;
        return this;
    }

    /**
     * Gets the value of the lltyAcct property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyAccount1 }
     *     
     */
    public LoyaltyAccount1 getLltyAcct() {
        return lltyAcct;
    }

    /**
     * Sets the value of the lltyAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyAccount1 }
     *     
     */
    public BalanceInquiryResponse1 setLltyAcct(LoyaltyAccount1 value) {
        this.lltyAcct = value;
        return this;
    }

    /**
     * Gets the value of the stordValAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stordValAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStordValAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredValueAccount1 }
     * 
     * 
     */
    public List<StoredValueAccount1> getStordValAcct() {
        if (stordValAcct == null) {
            stordValAcct = new ArrayList<StoredValueAccount1>();
        }
        return this.stordValAcct;
    }

    /**
     * Gets the value of the rct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReceipt1 }
     * 
     * 
     */
    public List<PaymentReceipt1> getRct() {
        if (rct == null) {
            rct = new ArrayList<PaymentReceipt1>();
        }
        return this.rct;
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
     * Adds a new item to the stordValAcct list.
     * @see #getStordValAcct()
     * 
     */
    public BalanceInquiryResponse1 addStordValAcct(StoredValueAccount1 stordValAcct) {
        getStordValAcct().add(stordValAcct);
        return this;
    }

    /**
     * Adds a new item to the rct list.
     * @see #getRct()
     * 
     */
    public BalanceInquiryResponse1 addRct(PaymentReceipt1 rct) {
        getRct().add(rct);
        return this;
    }

}
