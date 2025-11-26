
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
@XmlType(name = "CardData13", propOrder = {
    "pan",
    "prtctdPAN",
    "cardSeqNb",
    "fctvDt",
    "xpryDt",
    "trck2",
    "pmtAcctRef",
    "panAcctRg",
    "ctryCd",
    "pdctTp",
    "pdctSubTp",
    "prtflIdr",
    "addtlCardData"
})
public class CardData13 {

    @XmlElement(name = "PAN")
    protected String pan;
    @XmlElement(name = "PrtctdPAN")
    protected Boolean prtctdPAN;
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
    @XmlElement(name = "Trck2")
    protected Track2Data1Choice trck2;
    @XmlElement(name = "PmtAcctRef")
    protected String pmtAcctRef;
    @XmlElement(name = "PANAcctRg")
    protected String panAcctRg;
    @XmlElement(name = "CtryCd")
    protected String ctryCd;
    @XmlElement(name = "PdctTp")
    protected String pdctTp;
    @XmlElement(name = "PdctSubTp")
    protected String pdctSubTp;
    @XmlElement(name = "PrtflIdr")
    protected String prtflIdr;
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
    public CardData13 setPAN(String value) {
        this.pan = value;
        return this;
    }

    /**
     * Gets the value of the prtctdPAN property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtctdPAN() {
        return prtctdPAN;
    }

    /**
     * Sets the value of the prtctdPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardData13 setPrtctdPAN(Boolean value) {
        this.prtctdPAN = value;
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
    public CardData13 setCardSeqNb(String value) {
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
    public CardData13 setFctvDt(YearMonth value) {
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
    public CardData13 setXpryDt(YearMonth value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the trck2 property.
     * 
     * @return
     *     possible object is
     *     {@link Track2Data1Choice }
     *     
     */
    public Track2Data1Choice getTrck2() {
        return trck2;
    }

    /**
     * Sets the value of the trck2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Track2Data1Choice }
     *     
     */
    public CardData13 setTrck2(Track2Data1Choice value) {
        this.trck2 = value;
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
    public CardData13 setPmtAcctRef(String value) {
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
    public CardData13 setPANAcctRg(String value) {
        this.panAcctRg = value;
        return this;
    }

    /**
     * Gets the value of the ctryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryCd() {
        return ctryCd;
    }

    /**
     * Sets the value of the ctryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData13 setCtryCd(String value) {
        this.ctryCd = value;
        return this;
    }

    /**
     * Gets the value of the pdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctTp() {
        return pdctTp;
    }

    /**
     * Sets the value of the pdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData13 setPdctTp(String value) {
        this.pdctTp = value;
        return this;
    }

    /**
     * Gets the value of the pdctSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctSubTp() {
        return pdctSubTp;
    }

    /**
     * Sets the value of the pdctSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData13 setPdctSubTp(String value) {
        this.pdctSubTp = value;
        return this;
    }

    /**
     * Gets the value of the prtflIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtflIdr() {
        return prtflIdr;
    }

    /**
     * Sets the value of the prtflIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData13 setPrtflIdr(String value) {
        this.prtflIdr = value;
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
    public CardData13 addAddtlCardData(AdditionalData1 addtlCardData) {
        getAddtlCardData().add(addtlCardData);
        return this;
    }

}
