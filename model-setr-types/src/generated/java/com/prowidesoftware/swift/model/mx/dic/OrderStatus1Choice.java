
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
 * Choice of status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatus1Choice", propOrder = {
    "sts",
    "canc",
    "condlyAccptd",
    "rjctd",
    "sspd",
    "prtlySttld"
})
public class OrderStatus1Choice {

    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected OrderStatus5Code sts;
    @XmlElement(name = "Canc")
    protected CancelledStatusReason1Choice canc;
    @XmlElement(name = "CondlyAccptd")
    protected List<ConditionallyAcceptedStatusReason1Choice> condlyAccptd;
    @XmlElement(name = "Rjctd")
    protected List<RejectedStatusReason1Choice> rjctd;
    @XmlElement(name = "Sspd")
    protected SuspendedStatusReasonChoice sspd;
    @XmlElement(name = "PrtlySttld")
    protected PartiallySettledStatus2 prtlySttld;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus5Code }
     *     
     */
    public OrderStatus5Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus5Code }
     *     
     */
    public OrderStatus1Choice setSts(OrderStatus5Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatusReason1Choice }
     *     
     */
    public CancelledStatusReason1Choice getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatusReason1Choice }
     *     
     */
    public OrderStatus1Choice setCanc(CancelledStatusReason1Choice value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the condlyAccptd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condlyAccptd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondlyAccptd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionallyAcceptedStatusReason1Choice }
     * 
     * 
     */
    public List<ConditionallyAcceptedStatusReason1Choice> getCondlyAccptd() {
        if (condlyAccptd == null) {
            condlyAccptd = new ArrayList<ConditionallyAcceptedStatusReason1Choice>();
        }
        return this.condlyAccptd;
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
     * {@link RejectedStatusReason1Choice }
     * 
     * 
     */
    public List<RejectedStatusReason1Choice> getRjctd() {
        if (rjctd == null) {
            rjctd = new ArrayList<RejectedStatusReason1Choice>();
        }
        return this.rjctd;
    }

    /**
     * Gets the value of the sspd property.
     * 
     * @return
     *     possible object is
     *     {@link SuspendedStatusReasonChoice }
     *     
     */
    public SuspendedStatusReasonChoice getSspd() {
        return sspd;
    }

    /**
     * Sets the value of the sspd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuspendedStatusReasonChoice }
     *     
     */
    public OrderStatus1Choice setSspd(SuspendedStatusReasonChoice value) {
        this.sspd = value;
        return this;
    }

    /**
     * Gets the value of the prtlySttld property.
     * 
     * @return
     *     possible object is
     *     {@link PartiallySettledStatus2 }
     *     
     */
    public PartiallySettledStatus2 getPrtlySttld() {
        return prtlySttld;
    }

    /**
     * Sets the value of the prtlySttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartiallySettledStatus2 }
     *     
     */
    public OrderStatus1Choice setPrtlySttld(PartiallySettledStatus2 value) {
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
     * Adds a new item to the condlyAccptd list.
     * @see #getCondlyAccptd()
     * 
     */
    public OrderStatus1Choice addCondlyAccptd(ConditionallyAcceptedStatusReason1Choice condlyAccptd) {
        getCondlyAccptd().add(condlyAccptd);
        return this;
    }

    /**
     * Adds a new item to the rjctd list.
     * @see #getRjctd()
     * 
     */
    public OrderStatus1Choice addRjctd(RejectedStatusReason1Choice rjctd) {
        getRjctd().add(rjctd);
        return this;
    }

}
