
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
 * Global collateral status of all transactions covered in the message, in the reporting currency, that is, the total of the exposure amount, of the posted collateral, of the margin amounts, of the accrued interest, of the fees or commissions and of the principals. In addition, it provides collateral-specific information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallCollateralDetails2", propOrder = {
    "valtnAmts",
    "mrgnRate",
    "gblCollSts",
    "valtnDt",
    "collAddtlDtls"
})
public class OverallCollateralDetails2 {

    @XmlElement(name = "ValtnAmts", required = true)
    protected CollateralAmount15 valtnAmts;
    @XmlElement(name = "MrgnRate")
    protected BigDecimal mrgnRate;
    @XmlElement(name = "GblCollSts")
    @XmlSchemaType(name = "string")
    protected CollateralStatus1Code gblCollSts;
    @XmlElement(name = "ValtnDt", required = true)
    protected DateAndDateTime2Choice valtnDt;
    @XmlElement(name = "CollAddtlDtls")
    protected String collAddtlDtls;

    /**
     * Gets the value of the valtnAmts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount15 }
     *     
     */
    public CollateralAmount15 getValtnAmts() {
        return valtnAmts;
    }

    /**
     * Sets the value of the valtnAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount15 }
     *     
     */
    public OverallCollateralDetails2 setValtnAmts(CollateralAmount15 value) {
        this.valtnAmts = value;
        return this;
    }

    /**
     * Gets the value of the mrgnRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMrgnRate() {
        return mrgnRate;
    }

    /**
     * Sets the value of the mrgnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OverallCollateralDetails2 setMrgnRate(BigDecimal value) {
        this.mrgnRate = value;
        return this;
    }

    /**
     * Gets the value of the gblCollSts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralStatus1Code }
     *     
     */
    public CollateralStatus1Code getGblCollSts() {
        return gblCollSts;
    }

    /**
     * Sets the value of the gblCollSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralStatus1Code }
     *     
     */
    public OverallCollateralDetails2 setGblCollSts(CollateralStatus1Code value) {
        this.gblCollSts = value;
        return this;
    }

    /**
     * Gets the value of the valtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValtnDt() {
        return valtnDt;
    }

    /**
     * Sets the value of the valtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public OverallCollateralDetails2 setValtnDt(DateAndDateTime2Choice value) {
        this.valtnDt = value;
        return this;
    }

    /**
     * Gets the value of the collAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollAddtlDtls() {
        return collAddtlDtls;
    }

    /**
     * Sets the value of the collAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OverallCollateralDetails2 setCollAddtlDtls(String value) {
        this.collAddtlDtls = value;
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
