
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
 * The capabilities of the display components performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayCapabilities1", propOrder = {
    "dispTp",
    "nbOfLines",
    "lineWidth"
})
public class DisplayCapabilities1 {

    @XmlElement(name = "DispTp", required = true)
    @XmlSchemaType(name = "string")
    protected UserInterface2Code dispTp;
    @XmlElement(name = "NbOfLines", required = true)
    protected String nbOfLines;
    @XmlElement(name = "LineWidth", required = true)
    protected String lineWidth;

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
    public DisplayCapabilities1 setDispTp(UserInterface2Code value) {
        this.dispTp = value;
        return this;
    }

    /**
     * Gets the value of the nbOfLines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfLines() {
        return nbOfLines;
    }

    /**
     * Sets the value of the nbOfLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisplayCapabilities1 setNbOfLines(String value) {
        this.nbOfLines = value;
        return this;
    }

    /**
     * Gets the value of the lineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineWidth() {
        return lineWidth;
    }

    /**
     * Sets the value of the lineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisplayCapabilities1 setLineWidth(String value) {
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
