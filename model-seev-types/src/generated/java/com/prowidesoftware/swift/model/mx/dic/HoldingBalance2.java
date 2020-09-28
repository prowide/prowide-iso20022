
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Net position of a segregated holding of a single security within the overall position held in the securities account, eg, sub-balance per status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingBalance2", propOrder = {
    "bal",
    "balTp",
    "sfkpgPlc",
    "dt",
    "vtngRghtsNb"
})
public class HoldingBalance2 {

    @XmlElement(name = "Bal")
    protected UnitOrFaceAmountChoice bal;
    @XmlElement(name = "BalTp")
    @XmlSchemaType(name = "string")
    protected SecuritiesEntryType1Code balTp;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormatChoice sfkpgPlc;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "VtngRghtsNb")
    protected BigDecimal vtngRghtsNb;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmountChoice }
     *     
     */
    public UnitOrFaceAmountChoice getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmountChoice }
     *     
     */
    public HoldingBalance2 setBal(UnitOrFaceAmountChoice value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the balTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesEntryType1Code }
     *     
     */
    public SecuritiesEntryType1Code getBalTp() {
        return balTp;
    }

    /**
     * Sets the value of the balTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesEntryType1Code }
     *     
     */
    public HoldingBalance2 setBalTp(SecuritiesEntryType1Code value) {
        this.balTp = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormatChoice }
     *     
     */
    public SafekeepingPlaceFormatChoice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormatChoice }
     *     
     */
    public HoldingBalance2 setSfkpgPlc(SafekeepingPlaceFormatChoice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public HoldingBalance2 setDt(XMLGregorianCalendar value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the vtngRghtsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVtngRghtsNb() {
        return vtngRghtsNb;
    }

    /**
     * Sets the value of the vtngRghtsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public HoldingBalance2 setVtngRghtsNb(BigDecimal value) {
        this.vtngRghtsNb = value;
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
