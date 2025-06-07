
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transfer1", propOrder = {
    "trfRef",
    "reqdTrfDt",
    "ttlUnitsNb",
    "prtflTrfOutRate",
    "unitsDtls",
    "ownAcctTrfInd",
    "avrgPric"
})
public class Transfer1 {

    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "ReqdTrfDt", required = true)
    protected DateFormat1Choice reqdTrfDt;
    @XmlElement(name = "TtlUnitsNb")
    protected FinancialInstrumentQuantity1 ttlUnitsNb;
    @XmlElement(name = "PrtflTrfOutRate")
    protected BigDecimal prtflTrfOutRate;
    @XmlElement(name = "UnitsDtls")
    protected List<Unit1> unitsDtls;
    @XmlElement(name = "OwnAcctTrfInd")
    protected boolean ownAcctTrfInd;
    @XmlElement(name = "AvrgPric")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount avrgPric;

    /**
     * Gets the value of the trfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfRef() {
        return trfRef;
    }

    /**
     * Sets the value of the trfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transfer1 setTrfRef(String value) {
        this.trfRef = value;
        return this;
    }

    /**
     * Gets the value of the reqdTrfDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat1Choice }
     *     
     */
    public DateFormat1Choice getReqdTrfDt() {
        return reqdTrfDt;
    }

    /**
     * Sets the value of the reqdTrfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat1Choice }
     *     
     */
    public Transfer1 setReqdTrfDt(DateFormat1Choice value) {
        this.reqdTrfDt = value;
        return this;
    }

    /**
     * Gets the value of the ttlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getTtlUnitsNb() {
        return ttlUnitsNb;
    }

    /**
     * Sets the value of the ttlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public Transfer1 setTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.ttlUnitsNb = value;
        return this;
    }

    /**
     * Gets the value of the prtflTrfOutRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrtflTrfOutRate() {
        return prtflTrfOutRate;
    }

    /**
     * Sets the value of the prtflTrfOutRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Transfer1 setPrtflTrfOutRate(BigDecimal value) {
        this.prtflTrfOutRate = value;
        return this;
    }

    /**
     * Gets the value of the unitsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Unit1 }
     * 
     * 
     */
    public List<Unit1> getUnitsDtls() {
        if (unitsDtls == null) {
            unitsDtls = new ArrayList<Unit1>();
        }
        return this.unitsDtls;
    }

    /**
     * Gets the value of the ownAcctTrfInd property.
     * 
     */
    public boolean isOwnAcctTrfInd() {
        return ownAcctTrfInd;
    }

    /**
     * Sets the value of the ownAcctTrfInd property.
     * 
     */
    public Transfer1 setOwnAcctTrfInd(boolean value) {
        this.ownAcctTrfInd = value;
        return this;
    }

    /**
     * Gets the value of the avrgPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getAvrgPric() {
        return avrgPric;
    }

    /**
     * Sets the value of the avrgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public Transfer1 setAvrgPric(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.avrgPric = value;
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
     * Adds a new item to the unitsDtls list.
     * @see #getUnitsDtls()
     * 
     */
    public Transfer1 addUnitsDtls(Unit1 unitsDtls) {
        getUnitsDtls().add(unitsDtls);
        return this;
    }

}
