
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Allows the user to specify the algorithm parameters for the algo strategy.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyParameters1", propOrder = {
    "nm",
    "tp",
    "trgtStrtgy"
})
public class StrategyParameters1 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "TrgtStrtgy")
    protected String trgtStrtgy;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StrategyParameters1 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StrategyParameters1 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the trgtStrtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgtStrtgy() {
        return trgtStrtgy;
    }

    /**
     * Sets the value of the trgtStrtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StrategyParameters1 setTrgtStrtgy(String value) {
        this.trgtStrtgy = value;
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
