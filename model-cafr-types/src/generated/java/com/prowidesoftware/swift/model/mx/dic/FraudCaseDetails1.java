
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
 * Details of fraudulent case.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudCaseDetails1", propOrder = {
    "mktSgmt",
    "lctrNb",
    "caseRef",
    "arrstInd"
})
public class FraudCaseDetails1 {

    @XmlElement(name = "MktSgmt")
    protected String mktSgmt;
    @XmlElement(name = "LctrNb")
    protected String lctrNb;
    @XmlElement(name = "CaseRef")
    protected String caseRef;
    @XmlElement(name = "ArrstInd")
    protected Boolean arrstInd;

    /**
     * Gets the value of the mktSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktSgmt() {
        return mktSgmt;
    }

    /**
     * Sets the value of the mktSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FraudCaseDetails1 setMktSgmt(String value) {
        this.mktSgmt = value;
        return this;
    }

    /**
     * Gets the value of the lctrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctrNb() {
        return lctrNb;
    }

    /**
     * Sets the value of the lctrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FraudCaseDetails1 setLctrNb(String value) {
        this.lctrNb = value;
        return this;
    }

    /**
     * Gets the value of the caseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseRef() {
        return caseRef;
    }

    /**
     * Sets the value of the caseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FraudCaseDetails1 setCaseRef(String value) {
        this.caseRef = value;
        return this;
    }

    /**
     * Gets the value of the arrstInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArrstInd() {
        return arrstInd;
    }

    /**
     * Sets the value of the arrstInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FraudCaseDetails1 setArrstInd(Boolean value) {
        this.arrstInd = value;
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
