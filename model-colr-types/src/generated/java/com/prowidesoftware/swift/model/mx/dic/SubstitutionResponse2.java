
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
 * Provides details about the collateral substitution response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstitutionResponse2", propOrder = {
    "rspnTp",
    "collSbstitnAccptncDtls",
    "collSbstitnRjctnDtls"
})
public class SubstitutionResponse2 {

    @XmlElement(name = "RspnTp", required = true)
    @XmlSchemaType(name = "string")
    protected Status4Code rspnTp;
    @XmlElement(name = "CollSbstitnAccptncDtls")
    protected CollateralSubstitutionResponse1 collSbstitnAccptncDtls;
    @XmlElement(name = "CollSbstitnRjctnDtls")
    protected CollateralSubstitutionResponse3 collSbstitnRjctnDtls;

    /**
     * Gets the value of the rspnTp property.
     * 
     * @return
     *     possible object is
     *     {@link Status4Code }
     *     
     */
    public Status4Code getRspnTp() {
        return rspnTp;
    }

    /**
     * Sets the value of the rspnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status4Code }
     *     
     */
    public SubstitutionResponse2 setRspnTp(Status4Code value) {
        this.rspnTp = value;
        return this;
    }

    /**
     * Gets the value of the collSbstitnAccptncDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitutionResponse1 }
     *     
     */
    public CollateralSubstitutionResponse1 getCollSbstitnAccptncDtls() {
        return collSbstitnAccptncDtls;
    }

    /**
     * Sets the value of the collSbstitnAccptncDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitutionResponse1 }
     *     
     */
    public SubstitutionResponse2 setCollSbstitnAccptncDtls(CollateralSubstitutionResponse1 value) {
        this.collSbstitnAccptncDtls = value;
        return this;
    }

    /**
     * Gets the value of the collSbstitnRjctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitutionResponse3 }
     *     
     */
    public CollateralSubstitutionResponse3 getCollSbstitnRjctnDtls() {
        return collSbstitnRjctnDtls;
    }

    /**
     * Sets the value of the collSbstitnRjctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitutionResponse3 }
     *     
     */
    public SubstitutionResponse2 setCollSbstitnRjctnDtls(CollateralSubstitutionResponse3 value) {
        this.collSbstitnRjctnDtls = value;
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
