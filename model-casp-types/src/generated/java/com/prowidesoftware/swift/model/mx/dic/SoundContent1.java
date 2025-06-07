
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
 * Content of the Sound to play.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoundContent1", propOrder = {
    "soundFrmt",
    "lang",
    "soundRef",
    "txt"
})
public class SoundContent1 {

    @XmlElement(name = "SoundFrmt", required = true)
    @XmlSchemaType(name = "string")
    protected SoundFormat1Code soundFrmt;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "SoundRef")
    protected String soundRef;
    @XmlElement(name = "Txt")
    protected String txt;

    /**
     * Gets the value of the soundFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link SoundFormat1Code }
     *     
     */
    public SoundFormat1Code getSoundFrmt() {
        return soundFrmt;
    }

    /**
     * Sets the value of the soundFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoundFormat1Code }
     *     
     */
    public SoundContent1 setSoundFrmt(SoundFormat1Code value) {
        this.soundFrmt = value;
        return this;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SoundContent1 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the soundRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoundRef() {
        return soundRef;
    }

    /**
     * Sets the value of the soundRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SoundContent1 setSoundRef(String value) {
        this.soundRef = value;
        return this;
    }

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SoundContent1 setTxt(String value) {
        this.txt = value;
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
