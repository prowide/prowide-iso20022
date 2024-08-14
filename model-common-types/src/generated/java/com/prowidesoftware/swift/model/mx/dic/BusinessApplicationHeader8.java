
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the Business Application Header of the Business Message.
 * Can be used when replying to a query; can also be used when cancelling or amending.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessApplicationHeader8", propOrder = {
    "charSet",
    "fr",
    "to",
    "bizMsgIdr",
    "msgDefIdr",
    "bizSvc",
    "mktPrctc",
    "creDt",
    "bizPrcgDt",
    "cpyDplct",
    "pssblDplct",
    "prty",
    "sgntr"
})
public class BusinessApplicationHeader8 {

    @XmlElement(name = "CharSet")
    protected String charSet;
    @XmlElement(name = "Fr", required = true)
    protected Party51Choice fr;
    @XmlElement(name = "To", required = true)
    protected Party51Choice to;
    @XmlElement(name = "BizMsgIdr", required = true)
    protected String bizMsgIdr;
    @XmlElement(name = "MsgDefIdr", required = true)
    protected String msgDefIdr;
    @XmlElement(name = "BizSvc")
    protected String bizSvc;
    @XmlElement(name = "MktPrctc")
    protected ImplementationSpecification1 mktPrctc;
    @XmlElement(name = "CreDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDt;
    @XmlElement(name = "BizPrcgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bizPrcgDt;
    @XmlElement(name = "CpyDplct")
    @XmlSchemaType(name = "string")
    protected CopyDuplicate1Code cpyDplct;
    @XmlElement(name = "PssblDplct")
    protected Boolean pssblDplct;
    @XmlElement(name = "Prty")
    protected String prty;
    @XmlElement(name = "Sgntr")
    protected SignatureEnvelope sgntr;

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
    public BusinessApplicationHeader8 setCharSet(String value) {
        this.charSet = value;
        return this;
    }

    /**
     * Gets the value of the fr property.
     * 
     * @return
     *     possible object is
     *     {@link Party51Choice }
     *     
     */
    public Party51Choice getFr() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party51Choice }
     *     
     */
    public BusinessApplicationHeader8 setFr(Party51Choice value) {
        this.fr = value;
        return this;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Party51Choice }
     *     
     */
    public Party51Choice getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party51Choice }
     *     
     */
    public BusinessApplicationHeader8 setTo(Party51Choice value) {
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
    public BusinessApplicationHeader8 setBizMsgIdr(String value) {
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
    public BusinessApplicationHeader8 setMsgDefIdr(String value) {
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
    public BusinessApplicationHeader8 setBizSvc(String value) {
        this.bizSvc = value;
        return this;
    }

    /**
     * Gets the value of the mktPrctc property.
     * 
     * @return
     *     possible object is
     *     {@link ImplementationSpecification1 }
     *     
     */
    public ImplementationSpecification1 getMktPrctc() {
        return mktPrctc;
    }

    /**
     * Sets the value of the mktPrctc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImplementationSpecification1 }
     *     
     */
    public BusinessApplicationHeader8 setMktPrctc(ImplementationSpecification1 value) {
        this.mktPrctc = value;
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
    public XMLGregorianCalendar getCreDt() {
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
    public BusinessApplicationHeader8 setCreDt(XMLGregorianCalendar value) {
        this.creDt = value;
        return this;
    }

    /**
     * Gets the value of the bizPrcgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getBizPrcgDt() {
        return bizPrcgDt;
    }

    /**
     * Sets the value of the bizPrcgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BusinessApplicationHeader8 setBizPrcgDt(XMLGregorianCalendar value) {
        this.bizPrcgDt = value;
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
    public BusinessApplicationHeader8 setCpyDplct(CopyDuplicate1Code value) {
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
    public BusinessApplicationHeader8 setPssblDplct(Boolean value) {
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
    public BusinessApplicationHeader8 setPrty(String value) {
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
    public BusinessApplicationHeader8 setSgntr(SignatureEnvelope value) {
        this.sgntr = value;
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
