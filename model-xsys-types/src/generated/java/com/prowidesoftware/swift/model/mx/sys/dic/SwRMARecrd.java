
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for RMARecrd complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMARecrd", propOrder = {
    "tp",
    "rmaSts",
    "issr",
    "crspdt",
    "svcNm",
    "issdDtTm",
    "vldtyPrd",
    "permssn",
    "finSvcPermssn",
    "signature"
})
public class SwRMARecrd {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "RMASts", required = true)
    protected String rmaSts;
    @XmlElement(name = "Issr", namespace = "urn:swift:snl:ns.Doc", required = true)
    protected String issr;
    @XmlElement(name = "Crspdt", namespace = "urn:swift:snl:ns.Doc", required = true)
    protected String crspdt;
    @XmlElement(name = "SvcNm", namespace = "urn:swift:snl:ns.Doc", required = true)
    protected String svcNm;
    @XmlElement(name = "IssdDtTm", namespace = "urn:swift:snl:ns.Doc")
    protected String issdDtTm;
    @XmlElement(name = "VldtyPrd", namespace = "urn:swift:snl:ns.Doc")
    protected DocVldtyPrd vldtyPrd;
    @XmlElement(name = "Permssn", namespace = "urn:swift:snl:ns.Doc")
    protected DocPermssn permssn;
    @XmlElement(name = "FINSvcPermssn", namespace = "urn:swift:snl:ns.Doc")
    protected DocFINSvcPermssn finSvcPermssn;
    @XmlElement(name = "Signature", namespace = "urn:swift:snl:ns.SwSec")
    protected SwSecSignature signature;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRMARecrd setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the rmaSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMASts() {
        return rmaSts;
    }

    /**
     * Sets the value of the rmaSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRMARecrd setRMASts(String value) {
        this.rmaSts = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRMARecrd setIssr(String value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the crspdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrspdt() {
        return crspdt;
    }

    /**
     * Sets the value of the crspdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRMARecrd setCrspdt(String value) {
        this.crspdt = value;
        return this;
    }

    /**
     * Gets the value of the svcNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcNm() {
        return svcNm;
    }

    /**
     * Sets the value of the svcNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRMARecrd setSvcNm(String value) {
        this.svcNm = value;
        return this;
    }

    /**
     * Gets the value of the issdDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssdDtTm() {
        return issdDtTm;
    }

    /**
     * Sets the value of the issdDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRMARecrd setIssdDtTm(String value) {
        this.issdDtTm = value;
        return this;
    }

    /**
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DocVldtyPrd }
     *     
     */
    public DocVldtyPrd getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocVldtyPrd }
     *     
     */
    public SwRMARecrd setVldtyPrd(DocVldtyPrd value) {
        this.vldtyPrd = value;
        return this;
    }

    /**
     * Gets the value of the permssn property.
     * 
     * @return
     *     possible object is
     *     {@link DocPermssn }
     *     
     */
    public DocPermssn getPermssn() {
        return permssn;
    }

    /**
     * Sets the value of the permssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocPermssn }
     *     
     */
    public SwRMARecrd setPermssn(DocPermssn value) {
        this.permssn = value;
        return this;
    }

    /**
     * Gets the value of the finSvcPermssn property.
     * 
     * @return
     *     possible object is
     *     {@link DocFINSvcPermssn }
     *     
     */
    public DocFINSvcPermssn getFINSvcPermssn() {
        return finSvcPermssn;
    }

    /**
     * Sets the value of the finSvcPermssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocFINSvcPermssn }
     *     
     */
    public SwRMARecrd setFINSvcPermssn(DocFINSvcPermssn value) {
        this.finSvcPermssn = value;
        return this;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SwSecSignature }
     *     
     */
    public SwSecSignature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSecSignature }
     *     
     */
    public SwRMARecrd setSignature(SwSecSignature value) {
        this.signature = value;
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
