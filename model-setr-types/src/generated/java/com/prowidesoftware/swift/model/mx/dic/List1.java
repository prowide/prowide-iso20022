
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
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
 * Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. 
 * 
 * One example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of
 * a derivative product (for example index futures) to profit from price differences between the basket and the derivative product. 
 * 
 * Other examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List1", propOrder = {
    "listId",
    "nbOfListOrdrs",
    "ttlNbOfListOrdrs",
    "imdtExctnInd",
    "exctnInstr",
    "prgrsRptInd",
    "prgrsPrdIntrvl",
    "realTmExctnRptInd",
    "bidTp",
    "mnyLndrgSts",
    "allwblOneSddnsPct",
    "allwblOneSddnsVal",
    "ordrDtls"
})
public class List1 {

    @XmlElement(name = "ListId", required = true)
    protected String listId;
    @XmlElement(name = "NbOfListOrdrs", required = true)
    protected BigDecimal nbOfListOrdrs;
    @XmlElement(name = "TtlNbOfListOrdrs", required = true)
    protected BigDecimal ttlNbOfListOrdrs;
    @XmlElement(name = "ImdtExctnInd")
    protected Boolean imdtExctnInd;
    @XmlElement(name = "ExctnInstr")
    protected String exctnInstr;
    @XmlElement(name = "PrgrsRptInd")
    protected Boolean prgrsRptInd;
    @XmlElement(name = "PrgrsPrdIntrvl", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected Calendar prgrsPrdIntrvl;
    @XmlElement(name = "RealTmExctnRptInd")
    protected Boolean realTmExctnRptInd;
    @XmlElement(name = "BidTp")
    @XmlSchemaType(name = "string")
    protected BidType1Code bidTp;
    @XmlElement(name = "MnyLndrgSts")
    @XmlSchemaType(name = "string")
    protected OldMoneyLaunderingCheck1Code mnyLndrgSts;
    @XmlElement(name = "AllwblOneSddnsPct", required = true)
    protected BigDecimal allwblOneSddnsPct;
    @XmlElement(name = "AllwblOneSddnsVal", required = true)
    protected ActiveCurrencyAndAmount allwblOneSddnsVal;
    @XmlElement(name = "OrdrDtls", required = true)
    protected List<Order6> ordrDtls;

    /**
     * Gets the value of the listId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListId() {
        return listId;
    }

    /**
     * Sets the value of the listId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public List1 setListId(String value) {
        this.listId = value;
        return this;
    }

    /**
     * Gets the value of the nbOfListOrdrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfListOrdrs() {
        return nbOfListOrdrs;
    }

    /**
     * Sets the value of the nbOfListOrdrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public List1 setNbOfListOrdrs(BigDecimal value) {
        this.nbOfListOrdrs = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfListOrdrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfListOrdrs() {
        return ttlNbOfListOrdrs;
    }

    /**
     * Sets the value of the ttlNbOfListOrdrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public List1 setTtlNbOfListOrdrs(BigDecimal value) {
        this.ttlNbOfListOrdrs = value;
        return this;
    }

    /**
     * Gets the value of the imdtExctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImdtExctnInd() {
        return imdtExctnInd;
    }

    /**
     * Sets the value of the imdtExctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public List1 setImdtExctnInd(Boolean value) {
        this.imdtExctnInd = value;
        return this;
    }

    /**
     * Gets the value of the exctnInstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExctnInstr() {
        return exctnInstr;
    }

    /**
     * Sets the value of the exctnInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public List1 setExctnInstr(String value) {
        this.exctnInstr = value;
        return this;
    }

    /**
     * Gets the value of the prgrsRptInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrgrsRptInd() {
        return prgrsRptInd;
    }

    /**
     * Sets the value of the prgrsRptInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public List1 setPrgrsRptInd(Boolean value) {
        this.prgrsRptInd = value;
        return this;
    }

    /**
     * Gets the value of the prgrsPrdIntrvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPrgrsPrdIntrvl() {
        return prgrsPrdIntrvl;
    }

    /**
     * Sets the value of the prgrsPrdIntrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public List1 setPrgrsPrdIntrvl(Calendar value) {
        this.prgrsPrdIntrvl = value;
        return this;
    }

    /**
     * Gets the value of the realTmExctnRptInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRealTmExctnRptInd() {
        return realTmExctnRptInd;
    }

    /**
     * Sets the value of the realTmExctnRptInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public List1 setRealTmExctnRptInd(Boolean value) {
        this.realTmExctnRptInd = value;
        return this;
    }

    /**
     * Gets the value of the bidTp property.
     * 
     * @return
     *     possible object is
     *     {@link BidType1Code }
     *     
     */
    public BidType1Code getBidTp() {
        return bidTp;
    }

    /**
     * Sets the value of the bidTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidType1Code }
     *     
     */
    public List1 setBidTp(BidType1Code value) {
        this.bidTp = value;
        return this;
    }

    /**
     * Gets the value of the mnyLndrgSts property.
     * 
     * @return
     *     possible object is
     *     {@link OldMoneyLaunderingCheck1Code }
     *     
     */
    public OldMoneyLaunderingCheck1Code getMnyLndrgSts() {
        return mnyLndrgSts;
    }

    /**
     * Sets the value of the mnyLndrgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldMoneyLaunderingCheck1Code }
     *     
     */
    public List1 setMnyLndrgSts(OldMoneyLaunderingCheck1Code value) {
        this.mnyLndrgSts = value;
        return this;
    }

    /**
     * Gets the value of the allwblOneSddnsPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllwblOneSddnsPct() {
        return allwblOneSddnsPct;
    }

    /**
     * Sets the value of the allwblOneSddnsPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public List1 setAllwblOneSddnsPct(BigDecimal value) {
        this.allwblOneSddnsPct = value;
        return this;
    }

    /**
     * Gets the value of the allwblOneSddnsVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAllwblOneSddnsVal() {
        return allwblOneSddnsVal;
    }

    /**
     * Sets the value of the allwblOneSddnsVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public List1 setAllwblOneSddnsVal(ActiveCurrencyAndAmount value) {
        this.allwblOneSddnsVal = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ordrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Order6 }
     * 
     * 
     * @return
     *     The value of the ordrDtls property.
     */
    public List<Order6> getOrdrDtls() {
        if (ordrDtls == null) {
            ordrDtls = new ArrayList<>();
        }
        return this.ordrDtls;
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
     * Adds a new item to the ordrDtls list.
     * @see #getOrdrDtls()
     * 
     */
    public List1 addOrdrDtls(Order6 ordrDtls) {
        getOrdrDtls().add(ordrDtls);
        return this;
    }

}
