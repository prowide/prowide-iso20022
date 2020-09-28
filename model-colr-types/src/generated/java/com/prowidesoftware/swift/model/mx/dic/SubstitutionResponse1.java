
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "SubstitutionResponse1", propOrder = {
    "rspnTp",
    "collSbstitnAccptncDtls",
    "collSbstitnRjctnDtls"
})
public class SubstitutionResponse1 {

    @XmlElement(name = "RspnTp", required = true)
    @XmlSchemaType(name = "string")
    protected Status4Code rspnTp;
    @XmlElement(name = "CollSbstitnAccptncDtls")
    protected CollateralSubstitutionResponse1 collSbstitnAccptncDtls;
    @XmlElement(name = "CollSbstitnRjctnDtls")
    protected CollateralSubstitutionResponse2 collSbstitnRjctnDtls;

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
    public SubstitutionResponse1 setRspnTp(Status4Code value) {
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
    public SubstitutionResponse1 setCollSbstitnAccptncDtls(CollateralSubstitutionResponse1 value) {
        this.collSbstitnAccptncDtls = value;
        return this;
    }

    /**
     * Gets the value of the collSbstitnRjctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitutionResponse2 }
     *     
     */
    public CollateralSubstitutionResponse2 getCollSbstitnRjctnDtls() {
        return collSbstitnRjctnDtls;
    }

    /**
     * Sets the value of the collSbstitnRjctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitutionResponse2 }
     *     
     */
    public SubstitutionResponse1 setCollSbstitnRjctnDtls(CollateralSubstitutionResponse2 value) {
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
