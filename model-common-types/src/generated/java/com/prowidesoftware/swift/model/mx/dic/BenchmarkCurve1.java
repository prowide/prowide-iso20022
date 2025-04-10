
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
 * Identifies the benchmark against which the financial instrument is measured.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenchmarkCurve1", propOrder = {
    "sprd",
    "bchmkId",
    "bchmkPric",
    "bchmkCrvCcy",
    "bchmkCrvNm",
    "bchmkCrvPt"
})
public class BenchmarkCurve1 {

    @XmlElement(name = "Sprd")
    protected BigDecimal sprd;
    @XmlElement(name = "BchmkId")
    protected SecurityIdentification7 bchmkId;
    @XmlElement(name = "BchmkPric")
    protected Price1 bchmkPric;
    @XmlElement(name = "BchmkCrvCcy")
    protected String bchmkCrvCcy;
    @XmlElement(name = "BchmkCrvNm")
    @XmlSchemaType(name = "string")
    protected BenchmarkCurveName1Code bchmkCrvNm;
    @XmlElement(name = "BchmkCrvPt")
    protected String bchmkCrvPt;

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BenchmarkCurve1 setSprd(BigDecimal value) {
        this.sprd = value;
        return this;
    }

    /**
     * Gets the value of the bchmkId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getBchmkId() {
        return bchmkId;
    }

    /**
     * Sets the value of the bchmkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public BenchmarkCurve1 setBchmkId(SecurityIdentification7 value) {
        this.bchmkId = value;
        return this;
    }

    /**
     * Gets the value of the bchmkPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getBchmkPric() {
        return bchmkPric;
    }

    /**
     * Sets the value of the bchmkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public BenchmarkCurve1 setBchmkPric(Price1 value) {
        this.bchmkPric = value;
        return this;
    }

    /**
     * Gets the value of the bchmkCrvCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBchmkCrvCcy() {
        return bchmkCrvCcy;
    }

    /**
     * Sets the value of the bchmkCrvCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BenchmarkCurve1 setBchmkCrvCcy(String value) {
        this.bchmkCrvCcy = value;
        return this;
    }

    /**
     * Gets the value of the bchmkCrvNm property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName1Code }
     *     
     */
    public BenchmarkCurveName1Code getBchmkCrvNm() {
        return bchmkCrvNm;
    }

    /**
     * Sets the value of the bchmkCrvNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName1Code }
     *     
     */
    public BenchmarkCurve1 setBchmkCrvNm(BenchmarkCurveName1Code value) {
        this.bchmkCrvNm = value;
        return this;
    }

    /**
     * Gets the value of the bchmkCrvPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBchmkCrvPt() {
        return bchmkCrvPt;
    }

    /**
     * Sets the value of the bchmkCrvPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BenchmarkCurve1 setBchmkCrvPt(String value) {
        this.bchmkCrvPt = value;
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
