
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
 * Commercial details of a trade transaction between a buyer and a seller.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem9", propOrder = {
    "purchsOrdrRef",
    "fnlSubmissn",
    "comrclLineItms",
    "lineItmsTtlAmt",
    "incotrms",
    "adjstmnt",
    "frghtChrgs",
    "tax",
    "ttlNetAmt",
    "buyrDfndInf",
    "sellrDfndInf"
})
public class LineItem9 {

    @XmlElement(name = "PurchsOrdrRef", required = true)
    protected DocumentIdentification7 purchsOrdrRef;
    @XmlElement(name = "FnlSubmissn")
    protected boolean fnlSubmissn;
    @XmlElement(name = "ComrclLineItms", required = true)
    protected List<LineItemDetails9> comrclLineItms;
    @XmlElement(name = "LineItmsTtlAmt", required = true)
    protected CurrencyAndAmount lineItmsTtlAmt;
    @XmlElement(name = "Incotrms")
    protected Incoterms2 incotrms;
    @XmlElement(name = "Adjstmnt")
    protected List<Adjustment4> adjstmnt;
    @XmlElement(name = "FrghtChrgs")
    protected Charge13 frghtChrgs;
    @XmlElement(name = "Tax")
    protected List<Tax12> tax;
    @XmlElement(name = "TtlNetAmt", required = true)
    protected CurrencyAndAmount ttlNetAmt;
    @XmlElement(name = "BuyrDfndInf")
    protected List<UserDefinedInformation1> buyrDfndInf;
    @XmlElement(name = "SellrDfndInf")
    protected List<UserDefinedInformation1> sellrDfndInf;

    /**
     * Gets the value of the purchsOrdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public DocumentIdentification7 getPurchsOrdrRef() {
        return purchsOrdrRef;
    }

    /**
     * Sets the value of the purchsOrdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public LineItem9 setPurchsOrdrRef(DocumentIdentification7 value) {
        this.purchsOrdrRef = value;
        return this;
    }

    /**
     * Gets the value of the fnlSubmissn property.
     * 
     */
    public boolean isFnlSubmissn() {
        return fnlSubmissn;
    }

    /**
     * Sets the value of the fnlSubmissn property.
     * 
     */
    public LineItem9 setFnlSubmissn(boolean value) {
        this.fnlSubmissn = value;
        return this;
    }

    /**
     * Gets the value of the comrclLineItms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comrclLineItms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComrclLineItms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemDetails9 }
     * 
     * 
     */
    public List<LineItemDetails9> getComrclLineItms() {
        if (comrclLineItms == null) {
            comrclLineItms = new ArrayList<LineItemDetails9>();
        }
        return this.comrclLineItms;
    }

    /**
     * Gets the value of the lineItmsTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getLineItmsTtlAmt() {
        return lineItmsTtlAmt;
    }

    /**
     * Sets the value of the lineItmsTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItem9 setLineItmsTtlAmt(CurrencyAndAmount value) {
        this.lineItmsTtlAmt = value;
        return this;
    }

    /**
     * Gets the value of the incotrms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms2 }
     *     
     */
    public Incoterms2 getIncotrms() {
        return incotrms;
    }

    /**
     * Sets the value of the incotrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms2 }
     *     
     */
    public LineItem9 setIncotrms(Incoterms2 value) {
        this.incotrms = value;
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
     * {@link Adjustment4 }
     * 
     * 
     */
    public List<Adjustment4> getAdjstmnt() {
        if (adjstmnt == null) {
            adjstmnt = new ArrayList<Adjustment4>();
        }
        return this.adjstmnt;
    }

    /**
     * Gets the value of the frghtChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charge13 }
     *     
     */
    public Charge13 getFrghtChrgs() {
        return frghtChrgs;
    }

    /**
     * Sets the value of the frghtChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge13 }
     *     
     */
    public LineItem9 setFrghtChrgs(Charge13 value) {
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
     * {@link Tax12 }
     * 
     * 
     */
    public List<Tax12> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax12>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the ttlNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTtlNetAmt() {
        return ttlNetAmt;
    }

    /**
     * Sets the value of the ttlNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public LineItem9 setTtlNetAmt(CurrencyAndAmount value) {
        this.ttlNetAmt = value;
        return this;
    }

    /**
     * Gets the value of the buyrDfndInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyrDfndInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrDfndInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedInformation1 }
     * 
     * 
     */
    public List<UserDefinedInformation1> getBuyrDfndInf() {
        if (buyrDfndInf == null) {
            buyrDfndInf = new ArrayList<UserDefinedInformation1>();
        }
        return this.buyrDfndInf;
    }

    /**
     * Gets the value of the sellrDfndInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellrDfndInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellrDfndInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDefinedInformation1 }
     * 
     * 
     */
    public List<UserDefinedInformation1> getSellrDfndInf() {
        if (sellrDfndInf == null) {
            sellrDfndInf = new ArrayList<UserDefinedInformation1>();
        }
        return this.sellrDfndInf;
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
     * Adds a new item to the comrclLineItms list.
     * @see #getComrclLineItms()
     * 
     */
    public LineItem9 addComrclLineItms(LineItemDetails9 comrclLineItms) {
        getComrclLineItms().add(comrclLineItms);
        return this;
    }

    /**
     * Adds a new item to the adjstmnt list.
     * @see #getAdjstmnt()
     * 
     */
    public LineItem9 addAdjstmnt(Adjustment4 adjstmnt) {
        getAdjstmnt().add(adjstmnt);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public LineItem9 addTax(Tax12 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the buyrDfndInf list.
     * @see #getBuyrDfndInf()
     * 
     */
    public LineItem9 addBuyrDfndInf(UserDefinedInformation1 buyrDfndInf) {
        getBuyrDfndInf().add(buyrDfndInf);
        return this;
    }

    /**
     * Adds a new item to the sellrDfndInf list.
     * @see #getSellrDfndInf()
     * 
     */
    public LineItem9 addSellrDfndInf(UserDefinedInformation1 sellrDfndInf) {
        getSellrDfndInf().add(sellrDfndInf);
        return this;
    }

}
