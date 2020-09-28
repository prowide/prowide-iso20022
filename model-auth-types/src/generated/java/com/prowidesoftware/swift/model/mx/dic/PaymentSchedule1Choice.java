
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
 * Choice between expected/due payment date and a payment schedule per amount and due date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSchedule1Choice", propOrder = {
    "dtRg",
    "subSchdl"
})
public class PaymentSchedule1Choice {

    @XmlElement(name = "DtRg")
    protected PaymentDateRange1 dtRg;
    @XmlElement(name = "SubSchdl")
    protected List<PaymentDateRange2> subSchdl;

    /**
     * Gets the value of the dtRg property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDateRange1 }
     *     
     */
    public PaymentDateRange1 getDtRg() {
        return dtRg;
    }

    /**
     * Sets the value of the dtRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDateRange1 }
     *     
     */
    public PaymentSchedule1Choice setDtRg(PaymentDateRange1 value) {
        this.dtRg = value;
        return this;
    }

    /**
     * Gets the value of the subSchdl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subSchdl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubSchdl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDateRange2 }
     * 
     * 
     */
    public List<PaymentDateRange2> getSubSchdl() {
        if (subSchdl == null) {
            subSchdl = new ArrayList<PaymentDateRange2>();
        }
        return this.subSchdl;
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
     * Adds a new item to the subSchdl list.
     * @see #getSubSchdl()
     * 
     */
    public PaymentSchedule1Choice addSubSchdl(PaymentDateRange2 subSchdl) {
        getSubSchdl().add(subSchdl);
        return this;
    }

}
