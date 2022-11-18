
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
 * Identifies the benchmark against which the financial instrument is measured.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenchmarkCurve6", propOrder = {
    "sprd",
    "bchmkId",
    "bchmkPric",
    "bchmkCrvCcy",
    "bchmkCrvNm",
    "bchmkCrvPt"
})
public class BenchmarkCurve6 {

    @XmlElement(name = "Sprd")
    protected BigDecimal sprd;
    @XmlElement(name = "BchmkId")
    protected SecurityIdentification39 bchmkId;
    @XmlElement(name = "BchmkPric")
    protected Price8 bchmkPric;
    @XmlElement(name = "BchmkCrvCcy")
    protected String bchmkCrvCcy;
    @XmlElement(name = "BchmkCrvNm")
    protected BenchmarkCurveName7Choice bchmkCrvNm;
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
    public BenchmarkCurve6 setSprd(BigDecimal value) {
        this.sprd = value;
        return this;
    }

    /**
     * Gets the value of the bchmkId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecurityIdentification39 getBchmkId() {
        return bchmkId;
    }

    /**
     * Sets the value of the bchmkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public BenchmarkCurve6 setBchmkId(SecurityIdentification39 value) {
        this.bchmkId = value;
        return this;
    }

    /**
     * Gets the value of the bchmkPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price8 }
     *     
     */
    public Price8 getBchmkPric() {
        return bchmkPric;
    }

    /**
     * Sets the value of the bchmkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price8 }
     *     
     */
    public BenchmarkCurve6 setBchmkPric(Price8 value) {
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
    public BenchmarkCurve6 setBchmkCrvCcy(String value) {
        this.bchmkCrvCcy = value;
        return this;
    }

    /**
     * Gets the value of the bchmkCrvNm property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName7Choice }
     *     
     */
    public BenchmarkCurveName7Choice getBchmkCrvNm() {
        return bchmkCrvNm;
    }

    /**
     * Sets the value of the bchmkCrvNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName7Choice }
     *     
     */
    public BenchmarkCurve6 setBchmkCrvNm(BenchmarkCurveName7Choice value) {
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
    public BenchmarkCurve6 setBchmkCrvPt(String value) {
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
