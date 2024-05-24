
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the file action to be performed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileActionDetails1", propOrder = {
    "fileNm",
    "dataRcrd",
    "actnDt",
    "fileSctyCd"
})
public class FileActionDetails1 {

    @XmlElement(name = "FileNm", required = true)
    protected String fileNm;
    @XmlElement(name = "DataRcrd", required = true)
    protected byte[] dataRcrd;
    @XmlElement(name = "ActnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate actnDt;
    @XmlElement(name = "FileSctyCd")
    protected String fileSctyCd;

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
    public FileActionDetails1 setFileNm(String value) {
        this.fileNm = value;
        return this;
    }

    /**
     * Gets the value of the dataRcrd property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDataRcrd() {
        return dataRcrd;
    }

    /**
     * Sets the value of the dataRcrd property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public FileActionDetails1 setDataRcrd(byte[] value) {
        this.dataRcrd = value;
        return this;
    }

    /**
     * Gets the value of the actnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getActnDt() {
        return actnDt;
    }

    /**
     * Sets the value of the actnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FileActionDetails1 setActnDt(LocalDate value) {
        this.actnDt = value;
        return this;
    }

    /**
     * Gets the value of the fileSctyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSctyCd() {
        return fileSctyCd;
    }

    /**
     * Sets the value of the fileSctyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FileActionDetails1 setFileSctyCd(String value) {
        this.fileSctyCd = value;
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
