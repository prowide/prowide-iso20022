
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Attempt to buy or sell a large number of financial instruments contained in or comprising a portfolio.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bid1", propOrder = {
    "clntBidId",
    "listNm",
    "bidId",
    "ttlNbScties",
    "xchgForPhysInd",
    "frgnXchgExctnReqdInd",
    "tradTp",
    "ttlNbTckts",
    "prgrsRptInd",
    "prgrsPrdIntrvl",
    "ttlNbOfBddrs",
    "tradDt",
    "strkTm",
    "bsisPricTp",
    "lqdtyAndSttstcs"
})
public class Bid1 {

    @XmlElement(name = "ClntBidId", required = true)
    protected String clntBidId;
    @XmlElement(name = "ListNm")
    protected String listNm;
    @XmlElement(name = "BidId")
    protected String bidId;
    @XmlElement(name = "TtlNbScties", required = true)
    protected BigDecimal ttlNbScties;
    @XmlElement(name = "XchgForPhysInd")
    protected boolean xchgForPhysInd;
    @XmlElement(name = "FrgnXchgExctnReqdInd")
    protected boolean frgnXchgExctnReqdInd;
    @XmlElement(name = "TradTp", required = true)
    @XmlSchemaType(name = "string")
    protected TradeType2Code tradTp;
    @XmlElement(name = "TtlNbTckts")
    protected BigDecimal ttlNbTckts;
    @XmlElement(name = "PrgrsRptInd")
    protected Boolean prgrsRptInd;
    @XmlElement(name = "PrgrsPrdIntrvl", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar prgrsPrdIntrvl;
    @XmlElement(name = "TtlNbOfBddrs")
    protected BigDecimal ttlNbOfBddrs;
    @XmlElement(name = "TradDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "StrkTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar strkTm;
    @XmlElement(name = "BsisPricTp", required = true)
    protected BasisPriceType1Choice bsisPricTp;
    @XmlElement(name = "LqdtyAndSttstcs", required = true)
    protected LiquidityAndStatistics1 lqdtyAndSttstcs;

    /**
     * Gets the value of the clntBidId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntBidId() {
        return clntBidId;
    }

    /**
     * Sets the value of the clntBidId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Bid1 setClntBidId(String value) {
        this.clntBidId = value;
        return this;
    }

    /**
     * Gets the value of the listNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListNm() {
        return listNm;
    }

    /**
     * Sets the value of the listNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Bid1 setListNm(String value) {
        this.listNm = value;
        return this;
    }

    /**
     * Gets the value of the bidId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidId() {
        return bidId;
    }

    /**
     * Sets the value of the bidId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Bid1 setBidId(String value) {
        this.bidId = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbScties property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbScties() {
        return ttlNbScties;
    }

    /**
     * Sets the value of the ttlNbScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Bid1 setTtlNbScties(BigDecimal value) {
        this.ttlNbScties = value;
        return this;
    }

    /**
     * Gets the value of the xchgForPhysInd property.
     * 
     */
    public boolean isXchgForPhysInd() {
        return xchgForPhysInd;
    }

    /**
     * Sets the value of the xchgForPhysInd property.
     * 
     */
    public Bid1 setXchgForPhysInd(boolean value) {
        this.xchgForPhysInd = value;
        return this;
    }

    /**
     * Gets the value of the frgnXchgExctnReqdInd property.
     * 
     */
    public boolean isFrgnXchgExctnReqdInd() {
        return frgnXchgExctnReqdInd;
    }

    /**
     * Sets the value of the frgnXchgExctnReqdInd property.
     * 
     */
    public Bid1 setFrgnXchgExctnReqdInd(boolean value) {
        this.frgnXchgExctnReqdInd = value;
        return this;
    }

    /**
     * Gets the value of the tradTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeType2Code }
     *     
     */
    public TradeType2Code getTradTp() {
        return tradTp;
    }

    /**
     * Sets the value of the tradTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeType2Code }
     *     
     */
    public Bid1 setTradTp(TradeType2Code value) {
        this.tradTp = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbTckts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbTckts() {
        return ttlNbTckts;
    }

    /**
     * Sets the value of the ttlNbTckts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Bid1 setTtlNbTckts(BigDecimal value) {
        this.ttlNbTckts = value;
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
    public Bid1 setPrgrsRptInd(Boolean value) {
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
    public XMLGregorianCalendar getPrgrsPrdIntrvl() {
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
    public Bid1 setPrgrsPrdIntrvl(XMLGregorianCalendar value) {
        this.prgrsPrdIntrvl = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfBddrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfBddrs() {
        return ttlNbOfBddrs;
    }

    /**
     * Sets the value of the ttlNbOfBddrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Bid1 setTtlNbOfBddrs(BigDecimal value) {
        this.ttlNbOfBddrs = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Bid1 setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the strkTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getStrkTm() {
        return strkTm;
    }

    /**
     * Sets the value of the strkTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Bid1 setStrkTm(XMLGregorianCalendar value) {
        this.strkTm = value;
        return this;
    }

    /**
     * Gets the value of the bsisPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link BasisPriceType1Choice }
     *     
     */
    public BasisPriceType1Choice getBsisPricTp() {
        return bsisPricTp;
    }

    /**
     * Sets the value of the bsisPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasisPriceType1Choice }
     *     
     */
    public Bid1 setBsisPricTp(BasisPriceType1Choice value) {
        this.bsisPricTp = value;
        return this;
    }

    /**
     * Gets the value of the lqdtyAndSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidityAndStatistics1 }
     *     
     */
    public LiquidityAndStatistics1 getLqdtyAndSttstcs() {
        return lqdtyAndSttstcs;
    }

    /**
     * Sets the value of the lqdtyAndSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidityAndStatistics1 }
     *     
     */
    public Bid1 setLqdtyAndSttstcs(LiquidityAndStatistics1 value) {
        this.lqdtyAndSttstcs = value;
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
