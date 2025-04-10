
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
 * Information related to an Input request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputResultData6", propOrder = {
    "inptCmd",
    "confdFlg",
    "fctnKey",
    "inptMsg",
    "pwd",
    "imgCaptrdSgntr"
})
public class InputResultData6 {

    @XmlElement(name = "InptCmd", required = true)
    @XmlSchemaType(name = "string")
    protected InputCommand1Code inptCmd;
    @XmlElement(name = "ConfdFlg")
    protected Boolean confdFlg;
    @XmlElement(name = "FctnKey")
    protected BigDecimal fctnKey;
    @XmlElement(name = "InptMsg")
    protected String inptMsg;
    @XmlElement(name = "Pwd")
    protected ContentInformationType39 pwd;
    @XmlElement(name = "ImgCaptrdSgntr")
    protected CapturedSignature1 imgCaptrdSgntr;

    /**
     * Gets the value of the inptCmd property.
     * 
     * @return
     *     possible object is
     *     {@link InputCommand1Code }
     *     
     */
    public InputCommand1Code getInptCmd() {
        return inptCmd;
    }

    /**
     * Sets the value of the inptCmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputCommand1Code }
     *     
     */
    public InputResultData6 setInptCmd(InputCommand1Code value) {
        this.inptCmd = value;
        return this;
    }

    /**
     * Gets the value of the confdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfdFlg() {
        return confdFlg;
    }

    /**
     * Sets the value of the confdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InputResultData6 setConfdFlg(Boolean value) {
        this.confdFlg = value;
        return this;
    }

    /**
     * Gets the value of the fctnKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFctnKey() {
        return fctnKey;
    }

    /**
     * Sets the value of the fctnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InputResultData6 setFctnKey(BigDecimal value) {
        this.fctnKey = value;
        return this;
    }

    /**
     * Gets the value of the inptMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInptMsg() {
        return inptMsg;
    }

    /**
     * Sets the value of the inptMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InputResultData6 setInptMsg(String value) {
        this.inptMsg = value;
        return this;
    }

    /**
     * Gets the value of the pwd property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType39 }
     *     
     */
    public ContentInformationType39 getPwd() {
        return pwd;
    }

    /**
     * Sets the value of the pwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType39 }
     *     
     */
    public InputResultData6 setPwd(ContentInformationType39 value) {
        this.pwd = value;
        return this;
    }

    /**
     * Gets the value of the imgCaptrdSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link CapturedSignature1 }
     *     
     */
    public CapturedSignature1 getImgCaptrdSgntr() {
        return imgCaptrdSgntr;
    }

    /**
     * Sets the value of the imgCaptrdSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapturedSignature1 }
     *     
     */
    public InputResultData6 setImgCaptrdSgntr(CapturedSignature1 value) {
        this.imgCaptrdSgntr = value;
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
