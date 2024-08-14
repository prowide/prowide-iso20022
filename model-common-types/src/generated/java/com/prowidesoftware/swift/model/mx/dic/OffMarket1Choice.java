
package com.prowidesoftware.swift.model.mx.dic;

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
 * Choice for specifying how the trade was executed off-market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffMarket1Choice", propOrder = {
    "offMktInd",
    "systmtcIntlr"
})
public class OffMarket1Choice {

    @XmlElement(name = "OffMktInd")
    @XmlSchemaType(name = "string")
    protected OffMarket1Code offMktInd;
    @XmlElement(name = "SystmtcIntlr")
    protected String systmtcIntlr;

    /**
     * Gets the value of the offMktInd property.
     * 
     * @return
     *     possible object is
     *     {@link OffMarket1Code }
     *     
     */
    public OffMarket1Code getOffMktInd() {
        return offMktInd;
    }

    /**
     * Sets the value of the offMktInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffMarket1Code }
     *     
     */
    public OffMarket1Choice setOffMktInd(OffMarket1Code value) {
        this.offMktInd = value;
        return this;
    }

    /**
     * Gets the value of the systmtcIntlr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystmtcIntlr() {
        return systmtcIntlr;
    }

    /**
     * Sets the value of the systmtcIntlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OffMarket1Choice setSystmtcIntlr(String value) {
        this.systmtcIntlr = value;
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
