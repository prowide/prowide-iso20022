
package com.prowidesoftware.swift.model.mx.dic;

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
 * Status report of a bulk or multiple or switch order that was previously received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusAndReason3", propOrder = {
    "sts",
    "canc",
    "condlyAccptd",
    "rjctd",
    "sspd",
    "stsInitr",
    "swtchOrdrLegId"
})
public class OrderStatusAndReason3 {

    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected OrderStatus2Code sts;
    @XmlElement(name = "Canc")
    protected CancelledStatus1 canc;
    @XmlElement(name = "CondlyAccptd")
    protected ConditionallyAcceptedStatus1 condlyAccptd;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus3 rjctd;
    @XmlElement(name = "Sspd")
    protected SuspendedStatus1 sspd;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification2Choice stsInitr;
    @XmlElement(name = "SwtchOrdrLegId")
    protected String swtchOrdrLegId;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus2Code }
     *     
     */
    public OrderStatus2Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus2Code }
     *     
     */
    public OrderStatusAndReason3 setSts(OrderStatus2Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the canc property.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus1 }
     *     
     */
    public CancelledStatus1 getCanc() {
        return canc;
    }

    /**
     * Sets the value of the canc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus1 }
     *     
     */
    public OrderStatusAndReason3 setCanc(CancelledStatus1 value) {
        this.canc = value;
        return this;
    }

    /**
     * Gets the value of the condlyAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionallyAcceptedStatus1 }
     *     
     */
    public ConditionallyAcceptedStatus1 getCondlyAccptd() {
        return condlyAccptd;
    }

    /**
     * Sets the value of the condlyAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionallyAcceptedStatus1 }
     *     
     */
    public OrderStatusAndReason3 setCondlyAccptd(ConditionallyAcceptedStatus1 value) {
        this.condlyAccptd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus3 }
     *     
     */
    public RejectedStatus3 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus3 }
     *     
     */
    public OrderStatusAndReason3 setRjctd(RejectedStatus3 value) {
        this.rjctd = value;
        return this;
    }

    /**
     * Gets the value of the sspd property.
     * 
     * @return
     *     possible object is
     *     {@link SuspendedStatus1 }
     *     
     */
    public SuspendedStatus1 getSspd() {
        return sspd;
    }

    /**
     * Sets the value of the sspd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuspendedStatus1 }
     *     
     */
    public OrderStatusAndReason3 setSspd(SuspendedStatus1 value) {
        this.sspd = value;
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
    public OrderStatusAndReason3 setStsInitr(PartyIdentification2Choice value) {
        this.stsInitr = value;
        return this;
    }

    /**
     * Gets the value of the swtchOrdrLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwtchOrdrLegId() {
        return swtchOrdrLegId;
    }

    /**
     * Sets the value of the swtchOrdrLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderStatusAndReason3 setSwtchOrdrLegId(String value) {
        this.swtchOrdrLegId = value;
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

}
