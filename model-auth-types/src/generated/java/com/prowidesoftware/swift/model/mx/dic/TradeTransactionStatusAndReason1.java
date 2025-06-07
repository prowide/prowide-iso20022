
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "TradeTransactionStatusAndReason1", propOrder = {
    "rltdRef",
    "tradRef",
    "sts",
    "rjctd"
})
public class TradeTransactionStatusAndReason1 {

    @XmlElement(name = "RltdRef", required = true)
    protected String rltdRef;
    @XmlElement(name = "TradRef", required = true)
    protected String tradRef;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected Status2Code sts;
    @XmlElement(name = "Rjctd")
    protected List<RejectedStatusReason9Choice> rjctd;

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
    public TradeTransactionStatusAndReason1 setRltdRef(String value) {
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
    public TradeTransactionStatusAndReason1 setTradRef(String value) {
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
    public TradeTransactionStatusAndReason1 setSts(Status2Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rjctd property.
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
     * {@link RejectedStatusReason9Choice }
     * 
     * 
     */
    public List<RejectedStatusReason9Choice> getRjctd() {
        if (rjctd == null) {
            rjctd = new ArrayList<RejectedStatusReason9Choice>();
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
    public TradeTransactionStatusAndReason1 addRjctd(RejectedStatusReason9Choice rjctd) {
        getRjctd().add(rjctd);
        return this;
    }

}
