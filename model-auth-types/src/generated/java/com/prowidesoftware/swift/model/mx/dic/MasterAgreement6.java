
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "MasterAgreement6", propOrder = {
    "tp",
    "vrsn",
    "othrMstrAgrmtDtls"
})
public class MasterAgreement6 {

    @XmlElement(name = "Tp", required = true)
    protected AgreementType1Choice tp;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "OthrMstrAgrmtDtls")
    protected String othrMstrAgrmtDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementType1Choice }
     *     
     */
    public AgreementType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementType1Choice }
     *     
     */
    public MasterAgreement6 setTp(AgreementType1Choice value) {
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
    public MasterAgreement6 setVrsn(String value) {
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
    public MasterAgreement6 setOthrMstrAgrmtDtls(String value) {
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
