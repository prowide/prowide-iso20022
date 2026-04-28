
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Overall position, in a single security, held in a securities account at a specified place of safekeeping.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateBalanceInformation34__1", propOrder = {
    "balDt",
    "finInstrmId",
    "aggtBal",
    "avlblBal",
    "notAvlblBal",
    "balBrkdwn"
})
public class AggregateBalanceInformation341 {

    @XmlElement(name = "BalDt", required = true)
    protected DateAndDateTime1Choice1 balDt;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification191 finInstrmId;
    @XmlElement(name = "AggtBal")
    protected Balance61 aggtBal;
    @XmlElement(name = "AvlblBal")
    protected Balance81 avlblBal;
    @XmlElement(name = "NotAvlblBal")
    protected BalanceQuantity8Choice1 notAvlblBal;
    @XmlElement(name = "BalBrkdwn")
    protected List<SubBalanceInformation151> balBrkdwn;

    /**
     * Gets the value of the balDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice1 }
     *     
     */
    public DateAndDateTime1Choice1 getBalDt() {
        return balDt;
    }

    /**
     * Sets the value of the balDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice1 }
     *     
     */
    public AggregateBalanceInformation341 setBalDt(DateAndDateTime1Choice1 value) {
        this.balDt = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification191 }
     *     
     */
    public SecurityIdentification191 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification191 }
     *     
     */
    public AggregateBalanceInformation341 setFinInstrmId(SecurityIdentification191 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the aggtBal property.
     * 
     * @return
     *     possible object is
     *     {@link Balance61 }
     *     
     */
    public Balance61 getAggtBal() {
        return aggtBal;
    }

    /**
     * Sets the value of the aggtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance61 }
     *     
     */
    public AggregateBalanceInformation341 setAggtBal(Balance61 value) {
        this.aggtBal = value;
        return this;
    }

    /**
     * Gets the value of the avlblBal property.
     * 
     * @return
     *     possible object is
     *     {@link Balance81 }
     *     
     */
    public Balance81 getAvlblBal() {
        return avlblBal;
    }

    /**
     * Sets the value of the avlblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance81 }
     *     
     */
    public AggregateBalanceInformation341 setAvlblBal(Balance81 value) {
        this.avlblBal = value;
        return this;
    }

    /**
     * Gets the value of the notAvlblBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity8Choice1 }
     *     
     */
    public BalanceQuantity8Choice1 getNotAvlblBal() {
        return notAvlblBal;
    }

    /**
     * Sets the value of the notAvlblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity8Choice1 }
     *     
     */
    public AggregateBalanceInformation341 setNotAvlblBal(BalanceQuantity8Choice1 value) {
        this.notAvlblBal = value;
        return this;
    }

    /**
     * Gets the value of the balBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubBalanceInformation151 }
     * 
     * 
     * @return
     *     The value of the balBrkdwn property.
     */
    public List<SubBalanceInformation151> getBalBrkdwn() {
        if (balBrkdwn == null) {
            balBrkdwn = new ArrayList<>();
        }
        return this.balBrkdwn;
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
     * Adds a new item to the balBrkdwn list.
     * @see #getBalBrkdwn()
     * 
     */
    public AggregateBalanceInformation341 addBalBrkdwn(SubBalanceInformation151 balBrkdwn) {
        getBalBrkdwn().add(balBrkdwn);
        return this;
    }

}
