
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
 * Choice of status for an order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatus4Choice", propOrder = {
    "sts",
    "canc",
    "condlyAccptd",
    "rjctd",
    "sspd",
    "inRpr",
    "prtlySttld"
})
public class OrderStatus4Choice {

    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected OrderStatus4Code sts;
    @XmlElement(name = "Canc")
    protected CancelledStatusReason16 canc;
    @XmlElement(name = "CondlyAccptd")
    protected ConditionallyAcceptedStatus3Choice condlyAccptd;
    @XmlElement(name = "Rjctd")
    protected List<RejectedStatus9> rjctd;
    @XmlElement(name = "Sspd")
    protected SuspendedStatusReason4Choice sspd;
    @XmlElement(name = "InRpr")
    protected InRepairStatusReason4Choice inRpr;
    @XmlElement(name = "PrtlySttld")
    protected PartiallySettledStatus10 prtlySttld;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus4Code }
     *     
     */
    public OrderStatus4Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus4Code }
     *     
     */
    public OrderStatus4Choice setSts(OrderStatus4Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatusReason16 }
     *     
     */
    public CancelledStatusReason16 getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatusReason16 }
     *     
     */
    public OrderStatus4Choice setCanc(CancelledStatusReason16 value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the condlyAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionallyAcceptedStatus3Choice }
     *     
     */
    public ConditionallyAcceptedStatus3Choice getCondlyAccptd() {
        return condlyAccptd;
    }

    /**
     * Sets the value of the condlyAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionallyAcceptedStatus3Choice }
     *     
     */
    public OrderStatus4Choice setCondlyAccptd(ConditionallyAcceptedStatus3Choice value) {
        this.condlyAccptd = value;
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
     * {@link RejectedStatus9 }
     * 
     * 
     * @return
     *     The value of the rjctd property.
     */
    public List<RejectedStatus9> getRjctd() {
        if (rjctd == null) {
            rjctd = new ArrayList<>();
        }
        return this.rjctd;
    }

    /**
     * Gets the value of the sspd property.
     * 
     * @return
     *     possible object is
     *     {@link SuspendedStatusReason4Choice }
     *     
     */
    public SuspendedStatusReason4Choice getSspd() {
        return sspd;
    }

    /**
     * Sets the value of the sspd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuspendedStatusReason4Choice }
     *     
     */
    public OrderStatus4Choice setSspd(SuspendedStatusReason4Choice value) {
        this.sspd = value;
        return this;
    }

    /**
     * Gets the value of the inRpr property.
     * 
     * @return
     *     possible object is
     *     {@link InRepairStatusReason4Choice }
     *     
     */
    public InRepairStatusReason4Choice getInRpr() {
        return inRpr;
    }

    /**
     * Sets the value of the inRpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InRepairStatusReason4Choice }
     *     
     */
    public OrderStatus4Choice setInRpr(InRepairStatusReason4Choice value) {
        this.inRpr = value;
        return this;
    }

    /**
     * Gets the value of the prtlySttld property.
     * 
     * @return
     *     possible object is
     *     {@link PartiallySettledStatus10 }
     *     
     */
    public PartiallySettledStatus10 getPrtlySttld() {
        return prtlySttld;
    }

    /**
     * Sets the value of the prtlySttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartiallySettledStatus10 }
     *     
     */
    public OrderStatus4Choice setPrtlySttld(PartiallySettledStatus10 value) {
        this.prtlySttld = value;
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
     * Adds a new item to the rjctd list.
     * @see #getRjctd()
     * 
     */
    public OrderStatus4Choice addRjctd(RejectedStatus9 rjctd) {
        getRjctd().add(rjctd);
        return this;
    }

}
