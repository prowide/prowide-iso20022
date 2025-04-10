
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Source of funding
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundingSource2", propOrder = {
    "srcTp",
    "othrSrcTp",
    "ref"
})
public class FundingSource2 {

    @XmlElement(name = "SrcTp")
    @XmlSchemaType(name = "string")
    protected FundingSourceType2Code srcTp;
    @XmlElement(name = "OthrSrcTp")
    protected String othrSrcTp;
    @XmlElement(name = "Ref")
    protected String ref;

    /**
     * Gets the value of the srcTp property.
     * 
     * @return
     *     possible object is
     *     {@link FundingSourceType2Code }
     *     
     */
    public FundingSourceType2Code getSrcTp() {
        return srcTp;
    }

    /**
     * Sets the value of the srcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingSourceType2Code }
     *     
     */
    public FundingSource2 setSrcTp(FundingSourceType2Code value) {
        this.srcTp = value;
        return this;
    }

    /**
     * Gets the value of the othrSrcTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrSrcTp() {
        return othrSrcTp;
    }

    /**
     * Sets the value of the othrSrcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingSource2 setOthrSrcTp(String value) {
        this.othrSrcTp = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingSource2 setRef(String value) {
        this.ref = value;
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
