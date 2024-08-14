
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
 * Variables related to derivatives that are used to group derivatives together into positions for collateral position sets and currency collateral position sets reports. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetCollateralDimensions3", propOrder = {
    "ctrPtyId",
    "coll",
    "initlMrgnPstdCcy",
    "vartnMrgnPstdCcy",
    "initlMrgnRcvdCcy",
    "vartnMrgnRcvdCcy",
    "xcssCollPstdCcy",
    "xcssCollRcvdCcy"
})
public class PositionSetCollateralDimensions3 {

    @XmlElement(name = "CtrPtyId")
    protected TradeCounterpartyReport20 ctrPtyId;
    @XmlElement(name = "Coll")
    protected MarginCollateralReport4 coll;
    @XmlElement(name = "InitlMrgnPstdCcy")
    protected String initlMrgnPstdCcy;
    @XmlElement(name = "VartnMrgnPstdCcy")
    protected String vartnMrgnPstdCcy;
    @XmlElement(name = "InitlMrgnRcvdCcy")
    protected String initlMrgnRcvdCcy;
    @XmlElement(name = "VartnMrgnRcvdCcy")
    protected String vartnMrgnRcvdCcy;
    @XmlElement(name = "XcssCollPstdCcy")
    protected String xcssCollPstdCcy;
    @XmlElement(name = "XcssCollRcvdCcy")
    protected String xcssCollRcvdCcy;

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyReport20 }
     *     
     */
    public TradeCounterpartyReport20 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyReport20 }
     *     
     */
    public PositionSetCollateralDimensions3 setCtrPtyId(TradeCounterpartyReport20 value) {
        this.ctrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCollateralReport4 }
     *     
     */
    public MarginCollateralReport4 getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCollateralReport4 }
     *     
     */
    public PositionSetCollateralDimensions3 setColl(MarginCollateralReport4 value) {
        this.coll = value;
        return this;
    }

    /**
     * Gets the value of the initlMrgnPstdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitlMrgnPstdCcy() {
        return initlMrgnPstdCcy;
    }

    /**
     * Sets the value of the initlMrgnPstdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetCollateralDimensions3 setInitlMrgnPstdCcy(String value) {
        this.initlMrgnPstdCcy = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnPstdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVartnMrgnPstdCcy() {
        return vartnMrgnPstdCcy;
    }

    /**
     * Sets the value of the vartnMrgnPstdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetCollateralDimensions3 setVartnMrgnPstdCcy(String value) {
        this.vartnMrgnPstdCcy = value;
        return this;
    }

    /**
     * Gets the value of the initlMrgnRcvdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitlMrgnRcvdCcy() {
        return initlMrgnRcvdCcy;
    }

    /**
     * Sets the value of the initlMrgnRcvdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetCollateralDimensions3 setInitlMrgnRcvdCcy(String value) {
        this.initlMrgnRcvdCcy = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnRcvdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVartnMrgnRcvdCcy() {
        return vartnMrgnRcvdCcy;
    }

    /**
     * Sets the value of the vartnMrgnRcvdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetCollateralDimensions3 setVartnMrgnRcvdCcy(String value) {
        this.vartnMrgnRcvdCcy = value;
        return this;
    }

    /**
     * Gets the value of the xcssCollPstdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcssCollPstdCcy() {
        return xcssCollPstdCcy;
    }

    /**
     * Sets the value of the xcssCollPstdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetCollateralDimensions3 setXcssCollPstdCcy(String value) {
        this.xcssCollPstdCcy = value;
        return this;
    }

    /**
     * Gets the value of the xcssCollRcvdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcssCollRcvdCcy() {
        return xcssCollRcvdCcy;
    }

    /**
     * Sets the value of the xcssCollRcvdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetCollateralDimensions3 setXcssCollRcvdCcy(String value) {
        this.xcssCollRcvdCcy = value;
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
