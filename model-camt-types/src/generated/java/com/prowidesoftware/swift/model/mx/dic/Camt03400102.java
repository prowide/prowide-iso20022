
package com.prowidesoftware.swift.model.mx.dic;

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
 * The Duplicate message is used by financial institutions, with their own offices, and/or with other financial institutions with which they have established bilateral agreements. It allows to exchange duplicate payment instructions.
 * Usage
 * This message must be sent in response to a Request For Duplicate message.
 * The Duplicate Data element must contain a well formed XML document. This means XML special characters such as '<' must be used in a way that is consistent with XML well-formedness criteria..
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camt.034.001.02", propOrder = {
    "assgnmt",
    "_case",
    "dplctData"
})
public class Camt03400102 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment assgnmt;
    @XmlElement(name = "Case", required = true)
    protected Case _case;
    @XmlElement(name = "DplctData", required = true)
    protected ProprietaryData dplctData;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment }
     *     
     */
    public CaseAssignment getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment }
     *     
     */
    public Camt03400102 setAssgnmt(CaseAssignment value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case }
     *     
     */
    public Case getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case }
     *     
     */
    public Camt03400102 setCase(Case value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the dplctData property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryData }
     *     
     */
    public ProprietaryData getDplctData() {
        return dplctData;
    }

    /**
     * Sets the value of the dplctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryData }
     *     
     */
    public Camt03400102 setDplctData(ProprietaryData value) {
        this.dplctData = value;
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
