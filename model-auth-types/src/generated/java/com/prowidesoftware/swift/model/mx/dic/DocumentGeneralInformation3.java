
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * General information that unambiguously identifies a document, such as identification number and issue date time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentGeneralInformation3", propOrder = {
    "docTp",
    "docNb",
    "sndrRcvrSeqId",
    "isseDt",
    "url",
    "lkFileHash",
    "attchdBinryFile"
})
public class DocumentGeneralInformation3 {

    @XmlElement(name = "DocTp", required = true)
    protected String docTp;
    @XmlElement(name = "DocNb", required = true)
    protected String docNb;
    @XmlElement(name = "SndrRcvrSeqId")
    protected String sndrRcvrSeqId;
    @XmlElement(name = "IsseDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "LkFileHash")
    protected SignatureEnvelopeReference lkFileHash;
    @XmlElement(name = "AttchdBinryFile", required = true)
    protected BinaryFile1 attchdBinryFile;

    /**
     * Gets the value of the docTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTp() {
        return docTp;
    }

    /**
     * Sets the value of the docTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentGeneralInformation3 setDocTp(String value) {
        this.docTp = value;
        return this;
    }

    /**
     * Gets the value of the docNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNb() {
        return docNb;
    }

    /**
     * Sets the value of the docNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentGeneralInformation3 setDocNb(String value) {
        this.docNb = value;
        return this;
    }

    /**
     * Gets the value of the sndrRcvrSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrRcvrSeqId() {
        return sndrRcvrSeqId;
    }

    /**
     * Sets the value of the sndrRcvrSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentGeneralInformation3 setSndrRcvrSeqId(String value) {
        this.sndrRcvrSeqId = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public DocumentGeneralInformation3 setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentGeneralInformation3 setURL(String value) {
        this.url = value;
        return this;
    }

    /**
     * Gets the value of the lkFileHash property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureEnvelopeReference }
     *     
     */
    public SignatureEnvelopeReference getLkFileHash() {
        return lkFileHash;
    }

    /**
     * Sets the value of the lkFileHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureEnvelopeReference }
     *     
     */
    public DocumentGeneralInformation3 setLkFileHash(SignatureEnvelopeReference value) {
        this.lkFileHash = value;
        return this;
    }

    /**
     * Gets the value of the attchdBinryFile property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryFile1 }
     *     
     */
    public BinaryFile1 getAttchdBinryFile() {
        return attchdBinryFile;
    }

    /**
     * Sets the value of the attchdBinryFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryFile1 }
     *     
     */
    public DocumentGeneralInformation3 setAttchdBinryFile(BinaryFile1 value) {
        this.attchdBinryFile = value;
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
