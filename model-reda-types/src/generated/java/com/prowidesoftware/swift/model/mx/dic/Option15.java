
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Option15", propOrder = {
    "optnSttlmStyle",
    "convsDt",
    "strkPric",
    "minExrcblQty",
    "convsPrd",
    "optnStyle",
    "optnTp",
    "strkVal",
    "strkMltplr",
    "instrmAssgnmtMtd",
    "vrsnNb",
    "xpryLctn",
    "stdstn",
    "tradgPtyRole",
    "ctrctSz",
    "addtlUndrlygAttrbts"
})
public class Option15 {

    @XmlElement(name = "OptnSttlmStyle")
    protected SettleStyle2Choice optnSttlmStyle;
    @XmlElement(name = "ConvsDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar convsDt;
    @XmlElement(name = "StrkPric")
    protected Price8 strkPric;
    @XmlElement(name = "MinExrcblQty")
    protected FinancialInstrumentQuantity1Choice minExrcblQty;
    @XmlElement(name = "ConvsPrd")
    protected DateTimePeriod1Choice convsPrd;
    @XmlElement(name = "OptnStyle")
    protected OptionStyle1Choice optnStyle;
    @XmlElement(name = "OptnTp")
    protected OptionType8Choice optnTp;
    @XmlElement(name = "StrkVal")
    protected BigDecimal strkVal;
    @XmlElement(name = "StrkMltplr")
    protected BigDecimal strkMltplr;
    @XmlElement(name = "InstrmAssgnmtMtd")
    protected AssignmentMethod2Choice instrmAssgnmtMtd;
    @XmlElement(name = "VrsnNb")
    protected BigDecimal vrsnNb;
    @XmlElement(name = "XpryLctn")
    protected String xpryLctn;
    @XmlElement(name = "Stdstn")
    protected Standardisation3Choice stdstn;
    @XmlElement(name = "TradgPtyRole")
    protected OptionParty3Choice tradgPtyRole;
    @XmlElement(name = "CtrctSz")
    protected BigDecimal ctrctSz;
    @XmlElement(name = "AddtlUndrlygAttrbts")
    protected List<UnderlyingAttributes4> addtlUndrlygAttrbts;

    /**
     * Gets the value of the optnSttlmStyle property.
     * 
     * @return
     *     possible object is
     *     {@link SettleStyle2Choice }
     *     
     */
    public SettleStyle2Choice getOptnSttlmStyle() {
        return optnSttlmStyle;
    }

    /**
     * Sets the value of the optnSttlmStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettleStyle2Choice }
     *     
     */
    public Option15 setOptnSttlmStyle(SettleStyle2Choice value) {
        this.optnSttlmStyle = value;
        return this;
    }

    /**
     * Gets the value of the convsDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getConvsDt() {
        return convsDt;
    }

    /**
     * Sets the value of the convsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Option15 setConvsDt(XMLGregorianCalendar value) {
        this.convsDt = value;
        return this;
    }

    /**
     * Gets the value of the strkPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price8 }
     *     
     */
    public Price8 getStrkPric() {
        return strkPric;
    }

    /**
     * Sets the value of the strkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price8 }
     *     
     */
    public Option15 setStrkPric(Price8 value) {
        this.strkPric = value;
        return this;
    }

    /**
     * Gets the value of the minExrcblQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinExrcblQty() {
        return minExrcblQty;
    }

    /**
     * Sets the value of the minExrcblQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public Option15 setMinExrcblQty(FinancialInstrumentQuantity1Choice value) {
        this.minExrcblQty = value;
        return this;
    }

    /**
     * Gets the value of the convsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getConvsPrd() {
        return convsPrd;
    }

    /**
     * Sets the value of the convsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public Option15 setConvsPrd(DateTimePeriod1Choice value) {
        this.convsPrd = value;
        return this;
    }

    /**
     * Gets the value of the optnStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle1Choice }
     *     
     */
    public OptionStyle1Choice getOptnStyle() {
        return optnStyle;
    }

    /**
     * Sets the value of the optnStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle1Choice }
     *     
     */
    public Option15 setOptnStyle(OptionStyle1Choice value) {
        this.optnStyle = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType8Choice }
     *     
     */
    public OptionType8Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType8Choice }
     *     
     */
    public Option15 setOptnTp(OptionType8Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the strkVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrkVal() {
        return strkVal;
    }

    /**
     * Sets the value of the strkVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Option15 setStrkVal(BigDecimal value) {
        this.strkVal = value;
        return this;
    }

    /**
     * Gets the value of the strkMltplr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrkMltplr() {
        return strkMltplr;
    }

    /**
     * Sets the value of the strkMltplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Option15 setStrkMltplr(BigDecimal value) {
        this.strkMltplr = value;
        return this;
    }

    /**
     * Gets the value of the instrmAssgnmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentMethod2Choice }
     *     
     */
    public AssignmentMethod2Choice getInstrmAssgnmtMtd() {
        return instrmAssgnmtMtd;
    }

    /**
     * Sets the value of the instrmAssgnmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentMethod2Choice }
     *     
     */
    public Option15 setInstrmAssgnmtMtd(AssignmentMethod2Choice value) {
        this.instrmAssgnmtMtd = value;
        return this;
    }

    /**
     * Gets the value of the vrsnNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsnNb() {
        return vrsnNb;
    }

    /**
     * Sets the value of the vrsnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Option15 setVrsnNb(BigDecimal value) {
        this.vrsnNb = value;
        return this;
    }

    /**
     * Gets the value of the xpryLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpryLctn() {
        return xpryLctn;
    }

    /**
     * Sets the value of the xpryLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Option15 setXpryLctn(String value) {
        this.xpryLctn = value;
        return this;
    }

    /**
     * Gets the value of the stdstn property.
     * 
     * @return
     *     possible object is
     *     {@link Standardisation3Choice }
     *     
     */
    public Standardisation3Choice getStdstn() {
        return stdstn;
    }

    /**
     * Sets the value of the stdstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Standardisation3Choice }
     *     
     */
    public Option15 setStdstn(Standardisation3Choice value) {
        this.stdstn = value;
        return this;
    }

    /**
     * Gets the value of the tradgPtyRole property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty3Choice }
     *     
     */
    public OptionParty3Choice getTradgPtyRole() {
        return tradgPtyRole;
    }

    /**
     * Sets the value of the tradgPtyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty3Choice }
     *     
     */
    public Option15 setTradgPtyRole(OptionParty3Choice value) {
        this.tradgPtyRole = value;
        return this;
    }

    /**
     * Gets the value of the ctrctSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Sets the value of the ctrctSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Option15 setCtrctSz(BigDecimal value) {
        this.ctrctSz = value;
        return this;
    }

    /**
     * Gets the value of the addtlUndrlygAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlUndrlygAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlUndrlygAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingAttributes4 }
     * 
     * 
     */
    public List<UnderlyingAttributes4> getAddtlUndrlygAttrbts() {
        if (addtlUndrlygAttrbts == null) {
            addtlUndrlygAttrbts = new ArrayList<UnderlyingAttributes4>();
        }
        return this.addtlUndrlygAttrbts;
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
     * Adds a new item to the addtlUndrlygAttrbts list.
     * @see #getAddtlUndrlygAttrbts()
     * 
     */
    public Option15 addAddtlUndrlygAttrbts(UnderlyingAttributes4 addtlUndrlygAttrbts) {
        getAddtlUndrlygAttrbts().add(addtlUndrlygAttrbts);
        return this;
    }

}
