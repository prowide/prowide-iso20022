
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
 * The IdentificationVerificationRequest message is sent by an assigner to an assignee. It is used to request the verification of party and/or account identification information.
 * Usage
 * The IdentificationVerificationRequest message is sent before the sending of one or several transactions messages.
 * The IdentificationVerificationRequest message can contain one or more verification requests.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationVerificationRequestV01", propOrder = {
    "assgnmt",
    "vrfctn"
})
public class IdentificationVerificationRequestV01 {

    @XmlElement(name = "Assgnmt", required = true)
    protected IdentificationAssignment1 assgnmt;
    @XmlElement(name = "Vrfctn", required = true)
    protected List<IdentificationVerification1> vrfctn;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationAssignment1 }
     *     
     */
    public IdentificationAssignment1 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationAssignment1 }
     *     
     */
    public IdentificationVerificationRequestV01 setAssgnmt(IdentificationAssignment1 value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the vrfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vrfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVrfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationVerification1 }
     * 
     * 
     */
    public List<IdentificationVerification1> getVrfctn() {
        if (vrfctn == null) {
            vrfctn = new ArrayList<IdentificationVerification1>();
        }
        return this.vrfctn;
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
     * Adds a new item to the vrfctn list.
     * @see #getVrfctn()
     * 
     */
    public IdentificationVerificationRequestV01 addVrfctn(IdentificationVerification1 vrfctn) {
        getVrfctn().add(vrfctn);
        return this;
    }

}
