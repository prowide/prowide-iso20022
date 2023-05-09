
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Unit of information showing the related provision of products and/or services and monetary summations reported as a discrete line items.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem10", propOrder = {
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
public class LineItem10 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "TradPdct")
    protected TradeProduct1 tradPdct;
    @XmlElement(name = "BuyrOrdrId")
    protected DocumentIdentification23 buyrOrdrId;
    @XmlElement(name = "CtrctId")
    protected DocumentIdentification22 ctrctId;
    @XmlElement(name = "PurchsAcctgAcct")
    protected List<AccountingAccount1> purchsAcctgAcct;
    @XmlElement(name = "NetPric")
    protected List<CurrencyAndAmount> netPric;
    @XmlElement(name = "NetPricQty")
    protected Quantity4 netPricQty;
    @XmlElement(name = "NetPricAllwncChrg")
    protected List<LineItemAllowanceCharge1> netPricAllwncChrg;
    @XmlElement(name = "NetWght")
    protected Quantity3 netWght;
    @XmlElement(name = "GrssPric")
    protected List<CurrencyAndAmount> grssPric;
    @XmlElement(name = "GrssPricQty")
    protected Quantity4 grssPricQty;
    @XmlElement(name = "GrssWght")
    protected Quantity3 grssWght;
    @XmlElement(name = "LogstcsChrg")
    protected List<ChargesDetails2> logstcsChrg;
    @XmlElement(name = "Tax")
    protected List<LineItemTax1> tax;
    @XmlElement(name = "AllwncChrg")
    protected List<LineItemAllowanceCharge1> allwncChrg;
    @XmlElement(name = "FinAdjstmnt")
    protected List<Adjustment4> finAdjstmnt;
    @XmlElement(name = "BlldQty")
    protected Quantity3 blldQty;
    @XmlElement(name = "PackgQty")
    protected BigDecimal packgQty;
    @XmlElement(name = "PerPackgUnitQty")
    protected Quantity3 perPackgUnitQty;
    @XmlElement(name = "Packgng")
    protected List<Packaging1> packgng;
    @XmlElement(name = "ChrgFreeQty")
    protected Quantity3 chrgFreeQty;
    @XmlElement(name = "MeasrQtyStart")
    protected Quantity3 measrQtyStart;
    @XmlElement(name = "MeasrQtyEnd")
    protected Quantity3 measrQtyEnd;
    @XmlElement(name = "MeasrDtTmStart", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime measrDtTmStart;
    @XmlElement(name = "MeasrDtTmEnd", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime measrDtTmEnd;
    @XmlElement(name = "ShipTo")
    protected TradeParty1 shipTo;
    @XmlElement(name = "Incotrms")
    protected Incoterms3 incotrms;
    @XmlElement(name = "DlvryDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dlvryDtTm;
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
    public LineItem10 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the tradPdct property.
     * 
     * @return
     *     possible object is
     *     {@link TradeProduct1 }
     *     
     */
    public TradeProduct1 getTradPdct() {
        return tradPdct;
    }

    /**
     * Sets the value of the tradPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeProduct1 }
     *     
     */
    public LineItem10 setTradPdct(TradeProduct1 value) {
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
    public LineItem10 setBuyrOrdrId(DocumentIdentification23 value) {
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
    public LineItem10 setCtrctId(DocumentIdentification22 value) {
        this.ctrctId = value;
        return this;
    }

    /**
     * Gets the value of the purchsAcctgAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the purchsAcctgAcct property.
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
     * @return
     *     The value of the purchsAcctgAcct property.
     */
    public List<AccountingAccount1> getPurchsAcctgAcct() {
        if (purchsAcctgAcct == null) {
            purchsAcctgAcct = new ArrayList<>();
        }
        return this.purchsAcctgAcct;
    }

    /**
     * Gets the value of the netPric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the netPric property.
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
     * @return
     *     The value of the netPric property.
     */
    public List<CurrencyAndAmount> getNetPric() {
        if (netPric == null) {
            netPric = new ArrayList<>();
        }
        return this.netPric;
    }

    /**
     * Gets the value of the netPricQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity4 }
     *     
     */
    public Quantity4 getNetPricQty() {
        return netPricQty;
    }

    /**
     * Sets the value of the netPricQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity4 }
     *     
     */
    public LineItem10 setNetPricQty(Quantity4 value) {
        this.netPricQty = value;
        return this;
    }

    /**
     * Gets the value of the netPricAllwncChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the netPricAllwncChrg property.
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
     * {@link LineItemAllowanceCharge1 }
     * 
     * 
     * @return
     *     The value of the netPricAllwncChrg property.
     */
    public List<LineItemAllowanceCharge1> getNetPricAllwncChrg() {
        if (netPricAllwncChrg == null) {
            netPricAllwncChrg = new ArrayList<>();
        }
        return this.netPricAllwncChrg;
    }

    /**
     * Gets the value of the netWght property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity3 }
     *     
     */
    public Quantity3 getNetWght() {
        return netWght;
    }

    /**
     * Sets the value of the netWght property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity3 }
     *     
     */
    public LineItem10 setNetWght(Quantity3 value) {
        this.netWght = value;
        return this;
    }

    /**
     * Gets the value of the grssPric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the grssPric property.
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
     * @return
     *     The value of the grssPric property.
     */
    public List<CurrencyAndAmount> getGrssPric() {
        if (grssPric == null) {
            grssPric = new ArrayList<>();
        }
        return this.grssPric;
    }

    /**
     * Gets the value of the grssPricQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity4 }
     *     
     */
    public Quantity4 getGrssPricQty() {
        return grssPricQty;
    }

    /**
     * Sets the value of the grssPricQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity4 }
     *     
     */
    public LineItem10 setGrssPricQty(Quantity4 value) {
        this.grssPricQty = value;
        return this;
    }

    /**
     * Gets the value of the grssWght property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity3 }
     *     
     */
    public Quantity3 getGrssWght() {
        return grssWght;
    }

    /**
     * Sets the value of the grssWght property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity3 }
     *     
     */
    public LineItem10 setGrssWght(Quantity3 value) {
        this.grssWght = value;
        return this;
    }

    /**
     * Gets the value of the logstcsChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the logstcsChrg property.
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
     * {@link ChargesDetails2 }
     * 
     * 
     * @return
     *     The value of the logstcsChrg property.
     */
    public List<ChargesDetails2> getLogstcsChrg() {
        if (logstcsChrg == null) {
            logstcsChrg = new ArrayList<>();
        }
        return this.logstcsChrg;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
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
     * @return
     *     The value of the tax property.
     */
    public List<LineItemTax1> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the allwncChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwncChrg property.
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
     * {@link LineItemAllowanceCharge1 }
     * 
     * 
     * @return
     *     The value of the allwncChrg property.
     */
    public List<LineItemAllowanceCharge1> getAllwncChrg() {
        if (allwncChrg == null) {
            allwncChrg = new ArrayList<>();
        }
        return this.allwncChrg;
    }

    /**
     * Gets the value of the finAdjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finAdjstmnt property.
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
     * {@link Adjustment4 }
     * 
     * 
     * @return
     *     The value of the finAdjstmnt property.
     */
    public List<Adjustment4> getFinAdjstmnt() {
        if (finAdjstmnt == null) {
            finAdjstmnt = new ArrayList<>();
        }
        return this.finAdjstmnt;
    }

    /**
     * Gets the value of the blldQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity3 }
     *     
     */
    public Quantity3 getBlldQty() {
        return blldQty;
    }

    /**
     * Sets the value of the blldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity3 }
     *     
     */
    public LineItem10 setBlldQty(Quantity3 value) {
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
    public LineItem10 setPackgQty(BigDecimal value) {
        this.packgQty = value;
        return this;
    }

    /**
     * Gets the value of the perPackgUnitQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity3 }
     *     
     */
    public Quantity3 getPerPackgUnitQty() {
        return perPackgUnitQty;
    }

    /**
     * Sets the value of the perPackgUnitQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity3 }
     *     
     */
    public LineItem10 setPerPackgUnitQty(Quantity3 value) {
        this.perPackgUnitQty = value;
        return this;
    }

    /**
     * Gets the value of the packgng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the packgng property.
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
     * @return
     *     The value of the packgng property.
     */
    public List<Packaging1> getPackgng() {
        if (packgng == null) {
            packgng = new ArrayList<>();
        }
        return this.packgng;
    }

    /**
     * Gets the value of the chrgFreeQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity3 }
     *     
     */
    public Quantity3 getChrgFreeQty() {
        return chrgFreeQty;
    }

    /**
     * Sets the value of the chrgFreeQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity3 }
     *     
     */
    public LineItem10 setChrgFreeQty(Quantity3 value) {
        this.chrgFreeQty = value;
        return this;
    }

    /**
     * Gets the value of the measrQtyStart property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity3 }
     *     
     */
    public Quantity3 getMeasrQtyStart() {
        return measrQtyStart;
    }

    /**
     * Sets the value of the measrQtyStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity3 }
     *     
     */
    public LineItem10 setMeasrQtyStart(Quantity3 value) {
        this.measrQtyStart = value;
        return this;
    }

    /**
     * Gets the value of the measrQtyEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity3 }
     *     
     */
    public Quantity3 getMeasrQtyEnd() {
        return measrQtyEnd;
    }

    /**
     * Sets the value of the measrQtyEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity3 }
     *     
     */
    public LineItem10 setMeasrQtyEnd(Quantity3 value) {
        this.measrQtyEnd = value;
        return this;
    }

    /**
     * Gets the value of the measrDtTmStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getMeasrDtTmStart() {
        return measrDtTmStart;
    }

    /**
     * Sets the value of the measrDtTmStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LineItem10 setMeasrDtTmStart(OffsetDateTime value) {
        this.measrDtTmStart = value;
        return this;
    }

    /**
     * Gets the value of the measrDtTmEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getMeasrDtTmEnd() {
        return measrDtTmEnd;
    }

    /**
     * Sets the value of the measrDtTmEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LineItem10 setMeasrDtTmEnd(OffsetDateTime value) {
        this.measrDtTmEnd = value;
        return this;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeParty1 getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty1 }
     *     
     */
    public LineItem10 setShipTo(TradeParty1 value) {
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
    public LineItem10 setIncotrms(Incoterms3 value) {
        this.incotrms = value;
        return this;
    }

    /**
     * Gets the value of the dlvryDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getDlvryDtTm() {
        return dlvryDtTm;
    }

    /**
     * Sets the value of the dlvryDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LineItem10 setDlvryDtTm(OffsetDateTime value) {
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
    public LineItem10 setDlvryNoteId(DocumentIdentification22 value) {
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
    public LineItem10 setMntrySummtn(LineItemMonetarySummation1 value) {
        this.mntrySummtn = value;
        return this;
    }

    /**
     * Gets the value of the inclNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the inclNote property.
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
     * @return
     *     The value of the inclNote property.
     */
    public List<AdditionalInformation1> getInclNote() {
        if (inclNote == null) {
            inclNote = new ArrayList<>();
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
    public LineItem10 addPurchsAcctgAcct(AccountingAccount1 purchsAcctgAcct) {
        getPurchsAcctgAcct().add(purchsAcctgAcct);
        return this;
    }

    /**
     * Adds a new item to the netPric list.
     * @see #getNetPric()
     * 
     */
    public LineItem10 addNetPric(CurrencyAndAmount netPric) {
        getNetPric().add(netPric);
        return this;
    }

    /**
     * Adds a new item to the netPricAllwncChrg list.
     * @see #getNetPricAllwncChrg()
     * 
     */
    public LineItem10 addNetPricAllwncChrg(LineItemAllowanceCharge1 netPricAllwncChrg) {
        getNetPricAllwncChrg().add(netPricAllwncChrg);
        return this;
    }

    /**
     * Adds a new item to the grssPric list.
     * @see #getGrssPric()
     * 
     */
    public LineItem10 addGrssPric(CurrencyAndAmount grssPric) {
        getGrssPric().add(grssPric);
        return this;
    }

    /**
     * Adds a new item to the logstcsChrg list.
     * @see #getLogstcsChrg()
     * 
     */
    public LineItem10 addLogstcsChrg(ChargesDetails2 logstcsChrg) {
        getLogstcsChrg().add(logstcsChrg);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public LineItem10 addTax(LineItemTax1 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the allwncChrg list.
     * @see #getAllwncChrg()
     * 
     */
    public LineItem10 addAllwncChrg(LineItemAllowanceCharge1 allwncChrg) {
        getAllwncChrg().add(allwncChrg);
        return this;
    }

    /**
     * Adds a new item to the finAdjstmnt list.
     * @see #getFinAdjstmnt()
     * 
     */
    public LineItem10 addFinAdjstmnt(Adjustment4 finAdjstmnt) {
        getFinAdjstmnt().add(finAdjstmnt);
        return this;
    }

    /**
     * Adds a new item to the packgng list.
     * @see #getPackgng()
     * 
     */
    public LineItem10 addPackgng(Packaging1 packgng) {
        getPackgng().add(packgng);
        return this;
    }

    /**
     * Adds a new item to the inclNote list.
     * @see #getInclNote()
     * 
     */
    public LineItem10 addInclNote(AdditionalInformation1 inclNote) {
        getInclNote().add(inclNote);
        return this;
    }

}
