
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
 * Defines the criteria used to report on business information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralBusinessInformationReturnCriteria", propOrder = {
    "qlfrInd",
    "sbjtInd",
    "sbjtDtlsInd"
})
public class GeneralBusinessInformationReturnCriteria {

    @XmlElement(name = "QlfrInd")
    protected Boolean qlfrInd;
    @XmlElement(name = "SbjtInd")
    protected Boolean sbjtInd;
    @XmlElement(name = "SbjtDtlsInd")
    protected Boolean sbjtDtlsInd;

    /**
     * Gets the value of the qlfrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQlfrInd() {
        return qlfrInd;
    }

    /**
     * Sets the value of the qlfrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public GeneralBusinessInformationReturnCriteria setQlfrInd(Boolean value) {
        this.qlfrInd = value;
        return this;
    }

    /**
     * Gets the value of the sbjtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSbjtInd() {
        return sbjtInd;
    }

    /**
     * Sets the value of the sbjtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public GeneralBusinessInformationReturnCriteria setSbjtInd(Boolean value) {
        this.sbjtInd = value;
        return this;
    }

    /**
     * Gets the value of the sbjtDtlsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSbjtDtlsInd() {
        return sbjtDtlsInd;
    }

    /**
     * Sets the value of the sbjtDtlsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public GeneralBusinessInformationReturnCriteria setSbjtDtlsInd(Boolean value) {
        this.sbjtDtlsInd = value;
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
