
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Unit of information showing the related provision of products and/or services and monetary summations reported as a discrete line items.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem17", propOrder = {
    "id",
    "tradPdct",
    "buyrOrdrId",
    "ctrctId",
    "purchsAcctgAcct",
    "netPric",
    "netPricQty",
    "netPricAllwncChrg",
    "netWght",
    "grssPric",
    "grssPricQty",
    "grssWght",
    "logstcsChrg",
    "tax",
    "allwncChrg",
    "finAdjstmnt",
    "blldQty",
    "packgQty",
    "perPackgUnitQty",
    "packgng",
    "chrgFreeQty",
    "measrQtyStart",
    "measrQtyEnd",
    "measrDtTmStart",
    "measrDtTmEnd",
    "shipTo",
    "incotrms",
    "dlvryDtTm",
    "dlvryNoteId",
    "mntrySummtn",
    "inclNote"
})
public class LineItem17 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "TradPdct")
    protected TradeProduct3 tradPdct;
    @XmlElement(name = "BuyrOrdrId")
    protected DocumentIdentification23 buyrOrdrId;
    @XmlElement(name = "CtrctId")
    protected DocumentIdentification22 ctrctId;
    @XmlElement(name = "PurchsAcctgAcct")
    protected List<AccountingAccount1> purchsAcctgAcct;
    @XmlElement(name = "NetPric")
    protected List<CurrencyAndAmount> netPric;
    @XmlElement(name = "NetPricQty")
    protected Quantity16 netPricQty;
    @XmlElement(name = "NetPricAllwncChrg")
    protected List<LineItemAllowanceCharge3> netPricAllwncChrg;
    @XmlElement(name = "NetWght")
    protected Quantity16 netWght;
    @XmlElement(name = "GrssPric")
    protected List<CurrencyAndAmount> grssPric;
    @XmlElement(name = "GrssPricQty")
    protected Quantity16 grssPricQty;
    @XmlElement(name = "GrssWght")
    protected Quantity16 grssWght;
    @XmlElement(name = "LogstcsChrg")
    protected List<ChargesDetails4> logstcsChrg;
    @XmlElement(name = "Tax")
    protected List<LineItemTax1> tax;
    @XmlElement(name = "AllwncChrg")
    protected List<LineItemAllowanceCharge3> allwncChrg;
    @XmlElement(name = "FinAdjstmnt")
    protected List<Adjustment6> finAdjstmnt;
    @XmlElement(name = "BlldQty")
    protected Quantity16 blldQty;
    @XmlElement(name = "PackgQty")
    protected BigDecimal packgQty;
    @XmlElement(name = "PerPackgUnitQty")
    protected Quantity16 perPackgUnitQty;
    @XmlElement(name = "Packgng")
    protected List<Packaging1> packgng;
    @XmlElement(name = "ChrgFreeQty")
    protected Quantity16 chrgFreeQty;
    @XmlElement(name = "MeasrQtyStart")
    protected Quantity16 measrQtyStart;
    @XmlElement(name = "MeasrQtyEnd")
    protected Quantity16 measrQtyEnd;
    @XmlElement(name = "MeasrDtTmStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measrDtTmStart;
    @XmlElement(name = "MeasrDtTmEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measrDtTmEnd;
    @XmlElement(name = "ShipTo")
    protected TradeParty4 shipTo;
    @XmlElement(name = "Incotrms")
    protected Incoterms3 incotrms;
    @XmlElement(name = "DlvryDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dlvryDtTm;
    @XmlElement(name = "DlvryNoteId")
    protected DocumentIdentification22 dlvryNoteId;
    @XmlElement(name = "MntrySummtn")
    protected LineItemMonetarySummation1 mntrySummtn;
    @XmlElement(name = "InclNote")
    protected List<AdditionalInformation1> inclNote;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LineItem17 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the tradPdct property.
     * 
     * @return
     *     possible object is
     *     {@link TradeProduct3 }
     *     
     */
    public TradeProduct3 getTradPdct() {
        return tradPdct;
    }

    /**
     * Sets the value of the tradPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeProduct3 }
     *     
     */
    public LineItem17 setTradPdct(TradeProduct3 value) {
        this.tradPdct = value;
        return this;
    }

    /**
     * Gets the value of the buyrOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification23 }
     *     
     */
    public DocumentIdentification23 getBuyrOrdrId() {
        return buyrOrdrId;
    }

    /**
     * Sets the value of the buyrOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification23 }
     *     
     */
    public LineItem17 setBuyrOrdrId(DocumentIdentification23 value) {
        this.buyrOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the ctrctId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getCtrctId() {
        return ctrctId;
    }

    /**
     * Sets the value of the ctrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public LineItem17 setCtrctId(DocumentIdentification22 value) {
        this.ctrctId = value;
        return this;
    }

    /**
     * Gets the value of the purchsAcctgAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchsAcctgAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchsAcctgAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingAccount1 }
     * 
     * 
     */
    public List<AccountingAccount1> getPurchsAcctgAcct() {
        if (purchsAcctgAcct == null) {
            purchsAcctgAcct = new ArrayList<AccountingAccount1>();
        }
        return this.purchsAcctgAcct;
    }

    /**
     * Gets the value of the netPric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netPric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetPric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     */
    public List<CurrencyAndAmount> getNetPric() {
        if (netPric == null) {
            netPric = new ArrayList<CurrencyAndAmount>();
        }
        return this.netPric;
    }

    /**
     * Gets the value of the netPricQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity16 }
     *     
     */
    public Quantity16 getNetPricQty() {
        return netPricQty;
    }

    /**
     * Sets the value of the netPricQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity16 }
     *     
     */
    public LineItem17 setNetPricQty(Quantity16 value) {
        this.netPricQty = value;
        return this;
    }

    /**
     * Gets the value of the netPricAllwncChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netPricAllwncChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetPricAllwncChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemAllowanceCharge3 }
     * 
     * 
     */
    public List<LineItemAllowanceCharge3> getNetPricAllwncChrg() {
        if (netPricAllwncChrg == null) {
            netPricAllwncChrg = new ArrayList<LineItemAllowanceCharge3>();
        }
        return this.netPricAllwncChrg;
    }

    /**
     * Gets the value of the netWght property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity16 }
     *     
     */
    public Quantity16 getNetWght() {
        return netWght;
    }

    /**
     * Sets the value of the netWght property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity16 }
     *     
     */
    public LineItem17 setNetWght(Quantity16 value) {
        this.netWght = value;
        return this;
    }

    /**
     * Gets the value of the grssPric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grssPric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrssPric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     */
    public List<CurrencyAndAmount> getGrssPric() {
        if (grssPric == null) {
            grssPric = new ArrayList<CurrencyAndAmount>();
        }
        return this.grssPric;
    }

    /**
     * Gets the value of the grssPricQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity16 }
     *     
     */
    public Quantity16 getGrssPricQty() {
        return grssPricQty;
    }

    /**
     * Sets the value of the grssPricQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity16 }
     *     
     */
    public LineItem17 setGrssPricQty(Quantity16 value) {
        this.grssPricQty = value;
        return this;
    }

    /**
     * Gets the value of the grssWght property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity16 }
     *     
     */
    public Quantity16 getGrssWght() {
        return grssWght;
    }

    /**
     * Sets the value of the grssWght property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity16 }
     *     
     */
    public LineItem17 setGrssWght(Quantity16 value) {
        this.grssWght = value;
        return this;
    }

    /**
     * Gets the value of the logstcsChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logstcsChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogstcsChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesDetails4 }
     * 
     * 
     */
    public List<ChargesDetails4> getLogstcsChrg() {
        if (logstcsChrg == null) {
            logstcsChrg = new ArrayList<ChargesDetails4>();
        }
        return this.logstcsChrg;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemTax1 }
     * 
     * 
     */
    public List<LineItemTax1> getTax() {
        if (tax == null) {
            tax = new ArrayList<LineItemTax1>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the allwncChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allwncChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwncChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemAllowanceCharge3 }
     * 
     * 
     */
    public List<LineItemAllowanceCharge3> getAllwncChrg() {
        if (allwncChrg == null) {
            allwncChrg = new ArrayList<LineItemAllowanceCharge3>();
        }
        return this.allwncChrg;
    }

    /**
     * Gets the value of the finAdjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finAdjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adjustment6 }
     * 
     * 
     */
    public List<Adjustment6> getFinAdjstmnt() {
        if (finAdjstmnt == null) {
            finAdjstmnt = new ArrayList<Adjustment6>();
        }
        return this.finAdjstmnt;
    }

    /**
     * Gets the value of the blldQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity16 }
     *     
     */
    public Quantity16 getBlldQty() {
        return blldQty;
    }

    /**
     * Sets the value of the blldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity16 }
     *     
     */
    public LineItem17 setBlldQty(Quantity16 value) {
        this.blldQty = value;
        return this;
    }

    /**
     * Gets the value of the packgQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPackgQty() {
        return packgQty;
    }

    /**
     * Sets the value of the packgQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LineItem17 setPackgQty(BigDecimal value) {
        this.packgQty = value;
        return this;
    }

    /**
     * Gets the value of the perPackgUnitQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity16 }
     *     
     */
    public Quantity16 getPerPackgUnitQty() {
        return perPackgUnitQty;
    }

    /**
     * Sets the value of the perPackgUnitQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity16 }
     *     
     */
    public LineItem17 setPerPackgUnitQty(Quantity16 value) {
        this.perPackgUnitQty = value;
        return this;
    }

    /**
     * Gets the value of the packgng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packgng property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackgng().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Packaging1 }
     * 
     * 
     */
    public List<Packaging1> getPackgng() {
        if (packgng == null) {
            packgng = new ArrayList<Packaging1>();
        }
        return this.packgng;
    }

    /**
     * Gets the value of the chrgFreeQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity16 }
     *     
     */
    public Quantity16 getChrgFreeQty() {
        return chrgFreeQty;
    }

    /**
     * Sets the value of the chrgFreeQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity16 }
     *     
     */
    public LineItem17 setChrgFreeQty(Quantity16 value) {
        this.chrgFreeQty = value;
        return this;
    }

    /**
     * Gets the value of the measrQtyStart property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity16 }
     *     
     */
    public Quantity16 getMeasrQtyStart() {
        return measrQtyStart;
    }

    /**
     * Sets the value of the measrQtyStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity16 }
     *     
     */
    public LineItem17 setMeasrQtyStart(Quantity16 value) {
        this.measrQtyStart = value;
        return this;
    }

    /**
     * Gets the value of the measrQtyEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity16 }
     *     
     */
    public Quantity16 getMeasrQtyEnd() {
        return measrQtyEnd;
    }

    /**
     * Sets the value of the measrQtyEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity16 }
     *     
     */
    public LineItem17 setMeasrQtyEnd(Quantity16 value) {
        this.measrQtyEnd = value;
        return this;
    }

    /**
     * Gets the value of the measrDtTmStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasrDtTmStart() {
        return measrDtTmStart;
    }

    /**
     * Sets the value of the measrDtTmStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public LineItem17 setMeasrDtTmStart(XMLGregorianCalendar value) {
        this.measrDtTmStart = value;
        return this;
    }

    /**
     * Gets the value of the measrDtTmEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasrDtTmEnd() {
        return measrDtTmEnd;
    }

    /**
     * Sets the value of the measrDtTmEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public LineItem17 setMeasrDtTmEnd(XMLGregorianCalendar value) {
        this.measrDtTmEnd = value;
        return this;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty4 }
     *     
     */
    public TradeParty4 getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty4 }
     *     
     */
    public LineItem17 setShipTo(TradeParty4 value) {
        this.shipTo = value;
        return this;
    }

    /**
     * Gets the value of the incotrms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms3 }
     *     
     */
    public Incoterms3 getIncotrms() {
        return incotrms;
    }

    /**
     * Sets the value of the incotrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms3 }
     *     
     */
    public LineItem17 setIncotrms(Incoterms3 value) {
        this.incotrms = value;
        return this;
    }

    /**
     * Gets the value of the dlvryDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDlvryDtTm() {
        return dlvryDtTm;
    }

    /**
     * Sets the value of the dlvryDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public LineItem17 setDlvryDtTm(XMLGregorianCalendar value) {
        this.dlvryDtTm = value;
        return this;
    }

    /**
     * Gets the value of the dlvryNoteId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public DocumentIdentification22 getDlvryNoteId() {
        return dlvryNoteId;
    }

    /**
     * Sets the value of the dlvryNoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification22 }
     *     
     */
    public LineItem17 setDlvryNoteId(DocumentIdentification22 value) {
        this.dlvryNoteId = value;
        return this;
    }

    /**
     * Gets the value of the mntrySummtn property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemMonetarySummation1 }
     *     
     */
    public LineItemMonetarySummation1 getMntrySummtn() {
        return mntrySummtn;
    }

    /**
     * Sets the value of the mntrySummtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemMonetarySummation1 }
     *     
     */
    public LineItem17 setMntrySummtn(LineItemMonetarySummation1 value) {
        this.mntrySummtn = value;
        return this;
    }

    /**
     * Gets the value of the inclNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inclNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation1 }
     * 
     * 
     */
    public List<AdditionalInformation1> getInclNote() {
        if (inclNote == null) {
            inclNote = new ArrayList<AdditionalInformation1>();
        }
        return this.inclNote;
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
     * Adds a new item to the purchsAcctgAcct list.
     * @see #getPurchsAcctgAcct()
     * 
     */
    public LineItem17 addPurchsAcctgAcct(AccountingAccount1 purchsAcctgAcct) {
        getPurchsAcctgAcct().add(purchsAcctgAcct);
        return this;
    }

    /**
     * Adds a new item to the netPric list.
     * @see #getNetPric()
     * 
     */
    public LineItem17 addNetPric(CurrencyAndAmount netPric) {
        getNetPric().add(netPric);
        return this;
    }

    /**
     * Adds a new item to the netPricAllwncChrg list.
     * @see #getNetPricAllwncChrg()
     * 
     */
    public LineItem17 addNetPricAllwncChrg(LineItemAllowanceCharge3 netPricAllwncChrg) {
        getNetPricAllwncChrg().add(netPricAllwncChrg);
        return this;
    }

    /**
     * Adds a new item to the grssPric list.
     * @see #getGrssPric()
     * 
     */
    public LineItem17 addGrssPric(CurrencyAndAmount grssPric) {
        getGrssPric().add(grssPric);
        return this;
    }

    /**
     * Adds a new item to the logstcsChrg list.
     * @see #getLogstcsChrg()
     * 
     */
    public LineItem17 addLogstcsChrg(ChargesDetails4 logstcsChrg) {
        getLogstcsChrg().add(logstcsChrg);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public LineItem17 addTax(LineItemTax1 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the allwncChrg list.
     * @see #getAllwncChrg()
     * 
     */
    public LineItem17 addAllwncChrg(LineItemAllowanceCharge3 allwncChrg) {
        getAllwncChrg().add(allwncChrg);
        return this;
    }

    /**
     * Adds a new item to the finAdjstmnt list.
     * @see #getFinAdjstmnt()
     * 
     */
    public LineItem17 addFinAdjstmnt(Adjustment6 finAdjstmnt) {
        getFinAdjstmnt().add(finAdjstmnt);
        return this;
    }

    /**
     * Adds a new item to the packgng list.
     * @see #getPackgng()
     * 
     */
    public LineItem17 addPackgng(Packaging1 packgng) {
        getPackgng().add(packgng);
        return this;
    }

    /**
     * Adds a new item to the inclNote list.
     * @see #getInclNote()
     * 
     */
    public LineItem17 addInclNote(AdditionalInformation1 inclNote) {
        getInclNote().add(inclNote);
        return this;
    }

}
