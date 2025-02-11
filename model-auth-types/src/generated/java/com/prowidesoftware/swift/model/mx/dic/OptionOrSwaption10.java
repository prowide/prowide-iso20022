
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
 * Option or swaption related attributes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionOrSwaption10", propOrder = {
    "tp",
    "mbddTp",
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
public class OptionOrSwaption10 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected OptionType2Code tp;
    @XmlElement(name = "MbddTp")
    @XmlSchemaType(name = "string")
    protected EmbeddedType1Code mbddTp;
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
    protected LocalDate prmPmtDt;
    @XmlElement(name = "MtrtyDtOfUndrlyg", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate mtrtyDtOfUndrlyg;

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
    public OptionOrSwaption10 setTp(OptionType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the mbddTp property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedType1Code }
     *     
     */
    public EmbeddedType1Code getMbddTp() {
        return mbddTp;
    }

    /**
     * Sets the value of the mbddTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedType1Code }
     *     
     */
    public OptionOrSwaption10 setMbddTp(EmbeddedType1Code value) {
        this.mbddTp = value;
        return this;
    }

    /**
     * Gets the value of the exrcStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the exrcStyle property.
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
     * @return
     *     The value of the exrcStyle property.
     */
    public List<OptionStyle6Code> getExrcStyle() {
        if (exrcStyle == null) {
            exrcStyle = new ArrayList<>();
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
    public OptionOrSwaption10 setExrcDt(ExerciseDate1Choice value) {
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
    public OptionOrSwaption10 setStrkPric(SecuritiesTransactionPrice17Choice value) {
        this.strkPric = value;
        return this;
    }

    /**
     * Gets the value of the strkPricSchdl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the strkPricSchdl property.
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
     * @return
     *     The value of the strkPricSchdl property.
     */
    public List<Schedule4> getStrkPricSchdl() {
        if (strkPricSchdl == null) {
            strkPricSchdl = new ArrayList<>();
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
    public OptionOrSwaption10 setCallAmt(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
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
    public OptionOrSwaption10 setPutAmt(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
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
    public OptionOrSwaption10 setPrmAmt(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
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
    public LocalDate getPrmPmtDt() {
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
    public OptionOrSwaption10 setPrmPmtDt(LocalDate value) {
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
    public LocalDate getMtrtyDtOfUndrlyg() {
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
    public OptionOrSwaption10 setMtrtyDtOfUndrlyg(LocalDate value) {
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
    public OptionOrSwaption10 addExrcStyle(OptionStyle6Code exrcStyle) {
        getExrcStyle().add(exrcStyle);
        return this;
    }

    /**
     * Adds a new item to the strkPricSchdl list.
     * @see #getStrkPricSchdl()
     * 
     */
    public OptionOrSwaption10 addStrkPricSchdl(Schedule4 strkPricSchdl) {
        getStrkPricSchdl().add(strkPricSchdl);
        return this;
    }

}
