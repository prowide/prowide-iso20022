
package com.prowidesoftware.swift.model.mx.dic;

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
 * Goods or services that are part of a commercial trade agreement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemDetails4", propOrder = {
    "lineItmId",
    "qty",
    "qtyTlrnce",
    "unitPric",
    "pricTlrnce",
    "pdctNm",
    "pdctIdr",
    "pdctChrtcs",
    "pdctCtgy",
    "pdctOrgn",
    "latstShipmntDt",
    "rtgSummry",
    "incotrms",
    "adjstmnt",
    "frghtChrgs",
    "tax",
    "ttlAmt"
})
public class LineItemDetails4 {

    @XmlElement(name = "LineItmId", required = true)
    protected String lineItmId;
    @XmlElement(name = "Qty", required = true)
    protected Quantity2 qty;
    @XmlElement(name = "QtyTlrnce")
    protected PercentageTolerance1 qtyTlrnce;
    @XmlElement(name = "UnitPric")
    protected UnitPrice8 unitPric;
    @XmlElement(name = "PricTlrnce")
    protected PercentageTolerance1 pricTlrnce;
    @XmlElement(name = "PdctNm")
    protected String pdctNm;
    @XmlElement(name = "PdctIdr")
    protected List<ProductIdentifier2Choice> pdctIdr;
    @XmlElement(name = "PdctChrtcs")
    protected List<ProductCharacteristics1Choice> pdctChrtcs;
    @XmlElement(name = "PdctCtgy")
    protected List<ProductCategory1Choice> pdctCtgy;
    @XmlElement(name = "PdctOrgn")
    protected String pdctOrgn;
    @XmlElement(name = "LatstShipmntDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar latstShipmntDt;
    @XmlElement(name = "RtgSummry")
    protected TransportMeans1Choice rtgSummry;
    @XmlElement(name = "Incotrms")
    protected List<Incoterms1> incotrms;
    @XmlElement(name = "Adjstmnt")
    protected List<Adjustment3> adjstmnt;
    @XmlElement(name = "FrghtChrgs")
    protected Charge12 frghtChrgs;
    @XmlElement(name = "Tax")
    protected List<Tax13> tax;
    @XmlElement(name = "TtlAmt", required = true)
    protected CurrencyAndAmount ttlAmt;

    /**
     * Gets the value of the lineItmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItmId() {
        return lineItmId;
    }

    /**
     * Sets the value of the lineItmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LineItemDetails4 setLineItmId(String value) {
        this.lineItmId = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity2 }
     *     
     */
    public Quantity2 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity2 }
     *     
     */
    public LineItemDetails4 setQty(Quantity2 value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the qtyTlrnce property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageTolerance1 }
     *     
     */
    public PercentageTolerance1 getQtyTlrnce() {
        return qtyTlrnce;
    }

