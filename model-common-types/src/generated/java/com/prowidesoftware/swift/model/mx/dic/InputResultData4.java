
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Information related to an Input request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputResultData4", propOrder = {
    "inptCmd",
    "confdFlg",
    "fctnKey",
    "inptMsg",
    "pwd",
    "imgCaptrdSgntr"
})
public class InputResultData4 {

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
    protected ContentInformationType30 pwd;
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
    public InputResultData4 setInptCmd(InputCommand1Code value) {
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
    public InputResultData4 setConfdFlg(Boolean value) {
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
    public InputResultData4 setFctnKey(BigDecimal value) {
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
    public InputResultData4 setInptMsg(String value) {
        this.inptMsg = value;
        return this;
    }

    /**
     * Gets the value of the pwd property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType30 }
     *     
     */
    public ContentInformationType30 getPwd() {
        return pwd;
    }

    /**
     * Sets the value of the pwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType30 }
     *     
     */
    public InputResultData4 setPwd(ContentInformationType30 value) {
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
    public InputResultData4 setImgCaptrdSgntr(CapturedSignature1 value) {
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
