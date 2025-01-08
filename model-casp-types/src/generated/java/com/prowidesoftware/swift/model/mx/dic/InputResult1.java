
package com.prowidesoftware.swift.model.mx.dic;

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
 * Information related to the result the input.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputResult1", propOrder = {
    "dvcTp",
    "infQlfr",
    "inptRsltData"
})
public class InputResult1 {

    @XmlElement(name = "DvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected SaleCapabilities2Code dvcTp;
    @XmlElement(name = "InfQlfr", required = true)
    @XmlSchemaType(name = "string")
    protected InformationQualify1Code infQlfr;
    @XmlElement(name = "InptRsltData", required = true)
    protected InputResultData1 inptRsltData;

    /**
     * Gets the value of the dvcTp property.
     * 
     * @return
     *     possible object is
     *     {@link SaleCapabilities2Code }
     *     
     */
    public SaleCapabilities2Code getDvcTp() {
        return dvcTp;
    }

    /**
     * Sets the value of the dvcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleCapabilities2Code }
     *     
     */
    public InputResult1 setDvcTp(SaleCapabilities2Code value) {
        this.dvcTp = value;
        return this;
    }

    /**
     * Gets the value of the infQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link InformationQualify1Code }
     *     
     */
    public InformationQualify1Code getInfQlfr() {
        return infQlfr;
    }

    /**
     * Sets the value of the infQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationQualify1Code }
     *     
     */
    public InputResult1 setInfQlfr(InformationQualify1Code value) {
        this.infQlfr = value;
        return this;
    }

    /**
     * Gets the value of the inptRsltData property.
     * 
     * @return
     *     possible object is
     *     {@link InputResultData1 }
     *     
     */
    public InputResultData1 getInptRsltData() {
        return inptRsltData;
    }

    /**
     * Sets the value of the inptRsltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputResultData1 }
     *     
     */
    public InputResult1 setInptRsltData(InputResultData1 value) {
        this.inptRsltData = value;
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