    /**
     * Sets the value of the qtyTlrnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageTolerance1 }
     *     
     */
    public LineItemDetails4 setQtyTlrnce(PercentageTolerance1 value) {
        this.qtyTlrnce = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice8 }
     *     
     */
    public UnitPrice8 getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice8 }
     *     
     */
    public LineItemDetails4 setUnitPric(UnitPrice8 value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the pricTlrnce property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageTolerance1 }
     *     
     */
    public PercentageTolerance1 getPricTlrnce() {
        return pricTlrnce;
    }

    /**
     * Sets the value of the pricTlrnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageTolerance1 }
     *     
     */
    public LineItemDetails4 setPricTlrnce(PercentageTolerance1 value) {
        this.pricTlrnce = value;
        return this;
    }

    /**
     * Gets the value of the pdctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctNm() {
        return pdctNm;
    }

    /**
     * Sets the value of the pdctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LineItemDetails4 setPdctNm(String value) {
        this.pdctNm = value;
        return this;
    }

    /**
     * Gets the value of the pdctIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdctIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdctIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentifier2Choice }
     * 
     * 
     */
    public List<ProductIdentifier2Choice> getPdctIdr() {
        if (pdctIdr == null) {
            pdctIdr = new ArrayList<ProductIdentifier2Choice>();
        }
        return this.pdctIdr;
    }

    /**
     * Gets the value of the pdctChrtcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdctChrtcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdctChrtcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCharacteristics1Choice }
     * 
     * 
     */
    public List<ProductCharacteristics1Choice> getPdctChrtcs() {
        if (pdctChrtcs == null) {
            pdctChrtcs = new ArrayList<ProductCharacteristics1Choice>();
        }
        return this.pdctChrtcs;
    }

    /**
     * Gets the value of the pdctCtgy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdctCtgy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdctCtgy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCategory1Choice }
     * 
     * 
     */
    public List<ProductCategory1Choice> getPdctCtgy() {
        if (pdctCtgy == null) {
            pdctCtgy = new ArrayList<ProductCategory1Choice>();
        }
        return this.pdctCtgy;
    }

    /**
     * Gets the value of the pdctOrgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctOrgn() {
        return pdctOrgn;
    }

    /**
     * Sets the value of the pdctOrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LineItemDetails4 setPdctOrgn(String value) {
        this.pdctOrgn = value;
        return this;
    }

    /**
     * Gets the value of the latstShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatstShipmntDt() {
        return latstShipmntDt;
    }

    /**
     * Sets the value of the latstShipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public LineItemDetails4 setLatstShipmntDt(XMLGregorianCalendar value) {
        this.latstShipmntDt = value;
        return this;
    }

    /**
     * Gets the value of the rtgSummry property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeans1Choice }
     *     
     */
    public TransportMeans1Choice getRtgSummry() {
        return rtgSummry;
    }

    /**
     * Sets the value of the rtgSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeans1Choice }
     *     
     */
    public LineItemDetails4 setRtgSummry(TransportMeans1Choice value) {
        this.rtgSummry = value;
        return this;
    }

    /**
     * Gets the value of the incotrms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incotrms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncotrms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Incoterms1 }
     * 
     * 
     */
    public List<Incoterms1> getIncotrms() {
        if (incotrms == null) {
            incotrms = new ArrayList<Incoterms1>();
        }
        return this.incotrms;
    }

    /**
     * Gets the value of the adjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adjustment3 }
     * 
     * 
     */
    public List<Adjustment3> getAdjstmnt() {
        if (adjstmnt == null) {
            adjstmnt = new ArrayList<Adjustment3>();
        }
        return this.adjstmnt;
    }

    /**
     * Gets the value of the frghtChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charge12 }
     *     
     */
    public Charge12 getFrghtChrgs() {
        return frghtChrgs;
    }

    /**
     * Sets the value of the frghtChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge12 }
     *     
     */
    public LineItemDetails4 setFrghtChrgs(Charge12 value) {
        this.frghtChrgs = value;
        return this;
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
     * {@link Tax13 }
     * 
     * 
     */
    public List<Tax13> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax13>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItemDetails4 setTtlAmt(CurrencyAndAmount value) {
        this.ttlAmt = value;
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
     * Adds a new item to the pdctIdr list.
     * @see #getPdctIdr()
     * 
     */
    public LineItemDetails4 addPdctIdr(ProductIdentifier2Choice pdctIdr) {
        getPdctIdr().add(pdctIdr);
        return this;
    }

    /**
     * Adds a new item to the pdctChrtcs list.
     * @see #getPdctChrtcs()
     * 
     */
    public LineItemDetails4 addPdctChrtcs(ProductCharacteristics1Choice pdctChrtcs) {
        getPdctChrtcs().add(pdctChrtcs);
        return this;
    }

    /**
     * Adds a new item to the pdctCtgy list.
     * @see #getPdctCtgy()
     * 
     */
    public LineItemDetails4 addPdctCtgy(ProductCategory1Choice pdctCtgy) {
        getPdctCtgy().add(pdctCtgy);
        return this;
    }

    /**
     * Adds a new item to the incotrms list.
     * @see #getIncotrms()
     * 
     */
    public LineItemDetails4 addIncotrms(Incoterms1 incotrms) {
        getIncotrms().add(incotrms);
        return this;
    }

    /**
     * Adds a new item to the adjstmnt list.
     * @see #getAdjstmnt()
     * 
     */
    public LineItemDetails4 addAdjstmnt(Adjustment3 adjstmnt) {
        getAdjstmnt().add(adjstmnt);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public LineItemDetails4 addTax(Tax13 tax) {
        getTax().add(tax);
        return this;
    }

}
