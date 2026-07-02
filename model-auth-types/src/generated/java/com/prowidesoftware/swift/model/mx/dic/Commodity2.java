
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
 * Financial instrument representing ownership of an amount of a commodity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commodity2", propOrder = {
    "mktVal",
    "cmmdtyTp"
})
public class Commodity2 {

    @XmlElement(name = "MktVal", required = true)
    protected ActiveCurrencyAnd24Amount mktVal;
    @XmlElement(name = "CmmdtyTp", required = true)
    protected AssetClassDetailedSubProductType1Choice cmmdtyTp;

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public ActiveCurrencyAnd24Amount getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public Commodity2 setMktVal(ActiveCurrencyAnd24Amount value) {
        this.mktVal = value;
        return this;
    }

    /**
     * Gets the value of the cmmdtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassDetailedSubProductType1Choice }
     *     
     */
    public AssetClassDetailedSubProductType1Choice getCmmdtyTp() {
        return cmmdtyTp;
    }

    /**
     * Sets the value of the cmmdtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassDetailedSubProductType1Choice }
     *     
     */
    public Commodity2 setCmmdtyTp(AssetClassDetailedSubProductType1Choice value) {
        this.cmmdtyTp = value;
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
