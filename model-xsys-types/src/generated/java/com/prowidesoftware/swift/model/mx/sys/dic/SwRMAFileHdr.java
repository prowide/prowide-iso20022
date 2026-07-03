
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for RMAFileHdr complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMAFileHdr", propOrder = {
    "bic8Lst",
    "svcLst",
    "fileMaintncSts",
    "fileDesc",
    "crDtTm",
    "tltRecrd",
    "lau"
})
public class SwRMAFileHdr {

    @XmlElement(name = "Bic8Lst", required = true)
    protected SwBic8Lst bic8Lst;
    @XmlElement(name = "SvcLst", required = true)
    protected SwSvcLst svcLst;
    @XmlElement(name = "FileMaintncSts", required = true)
    protected String fileMaintncSts;
    @XmlElement(name = "FileDesc", required = true)
    protected String fileDesc;
    @XmlElement(name = "CrDtTm", required = true)
    protected String crDtTm;
    @XmlElement(name = "TltRecrd", required = true)
    protected String tltRecrd;
    @XmlElement(name = "LAU", required = true)
    protected SwLAU lau;

    /**
     * Gets the value of the bic8Lst property.
     * 
     * @return
     *     possible object is
     *     {@link SwBic8Lst }
     *     
     */
    public SwBic8Lst getBic8Lst() {
        return bic8Lst;
    }

    /**
     * Sets the value of the bic8Lst property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwBic8Lst }
     *     
     */
    public SwRMAFileHdr setBic8Lst(SwBic8Lst value) {
        this.bic8Lst = value;
        return this;
    }

    /**
     * Gets the value of the svcLst property.
     * 
     * @return
     *     possible object is
     *     {@link SwSvcLst }
     *     
     */
    public SwSvcLst getSvcLst() {
        return svcLst;
    }

    /**
     * Sets the value of the svcLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwSvcLst }
     *     
     */
    public SwRMAFileHdr setSvcLst(SwSvcLst value) {
        this.svcLst = value;
        return this;
    }

    /**
     * Gets the value of the fileMaintncSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileMaintncSts() {
        return fileMaintncSts;
    }

    /**
     * Sets the value of the fileMaintncSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRMAFileHdr setFileMaintncSts(String value) {
        this.fileMaintncSts = value;
        return this;
    }

    /**
     * Gets the value of the fileDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileDesc() {
        return fileDesc;
    }

    /**
     * Sets the value of the fileDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRMAFileHdr setFileDesc(String value) {
        this.fileDesc = value;
        return this;
    }

    /**
     * Gets the value of the crDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrDtTm() {
        return crDtTm;
    }

    /**
     * Sets the value of the crDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRMAFileHdr setCrDtTm(String value) {
        this.crDtTm = value;
        return this;
    }

    /**
     * Gets the value of the tltRecrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTltRecrd() {
        return tltRecrd;
    }

    /**
     * Sets the value of the tltRecrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRMAFileHdr setTltRecrd(String value) {
        this.tltRecrd = value;
        return this;
    }

    /**
     * Gets the value of the lau property.
     * 
     * @return
     *     possible object is
     *     {@link SwLAU }
     *     
     */
    public SwLAU getLAU() {
        return lau;
    }

    /**
     * Sets the value of the lau property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwLAU }
     *     
     */
    public SwRMAFileHdr setLAU(SwLAU value) {
        this.lau = value;
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
