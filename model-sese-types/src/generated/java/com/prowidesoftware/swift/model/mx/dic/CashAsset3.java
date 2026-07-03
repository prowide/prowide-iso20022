
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
 * Identification of a cash asset.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAsset3", propOrder = {
    "cshAsstTp",
    "hldgCcy",
    "trfCcy",
    "addtlInf"
})
public class CashAsset3 {

    @XmlElement(name = "CshAsstTp", required = true)
    protected CashAssetType1Choice cshAsstTp;
    @XmlElement(name = "HldgCcy", required = true)
    protected String hldgCcy;
    @XmlElement(name = "TrfCcy")
    protected String trfCcy;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation15 addtlInf;

    /**
     * Gets the value of the cshAsstTp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAssetType1Choice }
     *     
     */
    public CashAssetType1Choice getCshAsstTp() {
        return cshAsstTp;
    }

    /**
     * Sets the value of the cshAsstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAssetType1Choice }
     *     
     */
    public CashAsset3 setCshAsstTp(CashAssetType1Choice value) {
        this.cshAsstTp = value;
        return this;
    }

    /**
     * Gets the value of the hldgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHldgCcy() {
        return hldgCcy;
    }

    /**
     * Sets the value of the hldgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAsset3 setHldgCcy(String value) {
        this.hldgCcy = value;
        return this;
    }

    /**
     * Gets the value of the trfCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfCcy() {
        return trfCcy;
    }

    /**
     * Sets the value of the trfCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAsset3 setTrfCcy(String value) {
        this.trfCcy = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public AdditionalInformation15 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public CashAsset3 setAddtlInf(AdditionalInformation15 value) {
        this.addtlInf = value;
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
