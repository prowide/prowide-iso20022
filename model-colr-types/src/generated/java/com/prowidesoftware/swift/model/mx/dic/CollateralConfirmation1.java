
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
 * Provides the status details about the collateral substitution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralConfirmation1", propOrder = {
    "collSbstitnReqId",
    "collSbstitnRspnId",
    "confTp",
    "cmnt"
})
public class CollateralConfirmation1 {

    @XmlElement(name = "CollSbstitnReqId", required = true)
    protected String collSbstitnReqId;
    @XmlElement(name = "CollSbstitnRspnId")
    protected String collSbstitnRspnId;
    @XmlElement(name = "ConfTp", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralSubstitutionConfirmation1Code confTp;
    @XmlElement(name = "Cmnt")
    protected String cmnt;

    /**
     * Gets the value of the collSbstitnReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnReqId() {
        return collSbstitnReqId;
    }

    /**
     * Sets the value of the collSbstitnReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralConfirmation1 setCollSbstitnReqId(String value) {
        this.collSbstitnReqId = value;
        return this;
    }

    /**
     * Gets the value of the collSbstitnRspnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnRspnId() {
        return collSbstitnRspnId;
    }

    /**
     * Sets the value of the collSbstitnRspnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralConfirmation1 setCollSbstitnRspnId(String value) {
        this.collSbstitnRspnId = value;
        return this;
    }

    /**
     * Gets the value of the confTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitutionConfirmation1Code }
     *     
     */
    public CollateralSubstitutionConfirmation1Code getConfTp() {
        return confTp;
    }

    /**
     * Sets the value of the confTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitutionConfirmation1Code }
     *     
     */
    public CollateralConfirmation1 setConfTp(CollateralSubstitutionConfirmation1Code value) {
        this.confTp = value;
        return this;
    }

    /**
     * Gets the value of the cmnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmnt() {
        return cmnt;
    }

    /**
     * Sets the value of the cmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralConfirmation1 setCmnt(String value) {
        this.cmnt = value;
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
