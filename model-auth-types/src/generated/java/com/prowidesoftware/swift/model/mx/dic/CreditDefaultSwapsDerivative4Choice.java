
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
 * Choice structure allowing a credit default swap derivative to be defined.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDefaultSwapsDerivative4Choice", propOrder = {
    "snglNmCdtDfltSwp",
    "cdtDfltSwpIndx",
    "snglNmCdtDfltSwpDeriv",
    "cdtDfltSwpIndxDeriv"
})
public class CreditDefaultSwapsDerivative4Choice {

    @XmlElement(name = "SnglNmCdtDfltSwp")
    protected CreditDefaultSwapSingleName2 snglNmCdtDfltSwp;
    @XmlElement(name = "CdtDfltSwpIndx")
    protected CreditDefaultSwapIndex3 cdtDfltSwpIndx;
    @XmlElement(name = "SnglNmCdtDfltSwpDeriv")
    protected CreditDefaultSwapDerivative6 snglNmCdtDfltSwpDeriv;
    @XmlElement(name = "CdtDfltSwpIndxDeriv")
    protected CreditDefaultSwapDerivative5 cdtDfltSwpIndxDeriv;

    /**
     * Gets the value of the snglNmCdtDfltSwp property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDefaultSwapSingleName2 }
     *     
     */
    public CreditDefaultSwapSingleName2 getSnglNmCdtDfltSwp() {
        return snglNmCdtDfltSwp;
    }

    /**
     * Sets the value of the snglNmCdtDfltSwp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDefaultSwapSingleName2 }
     *     
     */
    public CreditDefaultSwapsDerivative4Choice setSnglNmCdtDfltSwp(CreditDefaultSwapSingleName2 value) {
        this.snglNmCdtDfltSwp = value;
        return this;
    }

    /**
     * Gets the value of the cdtDfltSwpIndx property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDefaultSwapIndex3 }
     *     
     */
    public CreditDefaultSwapIndex3 getCdtDfltSwpIndx() {
        return cdtDfltSwpIndx;
    }

    /**
     * Sets the value of the cdtDfltSwpIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDefaultSwapIndex3 }
     *     
     */
    public CreditDefaultSwapsDerivative4Choice setCdtDfltSwpIndx(CreditDefaultSwapIndex3 value) {
        this.cdtDfltSwpIndx = value;
        return this;
    }

    /**
     * Gets the value of the snglNmCdtDfltSwpDeriv property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDefaultSwapDerivative6 }
     *     
     */
    public CreditDefaultSwapDerivative6 getSnglNmCdtDfltSwpDeriv() {
        return snglNmCdtDfltSwpDeriv;
    }

    /**
     * Sets the value of the snglNmCdtDfltSwpDeriv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDefaultSwapDerivative6 }
     *     
     */
    public CreditDefaultSwapsDerivative4Choice setSnglNmCdtDfltSwpDeriv(CreditDefaultSwapDerivative6 value) {
        this.snglNmCdtDfltSwpDeriv = value;
        return this;
    }

    /**
     * Gets the value of the cdtDfltSwpIndxDeriv property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDefaultSwapDerivative5 }
     *     
     */
    public CreditDefaultSwapDerivative5 getCdtDfltSwpIndxDeriv() {
        return cdtDfltSwpIndxDeriv;
    }

    /**
     * Sets the value of the cdtDfltSwpIndxDeriv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDefaultSwapDerivative5 }
     *     
     */
    public CreditDefaultSwapsDerivative4Choice setCdtDfltSwpIndxDeriv(CreditDefaultSwapDerivative5 value) {
        this.cdtDfltSwpIndxDeriv = value;
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
