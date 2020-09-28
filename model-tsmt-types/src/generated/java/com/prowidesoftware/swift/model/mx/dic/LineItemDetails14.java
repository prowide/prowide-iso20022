
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "LineItemDetails14", propOrder = {
    "lineItmId",
    "qty",
    "unitPric",
    "pdctNm",
    "pdctIdr",
    "pdctChrtcs",
    "pdctCtgy",
    "pdctOrgn",
    "adjstmnt",
    "frghtChrgs",
    "tax",
    "ttlAmt"
})
public class LineItemDetails14 {

    @XmlElement(name = "LineItmId", required = true)
    protected String lineItmId;
    @XmlElement(name = "Qty", required = true)
    protected Quantity9 qty;
    @XmlElement(name = "UnitPric")
    protected UnitPrice18 unitPric;
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
    @XmlElement(name = "Adjstmnt")
    protected List<Adjustment6> adjstmnt;
    @XmlElement(name = "FrghtChrgs")
    protected Charge25 frghtChrgs;
    @XmlElement(name = "Tax")
    protected List<Tax22> tax;
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
    public LineItemDetails14 setLineItmId(String value) {
        this.lineItmId = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity9 }
     *     
     */
    public Quantity9 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity9 }
     *     
     */
    public LineItemDetails14 setQty(Quantity9 value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice18 }
     *     
     */
    public UnitPrice18 getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice18 }
     *     
     */
    public LineItemDetails14 setUnitPric(UnitPrice18 value) {
        this.unitPric = value;
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
    public LineItemDetails14 setPdctNm(String value) {
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
    public LineItemDetails14 setPdctOrgn(String value) {
        this.pdctOrgn = value;
        return this;
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
     * {@link Adjustment6 }
     * 
     * 
     */
    public List<Adjustment6> getAdjstmnt() {
        if (adjstmnt == null) {
            adjstmnt = new ArrayList<Adjustment6>();
        }
        return this.adjstmnt;
    }

    /**
     * Gets the value of the frghtChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charge25 }
     *     
     */
    public Charge25 getFrghtChrgs() {
        return frghtChrgs;
    }

    /**
     * Sets the value of the frghtChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge25 }
     *     
     */
    public LineItemDetails14 setFrghtChrgs(Charge25 value) {
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
     * {@link Tax22 }
     * 
     * 
     */
    public List<Tax22> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax22>();
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
    public LineItemDetails14 setTtlAmt(CurrencyAndAmount value) {
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
    public LineItemDetails14 addPdctIdr(ProductIdentifier2Choice pdctIdr) {
        getPdctIdr().add(pdctIdr);
        return this;
    }

    /**
     * Adds a new item to the pdctChrtcs list.
     * @see #getPdctChrtcs()
     * 
     */
    public LineItemDetails14 addPdctChrtcs(ProductCharacteristics1Choice pdctChrtcs) {
        getPdctChrtcs().add(pdctChrtcs);
        return this;
    }

    /**
     * Adds a new item to the pdctCtgy list.
     * @see #getPdctCtgy()
     * 
     */
    public LineItemDetails14 addPdctCtgy(ProductCategory1Choice pdctCtgy) {
        getPdctCtgy().add(pdctCtgy);
        return this;
    }

    /**
     * Adds a new item to the adjstmnt list.
     * @see #getAdjstmnt()
     * 
     */
    public LineItemDetails14 addAdjstmnt(Adjustment6 adjstmnt) {
        getAdjstmnt().add(adjstmnt);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public LineItemDetails14 addTax(Tax22 tax) {
        getTax().add(tax);
        return this;
    }

}
