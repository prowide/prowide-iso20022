
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
 * Details about business information related to a system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralBusinessInformation1", propOrder = {
    "qlfr",
    "sbjt",
    "sbjtDtls"
})
public class GeneralBusinessInformation1 {

    @XmlElement(name = "Qlfr")
    protected InformationQualifierType1 qlfr;
    @XmlElement(name = "Sbjt")
    protected String sbjt;
    @XmlElement(name = "SbjtDtls")
    protected String sbjtDtls;

    /**
     * Gets the value of the qlfr property.
     * 
     * @return
     *     possible object is
     *     {@link InformationQualifierType1 }
     *     
     */
    public InformationQualifierType1 getQlfr() {
        return qlfr;
    }

    /**
     * Sets the value of the qlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationQualifierType1 }
     *     
     */
    public GeneralBusinessInformation1 setQlfr(InformationQualifierType1 value) {
        this.qlfr = value;
        return this;
    }

    /**
     * Gets the value of the sbjt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbjt() {
        return sbjt;
    }

    /**
     * Sets the value of the sbjt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeneralBusinessInformation1 setSbjt(String value) {
        this.sbjt = value;
        return this;
    }

    /**
     * Gets the value of the sbjtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbjtDtls() {
        return sbjtDtls;
    }

    /**
     * Sets the value of the sbjtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeneralBusinessInformation1 setSbjtDtls(String value) {
        this.sbjtDtls = value;
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
