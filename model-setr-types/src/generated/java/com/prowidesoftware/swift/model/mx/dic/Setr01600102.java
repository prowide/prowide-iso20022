
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
 * Scope
 * The OrderInstructionStatusReport is sent by an executing party, eg, a transfer agent, to an instructing party, eg, an investment manager or its authorised representative. There may be one or more intermediary parties between the executing party and the instructing party. The intermediary party is, for example, an intermediary or a concentrator.
 * This message reports the status of an order from the time the executing party receives the order until the order is executed.
 * Usage
 * The OrderInstructionStatusReport message is sent by an executing party to the instructing party to report on the status of a subscription, redemption or a switch order.
 * The message can be used to report one of the following:
 * - a received status, or
 * - an accepted status, or
 * - a sent to next party status, or
 * - an already executed status, or
 * - a cancelled status, or
 * - a conditionally accepted status, or
 * - a rejected status, or
 * - a suspended status, or
 * - an in-repair status (at the individual order level only), or
 * - repaired conditions (at the individual order level only).
 * For subscription and redemption orders, the OrderInstructionStatusReport message covers both bulk and multiple categories of orders, and this message may provide the status either at the bulk or at the individual level.
 * For a switch order, this message provides the status of the whole order, ie, it is not possible to accept one leg and to reject the other leg, the entire switch order has to be rejected. In order to identify which leg within the switch is causing a problem, the redemption or subscription leg identification is used.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setr.016.001.02", propOrder = {
    "othrRef",
    "rltdRef",
    "mstrRef",
    "ordrDtlsRpt",
    "indvOrdrDtlsRpt"
})
public class Setr01600102 {

    @XmlElement(name = "OthrRef")
    protected List<AdditionalReference3> othrRef;
    @XmlElement(name = "RltdRef")
    protected List<AdditionalReference3> rltdRef;
    @XmlElement(name = "MstrRef")
    protected AdditionalReference3 mstrRef;
    @XmlElement(name = "OrdrDtlsRpt")
    protected OrderStatusAndReason3 ordrDtlsRpt;
    @XmlElement(name = "IndvOrdrDtlsRpt")
    protected List<IndividualOrderStatusAndReason1> indvOrdrDtlsRpt;

    /**
     * Gets the value of the othrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReference3 }
     * 
     * 
     */
    public List<AdditionalReference3> getOthrRef() {
        if (othrRef == null) {
            othrRef = new ArrayList<AdditionalReference3>();
        }
        return this.othrRef;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReference3 }
     * 
     * 
     */
    public List<AdditionalReference3> getRltdRef() {
        if (rltdRef == null) {
            rltdRef = new ArrayList<AdditionalReference3>();
        }
        return this.rltdRef;
    }

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public Setr01600102 setMstrRef(AdditionalReference3 value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtlsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusAndReason3 }
     *     
     */
    public OrderStatusAndReason3 getOrdrDtlsRpt() {
        return ordrDtlsRpt;
    }

    /**
     * Sets the value of the ordrDtlsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusAndReason3 }
     *     
     */
    public Setr01600102 setOrdrDtlsRpt(OrderStatusAndReason3 value) {
        this.ordrDtlsRpt = value;
        return this;
    }

    /**
     * Gets the value of the indvOrdrDtlsRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indvOrdrDtlsRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvOrdrDtlsRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualOrderStatusAndReason1 }
     * 
     * 
     */
    public List<IndividualOrderStatusAndReason1> getIndvOrdrDtlsRpt() {
        if (indvOrdrDtlsRpt == null) {
            indvOrdrDtlsRpt = new ArrayList<IndividualOrderStatusAndReason1>();
        }
        return this.indvOrdrDtlsRpt;
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
     * Adds a new item to the othrRef list.
     * @see #getOthrRef()
     * 
     */
    public Setr01600102 addOthrRef(AdditionalReference3 othrRef) {
        getOthrRef().add(othrRef);
        return this;
    }

    /**
     * Adds a new item to the rltdRef list.
     * @see #getRltdRef()
     * 
     */
    public Setr01600102 addRltdRef(AdditionalReference3 rltdRef) {
        getRltdRef().add(rltdRef);
        return this;
    }

    /**
     * Adds a new item to the indvOrdrDtlsRpt list.
     * @see #getIndvOrdrDtlsRpt()
     * 
     */
    public Setr01600102 addIndvOrdrDtlsRpt(IndividualOrderStatusAndReason1 indvOrdrDtlsRpt) {
        getIndvOrdrDtlsRpt().add(indvOrdrDtlsRpt);
        return this;
    }

}
