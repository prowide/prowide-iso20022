
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
@XmlType(name = "InputData2", propOrder = {
    "dvcTp",
    "infQlfr",
    "inptCmd",
    "ntfyCardInptFlg",
    "maxInptTm",
    "inptTxt",
    "imdtRspnFlg",
    "waitUsrVldtnFlg",
    "beepKeyFlg",
    "gblCrrctnFlg",
    "dsblCclFlg",
    "dsblCrrctFlg",
    "dsblVldFlg",
    "menuBckFlg"
})
public class InputData2 {

    @XmlElement(name = "DvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected SaleCapabilities2Code dvcTp;
    @XmlElement(name = "InfQlfr", required = true)
    @XmlSchemaType(name = "string")
    protected InformationQualify1Code infQlfr;
    @XmlElement(name = "InptCmd", required = true)
    @XmlSchemaType(name = "string")
    protected InputCommand1Code inptCmd;
    @XmlElement(name = "NtfyCardInptFlg")
    protected boolean ntfyCardInptFlg;
    @XmlElement(name = "MaxInptTm")
    protected BigDecimal maxInptTm;
    @XmlElement(name = "InptTxt")
    protected ActionMessage7 inptTxt;
    @XmlElement(name = "ImdtRspnFlg")
    protected Boolean imdtRspnFlg;
    @XmlElement(name = "WaitUsrVldtnFlg")
    protected Boolean waitUsrVldtnFlg;
    @XmlElement(name = "BeepKeyFlg")
    protected Boolean beepKeyFlg;
    @XmlElement(name = "GblCrrctnFlg")
    protected Boolean gblCrrctnFlg;
    @XmlElement(name = "DsblCclFlg")
    protected Boolean dsblCclFlg;
    @XmlElement(name = "DsblCrrctFlg")
    protected Boolean dsblCrrctFlg;
    @XmlElement(name = "DsblVldFlg")
    protected Boolean dsblVldFlg;
    @XmlElement(name = "MenuBckFlg")
    protected Boolean menuBckFlg;

    /**
     * Gets the value of the dvcTp property.
     * 
     * @return
     *     possible object is
     *     {@link SaleCapabilities2Code }
     *     
     */
    public SaleCapabilities2Code getDvcTp() {
        return dvcTp;
    }

    /**
     * Sets the value of the dvcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleCapabilities2Code }
     *     
     */
    public InputData2 setDvcTp(SaleCapabilities2Code value) {
        this.dvcTp = value;
        return this;
    }

    /**
     * Gets the value of the infQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link InformationQualify1Code }
     *     
     */
    public InformationQualify1Code getInfQlfr() {
        return infQlfr;
    }

    /**
     * Sets the value of the infQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationQualify1Code }
     *     
     */
    public InputData2 setInfQlfr(InformationQualify1Code value) {
        this.infQlfr = value;
        return this;
    }

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
    public InputData2 setInptCmd(InputCommand1Code value) {
        this.inptCmd = value;
        return this;
    }

    /**
     * Gets the value of the ntfyCardInptFlg property.
     * 
     */
    public boolean isNtfyCardInptFlg() {
        return ntfyCardInptFlg;
    }

    /**
     * Sets the value of the ntfyCardInptFlg property.
     * 
     */
    public InputData2 setNtfyCardInptFlg(boolean value) {
        this.ntfyCardInptFlg = value;
        return this;
    }

    /**
     * Gets the value of the maxInptTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxInptTm() {
        return maxInptTm;
    }

    /**
     * Sets the value of the maxInptTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InputData2 setMaxInptTm(BigDecimal value) {
        this.maxInptTm = value;
        return this;
    }

    /**
     * Gets the value of the inptTxt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage7 }
     *     
     */
    public ActionMessage7 getInptTxt() {
        return inptTxt;
    }

    /**
     * Sets the value of the inptTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage7 }
     *     
     */
    public InputData2 setInptTxt(ActionMessage7 value) {
        this.inptTxt = value;
        return this;
    }

    /**
     * Gets the value of the imdtRspnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImdtRspnFlg() {
        return imdtRspnFlg;
    }

    /**
     * Sets the value of the imdtRspnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InputData2 setImdtRspnFlg(Boolean value) {
        this.imdtRspnFlg = value;
        return this;
    }

    /**
     * Gets the value of the waitUsrVldtnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaitUsrVldtnFlg() {
        return waitUsrVldtnFlg;
    }

    /**
     * Sets the value of the waitUsrVldtnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InputData2 setWaitUsrVldtnFlg(Boolean value) {
        this.waitUsrVldtnFlg = value;
        return this;
    }

    /**
     * Gets the value of the beepKeyFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeepKeyFlg() {
        return beepKeyFlg;
    }

    /**
     * Sets the value of the beepKeyFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InputData2 setBeepKeyFlg(Boolean value) {
        this.beepKeyFlg = value;
        return this;
    }

    /**
     * Gets the value of the gblCrrctnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGblCrrctnFlg() {
        return gblCrrctnFlg;
    }

    /**
     * Sets the value of the gblCrrctnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InputData2 setGblCrrctnFlg(Boolean value) {
        this.gblCrrctnFlg = value;
        return this;
    }

    /**
     * Gets the value of the dsblCclFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDsblCclFlg() {
        return dsblCclFlg;
    }

    /**
     * Sets the value of the dsblCclFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InputData2 setDsblCclFlg(Boolean value) {
        this.dsblCclFlg = value;
        return this;
    }

    /**
     * Gets the value of the dsblCrrctFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDsblCrrctFlg() {
        return dsblCrrctFlg;
    }

    /**
     * Sets the value of the dsblCrrctFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InputData2 setDsblCrrctFlg(Boolean value) {
        this.dsblCrrctFlg = value;
        return this;
    }

    /**
     * Gets the value of the dsblVldFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDsblVldFlg() {
        return dsblVldFlg;
    }

    /**
     * Sets the value of the dsblVldFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InputData2 setDsblVldFlg(Boolean value) {
        this.dsblVldFlg = value;
        return this;
    }

    /**
     * Gets the value of the menuBckFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMenuBckFlg() {
        return menuBckFlg;
    }

    /**
     * Sets the value of the menuBckFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InputData2 setMenuBckFlg(Boolean value) {
        this.menuBckFlg = value;
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
