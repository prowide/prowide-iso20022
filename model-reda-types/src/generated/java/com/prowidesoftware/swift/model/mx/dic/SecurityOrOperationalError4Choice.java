
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
 * Provides the financial instruments details or the operational error details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityOrOperationalError4Choice", propOrder = {
    "sctyRptOrBizErr",
    "oprlErr"
})
public class SecurityOrOperationalError4Choice {

    @XmlElement(name = "SctyRptOrBizErr")
    protected SecurityOrBusinessError4Choice sctyRptOrBizErr;
    @XmlElement(name = "OprlErr")
    protected List<ErrorHandling5> oprlErr;

    /**
     * Gets the value of the sctyRptOrBizErr property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityOrBusinessError4Choice }
     *     
     */
    public SecurityOrBusinessError4Choice getSctyRptOrBizErr() {
        return sctyRptOrBizErr;
    }

    /**
     * Sets the value of the sctyRptOrBizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityOrBusinessError4Choice }
     *     
     */
    public SecurityOrOperationalError4Choice setSctyRptOrBizErr(SecurityOrBusinessError4Choice value) {
        this.sctyRptOrBizErr = value;
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
    public SecurityOrOperationalError4Choice addOprlErr(ErrorHandling5 oprlErr) {
        getOprlErr().add(oprlErr);
        return this;
    }

}
