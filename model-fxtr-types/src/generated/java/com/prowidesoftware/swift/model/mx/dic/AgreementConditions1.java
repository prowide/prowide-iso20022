
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
 * Specifies the type, date and version of the agreement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementConditions1", propOrder = {
    "agrmtCd",
    "dt",
    "vrsn"
})
public class AgreementConditions1 {

    @XmlElement(name = "AgrmtCd", required = true)
    protected String agrmtCd;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dt;
    @XmlElement(name = "Vrsn")
    protected String vrsn;

    /**
     * Gets the value of the agrmtCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrmtCd() {
        return agrmtCd;
    }

    /**
     * Sets the value of the agrmtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AgreementConditions1 setAgrmtCd(String value) {
        this.agrmtCd = value;
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
    public AgreementConditions1 setDt(LocalDate value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AgreementConditions1 setVrsn(String value) {
        this.vrsn = value;
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
