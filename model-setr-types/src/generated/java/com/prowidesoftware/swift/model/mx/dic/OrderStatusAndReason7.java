
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
 * Status report of a bulk or multiple or switch order that was previously received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusAndReason7", propOrder = {
    "mstrRef",
    "sts",
    "canc",
    "condlyAccptd",
    "rjctd",
    "sspd",
    "prtlySttld",
    "stsInitr"
})
public class OrderStatusAndReason7 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected OrderStatus4Code sts;
    @XmlElement(name = "Canc")
    protected CancelledStatus2 canc;
    @XmlElement(name = "CondlyAccptd")
    protected ConditionallyAcceptedStatus2 condlyAccptd;
    @XmlElement(name = "Rjctd")
    protected List<RejectedStatus6> rjctd;
    @XmlElement(name = "Sspd")
    protected SuspendedStatus2 sspd;
    @XmlElement(name = "PrtlySttld")
    protected PartiallySettledStatus1 prtlySttld;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification2Choice stsInitr;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderStatusAndReason7 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

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
    public OrderStatusAndReason7 setSts(OrderStatus4Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus2 }
     *     
     */
    public CancelledStatus2 getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus2 }
     *     
     */
    public OrderStatusAndReason7 setCanc(CancelledStatus2 value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the condlyAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionallyAcceptedStatus2 }
     *     
     */
    public ConditionallyAcceptedStatus2 getCondlyAccptd() {
        return condlyAccptd;
    }

    /**
     * Sets the value of the condlyAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionallyAcceptedStatus2 }
     *     
     */
    public OrderStatusAndReason7 setCondlyAccptd(ConditionallyAcceptedStatus2 value) {
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
     * {@link RejectedStatus6 }
     * 
     * 
     * @return
     *     The value of the rjctd property.
     */
    public List<RejectedStatus6> getRjctd() {
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
     *     {@link SuspendedStatus2 }
     *     
     */
    public SuspendedStatus2 getSspd() {
        return sspd;
    }

    /**
     * Sets the value of the sspd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuspendedStatus2 }
     *     
     */
    public OrderStatusAndReason7 setSspd(SuspendedStatus2 value) {
        this.sspd = value;
        return this;
    }

    /**
     * Gets the value of the prtlySttld property.
     * 
     * @return
     *     possible object is
     *     {@link PartiallySettledStatus1 }
     *     
     */
    public PartiallySettledStatus1 getPrtlySttld() {
        return prtlySttld;
    }

    /**
     * Sets the value of the prtlySttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartiallySettledStatus1 }
     *     
     */
    public OrderStatusAndReason7 setPrtlySttld(PartiallySettledStatus1 value) {
        this.prtlySttld = value;
        return this;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public OrderStatusAndReason7 setStsInitr(PartyIdentification2Choice value) {
        this.stsInitr = value;
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
    public OrderStatusAndReason7 addRjctd(RejectedStatus6 rjctd) {
        getRjctd().add(rjctd);
        return this;
    }

}
