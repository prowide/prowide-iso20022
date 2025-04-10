
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
 * Content of the Sound Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevicePlaySoundRequest1", propOrder = {
    "rspnMd",
    "soundActn",
    "soundVol",
    "soundCntt"
})
public class DevicePlaySoundRequest1 {

    @XmlElement(name = "RspnMd")
    @XmlSchemaType(name = "string")
    protected ResponseMode1Code rspnMd;
    @XmlElement(name = "SoundActn", required = true)
    @XmlSchemaType(name = "string")
    protected SoundAction1Code soundActn;
    @XmlElement(name = "SoundVol")
    protected BigDecimal soundVol;
    @XmlElement(name = "SoundCntt")
    protected SoundContent1 soundCntt;

    /**
     * Gets the value of the rspnMd property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMode1Code }
     *     
     */
    public ResponseMode1Code getRspnMd() {
        return rspnMd;
    }

    /**
     * Sets the value of the rspnMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMode1Code }
     *     
     */
    public DevicePlaySoundRequest1 setRspnMd(ResponseMode1Code value) {
        this.rspnMd = value;
        return this;
    }

    /**
     * Gets the value of the soundActn property.
     * 
     * @return
     *     possible object is
     *     {@link SoundAction1Code }
     *     
     */
    public SoundAction1Code getSoundActn() {
        return soundActn;
    }

    /**
     * Sets the value of the soundActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoundAction1Code }
     *     
     */
    public DevicePlaySoundRequest1 setSoundActn(SoundAction1Code value) {
        this.soundActn = value;
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
    public DevicePlaySoundRequest1 setSoundVol(BigDecimal value) {
        this.soundVol = value;
        return this;
    }

    /**
     * Gets the value of the soundCntt property.
     * 
     * @return
     *     possible object is
     *     {@link SoundContent1 }
     *     
     */
    public SoundContent1 getSoundCntt() {
        return soundCntt;
    }

    /**
     * Sets the value of the soundCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoundContent1 }
     *     
     */
    public DevicePlaySoundRequest1 setSoundCntt(SoundContent1 value) {
        this.soundCntt = value;
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
