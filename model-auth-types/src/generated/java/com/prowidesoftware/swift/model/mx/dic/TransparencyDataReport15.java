
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Provides for reporting quantitative data of non-equity instruments for transparency calculations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransparencyDataReport15", propOrder = {
    "techRcrdId",
    "id",
    "rptgDt",
    "tradgVn",
    "sspnsn",
    "nbTxs",
    "aggtdQttvData"
})
public class TransparencyDataReport15 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "RptgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rptgDt;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "Sspnsn")
    protected boolean sspnsn;
    @XmlElement(name = "NbTxs")
    protected BigDecimal nbTxs;
    @XmlElement(name = "AggtdQttvData")
    protected List<TransactionsBin2> aggtdQttvData;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport15 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

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
    public TransparencyDataReport15 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the rptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRptgDt() {
        return rptgDt;
    }

    /**
     * Sets the value of the rptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport15 setRptgDt(XMLGregorianCalendar value) {
        this.rptgDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport15 setTradgVn(String value) {
        this.tradgVn = value;
        return this;
    }

    /**
     * Gets the value of the sspnsn property.
     * 
     */
    public boolean isSspnsn() {
        return sspnsn;
    }

    /**
     * Sets the value of the sspnsn property.
     * 
     */
    public TransparencyDataReport15 setSspnsn(boolean value) {
        this.sspnsn = value;
        return this;
    }

    /**
     * Gets the value of the nbTxs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbTxs() {
        return nbTxs;
    }

    /**
     * Sets the value of the nbTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransparencyDataReport15 setNbTxs(BigDecimal value) {
        this.nbTxs = value;
        return this;
    }

    /**
     * Gets the value of the aggtdQttvData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggtdQttvData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggtdQttvData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionsBin2 }
     * 
     * 
     */
    public List<TransactionsBin2> getAggtdQttvData() {
        if (aggtdQttvData == null) {
            aggtdQttvData = new ArrayList<TransactionsBin2>();
        }
        return this.aggtdQttvData;
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
     * Adds a new item to the aggtdQttvData list.
     * @see #getAggtdQttvData()
     * 
     */
    public TransparencyDataReport15 addAggtdQttvData(TransactionsBin2 aggtdQttvData) {
        getAggtdQttvData().add(aggtdQttvData);
        return this;
    }

}
