
package com.prowidesoftware.swift.model.mx.dic;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
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
 * Sensible data associated with the payment card performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlainCardData1", propOrder = {
    "pan",
    "cardSeqNb",
    "fctvDt",
    "xpryDt",
    "svcCd",
    "trckData",
    "cardSctyCd"
})
public class PlainCardData1 {

    @XmlElement(name = "PAN", required = true)
    protected String pan;
    @XmlElement(name = "CardSeqNb")
    protected String cardSeqNb;
    @XmlElement(name = "FctvDt", type = String.class)
    @XmlJavaTypeAdapter(IsoYearMonthAdapter.class)
    @XmlSchemaType(name = "gYearMonth")
    protected YearMonth fctvDt;
    @XmlElement(name = "XpryDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoYearMonthAdapter.class)
    @XmlSchemaType(name = "gYearMonth")
    protected YearMonth xpryDt;
    @XmlElement(name = "SvcCd")
    protected String svcCd;
    @XmlElement(name = "TrckData")
    protected List<TrackData1> trckData;
    @XmlElement(name = "CardSctyCd")
    protected CardSecurityInformation1 cardSctyCd;

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlainCardData1 setPAN(String value) {
        this.pan = value;
        return this;
    }

    /**
     * Gets the value of the cardSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSeqNb() {
        return cardSeqNb;
    }

    /**
     * Sets the value of the cardSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlainCardData1 setCardSeqNb(String value) {
        this.cardSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public YearMonth getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlainCardData1 setFctvDt(YearMonth value) {
        this.fctvDt = value;
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
    public PlainCardData1 setXpryDt(YearMonth value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the svcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcCd() {
        return svcCd;
    }

    /**
     * Sets the value of the svcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlainCardData1 setSvcCd(String value) {
        this.svcCd = value;
        return this;
    }

    /**
     * Gets the value of the trckData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trckData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrckData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackData1 }
     * 
     * 
     * @return
     *     The value of the trckData property.
     */
    public List<TrackData1> getTrckData() {
        if (trckData == null) {
            trckData = new ArrayList<>();
        }
        return this.trckData;
    }

    /**
     * Gets the value of the cardSctyCd property.
     * 
     * @return
     *     possible object is
     *     {@link CardSecurityInformation1 }
     *     
     */
    public CardSecurityInformation1 getCardSctyCd() {
        return cardSctyCd;
    }

    /**
     * Sets the value of the cardSctyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardSecurityInformation1 }
     *     
     */
    public PlainCardData1 setCardSctyCd(CardSecurityInformation1 value) {
        this.cardSctyCd = value;
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

    /**
     * Adds a new item to the trckData list.
     * @see #getTrckData()
     * 
     */
    public PlainCardData1 addTrckData(TrackData1 trckData) {
        getTrckData().add(trckData);
        return this;
    }

}
