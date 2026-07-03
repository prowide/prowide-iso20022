
package com.prowidesoftware.swift.model.mx.dic;

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
 * Option or swaption related attributes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionOrSwaption7", propOrder = {
    "tp",
    "exrcStyle",
    "exrcDt",
    "strkPric",
    "strkPricSchdl",
    "callAmt",
    "putAmt",
    "prmAmt",
    "prmPmtDt",
    "mtrtyDtOfUndrlyg"
})
public class OptionOrSwaption7 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected OptionType2Code tp;
    @XmlElement(name = "ExrcStyle")
    @XmlSchemaType(name = "string")
    protected List<OptionStyle6Code> exrcStyle;
    @XmlElement(name = "ExrcDt")
    protected ExerciseDate1Choice exrcDt;
    @XmlElement(name = "StrkPric")
    protected SecuritiesTransactionPrice17Choice strkPric;
    @XmlElement(name = "StrkPricSchdl")
    protected List<Schedule4> strkPricSchdl;
    @XmlElement(name = "CallAmt")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount callAmt;
    @XmlElement(name = "PutAmt")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount putAmt;
    @XmlElement(name = "PrmAmt")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount prmAmt;
    @XmlElement(name = "PrmPmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prmPmtDt;
    @XmlElement(name = "MtrtyDtOfUndrlyg", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDtOfUndrlyg;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType2Code }
     *     
     */
    public OptionType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType2Code }
     *     
     */
    public OptionOrSwaption7 setTp(OptionType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the exrcStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exrcStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExrcStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionStyle6Code }
     * 
     * 
     */
    public List<OptionStyle6Code> getExrcStyle() {
        if (exrcStyle == null) {
            exrcStyle = new ArrayList<OptionStyle6Code>();
        }
        return this.exrcStyle;
    }

    /**
     * Gets the value of the exrcDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseDate1Choice }
     *     
     */
    public ExerciseDate1Choice getExrcDt() {
        return exrcDt;
    }

    /**
     * Sets the value of the exrcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseDate1Choice }
     *     
     */
    public OptionOrSwaption7 setExrcDt(ExerciseDate1Choice value) {
        this.exrcDt = value;
        return this;
    }

    /**
     * Gets the value of the strkPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice17Choice }
     *     
     */
    public SecuritiesTransactionPrice17Choice getStrkPric() {
        return strkPric;
    }

    /**
     * Sets the value of the strkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice17Choice }
     *     
     */
    public OptionOrSwaption7 setStrkPric(SecuritiesTransactionPrice17Choice value) {
        this.strkPric = value;
        return this;
    }

    /**
     * Gets the value of the strkPricSchdl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strkPricSchdl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrkPricSchdl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule4 }
     * 
     * 
     */
    public List<Schedule4> getStrkPricSchdl() {
        if (strkPricSchdl == null) {
            strkPricSchdl = new ArrayList<Schedule4>();
        }
        return this.strkPricSchdl;
    }

    /**
     * Gets the value of the callAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getCallAmt() {
        return callAmt;
    }

    /**
     * Sets the value of the callAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public OptionOrSwaption7 setCallAmt(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.callAmt = value;
        return this;
    }

    /**
     * Gets the value of the putAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getPutAmt() {
        return putAmt;
    }

    /**
     * Sets the value of the putAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public OptionOrSwaption7 setPutAmt(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.putAmt = value;
        return this;
    }

    /**
     * Gets the value of the prmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getPrmAmt() {
        return prmAmt;
    }

    /**
     * Sets the value of the prmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public OptionOrSwaption7 setPrmAmt(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.prmAmt = value;
        return this;
    }

    /**
     * Gets the value of the prmPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getPrmPmtDt() {
        return prmPmtDt;
    }

    /**
     * Sets the value of the prmPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionOrSwaption7 setPrmPmtDt(XMLGregorianCalendar value) {
        this.prmPmtDt = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDtOfUndrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getMtrtyDtOfUndrlyg() {
        return mtrtyDtOfUndrlyg;
    }

    /**
     * Sets the value of the mtrtyDtOfUndrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionOrSwaption7 setMtrtyDtOfUndrlyg(XMLGregorianCalendar value) {
        this.mtrtyDtOfUndrlyg = value;
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
     * Adds a new item to the exrcStyle list.
     * @see #getExrcStyle()
     * 
     */
    public OptionOrSwaption7 addExrcStyle(OptionStyle6Code exrcStyle) {
        getExrcStyle().add(exrcStyle);
        return this;
    }

    /**
     * Adds a new item to the strkPricSchdl list.
     * @see #getStrkPricSchdl()
     * 
     */
    public OptionOrSwaption7 addStrkPricSchdl(Schedule4 strkPricSchdl) {
        getStrkPricSchdl().add(strkPricSchdl);
        return this;
    }

}
