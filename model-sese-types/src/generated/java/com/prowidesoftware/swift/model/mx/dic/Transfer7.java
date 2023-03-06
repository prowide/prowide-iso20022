
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
 * Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transfer7", propOrder = {
    "mstrRef",
    "trfConfRef",
    "trfRef",
    "clntRef",
    "fctvTrfDt",
    "tradDt",
    "ttlUnitsNb",
    "unitsDtls",
    "ownAcctTrfInd",
    "avrgPric",
    "nonStdSttlmInf"
})
public class Transfer7 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfConfRef", required = true)
    protected String trfConfRef;
    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "FctvTrfDt", required = true)
    protected DateAndDateTimeChoice fctvTrfDt;
    @XmlElement(name = "TradDt", required = true)
    protected DateAndDateTimeChoice tradDt;
    @XmlElement(name = "TtlUnitsNb", required = true)
    protected FinancialInstrumentQuantity1 ttlUnitsNb;
    @XmlElement(name = "UnitsDtls")
    protected List<Unit3> unitsDtls;
    @XmlElement(name = "OwnAcctTrfInd")
    protected Boolean ownAcctTrfInd;
    @XmlElement(name = "AvrgPric")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount avrgPric;
    @XmlElement(name = "NonStdSttlmInf")
    protected String nonStdSttlmInf;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transfer7 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the trfConfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfConfRef() {
        return trfConfRef;
    }

    /**
     * Sets the value of the trfConfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transfer7 setTrfConfRef(String value) {
        this.trfConfRef = value;
        return this;
    }

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
    public Transfer7 setTrfRef(String value) {
        this.trfRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transfer7 setClntRef(String value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the fctvTrfDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getFctvTrfDt() {
        return fctvTrfDt;
    }

    /**
     * Sets the value of the fctvTrfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public Transfer7 setFctvTrfDt(DateAndDateTimeChoice value) {
        this.fctvTrfDt = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public Transfer7 setTradDt(DateAndDateTimeChoice value) {
        this.tradDt = value;
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
    public Transfer7 setTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.ttlUnitsNb = value;
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
     * {@link Unit3 }
     * 
     * 
     */
    public List<Unit3> getUnitsDtls() {
        if (unitsDtls == null) {
            unitsDtls = new ArrayList<Unit3>();
        }
        return this.unitsDtls;
    }

    /**
     * Gets the value of the ownAcctTrfInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnAcctTrfInd() {
        return ownAcctTrfInd;
    }

    /**
     * Sets the value of the ownAcctTrfInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Transfer7 setOwnAcctTrfInd(Boolean value) {
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
    public Transfer7 setAvrgPric(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.avrgPric = value;
        return this;
    }

    /**
     * Gets the value of the nonStdSttlmInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonStdSttlmInf() {
        return nonStdSttlmInf;
    }

    /**
     * Sets the value of the nonStdSttlmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transfer7 setNonStdSttlmInf(String value) {
        this.nonStdSttlmInf = value;
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
    public Transfer7 addUnitsDtls(Unit3 unitsDtls) {
        getUnitsDtls().add(unitsDtls);
        return this;
    }

}
