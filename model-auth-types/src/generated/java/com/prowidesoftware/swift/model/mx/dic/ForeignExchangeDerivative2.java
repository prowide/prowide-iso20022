
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
 * Foreign Exchange Derivative which is either deliverable or non-deliverable.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeDerivative2", propOrder = {
    "ctrctSubTp"
})
public class ForeignExchangeDerivative2 {

    @XmlElement(name = "CtrctSubTp", required = true)
    @XmlSchemaType(name = "string")
    protected AssetClassSubProductType19Code ctrctSubTp;

    /**
     * Gets the value of the ctrctSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassSubProductType19Code }
     *     
     */
    public AssetClassSubProductType19Code getCtrctSubTp() {
        return ctrctSubTp;
    }

    /**
     * Sets the value of the ctrctSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassSubProductType19Code }
     *     
     */
    public ForeignExchangeDerivative2 setCtrctSubTp(AssetClassSubProductType19Code value) {
        this.ctrctSubTp = value;
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
