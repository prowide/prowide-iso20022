
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "PositionSetCollateralTotal2", propOrder = {
    "nbOfRpts",
    "pstdMrgnOrColl",
    "rcvdMrgnOrColl"
})
public class PositionSetCollateralTotal2 {

    @XmlElement(name = "NbOfRpts")
    protected BigDecimal nbOfRpts;
    @XmlElement(name = "PstdMrgnOrColl")
    protected PostedMarginOrCollateral6 pstdMrgnOrColl;
    @XmlElement(name = "RcvdMrgnOrColl")
    protected ReceivedMarginOrCollateral6 rcvdMrgnOrColl;

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
    public PositionSetCollateralTotal2 setNbOfRpts(BigDecimal value) {
        this.nbOfRpts = value;
        return this;
    }

    /**
     * Gets the value of the pstdMrgnOrColl property.
     * 
     * @return
     *     possible object is
     *     {@link PostedMarginOrCollateral6 }
     *     
     */
    public PostedMarginOrCollateral6 getPstdMrgnOrColl() {
        return pstdMrgnOrColl;
    }

    /**
     * Sets the value of the pstdMrgnOrColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostedMarginOrCollateral6 }
     *     
     */
    public PositionSetCollateralTotal2 setPstdMrgnOrColl(PostedMarginOrCollateral6 value) {
        this.pstdMrgnOrColl = value;
        return this;
    }

    /**
     * Gets the value of the rcvdMrgnOrColl property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedMarginOrCollateral6 }
     *     
     */
    public ReceivedMarginOrCollateral6 getRcvdMrgnOrColl() {
        return rcvdMrgnOrColl;
    }

    /**
     * Sets the value of the rcvdMrgnOrColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedMarginOrCollateral6 }
     *     
     */
    public PositionSetCollateralTotal2 setRcvdMrgnOrColl(ReceivedMarginOrCollateral6 value) {
        this.rcvdMrgnOrColl = value;
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
