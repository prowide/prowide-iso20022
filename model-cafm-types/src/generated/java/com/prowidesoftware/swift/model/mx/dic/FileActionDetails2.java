
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
@XmlType(name = "FileActionDetails2", propOrder = {
    "fileNm",
    "frmt",
    "dataRcrd",
    "actnDt",
    "fileSctyCd"
})
public class FileActionDetails2 {

    @XmlElement(name = "FileNm")
    protected String fileNm;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat5Code frmt;
    @XmlElement(name = "DataRcrd", required = true)
    protected DataRecord1Choice dataRcrd;
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
    public FileActionDetails2 setFileNm(String value) {
        this.fileNm = value;
        return this;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat5Code }
     *     
     */
    public OutputFormat5Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat5Code }
     *     
     */
    public FileActionDetails2 setFrmt(OutputFormat5Code value) {
        this.frmt = value;
        return this;
    }

    /**
     * Gets the value of the dataRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link DataRecord1Choice }
     *     
     */
    public DataRecord1Choice getDataRcrd() {
        return dataRcrd;
    }

    /**
     * Sets the value of the dataRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRecord1Choice }
     *     
     */
    public FileActionDetails2 setDataRcrd(DataRecord1Choice value) {
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
    public FileActionDetails2 setActnDt(LocalDate value) {
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
    public FileActionDetails2 setFileSctyCd(String value) {
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
