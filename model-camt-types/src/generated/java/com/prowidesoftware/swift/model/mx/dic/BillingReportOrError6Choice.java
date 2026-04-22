
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
 * Choice between report on billing data, billing cancellation request details or operational error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingReportOrError6Choice", propOrder = {
    "bllgRpt",
    "cxlRpt",
    "oprlErr"
})
public class BillingReportOrError6Choice {

    @XmlElement(name = "BllgRpt")
    protected BillingReport6 bllgRpt;
    @XmlElement(name = "CxlRpt")
    protected BillingCancellationReport3 cxlRpt;
    @XmlElement(name = "OprlErr")
    protected List<ErrorHandling5> oprlErr;

    /**
     * Gets the value of the bllgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link BillingReport6 }
     *     
     */
    public BillingReport6 getBllgRpt() {
        return bllgRpt;
    }

    /**
     * Sets the value of the bllgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingReport6 }
     *     
     */
    public BillingReportOrError6Choice setBllgRpt(BillingReport6 value) {
        this.bllgRpt = value;
        return this;
    }

    /**
     * Gets the value of the cxlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link BillingCancellationReport3 }
     *     
     */
    public BillingCancellationReport3 getCxlRpt() {
        return cxlRpt;
    }

    /**
     * Sets the value of the cxlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingCancellationReport3 }
     *     
     */
    public BillingReportOrError6Choice setCxlRpt(BillingCancellationReport3 value) {
        this.cxlRpt = value;
        return this;
    }

    /**
     * Gets the value of the oprlErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the oprlErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOprlErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorHandling5 }
     * 
     * 
     * @return
     *     The value of the oprlErr property.
     */
    public List<ErrorHandling5> getOprlErr() {
        if (oprlErr == null) {
            oprlErr = new ArrayList<>();
        }
        return this.oprlErr;
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
     * Adds a new item to the oprlErr list.
     * @see #getOprlErr()
     * 
     */
    public BillingReportOrError6Choice addOprlErr(ErrorHandling5 oprlErr) {
        getOprlErr().add(oprlErr);
        return this;
    }

}
