
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
 * General information that unambiguously identifies a document, such as identification number and issue date time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentGeneralInformation5", propOrder = {
    "docTp",
    "docNb",
    "docNm",
    "sndrRcvrSeqId",
    "isseDt",
    "url",
    "lkFileHash",
    "attchdBinryFile"
})
public class DocumentGeneralInformation5 {

    @XmlElement(name = "DocTp", required = true)
    protected String docTp;
    @XmlElement(name = "DocNb", required = true)
    protected String docNb;
    @XmlElement(name = "DocNm")
    protected String docNm;
    @XmlElement(name = "SndrRcvrSeqId")
    protected String sndrRcvrSeqId;
    @XmlElement(name = "IsseDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate isseDt;
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
    public DocumentGeneralInformation5 setDocTp(String value) {
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
    public DocumentGeneralInformation5 setDocNb(String value) {
        this.docNb = value;
        return this;
    }

    /**
     * Gets the value of the docNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNm() {
        return docNm;
    }

    /**
     * Sets the value of the docNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentGeneralInformation5 setDocNm(String value) {
        this.docNm = value;
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
    public DocumentGeneralInformation5 setSndrRcvrSeqId(String value) {
        this.sndrRcvrSeqId = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentGeneralInformation5 setIsseDt(LocalDate value) {
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
    public DocumentGeneralInformation5 setURL(String value) {
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
    public DocumentGeneralInformation5 setLkFileHash(SignatureEnvelopeReference value) {
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
    public DocumentGeneralInformation5 setAttchdBinryFile(BinaryFile1 value) {
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
