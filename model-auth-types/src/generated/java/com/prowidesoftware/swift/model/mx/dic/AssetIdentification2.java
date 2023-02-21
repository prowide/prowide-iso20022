
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
 * Identification of the asset held by the fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetIdentification2", propOrder = {
    "clssfctnTp",
    "instrmId",
    "asstLEI"
})
public class AssetIdentification2 {

    @XmlElement(name = "ClssfctnTp")
    protected String clssfctnTp;
    @XmlElement(name = "InstrmId")
    protected InstrumentIdentification4Choice instrmId;
    @XmlElement(name = "AsstLEI")
    protected String asstLEI;

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AssetIdentification2 setClssfctnTp(String value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the instrmId property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentIdentification4Choice }
     *     
     */
    public InstrumentIdentification4Choice getInstrmId() {
        return instrmId;
    }

    /**
     * Sets the value of the instrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentIdentification4Choice }
     *     
     */
    public AssetIdentification2 setInstrmId(InstrumentIdentification4Choice value) {
        this.instrmId = value;
        return this;
    }

    /**
     * Gets the value of the asstLEI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsstLEI() {
        return asstLEI;
    }

    /**
     * Sets the value of the asstLEI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AssetIdentification2 setAsstLEI(String value) {
        this.asstLEI = value;
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
