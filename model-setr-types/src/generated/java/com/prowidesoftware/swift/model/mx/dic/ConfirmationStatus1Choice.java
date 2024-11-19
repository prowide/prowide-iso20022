
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
 * Status of the confirmation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationStatus1Choice", propOrder = {
    "confRjctd",
    "amdmntRjctd",
    "sts"
})
public class ConfirmationStatus1Choice {

    @XmlElement(name = "ConfRjctd")
    protected List<ConfirmationRejectedStatus2> confRjctd;
    @XmlElement(name = "AmdmntRjctd")
    protected List<ConfirmationRejectedStatus2> amdmntRjctd;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected OrderConfirmationStatus1Code sts;

    /**
     * Gets the value of the confRjctd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the confRjctd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfRjctd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmationRejectedStatus2 }
     * 
     * 
     * @return
     *     The value of the confRjctd property.
     */
    public List<ConfirmationRejectedStatus2> getConfRjctd() {
        if (confRjctd == null) {
            confRjctd = new ArrayList<>();
        }
        return this.confRjctd;
    }

    /**
     * Gets the value of the amdmntRjctd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the amdmntRjctd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmdmntRjctd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmationRejectedStatus2 }
     * 
     * 
     * @return
     *     The value of the amdmntRjctd property.
     */
    public List<ConfirmationRejectedStatus2> getAmdmntRjctd() {
        if (amdmntRjctd == null) {
            amdmntRjctd = new ArrayList<>();
        }
        return this.amdmntRjctd;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderConfirmationStatus1Code }
     *     
     */
    public OrderConfirmationStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderConfirmationStatus1Code }
     *     
     */
    public ConfirmationStatus1Choice setSts(OrderConfirmationStatus1Code value) {
        this.sts = value;
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
     * Adds a new item to the confRjctd list.
     * @see #getConfRjctd()
     * 
     */
    public ConfirmationStatus1Choice addConfRjctd(ConfirmationRejectedStatus2 confRjctd) {
        getConfRjctd().add(confRjctd);
        return this;
    }

    /**
     * Adds a new item to the amdmntRjctd list.
     * @see #getAmdmntRjctd()
     * 
     */
    public ConfirmationStatus1Choice addAmdmntRjctd(ConfirmationRejectedStatus2 amdmntRjctd) {
        getAmdmntRjctd().add(amdmntRjctd);
        return this;
    }

}
