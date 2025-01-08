
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
 * Information related to a master agreement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterAgreement7", propOrder = {
    "tp",
    "vrsn",
    "othrMstrAgrmtDtls"
})
public class MasterAgreement7 {

    @XmlElement(name = "Tp", required = true)
    protected AgreementType2Choice tp;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "OthrMstrAgrmtDtls")
    protected String othrMstrAgrmtDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementType2Choice }
     *     
     */
    public AgreementType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementType2Choice }
     *     
     */
    public MasterAgreement7 setTp(AgreementType2Choice value) {
        this.tp = value;
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
    public MasterAgreement7 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the othrMstrAgrmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrMstrAgrmtDtls() {
        return othrMstrAgrmtDtls;
    }

    /**
     * Sets the value of the othrMstrAgrmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MasterAgreement7 setOthrMstrAgrmtDtls(String value) {
        this.othrMstrAgrmtDtls = value;
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
