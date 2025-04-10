
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Content of the Play Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevicePlayResourceRequest1", propOrder = {
    "rspnMd",
    "rsrcActn",
    "soundVol",
    "dispRsltn",
    "rsrc",
    "tmgSlot"
})
public class DevicePlayResourceRequest1 {

    @XmlElement(name = "RspnMd")
    @XmlSchemaType(name = "string")
    protected ResponseMode2Code rspnMd;
    @XmlElement(name = "RsrcActn", required = true)
    @XmlSchemaType(name = "string")
    protected ResourceAction1Code rsrcActn;
    @XmlElement(name = "SoundVol")
    protected BigDecimal soundVol;
    @XmlElement(name = "DispRsltn")
    protected String dispRsltn;
    @XmlElement(name = "Rsrc")
    protected ResourceContent1 rsrc;
    @XmlElement(name = "TmgSlot")
    @XmlSchemaType(name = "string")
    protected ProcessingPosition2Code tmgSlot;

    /**
     * Gets the value of the rspnMd property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMode2Code }
     *     
     */
    public ResponseMode2Code getRspnMd() {
        return rspnMd;
    }

    /**
     * Sets the value of the rspnMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMode2Code }
     *     
     */
    public DevicePlayResourceRequest1 setRspnMd(ResponseMode2Code value) {
        this.rspnMd = value;
        return this;
    }

    /**
     * Gets the value of the rsrcActn property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAction1Code }
     *     
     */
    public ResourceAction1Code getRsrcActn() {
        return rsrcActn;
    }

    /**
     * Sets the value of the rsrcActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAction1Code }
     *     
     */
    public DevicePlayResourceRequest1 setRsrcActn(ResourceAction1Code value) {
        this.rsrcActn = value;
        return this;
    }

    /**
     * Gets the value of the soundVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSoundVol() {
        return soundVol;
    }

    /**
     * Sets the value of the soundVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DevicePlayResourceRequest1 setSoundVol(BigDecimal value) {
        this.soundVol = value;
        return this;
    }

    /**
     * Gets the value of the dispRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispRsltn() {
        return dispRsltn;
    }

    /**
     * Sets the value of the dispRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DevicePlayResourceRequest1 setDispRsltn(String value) {
        this.dispRsltn = value;
        return this;
    }

    /**
     * Gets the value of the rsrc property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceContent1 }
     *     
     */
    public ResourceContent1 getRsrc() {
        return rsrc;
    }

    /**
     * Sets the value of the rsrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceContent1 }
     *     
     */
    public DevicePlayResourceRequest1 setRsrc(ResourceContent1 value) {
        this.rsrc = value;
        return this;
    }

    /**
     * Gets the value of the tmgSlot property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition2Code }
     *     
     */
    public ProcessingPosition2Code getTmgSlot() {
        return tmgSlot;
    }

    /**
     * Sets the value of the tmgSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition2Code }
     *     
     */
    public DevicePlayResourceRequest1 setTmgSlot(ProcessingPosition2Code value) {
        this.tmgSlot = value;
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
