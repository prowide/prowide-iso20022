
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
 * Attributes of non-financial instrument of type foreign exchange as underlying.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeForeignExchange3", propOrder = {
    "fxTp",
    "othrNtnlCcy"
})
public class DerivativeForeignExchange3 {

    @XmlElement(name = "FxTp")
    @XmlSchemaType(name = "string")
    protected AssetFXSubProductType1Code fxTp;
    @XmlElement(name = "OthrNtnlCcy")
    protected String othrNtnlCcy;

    /**
     * Gets the value of the fxTp property.
     * 
     * @return
     *     possible object is
     *     {@link AssetFXSubProductType1Code }
     *     
     */
    public AssetFXSubProductType1Code getFxTp() {
        return fxTp;
    }

    /**
     * Sets the value of the fxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetFXSubProductType1Code }
     *     
     */
    public DerivativeForeignExchange3 setFxTp(AssetFXSubProductType1Code value) {
        this.fxTp = value;
        return this;
    }

    /**
     * Gets the value of the othrNtnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrNtnlCcy() {
        return othrNtnlCcy;
    }

    /**
     * Sets the value of the othrNtnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DerivativeForeignExchange3 setOthrNtnlCcy(String value) {
        this.othrNtnlCcy = value;
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
