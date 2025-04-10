
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Calculation of the current situation of a line item as a result of the submission of a commercial dataset.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemDetails5", propOrder = {
    "lineItmId",
    "pdctNm",
    "pdctIdr",
    "pdctChrtcs",
    "pdctCtgy",
    "ordrdQty",
    "accptdQty",
    "outsdngQty",
    "pdgQty",
    "qtyTlrnce",
    "ordrdAmt",
    "accptdAmt",
    "outsdngAmt",
    "pdgAmt",
    "pricTlrnce"
})
public class LineItemDetails5 {

    @XmlElement(name = "LineItmId", required = true)
    protected String lineItmId;
    @XmlElement(name = "PdctNm")
    protected String pdctNm;
    @XmlElement(name = "PdctIdr")
    protected List<ProductIdentifier2Choice> pdctIdr;
    @XmlElement(name = "PdctChrtcs")
    protected List<ProductCharacteristics1Choice> pdctChrtcs;
    @XmlElement(name = "PdctCtgy")
    protected List<ProductCategory1Choice> pdctCtgy;
    @XmlElement(name = "OrdrdQty", required = true)
    protected Quantity2 ordrdQty;
    @XmlElement(name = "AccptdQty", required = true)
    protected Quantity2 accptdQty;
    @XmlElement(name = "OutsdngQty", required = true)
    protected Quantity2 outsdngQty;
    @XmlElement(name = "PdgQty", required = true)
    protected Quantity2 pdgQty;
    @XmlElement(name = "QtyTlrnce")
    protected PercentageTolerance1 qtyTlrnce;
    @XmlElement(name = "OrdrdAmt", required = true)
    protected CurrencyAndAmount ordrdAmt;
    @XmlElement(name = "AccptdAmt", required = true)
    protected CurrencyAndAmount accptdAmt;
    @XmlElement(name = "OutsdngAmt", required = true)
    protected CurrencyAndAmount outsdngAmt;
    @XmlElement(name = "PdgAmt", required = true)
    protected CurrencyAndAmount pdgAmt;
    @XmlElement(name = "PricTlrnce")
    protected PercentageTolerance1 pricTlrnce;

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
    public LineItemDetails5 setLineItmId(String value) {
        this.lineItmId = value;
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
    public LineItemDetails5 setPdctNm(String value) {
        this.pdctNm = value;
        return this;
    }

    /**
     * Gets the value of the pdctIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdctIdr property.
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
     * @return
     *     The value of the pdctIdr property.
     */
    public List<ProductIdentifier2Choice> getPdctIdr() {
        if (pdctIdr == null) {
            pdctIdr = new ArrayList<>();
        }
        return this.pdctIdr;
    }

    /**
     * Gets the value of the pdctChrtcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdctChrtcs property.
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
     * @return
     *     The value of the pdctChrtcs property.
     */
    public List<ProductCharacteristics1Choice> getPdctChrtcs() {
        if (pdctChrtcs == null) {
            pdctChrtcs = new ArrayList<>();
        }
        return this.pdctChrtcs;
    }

    /**
     * Gets the value of the pdctCtgy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdctCtgy property.
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
     * @return
     *     The value of the pdctCtgy property.
     */
    public List<ProductCategory1Choice> getPdctCtgy() {
        if (pdctCtgy == null) {
            pdctCtgy = new ArrayList<>();
        }
        return this.pdctCtgy;
    }

    /**
     * Gets the value of the ordrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity2 }
     *     
     */
    public Quantity2 getOrdrdQty() {
        return ordrdQty;
    }

    /**
     * Sets the value of the ordrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity2 }
     *     
     */
    public LineItemDetails5 setOrdrdQty(Quantity2 value) {
        this.ordrdQty = value;
        return this;
    }

    /**
     * Gets the value of the accptdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity2 }
     *     
     */
    public Quantity2 getAccptdQty() {
        return accptdQty;
    }

    /**
     * Sets the value of the accptdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity2 }
     *     
     */
    public LineItemDetails5 setAccptdQty(Quantity2 value) {
        this.accptdQty = value;
        return this;
    }

    /**
     * Gets the value of the outsdngQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity2 }
     *     
     */
    public Quantity2 getOutsdngQty() {
        return outsdngQty;
    }

    /**
     * Sets the value of the outsdngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity2 }
     *     
     */
    public LineItemDetails5 setOutsdngQty(Quantity2 value) {
        this.outsdngQty = value;
        return this;
    }

    /**
     * Gets the value of the pdgQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity2 }
     *     
     */
    public Quantity2 getPdgQty() {
        return pdgQty;
    }

    /**
     * Sets the value of the pdgQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity2 }
     *     
     */
    public LineItemDetails5 setPdgQty(Quantity2 value) {
        this.pdgQty = value;
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
    public LineItemDetails5 setQtyTlrnce(PercentageTolerance1 value) {
        this.qtyTlrnce = value;
        return this;
    }

    /**
     * Gets the value of the ordrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getOrdrdAmt() {
        return ordrdAmt;
    }

    /**
     * Sets the value of the ordrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItemDetails5 setOrdrdAmt(CurrencyAndAmount value) {
        this.ordrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the accptdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAccptdAmt() {
        return accptdAmt;
    }

    /**
     * Sets the value of the accptdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItemDetails5 setAccptdAmt(CurrencyAndAmount value) {
        this.accptdAmt = value;
        return this;
    }

    /**
     * Gets the value of the outsdngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getOutsdngAmt() {
        return outsdngAmt;
    }

    /**
     * Sets the value of the outsdngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItemDetails5 setOutsdngAmt(CurrencyAndAmount value) {
        this.outsdngAmt = value;
        return this;
    }

    /**
     * Gets the value of the pdgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPdgAmt() {
        return pdgAmt;
    }

    /**
     * Sets the value of the pdgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItemDetails5 setPdgAmt(CurrencyAndAmount value) {
        this.pdgAmt = value;
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
    public LineItemDetails5 setPricTlrnce(PercentageTolerance1 value) {
        this.pricTlrnce = value;
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
    public LineItemDetails5 addPdctIdr(ProductIdentifier2Choice pdctIdr) {
        getPdctIdr().add(pdctIdr);
        return this;
    }

    /**
     * Adds a new item to the pdctChrtcs list.
     * @see #getPdctChrtcs()
     * 
     */
    public LineItemDetails5 addPdctChrtcs(ProductCharacteristics1Choice pdctChrtcs) {
        getPdctChrtcs().add(pdctChrtcs);
        return this;
    }

    /**
     * Adds a new item to the pdctCtgy list.
     * @see #getPdctCtgy()
     * 
     */
    public LineItemDetails5 addPdctCtgy(ProductCategory1Choice pdctCtgy) {
        getPdctCtgy().add(pdctCtgy);
        return this;
    }

}
