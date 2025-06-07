
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
 * Variables related to derivatives that are used to group derivatives together into positions for collateral position sets and currency collateral position sets reports. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetCollateralDimensions2", propOrder = {
    "ctrPtyId",
    "collstn",
    "prtfl",
    "initlMrgnPstdCcy",
    "vartnMrgnPstdCcy",
    "initlMrgnRcvdCcy",
    "vartnMrgnRcvdCcy",
    "xcssCollPstdCcy",
    "xcssCollRcvdCcy"
})
public class PositionSetCollateralDimensions2 {

    @XmlElement(name = "CtrPtyId")
    protected TradeCounterpartyReport9 ctrPtyId;
    @XmlElement(name = "Collstn")
    @XmlSchemaType(name = "string")
    protected CollateralisationType1Code collstn;
    @XmlElement(name = "Prtfl")
    protected String prtfl;
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
     *     {@link TradeCounterpartyReport9 }
     *     
     */
    public TradeCounterpartyReport9 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyReport9 }
     *     
     */
    public PositionSetCollateralDimensions2 setCtrPtyId(TradeCounterpartyReport9 value) {
        this.ctrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the collstn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralisationType1Code }
     *     
     */
    public CollateralisationType1Code getCollstn() {
        return collstn;
    }

    /**
     * Sets the value of the collstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralisationType1Code }
     *     
     */
    public PositionSetCollateralDimensions2 setCollstn(CollateralisationType1Code value) {
        this.collstn = value;
        return this;
    }

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetCollateralDimensions2 setPrtfl(String value) {
        this.prtfl = value;
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
    public PositionSetCollateralDimensions2 setInitlMrgnPstdCcy(String value) {
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
    public PositionSetCollateralDimensions2 setVartnMrgnPstdCcy(String value) {
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
    public PositionSetCollateralDimensions2 setInitlMrgnRcvdCcy(String value) {
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
    public PositionSetCollateralDimensions2 setVartnMrgnRcvdCcy(String value) {
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
    public PositionSetCollateralDimensions2 setXcssCollPstdCcy(String value) {
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
    public PositionSetCollateralDimensions2 setXcssCollRcvdCcy(String value) {
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
