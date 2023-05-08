
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
 * The capabilities of the display components performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayCapabilities2", propOrder = {
    "dispTp",
    "nbOfLines",
    "lineWidth"
})
public class DisplayCapabilities2 {

    @XmlElement(name = "DispTp", required = true)
    @XmlSchemaType(name = "string")
    protected UserInterface2Code dispTp;
    @XmlElement(name = "NbOfLines", required = true)
    protected BigDecimal nbOfLines;
    @XmlElement(name = "LineWidth", required = true)
    protected BigDecimal lineWidth;

    /**
     * Gets the value of the dispTp property.
     * 
     * @return
     *     possible object is
     *     {@link UserInterface2Code }
     *     
     */
    public UserInterface2Code getDispTp() {
        return dispTp;
    }

    /**
     * Sets the value of the dispTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInterface2Code }
     *     
     */
    public DisplayCapabilities2 setDispTp(UserInterface2Code value) {
        this.dispTp = value;
        return this;
    }

    /**
     * Gets the value of the nbOfLines property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfLines() {
        return nbOfLines;
    }

    /**
     * Sets the value of the nbOfLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DisplayCapabilities2 setNbOfLines(BigDecimal value) {
        this.nbOfLines = value;
        return this;
    }

    /**
     * Gets the value of the lineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineWidth() {
        return lineWidth;
    }

    /**
     * Sets the value of the lineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DisplayCapabilities2 setLineWidth(BigDecimal value) {
        this.lineWidth = value;
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
