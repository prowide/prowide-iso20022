
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
 * Information about a document.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document15", propOrder = {
    "tp",
    "id",
    "isseDt",
    "nm",
    "langCd",
    "frmt",
    "fileNm",
    "dgtlSgntr",
    "nclsr"
})
public class Document15 {

    @XmlElement(name = "Tp", required = true)
    protected DocumentType1Choice tp;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IsseDt", required = true)
    protected DateAndDateTime2Choice isseDt;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "LangCd")
    protected String langCd;
    @XmlElement(name = "Frmt", required = true)
    protected DocumentFormat1Choice frmt;
    @XmlElement(name = "FileNm")
    protected String fileNm;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature4 dgtlSgntr;
    @XmlElement(name = "Nclsr", required = true)
    protected byte[] nclsr;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType1Choice }
     *     
     */
    public DocumentType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType1Choice }
     *     
     */
    public Document15 setTp(DocumentType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Document15 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public Document15 setIsseDt(DateAndDateTime2Choice value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Document15 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the langCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCd() {
        return langCd;
    }

    /**
     * Sets the value of the langCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Document15 setLangCd(String value) {
        this.langCd = value;
        return this;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentFormat1Choice }
     *     
     */
    public DocumentFormat1Choice getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFormat1Choice }
     *     
     */
    public Document15 setFrmt(DocumentFormat1Choice value) {
        this.frmt = value;
        return this;
    }

    /**
     * Gets the value of the fileNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNm() {
        return fileNm;
    }

    /**
     * Sets the value of the fileNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Document15 setFileNm(String value) {
        this.fileNm = value;
        return this;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndSignature4 }
     *     
     */
    public PartyAndSignature4 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndSignature4 }
     *     
     */
    public Document15 setDgtlSgntr(PartyAndSignature4 value) {
        this.dgtlSgntr = value;
        return this;
    }

    /**
     * Gets the value of the nclsr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNclsr() {
        return nclsr;
    }

    /**
     * Sets the value of the nclsr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public Document15 setNclsr(byte[] value) {
        this.nclsr = value;
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
