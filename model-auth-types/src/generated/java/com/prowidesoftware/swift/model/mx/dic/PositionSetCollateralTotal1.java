
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Variables used to quantify the different calculations for position sets and currency position sets reports.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetCollateralTotal1", propOrder = {
    "nbOfRpts",
    "initlMrgn",
    "vartnMrgn",
    "xcssCsh"
})
public class PositionSetCollateralTotal1 {

    @XmlElement(name = "NbOfRpts")
    protected BigDecimal nbOfRpts;
    @XmlElement(name = "InitlMrgn")
    protected PositionSetPostedAndReceived1 initlMrgn;
    @XmlElement(name = "VartnMrgn")
    protected PositionSetPostedAndReceived1 vartnMrgn;
    @XmlElement(name = "XcssCsh")
    protected PositionSetPostedAndReceived1 xcssCsh;

    /**
     * Gets the value of the nbOfRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfRpts() {
        return nbOfRpts;
    }

    /**
     * Sets the value of the nbOfRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PositionSetCollateralTotal1 setNbOfRpts(BigDecimal value) {
        this.nbOfRpts = value;
        return this;
    }

    /**
     * Gets the value of the initlMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetPostedAndReceived1 }
     *     
     */
    public PositionSetPostedAndReceived1 getInitlMrgn() {
        return initlMrgn;
    }

    /**
     * Sets the value of the initlMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetPostedAndReceived1 }
     *     
     */
    public PositionSetCollateralTotal1 setInitlMrgn(PositionSetPostedAndReceived1 value) {
        this.initlMrgn = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetPostedAndReceived1 }
     *     
     */
    public PositionSetPostedAndReceived1 getVartnMrgn() {
        return vartnMrgn;
    }

    /**
     * Sets the value of the vartnMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetPostedAndReceived1 }
     *     
     */
    public PositionSetCollateralTotal1 setVartnMrgn(PositionSetPostedAndReceived1 value) {
        this.vartnMrgn = value;
        return this;
    }

    /**
     * Gets the value of the xcssCsh property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetPostedAndReceived1 }
     *     
     */
    public PositionSetPostedAndReceived1 getXcssCsh() {
        return xcssCsh;
    }

    /**
     * Sets the value of the xcssCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetPostedAndReceived1 }
     *     
     */
    public PositionSetCollateralTotal1 setXcssCsh(PositionSetPostedAndReceived1 value) {
        this.xcssCsh = value;
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
