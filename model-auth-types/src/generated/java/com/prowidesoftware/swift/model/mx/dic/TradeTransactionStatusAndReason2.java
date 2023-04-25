
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identifies the transaction with a trade reference and provides its status. If the status is rejected, a reason for this status must be given.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTransactionStatusAndReason2", propOrder = {
    "rltdRef",
    "tradRef",
    "sts",
    "rjctd"
})
public class TradeTransactionStatusAndReason2 {

    @XmlElement(name = "RltdRef", required = true)
    protected String rltdRef;
    @XmlElement(name = "TradRef", required = true)
    protected String tradRef;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected Status2Code sts;
    @XmlElement(name = "Rjctd")
    protected List<RejectedCancellationStatusReason1Choice> rjctd;

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransactionStatusAndReason2 setRltdRef(String value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the tradRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradRef() {
        return tradRef;
    }

    /**
     * Sets the value of the tradRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransactionStatusAndReason2 setTradRef(String value) {
        this.tradRef = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Status2Code }
     *     
     */
    public Status2Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status2Code }
     *     
     */
    public TradeTransactionStatusAndReason2 setSts(Status2Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectedCancellationStatusReason1Choice }
     * 
     * 
     * @return
     *     The value of the rjctd property.
     */
    public List<RejectedCancellationStatusReason1Choice> getRjctd() {
        if (rjctd == null) {
            rjctd = new ArrayList<>();
        }
        return this.rjctd;
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
     * Adds a new item to the rjctd list.
     * @see #getRjctd()
     * 
     */
    public TradeTransactionStatusAndReason2 addRjctd(RejectedCancellationStatusReason1Choice rjctd) {
        getRjctd().add(rjctd);
        return this;
    }

}
