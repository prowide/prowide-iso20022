
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
 * Acceptor parameters dedicated to the merchant.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantConfigurationParameters3", propOrder = {
    "actnTp",
    "mrchntId",
    "vrsn",
    "prxy",
    "othrParams"
})
public class MerchantConfigurationParameters3 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "MrchntId")
    protected String mrchntId;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "Prxy")
    protected NetworkParameters6 prxy;
    @XmlElement(name = "OthrParams")
    protected byte[] othrParams;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public MerchantConfigurationParameters3 setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
        return this;
    }

    /**
     * Gets the value of the mrchntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntId() {
        return mrchntId;
    }

    /**
     * Sets the value of the mrchntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MerchantConfigurationParameters3 setMrchntId(String value) {
        this.mrchntId = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MerchantConfigurationParameters3 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters6 }
     *     
     */
    public NetworkParameters6 getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters6 }
     *     
     */
    public MerchantConfigurationParameters3 setPrxy(NetworkParameters6 value) {
        this.prxy = value;
        return this;
    }

    /**
     * Gets the value of the othrParams property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOthrParams() {
        return othrParams;
    }

    /**
     * Sets the value of the othrParams property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public MerchantConfigurationParameters3 setOthrParams(byte[] value) {
        this.othrParams = value;
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
