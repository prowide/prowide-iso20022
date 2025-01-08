
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
 * Non-protected sensitive data associated with the card or payment token performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardData9", propOrder = {
    "pan",
    "prtctdPANInd",
    "cardSeqNb",
    "fctvDt",
    "xpryDt",
    "trck3",
    "pmtAcctRef",
    "panAcctRg",
    "panFourLastDgts",
    "cardCtryCd",
    "cardCcyCd",
    "cardPdctTp",
    "cardPdctSubTp",
    "cardPrtflIdr",
    "addtlCardData"
})
public class CardData9 {

    @XmlElement(name = "PAN")
    protected String pan;
    @XmlElement(name = "PrtctdPANInd")
    protected Boolean prtctdPANInd;
    @XmlElement(name = "CardSeqNb")
    protected String cardSeqNb;
    @XmlElement(name = "FctvDt", type = String.class)
    @XmlJavaTypeAdapter(IsoYearMonthAdapter.class)
    @XmlSchemaType(name = "gYearMonth")
    protected YearMonth fctvDt;
    @XmlElement(name = "XpryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoYearMonthAdapter.class)
    @XmlSchemaType(name = "gYearMonth")
    protected YearMonth xpryDt;
    @XmlElement(name = "Trck3")
    protected String trck3;
    @XmlElement(name = "PmtAcctRef")
    protected String pmtAcctRef;
    @XmlElement(name = "PANAcctRg")
    protected String panAcctRg;
    @XmlElement(name = "PANFourLastDgts")
    protected String panFourLastDgts;
    @XmlElement(name = "CardCtryCd")
    protected String cardCtryCd;
    @XmlElement(name = "CardCcyCd")
    protected String cardCcyCd;
    @XmlElement(name = "CardPdctTp")
    protected String cardPdctTp;
    @XmlElement(name = "CardPdctSubTp")
    protected String cardPdctSubTp;
    @XmlElement(name = "CardPrtflIdr")
    protected String cardPrtflIdr;
    @XmlElement(name = "AddtlCardData")
    protected List<AdditionalData1> addtlCardData;

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
    public CardData9 setPAN(String value) {
        this.pan = value;
        return this;
    }

    /**
     * Gets the value of the prtctdPANInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtctdPANInd() {
        return prtctdPANInd;
    }

    /**
     * Sets the value of the prtctdPANInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardData9 setPrtctdPANInd(Boolean value) {
        this.prtctdPANInd = value;
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
    public CardData9 setCardSeqNb(String value) {
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
    public CardData9 setFctvDt(YearMonth value) {
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
    public CardData9 setXpryDt(YearMonth value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the trck3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck3() {
        return trck3;
    }

    /**
     * Sets the value of the trck3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData9 setTrck3(String value) {
        this.trck3 = value;
        return this;
    }

    /**
     * Gets the value of the pmtAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtAcctRef() {
        return pmtAcctRef;
    }

    /**
     * Sets the value of the pmtAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData9 setPmtAcctRef(String value) {
        this.pmtAcctRef = value;
        return this;
    }

    /**
     * Gets the value of the panAcctRg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANAcctRg() {
        return panAcctRg;
    }

    /**
     * Sets the value of the panAcctRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData9 setPANAcctRg(String value) {
        this.panAcctRg = value;
        return this;
    }

    /**
     * Gets the value of the panFourLastDgts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANFourLastDgts() {
        return panFourLastDgts;
    }

    /**
     * Sets the value of the panFourLastDgts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData9 setPANFourLastDgts(String value) {
        this.panFourLastDgts = value;
        return this;
    }

    /**
     * Gets the value of the cardCtryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCtryCd() {
        return cardCtryCd;
    }

    /**
     * Sets the value of the cardCtryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData9 setCardCtryCd(String value) {
        this.cardCtryCd = value;
        return this;
    }

    /**
     * Gets the value of the cardCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCcyCd() {
        return cardCcyCd;
    }

    /**
     * Sets the value of the cardCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData9 setCardCcyCd(String value) {
        this.cardCcyCd = value;
        return this;
    }

    /**
     * Gets the value of the cardPdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPdctTp() {
        return cardPdctTp;
    }

    /**
     * Sets the value of the cardPdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData9 setCardPdctTp(String value) {
        this.cardPdctTp = value;
        return this;
    }

    /**
     * Gets the value of the cardPdctSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPdctSubTp() {
        return cardPdctSubTp;
    }

    /**
     * Sets the value of the cardPdctSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData9 setCardPdctSubTp(String value) {
        this.cardPdctSubTp = value;
        return this;
    }

    /**
     * Gets the value of the cardPrtflIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPrtflIdr() {
        return cardPrtflIdr;
    }

    /**
     * Sets the value of the cardPrtflIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData9 setCardPrtflIdr(String value) {
        this.cardPrtflIdr = value;
        return this;
    }

    /**
     * Gets the value of the addtlCardData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlCardData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlCardData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlCardData property.
     */
    public List<AdditionalData1> getAddtlCardData() {
        if (addtlCardData == null) {
            addtlCardData = new ArrayList<>();
        }
        return this.addtlCardData;
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
     * Adds a new item to the addtlCardData list.
     * @see #getAddtlCardData()
     * 
     */
    public CardData9 addAddtlCardData(AdditionalData1 addtlCardData) {
        getAddtlCardData().add(addtlCardData);
        return this;
    }

}
