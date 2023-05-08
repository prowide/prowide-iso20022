
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Further details on the shipment conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentAttribute1", propOrder = {
    "conds",
    "xpctdDt",
    "ctryOfCntrPty"
})
public class ShipmentAttribute1 {

    @XmlElement(name = "Conds")
    protected String conds;
    @XmlElement(name = "XpctdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar xpctdDt;
    @XmlElement(name = "CtryOfCntrPty", required = true)
    protected String ctryOfCntrPty;

    /**
     * Gets the value of the conds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConds() {
        return conds;
    }

    /**
     * Sets the value of the conds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShipmentAttribute1 setConds(String value) {
        this.conds = value;
        return this;
    }

    /**
     * Gets the value of the xpctdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getXpctdDt() {
        return xpctdDt;
    }

    /**
     * Sets the value of the xpctdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShipmentAttribute1 setXpctdDt(Calendar value) {
        this.xpctdDt = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfCntrPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfCntrPty() {
        return ctryOfCntrPty;
    }

    /**
     * Sets the value of the ctryOfCntrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShipmentAttribute1 setCtryOfCntrPty(String value) {
        this.ctryOfCntrPty = value;
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
