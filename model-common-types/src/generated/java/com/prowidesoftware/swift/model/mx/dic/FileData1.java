
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
 * Provides information on a file that is being sent seperately to the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileData1", propOrder = {
    "tp",
    "id",
    "isseDt",
    "frmt",
    "fileNm",
    "ntwkRef",
    "fileLctnElctrncAdr"
})
public class FileData1 {

    @XmlElement(name = "Tp")
    protected DocumentType1Choice tp;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IsseDt")
    protected DateAndDateTime2Choice isseDt;
    @XmlElement(name = "Frmt")
    protected DocumentFormat1Choice frmt;
    @XmlElement(name = "FileNm")
    protected String fileNm;
    @XmlElement(name = "NtwkRef")
    protected String ntwkRef;
    @XmlElement(name = "FileLctnElctrncAdr")
    protected String fileLctnElctrncAdr;

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
    public FileData1 setTp(DocumentType1Choice value) {
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
    public FileData1 setId(String value) {
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
    public FileData1 setIsseDt(DateAndDateTime2Choice value) {
        this.isseDt = value;
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
    public FileData1 setFrmt(DocumentFormat1Choice value) {
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
    public FileData1 setFileNm(String value) {
        this.fileNm = value;
        return this;
    }

    /**
     * Gets the value of the ntwkRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtwkRef() {
        return ntwkRef;
    }

    /**
     * Sets the value of the ntwkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FileData1 setNtwkRef(String value) {
        this.ntwkRef = value;
        return this;
    }

    /**
     * Gets the value of the fileLctnElctrncAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileLctnElctrncAdr() {
        return fileLctnElctrncAdr;
    }

    /**
     * Sets the value of the fileLctnElctrncAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FileData1 setFileLctnElctrncAdr(String value) {
        this.fileLctnElctrncAdr = value;
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
