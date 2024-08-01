
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
 * Choice between ISIN and an alternative format for the identification of a financial instrument. ISIN is the preferred format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification46", propOrder = {
    "isin",
    "unqPdctIdr",
    "altrntvInstrmId",
    "pdctDesc"
})
public class SecurityIdentification46 {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "UnqPdctIdr")
    protected UniqueProductIdentifier2Choice unqPdctIdr;
    @XmlElement(name = "AltrntvInstrmId")
    protected String altrntvInstrmId;
    @XmlElement(name = "PdctDesc")
    protected String pdctDesc;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification46 setISIN(String value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueProductIdentifier2Choice }
     *     
     */
    public UniqueProductIdentifier2Choice getUnqPdctIdr() {
        return unqPdctIdr;
    }

    /**
     * Sets the value of the unqPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueProductIdentifier2Choice }
     *     
     */
    public SecurityIdentification46 setUnqPdctIdr(UniqueProductIdentifier2Choice value) {
        this.unqPdctIdr = value;
        return this;
    }

    /**
     * Gets the value of the altrntvInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrntvInstrmId() {
        return altrntvInstrmId;
    }

    /**
     * Sets the value of the altrntvInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification46 setAltrntvInstrmId(String value) {
        this.altrntvInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the pdctDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctDesc() {
        return pdctDesc;
    }

    /**
     * Sets the value of the pdctDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification46 setPdctDesc(String value) {
        this.pdctDesc = value;
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
