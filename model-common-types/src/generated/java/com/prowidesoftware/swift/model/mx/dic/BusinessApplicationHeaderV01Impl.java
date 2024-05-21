
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * The Business Layer deals with Business Messages. The behaviour of the Business Messages is fully described by the Business Transaction and the structure of the Business Messages is fully described by the Message Definitions and related Message Rules, Rules and Market Practices. All of which are registered in the ISO 20022 Repository.
 * A single new Business Message (with its accompagnying business application header) is created - by the sending MessagingEndpoint - for each business event; that is each interaction in a Business Transaction. A Business Message adheres to the following principles:
 * " A Business Message (and its business application header) must not contain information about the Message Transport System or the mechanics or mechanism of message sending, transportation, or receipt. 
 * " A Business Message must be comprehensible outside of the context of the Transport Message. That is the Business Message must not require knowledge of the Transport Message to be understood.
 * " A Business Message may contain headers, footers, and envelopes that are meaningful for the business. When present, they are treated as any other message content, which means that they are considered part of the Message Definition of the Business Message and as such will be part of the ISO 20022 Repository.
 * " A Business Message refers to Business Actors by their Name. Each instance of a Business Actor has one Name. The Business Actor must not be referred to in the Transport Layer.
 * Specific usage of this BusinessMessageHeader may be defined by the relevant SEG.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessApplicationHeaderV01", propOrder = {
    "charSet",
    "fr",
    "to",
    "bizMsgIdr",
    "msgDefIdr",
    "bizSvc",
    "creDt",
    "cpyDplct",
    "pssblDplct",
    "prty",
    "sgntr",
    "rltd"
})
public class BusinessApplicationHeaderV01Impl {

    @XmlElement(name = "CharSet")
    protected String charSet;
    @XmlElement(name = "Fr", required = true)
    protected Party9Choice fr;
    @XmlElement(name = "To", required = true)
    protected Party9Choice to;
    @XmlElement(name = "BizMsgIdr", required = true)
    protected String bizMsgIdr;
    @XmlElement(name = "MsgDefIdr", required = true)
    protected String msgDefIdr;
    @XmlElement(name = "BizSvc")
    protected String bizSvc;
    @XmlElement(name = "CreDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime creDt;
    @XmlElement(name = "CpyDplct")
    @XmlSchemaType(name = "string")
    protected CopyDuplicate1Code cpyDplct;
    @XmlElement(name = "PssblDplct")
    protected Boolean pssblDplct;
    @XmlElement(name = "Prty")
    protected String prty;
    @XmlElement(name = "Sgntr")
    protected SignatureEnvelope sgntr;
    @XmlElement(name = "Rltd")
    protected BusinessApplicationHeader1 rltd;
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, BusinessApplicationHeader1 .class, BusinessApplicationHeaderV01Impl.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CopyDuplicate1Code.class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, NamePrefix1Code.class, OrganisationIdentification7 .class, OrganisationIdentificationSchemeName1Choice.class, Party10Choice.class, Party9Choice.class, PartyIdentification42 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, SignatureEnvelope.class };

    /**
     * Gets the value of the charSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharSet() {
        return charSet;
    }

    /**
     * Sets the value of the charSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BusinessApplicationHeaderV01Impl setCharSet(String value) {
        this.charSet = value;
        return this;
    }

    /**
     * Gets the value of the fr property.
     * 
     * @return
     *     possible object is
     *     {@link Party9Choice }
     *     
     */
    public Party9Choice getFr() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party9Choice }
     *     
     */
    public BusinessApplicationHeaderV01Impl setFr(Party9Choice value) {
        this.fr = value;
        return this;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Party9Choice }
     *     
     */
    public Party9Choice getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party9Choice }
     *     
     */
    public BusinessApplicationHeaderV01Impl setTo(Party9Choice value) {
        this.to = value;
        return this;
    }

    /**
     * Gets the value of the bizMsgIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizMsgIdr() {
        return bizMsgIdr;
    }

    /**
     * Sets the value of the bizMsgIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BusinessApplicationHeaderV01Impl setBizMsgIdr(String value) {
        this.bizMsgIdr = value;
        return this;
    }

    /**
     * Gets the value of the msgDefIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgDefIdr() {
        return msgDefIdr;
    }

    /**
     * Sets the value of the msgDefIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BusinessApplicationHeaderV01Impl setMsgDefIdr(String value) {
        this.msgDefIdr = value;
        return this;
    }

    /**
     * Gets the value of the bizSvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizSvc() {
        return bizSvc;
    }

    /**
     * Sets the value of the bizSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BusinessApplicationHeaderV01Impl setBizSvc(String value) {
        this.bizSvc = value;
        return this;
    }

    /**
     * Gets the value of the creDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getCreDt() {
        return creDt;
    }

    /**
     * Sets the value of the creDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BusinessApplicationHeaderV01Impl setCreDt(OffsetDateTime value) {
        this.creDt = value;
        return this;
    }

    /**
     * Gets the value of the cpyDplct property.
     * 
     * @return
     *     possible object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public CopyDuplicate1Code getCpyDplct() {
        return cpyDplct;
    }

    /**
     * Sets the value of the cpyDplct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public BusinessApplicationHeaderV01Impl setCpyDplct(CopyDuplicate1Code value) {
        this.cpyDplct = value;
        return this;
    }

    /**
     * Gets the value of the pssblDplct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPssblDplct() {
        return pssblDplct;
    }

    /**
     * Sets the value of the pssblDplct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BusinessApplicationHeaderV01Impl setPssblDplct(Boolean value) {
        this.pssblDplct = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BusinessApplicationHeaderV01Impl setPrty(String value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureEnvelope }
     *     
     */
    public SignatureEnvelope getSgntr() {
        return sgntr;
    }

    /**
     * Sets the value of the sgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureEnvelope }
     *     
     */
    public BusinessApplicationHeaderV01Impl setSgntr(SignatureEnvelope value) {
        this.sgntr = value;
        return this;
    }

    /**
     * Gets the value of the rltd property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessApplicationHeader1 }
     *     
     */
    public BusinessApplicationHeader1 getRltd() {
        return rltd;
    }

    /**
     * Sets the value of the rltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessApplicationHeader1 }
     *     
     */
    public BusinessApplicationHeaderV01Impl setRltd(BusinessApplicationHeader1 value) {
        this.rltd = value;
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
