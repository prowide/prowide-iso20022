
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
 * Provides additional information regarding corporate action details periods details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPeriodSD1", propOrder = {
    "plcAndNm",
    "dtcReorgDpstPrd",
    "dtcChillPrdForDpstryDlvry"
})
public class CorporateActionPeriodSD1 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "DTCReorgDpstPrd")
    protected Period3 dtcReorgDpstPrd;
    @XmlElement(name = "DTCChillPrdForDpstryDlvry")
    protected Period3 dtcChillPrdForDpstryDlvry;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionPeriodSD1 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the dtcReorgDpstPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period3 }
     *     
     */
    public Period3 getDTCReorgDpstPrd() {
        return dtcReorgDpstPrd;
    }

    /**
     * Sets the value of the dtcReorgDpstPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3 }
     *     
     */
    public CorporateActionPeriodSD1 setDTCReorgDpstPrd(Period3 value) {
        this.dtcReorgDpstPrd = value;
        return this;
    }

    /**
     * Gets the value of the dtcChillPrdForDpstryDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link Period3 }
     *     
     */
    public Period3 getDTCChillPrdForDpstryDlvry() {
        return dtcChillPrdForDpstryDlvry;
    }

    /**
     * Sets the value of the dtcChillPrdForDpstryDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3 }
     *     
     */
    public CorporateActionPeriodSD1 setDTCChillPrdForDpstryDlvry(Period3 value) {
        this.dtcChillPrdForDpstryDlvry = value;
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
