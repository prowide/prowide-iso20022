
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
 * Contains information related benefit (healthcare, employee benefit, etc.(
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenefitSupportingData1", propOrder = {
    "admstrId",
    "svcTp",
    "prvdrId",
    "dcsnRsn"
})
public class BenefitSupportingData1 {

    @XmlElement(name = "AdmstrId")
    protected String admstrId;
    @XmlElement(name = "SvcTp")
    protected String svcTp;
    @XmlElement(name = "PrvdrId")
    protected String prvdrId;
    @XmlElement(name = "DcsnRsn")
    protected String dcsnRsn;

    /**
     * Gets the value of the admstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmstrId() {
        return admstrId;
    }

    /**
     * Sets the value of the admstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BenefitSupportingData1 setAdmstrId(String value) {
        this.admstrId = value;
        return this;
    }

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BenefitSupportingData1 setSvcTp(String value) {
        this.svcTp = value;
        return this;
    }

    /**
     * Gets the value of the prvdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdrId() {
        return prvdrId;
    }

    /**
     * Sets the value of the prvdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BenefitSupportingData1 setPrvdrId(String value) {
        this.prvdrId = value;
        return this;
    }

    /**
     * Gets the value of the dcsnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcsnRsn() {
        return dcsnRsn;
    }

    /**
     * Sets the value of the dcsnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BenefitSupportingData1 setDcsnRsn(String value) {
        this.dcsnRsn = value;
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
