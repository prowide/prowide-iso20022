
package com.prowidesoftware.swift.model.mx.dic;

import java.time.YearMonth;
import com.prowidesoftware.swift.model.mx.adapters.IsoYearMonthAdapter;
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
 * Electronic money product that provides the cardholder with a portable and specialised computer device, which typically contains a microprocessor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard29", propOrder = {
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
public class PaymentCard29 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected CardType1Code tp;
    @XmlElement(name = "Nb", required = true)
    protected String nb;
    @XmlElement(name = "HldrNm", required = true)
    protected String hldrNm;
    @XmlElement(name = "StartDt", type = String.class)
    @XmlJavaTypeAdapter(IsoYearMonthAdapter.class)
    @XmlSchemaType(name = "gYearMonth")
    protected YearMonth startDt;
    @XmlElement(name = "XpryDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoYearMonthAdapter.class)
    @XmlSchemaType(name = "gYearMonth")
    protected YearMonth xpryDt;
    @XmlElement(name = "CardIssrNm")
    protected String cardIssrNm;
    @XmlElement(name = "CardIssrId")
    protected PartyIdentification125Choice cardIssrId;
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
    public PaymentCard29 setTp(CardType1Code value) {
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
    public PaymentCard29 setNb(String value) {
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
    public PaymentCard29 setHldrNm(String value) {
        this.hldrNm = value;
        return this;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public YearMonth getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard29 setStartDt(YearMonth value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public YearMonth getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard29 setXpryDt(YearMonth value) {
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
    public PaymentCard29 setCardIssrNm(String value) {
        this.cardIssrNm = value;
        return this;
    }

    /**
     * Gets the value of the cardIssrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getCardIssrId() {
        return cardIssrId;
    }

    /**
     * Sets the value of the cardIssrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PaymentCard29 setCardIssrId(PartyIdentification125Choice value) {
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
    public PaymentCard29 setSctyCd(String value) {
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
    public PaymentCard29 setSeqNb(String value) {
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
