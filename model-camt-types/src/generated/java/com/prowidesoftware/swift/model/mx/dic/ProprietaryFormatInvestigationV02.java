
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The Proprietary Format Investigation message type is used by financial institutions, with their own offices, and/or with other financial institutions with which they have established bilateral agreements.
 * Usage
 * The user should ensure that an existing standard message cannot be used before using the proprietary message.
 * As defined in the scope, this ProprietaryFormatInvestigation message may only be used when bilaterally agreed.
 * It is used as an envelope for a non standard message and provides means to manage an exception or investigation which falls outside the scope or capability of any other formatted message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietaryFormatInvestigationV02", propOrder = {
    "assgnmt",
    "_case",
    "prtryData"
})
public class ProprietaryFormatInvestigationV02 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment2 assgnmt;
    @XmlElement(name = "Case", required = true)
    protected Case2 _case;
    @XmlElement(name = "PrtryData", required = true)
    protected ProprietaryData4 prtryData;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment2 }
     *     
     */
    public CaseAssignment2 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment2 }
     *     
     */
    public ProprietaryFormatInvestigationV02 setAssgnmt(CaseAssignment2 value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case2 }
     *     
     */
    public Case2 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case2 }
     *     
     */
    public ProprietaryFormatInvestigationV02 setCase(Case2 value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the prtryData property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryData4 }
     *     
     */
    public ProprietaryData4 getPrtryData() {
        return prtryData;
    }

    /**
     * Sets the value of the prtryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryData4 }
     *     
     */
    public ProprietaryFormatInvestigationV02 setPrtryData(ProprietaryData4 value) {
        this.prtryData = value;
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
