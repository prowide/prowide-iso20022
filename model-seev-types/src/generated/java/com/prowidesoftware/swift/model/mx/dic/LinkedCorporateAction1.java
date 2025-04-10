
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies linkage information of a corporate action message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedCorporateAction1", propOrder = {
    "ntfctnTp",
    "lkdAgtCANtfctnAdvcId",
    "lkgTp",
    "lkdIssrCorpActnId",
    "lkdCorpActnPrcgId"
})
public class LinkedCorporateAction1 {

    @XmlElement(name = "NtfctnTp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionNotificationType1Code ntfctnTp;
    @XmlElement(name = "LkdAgtCANtfctnAdvcId")
    protected DocumentIdentification8 lkdAgtCANtfctnAdvcId;
    @XmlElement(name = "LkgTp")
    protected ProcessingPosition2FormatChoice lkgTp;
    @XmlElement(name = "LkdIssrCorpActnId")
    protected String lkdIssrCorpActnId;
    @XmlElement(name = "LkdCorpActnPrcgId")
    protected String lkdCorpActnPrcgId;

    /**
     * Gets the value of the ntfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationType1Code }
     *     
     */
    public CorporateActionNotificationType1Code getNtfctnTp() {
        return ntfctnTp;
    }

    /**
     * Sets the value of the ntfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationType1Code }
     *     
     */
    public LinkedCorporateAction1 setNtfctnTp(CorporateActionNotificationType1Code value) {
        this.ntfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the lkdAgtCANtfctnAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getLkdAgtCANtfctnAdvcId() {
        return lkdAgtCANtfctnAdvcId;
    }

    /**
     * Sets the value of the lkdAgtCANtfctnAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public LinkedCorporateAction1 setLkdAgtCANtfctnAdvcId(DocumentIdentification8 value) {
        this.lkdAgtCANtfctnAdvcId = value;
        return this;
    }

    /**
     * Gets the value of the lkgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition2FormatChoice }
     *     
     */
    public ProcessingPosition2FormatChoice getLkgTp() {
        return lkgTp;
    }

    /**
     * Sets the value of the lkgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition2FormatChoice }
     *     
     */
    public LinkedCorporateAction1 setLkgTp(ProcessingPosition2FormatChoice value) {
        this.lkgTp = value;
        return this;
    }

    /**
     * Gets the value of the lkdIssrCorpActnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdIssrCorpActnId() {
        return lkdIssrCorpActnId;
    }

    /**
     * Sets the value of the lkdIssrCorpActnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LinkedCorporateAction1 setLkdIssrCorpActnId(String value) {
        this.lkdIssrCorpActnId = value;
        return this;
    }

    /**
     * Gets the value of the lkdCorpActnPrcgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkdCorpActnPrcgId() {
        return lkdCorpActnPrcgId;
    }

    /**
     * Sets the value of the lkdCorpActnPrcgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LinkedCorporateAction1 setLkdCorpActnPrcgId(String value) {
        this.lkdCorpActnPrcgId = value;
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
