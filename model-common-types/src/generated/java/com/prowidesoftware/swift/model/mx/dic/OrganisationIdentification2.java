
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
 * Unique and unambiguous way to identify an organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIdentification2", propOrder = {
    "bic",
    "ibei",
    "bei",
    "eangln",
    "uschu",
    "duns",
    "bkPtyId",
    "taxIdNb",
    "prtryId"
})
public class OrganisationIdentification2 {

    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "IBEI")
    protected String ibei;
    @XmlElement(name = "BEI")
    protected String bei;
    @XmlElement(name = "EANGLN")
    protected String eangln;
    @XmlElement(name = "USCHU")
    protected String uschu;
    @XmlElement(name = "DUNS")
    protected String duns;
    @XmlElement(name = "BkPtyId")
    protected String bkPtyId;
    @XmlElement(name = "TaxIdNb")
    protected String taxIdNb;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification3 prtryId;

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification2 setBIC(String value) {
        this.bic = value;
        return this;
    }

    /**
     * Gets the value of the ibei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBEI() {
        return ibei;
    }

    /**
     * Sets the value of the ibei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification2 setIBEI(String value) {
        this.ibei = value;
        return this;
    }

    /**
     * Gets the value of the bei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEI() {
        return bei;
    }

    /**
     * Sets the value of the bei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification2 setBEI(String value) {
        this.bei = value;
        return this;
    }

    /**
     * Gets the value of the eangln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEANGLN() {
        return eangln;
    }

    /**
     * Sets the value of the eangln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification2 setEANGLN(String value) {
        this.eangln = value;
        return this;
    }

    /**
     * Gets the value of the uschu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSCHU() {
        return uschu;
    }

    /**
     * Sets the value of the uschu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification2 setUSCHU(String value) {
        this.uschu = value;
        return this;
    }

    /**
     * Gets the value of the duns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNS() {
        return duns;
    }

    /**
     * Sets the value of the duns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification2 setDUNS(String value) {
        this.duns = value;
        return this;
    }

    /**
     * Gets the value of the bkPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkPtyId() {
        return bkPtyId;
    }

    /**
     * Sets the value of the bkPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification2 setBkPtyId(String value) {
        this.bkPtyId = value;
        return this;
    }

    /**
     * Gets the value of the taxIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdNb() {
        return taxIdNb;
    }

    /**
     * Sets the value of the taxIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrganisationIdentification2 setTaxIdNb(String value) {
        this.taxIdNb = value;
        return this;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification3 }
     *     
     */
    public GenericIdentification3 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification3 }
     *     
     */
    public OrganisationIdentification2 setPrtryId(GenericIdentification3 value) {
        this.prtryId = value;
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
