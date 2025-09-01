
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
 * Electronic money product that provides the cardholder with a portable and specialised computer device, which typically contains a microprocessor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard25", propOrder = {
    "tp",
    "nb",
    "hldrNm",
    "startDt",
    "xpryDt",
    "cardIssrNm",
    "cardIssrId",
    "sctyCd",
    "seqNb"
})
public class PaymentCard25 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected CardType1Code tp;
    @XmlElement(name = "Nb", required = true)
    protected String nb;
    @XmlElement(name = "HldrNm", required = true)
    protected String hldrNm;
    @XmlElement(name = "StartDt")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "XpryDt", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "CardIssrNm")
    protected String cardIssrNm;
    @XmlElement(name = "CardIssrId")
    protected PartyIdentification113 cardIssrId;
    @XmlElement(name = "SctyCd")
    protected String sctyCd;
    @XmlElement(name = "SeqNb")
    protected String seqNb;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CardType1Code }
     *     
     */
    public CardType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardType1Code }
     *     
     */
    public PaymentCard25 setTp(CardType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard25 setNb(String value) {
        this.nb = value;
        return this;
    }

    /**
     * Gets the value of the hldrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHldrNm() {
        return hldrNm;
    }

    /**
     * Sets the value of the hldrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard25 setHldrNm(String value) {
        this.hldrNm = value;
        return this;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public PaymentCard25 setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public PaymentCard25 setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the cardIssrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssrNm() {
        return cardIssrNm;
    }

    /**
     * Sets the value of the cardIssrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard25 setCardIssrNm(String value) {
        this.cardIssrNm = value;
        return this;
    }

    /**
     * Gets the value of the cardIssrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getCardIssrId() {
        return cardIssrId;
    }

    /**
     * Sets the value of the cardIssrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PaymentCard25 setCardIssrId(PartyIdentification113 value) {
        this.cardIssrId = value;
        return this;
    }

    /**
     * Gets the value of the sctyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyCd() {
        return sctyCd;
    }

    /**
     * Sets the value of the sctyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard25 setSctyCd(String value) {
        this.sctyCd = value;
        return this;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard25 setSeqNb(String value) {
        this.seqNb = value;
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
