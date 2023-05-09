
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
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
 * Net position of a segregated holding of a single security within the overall position held in the securities account, eg, sub-balance per status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldingBalance3", propOrder = {
    "bal",
    "balTp",
    "sfkpgPlc",
    "dt"
})
public class HoldingBalance3 {

    @XmlElement(name = "Bal")
    protected UnitOrFaceAmountChoice bal;
    @XmlElement(name = "BalTp")
    @XmlSchemaType(name = "string")
    protected SecuritiesEntryType2Code balTp;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormatChoice sfkpgPlc;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dt;

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
    public HoldingBalance3 setBal(UnitOrFaceAmountChoice value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the balTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesEntryType2Code }
     *     
     */
    public SecuritiesEntryType2Code getBalTp() {
        return balTp;
    }

    /**
     * Sets the value of the balTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesEntryType2Code }
     *     
     */
    public HoldingBalance3 setBalTp(SecuritiesEntryType2Code value) {
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
    public HoldingBalance3 setSfkpgPlc(SafekeepingPlaceFormatChoice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public HoldingBalance3 setDt(LocalDate value) {
        this.dt = value;
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
