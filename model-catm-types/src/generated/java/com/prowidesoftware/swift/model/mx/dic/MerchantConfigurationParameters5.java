
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
 * Acceptor parameters dedicated to the merchant.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantConfigurationParameters5", propOrder = {
    "actnTp",
    "mrchntId",
    "vrsn",
    "paramFrmtIdr",
    "prxy",
    "othrParams"
})
public class MerchantConfigurationParameters5 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "MrchntId")
    protected String mrchntId;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "ParamFrmtIdr")
    protected String paramFrmtIdr;
    @XmlElement(name = "Prxy")
    protected NetworkParameters8 prxy;
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
    public MerchantConfigurationParameters5 setActnTp(TerminalManagementAction3Code value) {
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
    public MerchantConfigurationParameters5 setMrchntId(String value) {
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
    public MerchantConfigurationParameters5 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the paramFrmtIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamFrmtIdr() {
        return paramFrmtIdr;
    }

    /**
     * Sets the value of the paramFrmtIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MerchantConfigurationParameters5 setParamFrmtIdr(String value) {
        this.paramFrmtIdr = value;
        return this;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters8 }
     *     
     */
    public NetworkParameters8 getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters8 }
     *     
     */
    public MerchantConfigurationParameters5 setPrxy(NetworkParameters8 value) {
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
    public MerchantConfigurationParameters5 setOthrParams(byte[] value) {
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
