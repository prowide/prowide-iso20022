
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Details of the foreign exchange trade including spot\forward\NDF\swap that is confirmed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trade9", propOrder = {
    "tradId",
    "tradDt",
    "fxTradPdct",
    "tradgCcy",
    "sttlmCcy",
    "tradgMtd",
    "tradgMd",
    "clrMtd",
    "symb",
    "plcOfConf",
    "fxDtls",
    "swpLeg",
    "pdctId",
    "assoctdTradRef"
})
public class Trade9 {

    @XmlElement(name = "TradId", required = true)
    protected String tradId;
    @XmlElement(name = "TradDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate tradDt;
    @XmlElement(name = "FXTradPdct", required = true)
    @XmlSchemaType(name = "string")
    protected UnderlyingProductIdentifier1Code fxTradPdct;
    @XmlElement(name = "TradgCcy")
    protected String tradgCcy;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;
    @XmlElement(name = "TradgMtd")
    @XmlSchemaType(name = "string")
    protected TradingMethodType1Code tradgMtd;
    @XmlElement(name = "TradgMd", required = true)
    @XmlSchemaType(name = "string")
    protected TradingModeType1Code tradgMd;
    @XmlElement(name = "ClrMtd", required = true)
    @XmlSchemaType(name = "string")
    protected ClearingMethod1Code clrMtd;
    @XmlElement(name = "Symb")
    protected String symb;
    @XmlElement(name = "PlcOfConf")
    protected String plcOfConf;
    @XmlElement(name = "FXDtls")
    protected Trade10 fxDtls;
    @XmlElement(name = "SwpLeg")
    protected List<InstrumentLeg7> swpLeg;
    @XmlElement(name = "PdctId")
    protected SecurityIdentification38Choice pdctId;
    @XmlElement(name = "AssoctdTradRef")
    protected List<String> assoctdTradRef;

    /**
     * Gets the value of the tradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradId() {
        return tradId;
    }

    /**
     * Sets the value of the tradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade9 setTradId(String value) {
        this.tradId = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade9 setTradDt(LocalDate value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the fxTradPdct property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public UnderlyingProductIdentifier1Code getFXTradPdct() {
        return fxTradPdct;
    }

    /**
     * Sets the value of the fxTradPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public Trade9 setFXTradPdct(UnderlyingProductIdentifier1Code value) {
        this.fxTradPdct = value;
        return this;
    }

    /**
     * Gets the value of the tradgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgCcy() {
        return tradgCcy;
    }

    /**
     * Sets the value of the tradgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade9 setTradgCcy(String value) {
        this.tradgCcy = value;
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
    public Trade9 setSttlmCcy(String value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the tradgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link TradingMethodType1Code }
     *     
     */
    public TradingMethodType1Code getTradgMtd() {
        return tradgMtd;
    }

    /**
     * Sets the value of the tradgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingMethodType1Code }
     *     
     */
    public Trade9 setTradgMtd(TradingMethodType1Code value) {
        this.tradgMtd = value;
        return this;
    }

    /**
     * Gets the value of the tradgMd property.
     * 
     * @return
     *     possible object is
     *     {@link TradingModeType1Code }
     *     
     */
    public TradingModeType1Code getTradgMd() {
        return tradgMd;
    }

    /**
     * Sets the value of the tradgMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingModeType1Code }
     *     
     */
    public Trade9 setTradgMd(TradingModeType1Code value) {
        this.tradgMd = value;
        return this;
    }

    /**
     * Gets the value of the clrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingMethod1Code }
     *     
     */
    public ClearingMethod1Code getClrMtd() {
        return clrMtd;
    }

    /**
     * Sets the value of the clrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingMethod1Code }
     *     
     */
    public Trade9 setClrMtd(ClearingMethod1Code value) {
        this.clrMtd = value;
        return this;
    }

    /**
     * Gets the value of the symb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymb() {
        return symb;
    }

    /**
     * Sets the value of the symb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade9 setSymb(String value) {
        this.symb = value;
        return this;
    }

    /**
     * Gets the value of the plcOfConf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfConf() {
        return plcOfConf;
    }

    /**
     * Sets the value of the plcOfConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade9 setPlcOfConf(String value) {
        this.plcOfConf = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Trade10 }
     *     
     */
    public Trade10 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade10 }
     *     
     */
    public Trade9 setFXDtls(Trade10 value) {
        this.fxDtls = value;
        return this;
    }

    /**
     * Gets the value of the swpLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the swpLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwpLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentLeg7 }
     * 
     * 
     * @return
     *     The value of the swpLeg property.
     */
    public List<InstrumentLeg7> getSwpLeg() {
        if (swpLeg == null) {
            swpLeg = new ArrayList<>();
        }
        return this.swpLeg;
    }

    /**
     * Gets the value of the pdctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification38Choice }
     *     
     */
    public SecurityIdentification38Choice getPdctId() {
        return pdctId;
    }

    /**
     * Sets the value of the pdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification38Choice }
     *     
     */
    public Trade9 setPdctId(SecurityIdentification38Choice value) {
        this.pdctId = value;
        return this;
    }

    /**
     * Gets the value of the assoctdTradRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assoctdTradRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssoctdTradRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the assoctdTradRef property.
     */
    public List<String> getAssoctdTradRef() {
        if (assoctdTradRef == null) {
            assoctdTradRef = new ArrayList<>();
        }
        return this.assoctdTradRef;
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
     * Adds a new item to the swpLeg list.
     * @see #getSwpLeg()
     * 
     */
    public Trade9 addSwpLeg(InstrumentLeg7 swpLeg) {
        getSwpLeg().add(swpLeg);
        return this;
    }

    /**
     * Adds a new item to the assoctdTradRef list.
     * @see #getAssoctdTradRef()
     * 
     */
    public Trade9 addAssoctdTradRef(String assoctdTradRef) {
        getAssoctdTradRef().add(assoctdTradRef);
        return this;
    }

}
