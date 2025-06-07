
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Agreement between the parties, stipulating the terms and conditions of the delivery of goods or services.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeContract3", propOrder = {
    "ctrctDocId",
    "tradTpId",
    "amt",
    "buyr",
    "sellr",
    "mtrtyDt",
    "prlngtnFlg",
    "startDt",
    "sttlmCcy",
    "xchgRateInf",
    "pmtSchdl",
    "shipmntSchdl",
    "attchmnt"
})
public class TradeContract3 {

    @XmlElement(name = "CtrctDocId")
    protected DocumentIdentification22 ctrctDocId;
    @XmlElement(name = "TradTpId")
    protected String tradTpId;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "Buyr", required = true)
    protected List<TradeParty5> buyr;
    @XmlElement(name = "Sellr", required = true)
    protected List<TradeParty5> sellr;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "PrlngtnFlg")
    protected Boolean prlngtnFlg;
    @XmlElement(name = "StartDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;
    @XmlElement(name = "XchgRateInf")
    protected ExchangeRate1 xchgRateInf;
    @XmlElement(name = "PmtSchdl")
    protected InterestPaymentDateRange1 pmtSchdl;
    @XmlElement(name = "ShipmntSchdl")
    protected ShipmentSchedule2Choice shipmntSchdl;
    @XmlElement(name = "Attchmnt")
    protected List<DocumentGeneralInformation5> attchmnt;

    /**
     * Gets the value of the ctrctDocId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getCtrctDocId() {
        return ctrctDocId;
    }

    /**
     * Sets the value of the ctrctDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public TradeContract3 setCtrctDocId(DocumentIdentification22 value) {
        this.ctrctDocId = value;
        return this;
    }

    /**
     * Gets the value of the tradTpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradTpId() {
        return tradTpId;
    }

    /**
     * Sets the value of the tradTpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeContract3 setTradTpId(String value) {
        this.tradTpId = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TradeContract3 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeParty5 }
     * 
     * 
     */
    public List<TradeParty5> getBuyr() {
        if (buyr == null) {
            buyr = new ArrayList<TradeParty5>();
        }
        return this.buyr;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeParty5 }
     * 
     * 
     */
    public List<TradeParty5> getSellr() {
        if (sellr == null) {
            sellr = new ArrayList<TradeParty5>();
        }
        return this.sellr;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeContract3 setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the prlngtnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrlngtnFlg() {
        return prlngtnFlg;
    }

    /**
     * Sets the value of the prlngtnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeContract3 setPrlngtnFlg(Boolean value) {
        this.prlngtnFlg = value;
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
    public XMLGregorianCalendar getStartDt() {
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
    public TradeContract3 setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeContract3 setSttlmCcy(String value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the xchgRateInf property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRate1 }
     *     
     */
    public ExchangeRate1 getXchgRateInf() {
        return xchgRateInf;
    }

    /**
     * Sets the value of the xchgRateInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRate1 }
     *     
     */
    public TradeContract3 setXchgRateInf(ExchangeRate1 value) {
        this.xchgRateInf = value;
        return this;
    }

    /**
     * Gets the value of the pmtSchdl property.
     * 
     * @return
     *     possible object is
     *     {@link InterestPaymentDateRange1 }
     *     
     */
    public InterestPaymentDateRange1 getPmtSchdl() {
        return pmtSchdl;
    }

    /**
     * Sets the value of the pmtSchdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestPaymentDateRange1 }
     *     
     */
    public TradeContract3 setPmtSchdl(InterestPaymentDateRange1 value) {
        this.pmtSchdl = value;
        return this;
    }

    /**
     * Gets the value of the shipmntSchdl property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentSchedule2Choice }
     *     
     */
    public ShipmentSchedule2Choice getShipmntSchdl() {
        return shipmntSchdl;
    }

    /**
     * Sets the value of the shipmntSchdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentSchedule2Choice }
     *     
     */
    public TradeContract3 setShipmntSchdl(ShipmentSchedule2Choice value) {
        this.shipmntSchdl = value;
        return this;
    }

    /**
     * Gets the value of the attchmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attchmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation5 }
     * 
     * 
     */
    public List<DocumentGeneralInformation5> getAttchmnt() {
        if (attchmnt == null) {
            attchmnt = new ArrayList<DocumentGeneralInformation5>();
        }
        return this.attchmnt;
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
     * Adds a new item to the buyr list.
     * @see #getBuyr()
     * 
     */
    public TradeContract3 addBuyr(TradeParty5 buyr) {
        getBuyr().add(buyr);
        return this;
    }

    /**
     * Adds a new item to the sellr list.
     * @see #getSellr()
     * 
     */
    public TradeContract3 addSellr(TradeParty5 sellr) {
        getSellr().add(sellr);
        return this;
    }

    /**
     * Adds a new item to the attchmnt list.
     * @see #getAttchmnt()
     * 
     */
    public TradeContract3 addAttchmnt(DocumentGeneralInformation5 attchmnt) {
        getAttchmnt().add(attchmnt);
        return this;
    }

}
